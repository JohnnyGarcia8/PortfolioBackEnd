
package com.portfolio.Jonathan.Repository;



import com.portfolio.Jonathan.Entity.PersonaPerfil;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;



@Repository
public interface IPersonaPerfilRepository extends JpaRepository<PersonaPerfil, Long>{
    
}
