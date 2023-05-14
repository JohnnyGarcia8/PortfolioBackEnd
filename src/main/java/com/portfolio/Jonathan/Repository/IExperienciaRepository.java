
package com.portfolio.Jonathan.Repository;

import com.portfolio.Jonathan.Entity.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IExperienciaRepository extends JpaRepository<Experiencia, Long>{
    
}
