package views;

import controllers.HomeController;

public class HomeView {

    private HomeController homeController;

    public HomeView(HomeController homeController) {
        this.homeController = homeController;
    }

    public void showMenu() {
        String loginResult = homeController.handleLogin();

        switch (loginResult) {
            case "Elf":
                ElfView elfView = new ElfView();
                elfView.showElfMenu(); // Redirige al menú de Elfo
                break;

            case "Santa":
                SantaView santaView = new SantaView();
                santaView.showSantaMenu(); // Redirige al menú de Santa Claus
                break;

            default:
                System.out.println("Inicio de sesión fallido. Cerrando la aplicación.");
                break;
        }
    }
}


