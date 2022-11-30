package control;

import view.Start;
import view.Search;

public class Controller {

    private Start menu;
    private Search searchLogs;

    public Controller(Start menu, Search searchLogs) {
        this.menu = menu;
        this.searchLogs = searchLogs;
    }

    public void initController() {
        menu.setVisible(true);
        menu.getjButton_start().addActionListener(e -> viewLogs());
    }

    private void viewLogs() {
//        KeyboardRecord Kb = new KeyboardRecord();
//        Kb.KeyboardRecord();    
        
        searchLogs.setVisible(true);
        menu.setVisible(false);
        searchLogs.getjButton_returnMenu().addActionListener(e -> viewMenu());
    }

    private void viewMenu() {
        searchLogs.setVisible(false);
        menu.setVisible(true);
    }
}
