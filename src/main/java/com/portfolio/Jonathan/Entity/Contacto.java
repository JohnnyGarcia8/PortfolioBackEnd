
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
    
    @Column(name="title_direccion", length = 50)
    private String title_direccion;
    
    @Column(name="localidad", length = 50)
    private String localidad;
    
    @Column(name="title_email", length = 50)
    private String title_email;
    
    @Column(name="new_email", length = 100)
    private String new_email;
    
    @Column(name="descripcion", length = 255)
    private String descripcion;
    
    @Column(name="url_redes1", length = 255)
    private String urlRedes1;
    
    @Column(name="url_redes2", length = 255)
    private String urlRedes2;
    
    @Column(name="url_redes3", length = 255)
    private String urlRedes3;
    
    @Column(name="form_nombre", length = 50)
    private String form_nombre;
    
    @Column(name="form_email", length = 50)
    private String form_email;
    
    @Column(name="form_mensaje", length = 50)
    private String form_mensaje;

    public Contacto() {
    }

    public Contacto(Long id, String title_direccion, String localidad, String title_email, String new_email, String descripcion, String urlRedes1, String urlRedes2, String urlRedes3, String form_nombre, String form_email, String form_mensaje) {
        this.id = id;
        this.title_direccion = title_direccion;
        this.localidad = localidad;
        this.title_email = title_email;
        this.new_email = new_email;
        this.descripcion = descripcion;
        this.urlRedes1 = urlRedes1;
        this.urlRedes2 = urlRedes2;
        this.urlRedes3 = urlRedes3;
        this.form_nombre = form_nombre;
        this.form_email = form_email;
        this.form_mensaje = form_mensaje;
    }
}
