package Model;

import ConnectionFactory.ConnectionFactory;
import Controller.ViewController;
import View.Password;
import java.sql.SQLException;
import java.sql.*;
import java.util.ArrayList;

public class AccountDAO {

    private Connection con;
    public ViewController vc;
    private Password conta;

    public ArrayList<Account> listarContas() {
        ArrayList<Account> listaContas = new ArrayList<>();
        String read = "select * from Conta;";
        try {
            con = new ConnectionFactory().getConnection();
            PreparedStatement pst = con.prepareStatement(read);

            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                int id = Integer.parseInt(rs.getString(1));
                String plataforma = rs.getString(2);
                String email = rs.getString(3);
                String usuario = rs.getString(4);
                String senha = rs.getString(5);

                listaContas.add(new Account(id, plataforma, email, usuario, senha));
            }
            con.close();
            return listaContas;

        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public int inserirConta(Account plataforma) throws SQLException {
        String insert = "INSERT INTO Conta(plataforma,email,usuario,senha)" + "values(?,?,?,?)";
        PreparedStatement pst = null;

        try {
            con = new ConnectionFactory().getConnection();
            pst = con.prepareStatement(insert);

            pst.setString(1, plataforma.getPlataforma());
            pst.setString(2, plataforma.getEmail());
            pst.setString(3, plataforma.getUsuario());
            pst.setString(4, plataforma.getSenha());
            pst.execute();

            return 1;
        } catch (SQLException e) {
            return e.getErrorCode();
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                    System.out.println("pst fechada");
                }
                if (con != null) {
                    con.close();
                    System.out.println("conexao fechada");
                }
            } catch (SQLException e) {
                return e.getErrorCode();
            }
        }
    }

    public int deletarConta(Account conta) throws SQLException {
        String delete = "DELETE FROM Conta WHERE id_conta = ?;";
        con = new ConnectionFactory().getConnection();
        PreparedStatement pst = null;
        try {
            pst = con.prepareStatement(delete);
            pst.setString(1, conta.getID() + "");

            pst.execute();
            return 1;

        } catch (SQLException e) {
            return e.getErrorCode();
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                    System.out.println("pst fechada");
                }
                if (con != null) {
                    con.close();
                    System.out.println("conexao fechada");
                }
            } catch (SQLException e) {
                return e.getErrorCode();
            }
        }
    }
    public void editarConta(Account conta) throws SQLException{
        String update = "UPDATE Conta set plataforma = ?, email = ?, usuario = ?, senha = ?" +
                "where id_conta = ?;";
        con = new ConnectionFactory().getConnection();
        try{
            PreparedStatement pst = con.prepareStatement(update);

            pst.setString(1, conta.getPlataforma());
            pst.setString(2, conta.getEmail());
            pst.setString(3, conta.getUsuario());
            pst.setString(4, conta.getSenha());
             pst.setInt(5, conta.getID());
            
            pst.executeUpdate();
            con.close();
            pst.close();
            
        }catch(SQLException e){
            System.out.println(e);
        }
    }
}
