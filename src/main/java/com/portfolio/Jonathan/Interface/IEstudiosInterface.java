
package com.portfolio.Jonathan.Interface;

import com.portfolio.Jonathan.Entity.Estudios;
import java.util.List;



public interface IEstudiosInterface {
    
    public List<Estudios> verEstudios();

    public void crearEstudios(Estudios estudios);

    public void borrarEstudios(Long id);

    public Estudios buscarEstudios(Long id);

    public void editarEstudios(Estudios estudios);
}
