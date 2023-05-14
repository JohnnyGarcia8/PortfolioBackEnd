
package com.portfolio.Jonathan.Repository;

import com.portfolio.Jonathan.Entity.Estudios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IEstudiosRepository extends JpaRepository<Estudios, Long>{
    
}
