
package com.portfolio.Jonathan.Service;

import com.portfolio.Jonathan.Entity.Proyectos;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.Jonathan.Repository.IProyectosRepository;
import com.portfolio.Jonathan.Interface.IProyectosInterface;



@Service
public class ProyectosService implements IProyectosInterface{
    
    @Autowired
    public IProyectosRepository ProyectosRepo;
    
    @Override
    public List<Proyectos> verProyectos() {
        return ProyectosRepo.findAll();
    }

    @Override
    public void crearProyectos(Proyectos proyectos) {
       ProyectosRepo.save(proyectos);
    }

    @Override
    public void borrarProyectos(Long id) {
       ProyectosRepo.deleteById(id);
    }

    @Override
    public Proyectos buscarProyectos(Long id) {
       return ProyectosRepo.findById(id).orElse(null);
    }

    @Override
    public void editarProyectos(Proyectos proyectos) {
        ProyectosRepo.save(proyectos);
    }
    
}
