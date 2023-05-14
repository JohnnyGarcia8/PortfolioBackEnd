
package com.portfolio.Jonathan.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
@Table(name = "proyectos")
@Entity
public class Proyectos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id") 
    private Long id;
    
    @Column(name="title_proyecto", length = 50)
    private String title_proyecto;
    
    @Column(name="fecha_inicio", length = 50)
    private String fecha_inicio;
    
    @Column(name="fecha_fin", length = 50)
    private String fecha_fin;
    
    @Column(name="img_proyecto", length = 255)
    private String imgProyecto;
    
    @Column(name="descripcion", length = 255)
    private String descripcion;

    public Proyectos() {
    }

    public Proyectos(Long id, String title_proyecto, String fecha_inicio, String fecha_fin, String imgProyecto, String descripcion) {
        this.id = id;
        this.title_proyecto = title_proyecto;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.imgProyecto = imgProyecto;
        this.descripcion = descripcion;
    }
    
}
