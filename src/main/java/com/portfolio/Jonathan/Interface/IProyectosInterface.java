
package com.portfolio.Jonathan.Interface;

import com.portfolio.Jonathan.Entity.Proyectos;
import java.util.List;


public interface IProyectosInterface {
    
    public List<Proyectos> verProyectos();

    public void crearProyectos(Proyectos proyectos);

    public void borrarProyectos(Long id);

    public Proyectos buscarProyectos(Long id);

    public void editarProyectos(Proyectos proyectos);
}
