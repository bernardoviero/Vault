package KeyLoggerApp;

import control.TelaController;
import view.TelaInicial;
import view.TelaLogs;

public class KeyLogger {

    public static void main(String[] args) {
        TelaInicial menu = new TelaInicial();
        TelaLogs logs = new TelaLogs();
        
        TelaController tc = new TelaController(menu, logs);

        tc.initController();
    }
}
