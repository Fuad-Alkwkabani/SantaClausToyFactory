package controllers;

import java.util.Scanner;

public class HomeController {
    
     public String handleLogin() {
        Scanner Scanner = new Scanner(System.in);

        System.out.println("Iniciar sesión de trabajo como:");
        System.out.println("1. Elfo");
        System.out.println("2. Santa Claus");
        System.out.print("Seleccione una opción: ");

        int option = Scanner.nextInt();
        Scanner.nextLine(); 

        if (option == 1) {
            System.out.print("Ingrese la contraseña de Elfo: ");
            String password = Scanner.nextLine();
            if (password.equals("elfregalos")) {
                return "Elf"; 
            } else {
                System.out.println("Contraseña incorrecta.");
                return "Invalid";
            }
        } else if (option == 2) {
            System.out.print("Ingrese la contraseña de Santa Claus: ");
            String password = Scanner.nextLine();
            if (password.equals("santaohoh")) {
                return "Santa"; 
            } else {
                System.out.println("Contraseña incorrecta.");
                return "Invalid";
            }
        } else {
            System.out.println("Opción inválida.");
            return "Invalid";
        }
        
        }
    }

    
    
