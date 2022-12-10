package controller;

import Model.Account;
import Model.AccountDAO;
import Model.Cryptography;
import View.Menu;
import View.Password;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class AccountController {

    private final Password contas;
    private final Menu menu;
    private final Cryptography crip;

    private final AccountDAO dao = new AccountDAO();

    public AccountController(Password contas, Menu menu, Cryptography crip) {
        this.menu = menu;
        this.crip = crip;
        this.contas = contas;
    }

    public void initController() {
        menu.getjButton_inserir().addActionListener(e -> cadastrarConta());
        menu.getjButton_visualizar().addActionListener(e -> listarContas());
        contas.getjButton_listar().addActionListener(e -> listarContas());
    }

    private void cadastrarConta() {
        String usuario = menu.getjTextField_usuario().getText();
        String email = menu.getjTextField_email().getText();
        String senha = menu.getjPasswordField_senha().getText();
        String senhaCriptografada = crip.criptografa(senha);
        System.out.println(senhaCriptografada);
        String plataforma = menu.getjTextField_conta().getText();

        Account conta = new Account(0, plataforma, email, usuario, senhaCriptografada);
        try {
            System.out.println(dao.inserirConta(conta));
        } catch (SQLException ex) {
            Logger.getLogger(AccountController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void listarContas() {
        ArrayList<Account> listaContas = dao.listarContas();
        DefaultTableModel model = ((DefaultTableModel) contas.getjTable1().getModel());
        contas.getjTable1().setRowHeight(40);
        model.setRowCount(0);

        for (int i = 0; i < listaContas.size(); i++) {
            String senhaDescriptografada = crip.descriptografa(listaContas.get(i).getSenha());
            model.addRow(new Object[]{listaContas.get(i).getID(), listaContas.get(i).getPlataforma(),
                listaContas.get(i).getEmail(), listaContas.get(i).getUsuario(), senhaDescriptografada});
        }

        contas.getjButton_excluir().addActionListener(e -> excluirConta());

        contas.getjButton_editar().addActionListener(e -> atualizarConta());

    }

    private void excluirConta() {
        JTable tabela = contas.getjTable1();
        int linha = tabela.getSelectedRow();
        if (linha != -1) {
            int id = Integer.parseInt(tabela.getValueAt(linha, 0) + "");
            String plataforma = tabela.getValueAt(linha, 1) + "";
            String usuario = tabela.getValueAt(linha, 2) + "";
            String email = tabela.getValueAt(linha, 3) + "";
            String senha = tabela.getValueAt(linha, 4) + "";

            Account conta = new Account(id, plataforma, email, usuario, senha);
            int showConfirmDialog = JOptionPane.showConfirmDialog(null, "DELETAR CONTA ?");
            if (showConfirmDialog == 0) {
                try {
                    dao.deletarConta(conta);
                } catch (SQLException ex) {
                    Logger.getLogger(AccountController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma conta válida !!");
        }
    }

    private void atualizarConta() {
        JTable tabela = contas.getjTable1();
        int linha = tabela.getSelectedRow();
        if (linha != -1) {
            int id = Integer.parseInt(tabela.getValueAt(linha, 0) + "");
            String plataforma = tabela.getValueAt(linha, 1) + "";
            String email = tabela.getValueAt(linha, 2) + "";
            String usuario = tabela.getValueAt(linha, 3) + "";
            String senha = tabela.getValueAt(linha, 4) + "";
            String senhaCriptografada = crip.criptografa(senha);

            Account conta = new Account(id, plataforma, email, usuario, senhaCriptografada);
            int showConfirmDialog = JOptionPane.showConfirmDialog(null, "ATUALIZAR DADOS DA CONTA ?");
            if (showConfirmDialog == 0) {
                try {
                    dao.editarConta(conta);
                } catch (SQLException ex) {
                    Logger.getLogger(AccountController.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Selecione uma conta válida !!");
            }
        }
    }
}
