package Model;

public class Account {

    private int ID;
    private String plataforma;
    private String email;
    private String usuario;
    private String senha;

    public Account(int ID, String plataforma, String email, String usuario, String senha) {
        this.email = email;
        this.usuario = usuario;
        this.senha = senha;
        this.plataforma = plataforma;
        this.ID = ID;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
