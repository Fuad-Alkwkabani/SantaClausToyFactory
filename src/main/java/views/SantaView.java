package views;

import java.io.IOException;
import java.util.Scanner;

import controllers.ToyController;

public class SantaView {
    private ToyController toyController;

    public SantaView() {
        this.toyController = new ToyController(); 
    }

    public void showSantaMenu() {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("-----------");
            System.out.println("Gestor de Juguetes (Sesión: Santa)");
            System.out.println("1. Ver lista de juguetes para niños buenos");
            System.out.println("2. Ver lista de juguetes para niños malos");
            System.out.println("3. Guardar lista completa de juguetes (.csv)");
            System.out.println("4. Cerrar sesión");
            System.out.print("Seleccione una opción: ");

            option = scanner.nextInt();
            scanner.nextLine(); 

            switch (option) {
                case 1:
                    viewGoodToys();
                    break;
                case 2:
                    viewBadToys();
                    break;
                case 3:
                    saveToysToCsv();
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

    private void viewGoodToys() {
        System.out.println("Lista de juguetes para niños buenos:");
        toyController.getGoodToys().forEach(System.out::println);
    }

    private void viewBadToys() {
        System.out.println("Lista de juguetes para niños malos:");
        toyController.getBadToys().forEach(System.out::println);
    }

    private void saveToysToCsv() {
        try {
            toyController.saveToysToCsv();
            System.out.println("Lista de juguetes guardada correctamente en toys.csv");
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo: " + e.getMessage());
        }
    }

}
