
package com.portfolio.Jonathan.Repository;

import com.portfolio.Jonathan.Entity.Habilidades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IHabilidadesRepository extends JpaRepository<Habilidades, Long> {
    
}
