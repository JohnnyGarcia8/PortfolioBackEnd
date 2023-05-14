
package com.portfolio.Jonathan.Repository;

import com.portfolio.Jonathan.Entity.Proyectos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IProyectosRepository extends JpaRepository<Proyectos, Long>{
    
}
