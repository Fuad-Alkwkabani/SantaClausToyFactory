package views;


import repository.ToyRepository;
public class SantaView extends View {

    private static final ToyRepository toyRepository = ToyRepository.getInstance();

    public static void showSantaMenu() {
        while (true) {
            // Menú de gestión para Santa Claus
            System.out.println("-----------");
            System.out.println("Gestor de juguetes (Tipo de sesión: Santa)");
            System.out.println("1. Ver lista de juguetes niños buenos");
            System.out.println("2. Ver lista de juguetes niños malos");
            System.out.println("3. Guardar lista de todos los juguetes (.csv)");
            System.out.println("4. Cerrar sesión");
            System.out.print("Seleccione una opción: ");

            int option = scanner.nextInt();

            switch (option) {
                case 1 -> listGoodToys();
                case 2 -> listBadToys();
                case 3 -> saveToysToCSV();
                case 4 -> {
                    System.out.println("Sesión cerrada correctamente.");
                    return;
                }
                default -> System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        }
    }

    private static void listGoodToys() {
        System.out.println("-----------");
        System.out.println("Juguetes para niños buenos:");
        toyRepository.getGoodToys().forEach(toy -> System.out.println(toy));
    }

    private static void listBadToys() {
        System.out.println("-----------");
        System.out.println("Juguetes para niños malos:");
        toyRepository.getBadToys().forEach(toy -> System.out.println(toy));
    }

    private static void saveToysToCSV() {
        if (toyRepository.saveToCSV()) {
            System.out.println("Lista de juguetes guardada en formato CSV.");
        } else {
            System.out.println("Error al guardar la lista.");
        }
    }
}