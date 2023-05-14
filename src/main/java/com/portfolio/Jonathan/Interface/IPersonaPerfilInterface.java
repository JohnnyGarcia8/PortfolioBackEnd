
package com.portfolio.Jonathan.Interface;

import com.portfolio.Jonathan.Entity.PersonaPerfil;
import java.util.List;




public interface IPersonaPerfilInterface {
    
    public List<PersonaPerfil> verPersonaPerfil();

    public void crearPersonaPerfil(PersonaPerfil personaperfil);

    public void borrarPersonaPerfil(Long id);

    public PersonaPerfil buscarPersonaPerfil(Long id);

    public void editarPersonaPerfil(PersonaPerfil personaperfil);
}
