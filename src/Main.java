

import backEnd.BackEnd;
import controller.LoginController;
import view.Login;
import javax.swing.*;

public class Main extends JFrame {
    public static void main(String[] args) {
        Login login = new Login();
        LoginController controlLogin = new LoginController(login);
        BackEnd backEnd = new BackEnd();




    }
}