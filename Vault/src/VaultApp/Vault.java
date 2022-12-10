package VaultApp;

import ConnectionFactory.ConnectionFactory;
import Controller.ViewController;
import Model.Cryptography;
import View.Login;
import View.Menu;
import View.Password;
import controller.AccountController;

public class Vault {
    public static void main(String[] args) {
        Password contas = new Password();
        Menu menu = new Menu();
        Login login = new Login();
        ConnectionFactory cf = new ConnectionFactory();
        Cryptography crip = new Cryptography();

        
        AccountController controller = new AccountController(contas, menu,crip);
        
        ViewController vc = new ViewController(contas, menu, login,cf);
        
        vc.initController();
        controller.initController();
    }
}
