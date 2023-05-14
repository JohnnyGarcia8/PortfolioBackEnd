
package com.portfolio.Jonathan.Service;


import com.portfolio.Jonathan.Entity.PersonaPerfil;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.Jonathan.Repository.IPersonaPerfilRepository;
import com.portfolio.Jonathan.Interface.IPersonaPerfilInterface;



@Service
public class PersonaPerfilService implements IPersonaPerfilInterface {

    @Autowired
    public IPersonaPerfilRepository PersonaPerfRepo; 
    
    @Override
    public List<PersonaPerfil> verPersonaPerfil() {
        return PersonaPerfRepo.findAll();
    }

    @Override
    public void crearPersonaPerfil(PersonaPerfil personaperfil) {
       PersonaPerfRepo.save(personaperfil);
    }

    @Override
    public void borrarPersonaPerfil(Long id) {
        PersonaPerfRepo.deleteById(id);
    }

    @Override
    public PersonaPerfil buscarPersonaPerfil(Long id) {
        return PersonaPerfRepo.findById(id).orElse(null);
    }

    @Override
    public void editarPersonaPerfil(PersonaPerfil personaperfil) {
        PersonaPerfRepo.save(personaperfil);
    }
    
}
