
package com.portfolio.Jonathan.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;




@Getter
@Setter
@Table(name = "estudios")
@Entity
public class Estudios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id") 
    private Long id;

    @Column(name="institucion", length = 50)
    private String institucion;
    
    @Column(name="titulo_insti", length = 100)
    private String titulo_insti;
    
    @Column(name="inicio", length = 50)
    private String inicio;
    
    @Column(name="fin", length = 50)
    private String fin;
    
    @Column(name="descripcion", length = 500)
    private String descripcion;
    
    @Column(name="certificados", length = 500)
    private String certificados;

    public Estudios() {
    }

    public Estudios(Long id, String institucion, String titulo_insti, String inicio, String fin, String descripcion, String certificados) {
        this.id = id;
        this.institucion = institucion;
        this.titulo_insti = titulo_insti;
        this.inicio = inicio;
        this.fin = fin;
        this.descripcion = descripcion;
        this.certificados = certificados;
    }
    
}
