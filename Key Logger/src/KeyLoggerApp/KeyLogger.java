package KeyLoggerApp;

import control.Controller;
import view.TelaInicial;
import view.TelaLogs;

public class KeyLogger {

    public static void main(String[] args) {
        TelaInicial menu = new TelaInicial();
        TelaLogs logs = new TelaLogs();
        
        Controller tc = new Controller(menu, logs);

        tc.initController();
    }
}
