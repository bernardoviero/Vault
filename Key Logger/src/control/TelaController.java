package control;

import view.TelaInicial;
import view.TelaLogs;

public class TelaController {

    private TelaInicial menu;
    private TelaLogs logs;

    public TelaController(TelaInicial menu, TelaLogs logs) {
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
        logs.getjButton_returnMenu().addActionListener(e -> exibirTelaMenu()  );
    }

    private void exibirTelaMenu() {
        logs.setVisible(false);
        menu.setVisible(true);
    }
}