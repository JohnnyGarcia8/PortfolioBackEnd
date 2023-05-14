
package com.portfolio.Jonathan.Service;

import com.portfolio.Jonathan.Entity.Estudios;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.Jonathan.Repository.IEstudiosRepository;
import com.portfolio.Jonathan.Interface.IEstudiosInterface;



@Service
public class EstudiosService implements IEstudiosInterface{
    
    @Autowired
    public IEstudiosRepository EstudiosRepo;
    
    @Override
    public List<Estudios> verEstudios() {
        return EstudiosRepo.findAll();
    }

    @Override
    public void crearEstudios(Estudios estudios) {
       EstudiosRepo.save(estudios);
    }

    @Override
    public void borrarEstudios(Long id) {
       EstudiosRepo.deleteById(id);
    }

    @Override
    public Estudios buscarEstudios(Long id) {
       return EstudiosRepo.findById(id).orElse(null);
    }

    @Override
    public void editarEstudios(Estudios estudios) {
        EstudiosRepo.save(estudios);
    }
    
}
