package views;

import java.util.Scanner;

import controllers.ToyController;

public class ElfView {


    private ToyController toyController;

    public ElfView() {
        this.toyController = new ToyController(); 
    }

    public void showElfMenu() {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("-----------");
            System.out.println("Gestor de Juguetes (Sesión: Elfo)");
            System.out.println("1. Añadir juguete");
            System.out.println("2. Ver todos los juguetes");
            System.out.println("3. Eliminar juguete");
            System.out.println("4. Cerrar sesión");
            System.out.print("Seleccione una opción: ");

            option = scanner.nextInt();
            scanner.nextLine(); 

            switch (option) {
                case 1:
                    addToy(scanner);
                    break;
                case 2:
                    viewAllToys();
                    break;
                case 3:
                    deleteToy(scanner);
                    break;
                case 4:
                    System.out.println("Sesión cerrada correctamente.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (option != 4);

        scanner.close(); 
    }

    private void addToy(Scanner scanner) {
        System.out.println("Para niño ...:");
        System.out.println("1. Bueno");
        System.out.println("2. Malo");
        System.out.print("Seleccione una opción: ");
        int type = scanner.nextInt();
        scanner.nextLine(); 

        if (type == 1) {
            System.out.print("Ingrese el título: ");
            String title = scanner.nextLine();
            System.out.print("Ingrese la marca: ");
            String brand = scanner.nextLine();
            System.out.print("Ingrese la edad recomendada: ");
            String age = scanner.nextLine();
            System.out.print("Ingrese la categoría: ");
            String category = scanner.nextLine();

            toyController.addGoodToy(title, brand, age, category);
            System.out.println("Juguete bueno añadido con éxito.");
        } else if (type == 2) {
            System.out.print("Ingrese el título: ");
            String title = scanner.nextLine();
            System.out.print("Ingrese el contenido: ");
            String content = scanner.nextLine();

            toyController.addBadToy(title, content);
            System.out.println("Juguete malo añadido con éxito.");
        } else {
            System.out.println("Opción no válida.");
        }
    }

    private void viewAllToys() {
        System.out.println("Lista de juguetes:");
        toyController.getAllToys().forEach(System.out::println);
    }

    private void deleteToy(Scanner scanner) {
        System.out.print("Ingrese el identificador del juguete a eliminar: ");
        String toyId = scanner.nextLine();
        if (toyController.deleteToy(toyId)) {
            System.out.println("Juguete eliminado con éxito.");
        } else {
            System.out.println("No se encontró el juguete con el identificador proporcionado.");
        }
    }
}
