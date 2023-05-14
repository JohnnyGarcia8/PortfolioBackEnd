
package com.portfolio.Jonathan.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
@Table(name = "habilidades")
@Entity
public class Habilidades {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id") 
    private Long id;
    
    @Column(name="tecnologia", length = 50)
    private String tecnologia;
    
    @Column(name="porcentaje", length = 50)
    private String porcentaje;

    public Habilidades() {
    }

    public Habilidades(Long id, String tecnologia, String porcentaje) {
        this.id = id;
        this.tecnologia = tecnologia;
        this.porcentaje = porcentaje;
    }

}
