package model;

import java.util.Date;

public class Entry {

    private String teclas;
    private String cordenadaXMouse;
    private String cordenadaYMouse;
    private Date data;
    
    public Entry(){
        
    }
    
    public Entry(String teclas, String cordenadaXMouse, String cordenadaYMouse, Date data){
        this.teclas = teclas;
        this.cordenadaXMouse = cordenadaXMouse;
        this.cordenadaYMouse = cordenadaYMouse;
        this.data = data;
    }

    public String getTeclas() {
        return teclas;
    }

    public void setTeclas(String teclas) {
        this.teclas = teclas;
    }

    public String getCordenadaXMouse() {
        return cordenadaXMouse;
    }

    public void setCordenadaXMouse(String cordenadaXMouse) {
        this.cordenadaXMouse = cordenadaXMouse;
    }

    public String getCordenadaYMouse() {
        return cordenadaYMouse;
    }

    public void setCordenadaYMouse(String cordenadaYMouse) {
        this.cordenadaYMouse = cordenadaYMouse;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
