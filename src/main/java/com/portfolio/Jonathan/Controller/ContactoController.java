
package com.portfolio.Jonathan.Controller;


import com.portfolio.Jonathan.Entity.Contacto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.portfolio.Jonathan.Interface.IContactoInterface;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ContactoController {
    
    @Autowired
    private IContactoInterface ContactoService;
    
    @GetMapping("/contacto/ver")
    @ResponseBody
    public List<Contacto> verContacto() {
        return ContactoService.verContacto();
    }
    
    @PostMapping("/contacto/crear")
    public void crearContacto(@RequestBody Contacto contacto) {
        ContactoService.crearContacto(contacto);
    }
    
    @DeleteMapping("/contacto/borrar/{id}")
    public void borrarContacto(@PathVariable Long id) {
        ContactoService.borrarContacto(id);
    }
    
    @GetMapping("/contacto/buscar/{id}")
    @ResponseBody
    public Contacto buscarContacto(@PathVariable Long id) {
        return ContactoService.buscarContacto(id);
    }
    
     @PutMapping("/contacto/editar/{id}")
    public void editarContacto(@PathVariable Long id, @RequestBody Contacto contacto) {
        ContactoService.editarContacto(contacto);
    }

    
}
