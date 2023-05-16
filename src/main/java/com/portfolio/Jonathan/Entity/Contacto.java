
package com.portfolio.Jonathan.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
@Table(name = "contacto")
@Entity
public class Contacto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id") 
    private Long id;
     
    @Column(name="localidad", length = 100)
    private String localidad;
    
    @Column(name="new_email", length = 100)
    private String new_email;
    
    @Column(name="descripcion", length = 500)
    private String descripcion;
    
    @Column(name="url_redes1", length = 500)
    private String urlRedes1;
    
    @Column(name="url_redes2", length = 500)
    private String urlRedes2;
    
    @Column(name="url_redes3", length = 500)
    private String urlRedes3;
    public Contacto() {
    }

    public Contacto(Long id, String localidad, String new_email, String descripcion, String urlRedes1, String urlRedes2, String urlRedes3) {
        this.id = id;
        this.localidad = localidad;
        this.new_email = new_email;
        this.descripcion = descripcion;
        this.urlRedes1 = urlRedes1;
        this.urlRedes2 = urlRedes2;
        this.urlRedes3 = urlRedes3;
    }

   
}
