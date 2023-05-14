
package com.portfolio.Jonathan.Entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;




@Getter
@Setter
@Table(name = "experiencia")
@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id") 
    private Long id;
    
    @Column(name="empresa", length = 50)
    private String empresa;
    
    @Column(name="puesto", length = 100)
    private String puesto;
    
    @Column(name="fecha_inicio", length = 50)
    private String fecha_inicio;
    
    @Column(name="fecha_fin", length = 50)
    private String fecha_fin;
    
    @Column(name="descripcion", length = 255)
    private String descripcion;
    
    @Column(name="trabajo_actual", length = 255)
    private String trabajo_actual;
    
     public Experiencia() {
    }

    public Experiencia(Long id, String empresa, String puesto, String fecha_inicio, String fecha_fin, String descripcion, String trabajo_actual) {
        this.id = id;
        this.empresa = empresa;
        this.puesto = puesto;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.descripcion = descripcion;
        this.trabajo_actual = trabajo_actual;
    }
}
