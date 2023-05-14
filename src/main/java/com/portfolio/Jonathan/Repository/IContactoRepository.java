
package com.portfolio.Jonathan.Repository;

import com.portfolio.Jonathan.Entity.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface IContactoRepository extends JpaRepository<Contacto, Long> {
    
}
