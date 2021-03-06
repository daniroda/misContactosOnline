package paquete.model;
// Generated 02-dic-2015 14:11:15 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Autores generated by hbm2java
 */
@Entity
@Table(name="autores"
    ,catalog="miscontactos"
)
public class Autores  implements java.io.Serializable {


     private Integer id;
     private String nombre;
     private String contacto;

    public Autores() {
    }

    public Autores(String nombre, String contacto) {
       this.nombre = nombre;
       this.contacto = contacto;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    
    @Column(name="nombre", nullable=false, length=45)
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    @Column(name="contacto", nullable=false, length=45)
    public String getContacto() {
        return this.contacto;
    }
    
    public void setContacto(String contacto) {
        this.contacto = contacto;
    }




}


