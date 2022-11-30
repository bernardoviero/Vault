package KeyLoggerApp;

import control.Controller;
//import model.KeyboardRecord;
import view.Start;
import view.Search;

public class KeyLogger{

    public static void main(String[] args) {
        Start menu = new Start();
        Search logs = new Search();

        Controller tc = new Controller(menu, logs);

        tc.initController();

//        KeyboardRecord kr = new KeyboardRecord();
    }
}
