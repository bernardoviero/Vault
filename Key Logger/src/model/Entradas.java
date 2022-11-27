package model;

public class Entradas {

    private String teclas;
    private String cordenadasMouse;

    public Entradas(String teclas, String cordenadasMouse) {
        this.teclas = teclas;
        this.cordenadasMouse = cordenadasMouse;
    }

    public String getTeclas() {
        return teclas;
    }

    public void setTeclas(String teclas) {
        this.teclas = teclas;
    }

    public String getcordenadasMousee() {
        return cordenadasMouse;
    }

    public void setMouse(String cordenadasMouse) {
        this.cordenadasMouse = cordenadasMouse;
    }
}
