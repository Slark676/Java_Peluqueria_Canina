
package com.mycompany.peluqueriacanina.logica;

import com.mycompany.peluqueriacanina.persistencia.PersistenciaJava;
import java.util.List;


public class Controladora {
    
    PersistenciaJava persis= new PersistenciaJava();

    public void guardar(String nombreMasco, String raza, String color, 
        String observaciones, String alergico, String atenEsp, String nombDueno, String celDueno) {
        //Asignar los datos de el due?o
        Dueno dueno=new Dueno();
        dueno.setNombre(nombDueno);
        dueno.setCel_dueno(celDueno);
        //Asignar los datos a la Mascota
        Mascota masco=new Mascota();
       masco.setNombre(nombreMasco);
       masco.setRaza(raza);
       masco.setColor(color);
       masco.setAlegico(alergico);
       masco.setAtencion_especial(atenEsp);
       masco.setObservasiones(observaciones);
       masco.setUnDueno(dueno);
       
      persis.guardar(dueno, masco);
       
       
    }

    public List<Mascota> traerMascota() {
        
        return persis.traerDatos();
    }

    public void borrarMascota(int num_cliente) {
       persis.borrarMascota(num_cliente);
    }

    public Mascota traerMascota(int num_cliente) {
        
      return  persis.traerMacota(num_cliente);
        
    }

    public void modificarMascota(Mascota masco, String nombreMasco, String raza, String color, String observaciones, String alergico, String atenEsp, String nombDueno, String celDueno) {

     masco.setNombre(nombreMasco);
     masco.setRaza(raza);
     masco.setColor(color);
     masco.setAlegico(alergico);
     masco.setAtencion_especial(atenEsp);
     masco.setObservasiones(observaciones);
     
     //modificar mascota en la persistencia
     persis.modificarMascota(masco);
     
     //LLamo al dueno mediante el id
     Dueno duenio = this.buscarDueno(masco.getUnDueno().getId_dueno());
     
     //Seteo los valores del  Dueno
     duenio.setNombre(nombDueno);
     duenio.setCel_dueno(celDueno);
     
     this.modificarDueno(duenio);
    }

    private Dueno buscarDueno(int id_dueno) {

     return persis.traerDueno(id_dueno);
     
    }

    private void modificarDueno(Dueno duenio) {

        persis.modificarDueno(duenio
        );
    }




}
