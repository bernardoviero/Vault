package control;

import view.telaInicial;
import view.telaLogs;

public class Controller {

    private telaInicial menu;
    private telaLogs logs;

    public Controller(telaInicial menu, telaLogs logs) {
        this.menu = menu;
        this.logs = logs;
    }

    public void initController() {
        menu.setVisible(true);
        menu.getjButton_start().addActionListener(e -> exibirTelaLogs());
    }

    private void exibirTelaLogs() {
        logs.setVisible(true);
        menu.setVisible(false);
        logs.getjMenu_menu().addActionListener(e -> exibirTelaMenu());
    }

    private void exibirTelaMenu() {
        logs.setVisible(false);
        menu.setVisible(true);
    }

//    private void salvarLogs() {
//        dao.inserirFuncionario(new Funcionarios(0, cadastro.getjTextField_nome().getText(), cadastro.getjTextField_email().getText(), cadastro.getjTextField_cargo().getText()));
//    }
}