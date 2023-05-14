
package com.portfolio.Jonathan.Interface;

import com.portfolio.Jonathan.Entity.Habilidades;
import java.util.List;

public interface IHabilidadesInterface {
    
    public List<Habilidades> verHabilidades();

    public void crearHabilidades(Habilidades habilidades);

    public void borrarHabilidades(Long id);

    public Habilidades buscarHabilidades(Long id);

    public void editarHabilidades(Habilidades habilidades);
}
