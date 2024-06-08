
package com.mycompany.peluqueriacanina.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity

public class Mascota implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
   private int num_cliente;
    private String nombre;
    private String raza;
    private String color;
    private String alegico;
    private String atencion_especial;
    private String observasiones;
    @OneToOne
    private Dueno unDueno;
    
    
    public Mascota() {
    }

    public Mascota(int num_cliente, String nombre, String raza, String color, String alegico, String atencion_especial, String observasiones, Dueno unDueno) {
        this.num_cliente = num_cliente;
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.alegico = alegico;
        this.atencion_especial = atencion_especial;
        this.observasiones = observasiones;
        this.unDueno = unDueno;
    }

    public int getNum_cliente() {
        return num_cliente;
    }

    public void setNum_cliente(int num_cliente) {
        this.num_cliente = num_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAlegico() {
        return alegico;
    }

    public void setAlegico(String alegico) {
        this.alegico = alegico;
    }

    public String getAtencion_especial() {
        return atencion_especial;
    }

    public void setAtencion_especial(String atencion_especial) {
        this.atencion_especial = atencion_especial;
    }

    public String getObservasiones() {
        return observasiones;
    }

    public void setObservasiones(String observasiones) {
        this.observasiones = observasiones;
    }

    public Dueno getUnDueno() {
        return unDueno;
    }

    public void setUnDueno(Dueno unDueno) {
        this.unDueno = unDueno;
    }

  
    
    
}
