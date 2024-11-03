package Main;
import Views.View;
import controllers.Controller;
import javax.swing.UIManager;
import models.Model;

public class Main {

    public static void main(String[] args) {
        try {
            View view = new View();
            Model model = new Model();
            Controller controller = new Controller(view, model);

            view.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
