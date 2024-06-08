
package com.mycompany.peluqueriacanina.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Dueno implements Serializable {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id_dueno;
    private String nombre;
    private String cel_dueno;

    public Dueno() {
    }

    public Dueno(int id_dueno, String nombre, String cel_dueno) {
        this.id_dueno = id_dueno;
        this.nombre = nombre;
        this.cel_dueno = cel_dueno;
    }

    public int getId_dueno() {
        return id_dueno;
    }

    public void setId_dueno(int id_dueno) {
        this.id_dueno = id_dueno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCel_dueno() {
        return cel_dueno;
    }

    public void setCel_dueno(String cel_dueno) {
        this.cel_dueno = cel_dueno;
    }
    
}
