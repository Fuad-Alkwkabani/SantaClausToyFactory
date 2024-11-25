package views;

import java.util.Scanner;

public class HomeView extends View {

        private static final Scanner scanner = new Scanner(System.in);

        


    public static void showMenu() {
        while (true) {
            
            System.out.println("Iniciar sesión de trabajo como:");
            System.out.println("1. Elfo");
            System.out.println("2. Santa Claus");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            int option = scanner.nextInt();

            switch (option) {
                case 1 -> ElfView.showElfMenu();  
                case 2 -> SantaView.showSantaMenu(); 
                case 3 -> quit();            
                default -> System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        }
    }

    public static void quit() {
        System.out.println("Cerrando sesión. ¡Feliz Navidad!");
        scanner.close();
        System.exit(0);
    }
}