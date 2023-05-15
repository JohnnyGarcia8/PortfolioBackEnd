
package com.portfolio.Jonathan.Controller;


import com.portfolio.Jonathan.Entity.PersonaPerfil;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.portfolio.Jonathan.Interface.IPersonaPerfilInterface;


@RestController
@CrossOrigin(origins = "https://portfoliojg-3a7ff.web.app")
public class PersonaPerfilController {
    
    @Autowired
    private IPersonaPerfilInterface PersonaPerfilService;
    
    @GetMapping("/personaperfil/ver")
    @ResponseBody
    public List<PersonaPerfil> verPersonaPerfil() {
        return PersonaPerfilService.verPersonaPerfil();
    }
    
    @PostMapping("/personaperfil/crear")
    public void crearPersonaPerfil(@RequestBody PersonaPerfil personaperfil) {
        PersonaPerfilService.crearPersonaPerfil(personaperfil);
    }
    
    @DeleteMapping("/personaperfil/borrar/{id}")
    public void borrarPersonaPerfil(@PathVariable Long id) {
        PersonaPerfilService.borrarPersonaPerfil(id);
    }
    
    @GetMapping("/personaperfil/buscar/{id}")
    @ResponseBody
    public PersonaPerfil buscarPersonaPerfil(@PathVariable Long id) {
        return PersonaPerfilService.buscarPersonaPerfil(id);
    }
    
     @PutMapping("/personaperfil/editar/{id}")
    public void editarPersonaPerfil(@PathVariable Long id, @RequestBody PersonaPerfil personaperfil) {
        PersonaPerfilService.editarPersonaPerfil(personaperfil);
    }
}
