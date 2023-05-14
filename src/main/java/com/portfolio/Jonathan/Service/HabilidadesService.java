
package com.portfolio.Jonathan.Service;

import com.portfolio.Jonathan.Entity.Habilidades;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.Jonathan.Repository.IHabilidadesRepository;
import com.portfolio.Jonathan.Interface.IHabilidadesInterface;



@Service
public class HabilidadesService implements IHabilidadesInterface {
    
    @Autowired
    public IHabilidadesRepository HabilidadesRepo;
    
    @Override
    public List<Habilidades> verHabilidades() {
        return HabilidadesRepo.findAll();
    }

    @Override
    public void crearHabilidades(Habilidades habilidades) {
       HabilidadesRepo.save(habilidades);
    }

    @Override
    public void borrarHabilidades(Long id) {
       HabilidadesRepo.deleteById(id);
    }

    @Override
    public Habilidades buscarHabilidades(Long id) {
       return HabilidadesRepo.findById(id).orElse(null);
    }

    @Override
    public void editarHabilidades(Habilidades habilidades) {
        HabilidadesRepo.save(habilidades);
    }
    
    
    
}
