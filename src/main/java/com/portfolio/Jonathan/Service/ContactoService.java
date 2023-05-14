
package com.portfolio.Jonathan.Service;

import com.portfolio.Jonathan.Entity.Contacto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.Jonathan.Repository.IContactoRepository;
import com.portfolio.Jonathan.Interface.IContactoInterface;



@Service
public class ContactoService implements IContactoInterface{
    
    @Autowired
    public IContactoRepository ContactoRepo;
    
    @Override
    public List<Contacto> verContacto() {
        return ContactoRepo.findAll();
    }

    @Override
    public void crearContacto(Contacto contacto) {
       ContactoRepo.save(contacto);
    }

    @Override
    public void borrarContacto(Long id) {
       ContactoRepo.deleteById(id);
    }

    @Override
    public Contacto buscarContacto(Long id) {
       return ContactoRepo.findById(id).orElse(null);
    }

    @Override
    public void editarContacto(Contacto contacto) {
        ContactoRepo.save(contacto);
    }
}
