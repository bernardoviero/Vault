package KeyLoggerApp;

import com.github.kwhat.jnativehook.NativeHookException;
import control.Controller;
import view.Start;
import view.Search;

public class KeyLogger {

    public static void main(String[] args) throws NativeHookException {
        Start menu = new Start();
        Search logs = new Search();
        
        Controller tc = new Controller(menu, logs);
        
        tc.initController();
    }
}
