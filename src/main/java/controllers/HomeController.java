package controllers;

import views.HomeView;

public class HomeController {

    public HomeController() {
        // Inicializar y mostrar el menú principal
        index();
    }

    public void index() {
        HomeView.showMenu();
    }
}

    
    
