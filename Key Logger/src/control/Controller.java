package control;

import java.awt.BorderLayout;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileNameExtensionFilter;
import view.TelaInicial;
import view.TelaLogs;

public class Controller {

    private TelaInicial menu;
    private TelaLogs logs;

    public Controller(TelaInicial menu, TelaLogs logs) {
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
        logs.getjButton_returnMenu().addActionListener(e -> exibirTelaMenu());
        logs.getjButton_openRecord().addActionListener(e -> abrirArquivos());
    }

    private void exibirTelaMenu() {
        logs.setVisible(false);
        menu.setVisible(true);
    }

    private void abrirArquivos() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }
        
        JFileChooser chooser = new JFileChooser();
        chooser.setFileFilter(new FileNameExtensionFilter("Arquivos de Texto","txt")); // apenas txt
        int status = chooser.showOpenDialog(null);
        if (status == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();
            if (file == null) {
                return;
            }
            String fileName = chooser.getSelectedFile().getAbsolutePath();
            System.out.println(fileName); // retorna o endereço do arq
        }
    }
}
