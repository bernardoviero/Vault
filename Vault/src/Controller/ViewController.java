package Controller;

import ConnectionFactory.ConnectionFactory;
import View.Login;
import View.Menu;
import View.Password;
import javax.swing.JOptionPane;

public class ViewController {

    private ConnectionFactory cf;
    private final Menu menu;
    private final Password contas;
    private final Login login;

    public ViewController(Password contas, Menu menu, Login login, ConnectionFactory cf) {
        this.login = login;
        this.menu = menu;
        this.contas = contas;
        this.cf = cf;
    }

    public void initController() {
        login.setVisible(true);
        login.getjButton_logar().addActionListener(e -> exibirTelaInsercao());
    }

    private void exibirContas() {
        menu.getjTextField_usuario().setText("");
        menu.getjTextField_email().setText("");
        menu.getjPasswordField_senha().setText("");
        menu.getjTextField_conta().setText("");
        
        contas.setVisible(true);
        login.setVisible(false);
        menu.setVisible(false);
        contas.getjButton_inserir().addActionListener(e -> exibirTelaInsercao());
        contas.getjButton_sair().addActionListener(e -> sairPrograma());
    }

    private void exibirTelaInsercao() {
        if (cf.getPassword().equals(login.getjPasswordField_senha().getText()) && cf.getUser().equals(login.getjTextField_usuario().getText())) {
            login.setVisible(false);
            contas.setVisible(false);
            menu.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos!");
            initController();
        }
        menu.getjButton_visualizar().addActionListener(e -> exibirContas());
    }

    private void sairPrograma() {
        System.exit(0);
    }
}
