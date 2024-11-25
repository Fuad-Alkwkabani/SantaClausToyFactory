package views;

import repository.ToyRepository;

public class ElfView extends View {

    private static final ToyRepository toyRepository = ToyRepository.getInstance();

    public static void showElfMenu() {
        while (true) {
            // Menú de gestión para Elfos
            System.out.println("-----------");
            System.out.println("Gestor de juguetes (Tipo de sesión: Elfo)");
            System.out.println("1. Añadir juguete");
            System.out.println("2. Ver todos los juguetes");
            System.out.println("3. Eliminar juguete");
            System.out.println("4. Cerrar sesión");
            System.out.print("Seleccione una opción: ");

            int option = scanner.nextInt();

            switch (option) {
                case 1 -> addToy();
                case 2 -> listToys();
                case 3 -> deleteToy();
                case 4 -> {
                    System.out.println("Sesión cerrada correctamente.");
                    return;
                }
                default -> System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        }
    }

    private static void addToy() {
        System.out.println("-----------");
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
            int recommendedAge = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Ingrese la categoría: ");
            String category = scanner.nextLine();

            toyRepository.addGoodToy(title, brand, recommendedAge, category);
            System.out.println("Juguete para niño bueno añadido con éxito.");
        } else if (type == 2) {
            System.out.print("Ingrese el título: ");
            String title = scanner.nextLine();
            System.out.print("Ingrese el contenido: ");
            String content = scanner.nextLine();

            toyRepository.addBadToy(title, content);
            System.out.println("Juguete para niño malo añadido con éxito.");
        } else {
            System.out.println("Opción no válida.");
        }
    }

    private static void listToys() {
        System.out.println("-----------");
        System.out.println("Lista de juguetes:");
        toyRepository.getAllToys().forEach(toy -> System.out.println(toy));
    }

    private static void deleteToy() {
        System.out.println("-----------");
        System.out.print("Ingrese el identificador del juguete a eliminar: ");
        String id = scanner.next();
        if (toyRepository.deleteToy(id)) {
            System.out.println("Juguete eliminado con éxito.");
        } else {
            System.out.println("No se encontró un juguete con ese identificador.");
        }
    }
}