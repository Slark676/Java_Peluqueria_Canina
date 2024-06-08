
package com.mycompany.peluqueriacanina.persistencia;

import com.mycompany.peluqueriacanina.logica.Dueno;
import com.mycompany.peluqueriacanina.logica.Mascota;
import com.mycompany.peluqueriacanina.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class PersistenciaJava {
    
    DuenoJpaController duenoJpa= new DuenoJpaController();
    MascotaJpaController mascoJpa= new MascotaJpaController();

    public void guardar(Dueno dueno, Mascota masco) {
      //Crear en la base de datos del Due?o  
      duenoJpa.create(dueno);
      
      //Crear en la base de datos de la Mascota
      mascoJpa.create(masco);
    }

    public List<Mascota> traerDatos() {
        return mascoJpa.findMascotaEntities();
    }

    public void borrarMascota(int num_cliente) {
        try {
            mascoJpa.destroy(num_cliente);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(PersistenciaJava.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Mascota traerMacota(int num_cliente) {
      return mascoJpa.findMascota(num_cliente);
    }

    public void modificarMascota(Mascota masco) {

        try {
            mascoJpa.edit(masco);
        } catch (Exception ex) {
            Logger.getLogger(PersistenciaJava.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Dueno traerDueno(int id_dueno){
        return duenoJpa.findDueno(id_dueno);
    }

    public void modificarDueno(Dueno duenio) {
        try {
            duenoJpa.edit(duenio);
        } catch (Exception ex) {
            Logger.getLogger(PersistenciaJava.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
