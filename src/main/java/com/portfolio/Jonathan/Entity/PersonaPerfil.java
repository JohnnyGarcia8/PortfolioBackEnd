
package com.portfolio.Jonathan.Entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;



@Getter 
@Setter
@Table(name = "persona_perfil")

@Entity
public class PersonaPerfil {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column(name="id")
    private Long id;
    
    @Column(name="nombre", length = 50)
    private String nombre;
    
    @Column(name="apellido", length = 50)
    private String apellido;
    
    @Column(name="titulo_acad", length = 50)
    private String titulo_acad;
    
    @Column(name="descripcion", length = 255)
    private String descripcion;
    
    @Column(name="cv", length = 255)
    private String cv;
    
    @Column(name="foto_url", length = 255)
    private String fotoUrl;
    

    public PersonaPerfil() {
    }

    public PersonaPerfil(Long id, String nombre, String apellido, String titulo_acad, String descripcion, String cv, String fotoUrl) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo_acad = titulo_acad;
        this.descripcion = descripcion;
        this.cv = cv;
        this.fotoUrl = fotoUrl;
    }
  
}
