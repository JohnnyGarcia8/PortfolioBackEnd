
package com.portfolio.Jonathan.Interface;

import com.portfolio.Jonathan.Entity.Experiencia;
import java.util.List;



public interface IExperienciaInterface {
    
    public List<Experiencia> verExperiencia();

    public void crearExperiencia(Experiencia experiencia);

    public void borrarExperiencia(Long id);

    public Experiencia buscarExperiencia(Long id);

    public void editarExperiencia(Experiencia experiencia);
}
