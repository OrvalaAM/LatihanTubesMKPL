package src.main.java.MainProgram;

import src.main.java.Controller.LoginController;
import src.main.java.View.LoginView;
public class Driver6PM {
    public static void main(String[] args){
        LoginView menuLogin = new LoginView();
        LoginController controlLogin = new LoginController(menuLogin);
        menuLogin.setVisible(true);
    }
}
