
package com.portfolio.Jonathan.Service;

import com.portfolio.Jonathan.Entity.Experiencia;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.Jonathan.Repository.IExperienciaRepository;
import com.portfolio.Jonathan.Interface.IExperienciaInterface;



@Service
public class ExperienciaService implements IExperienciaInterface{

    @Autowired
    public IExperienciaRepository ExperienciaRepo;
    
    @Override
    public List<Experiencia> verExperiencia() {
        return ExperienciaRepo.findAll();
    }

    @Override
    public void crearExperiencia(Experiencia experiencia) {
       ExperienciaRepo.save(experiencia);
    }

    @Override
    public void borrarExperiencia(Long id) {
       ExperienciaRepo.deleteById(id);
    }

    @Override
    public Experiencia buscarExperiencia(Long id) {
       return ExperienciaRepo.findById(id).orElse(null);
    }

    @Override
    public void editarExperiencia(Experiencia experiencia) {
        ExperienciaRepo.save(experiencia);
    }
    
}
