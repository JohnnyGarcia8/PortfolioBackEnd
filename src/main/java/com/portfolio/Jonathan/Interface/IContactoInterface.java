
package com.portfolio.Jonathan.Interface;

import com.portfolio.Jonathan.Entity.Contacto;
import java.util.List;


public interface IContactoInterface {
    public List<Contacto> verContacto();

    public void crearContacto(Contacto contacto);

    public void borrarContacto(Long id);

    public Contacto buscarContacto(Long id);

    public void editarContacto(Contacto contacto);
    
}
