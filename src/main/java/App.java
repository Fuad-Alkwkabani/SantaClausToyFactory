import controllers.HomeController;
import views.HomeView;

public class App {

    public static void main(String[] args) {
       HomeController homeController = new HomeController();
        HomeView homeView = new HomeView(homeController);

        homeView.showMenu();

    }

}
