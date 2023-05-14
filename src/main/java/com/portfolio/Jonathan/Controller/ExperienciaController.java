
package com.portfolio.Jonathan.Controller;


import com.portfolio.Jonathan.Entity.Experiencia;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.portfolio.Jonathan.Interface.IExperienciaInterface;



@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ExperienciaController {
    
    @Autowired
    private IExperienciaInterface ExperienciaService;
    
    @GetMapping("/experiencia/ver")
    @ResponseBody
    public List<Experiencia> verExperiencia() {
        return ExperienciaService.verExperiencia();
    }
    
    @PostMapping("/experiencia/crear")
    public void crearExperiencia(@RequestBody Experiencia experiencia) {
        ExperienciaService.crearExperiencia(experiencia);
    }
    
    @DeleteMapping("/experiencia/borrar/{id}")
    public void borrarExperiencia(@PathVariable Long id) {
        ExperienciaService.borrarExperiencia(id);
    }
    
    @GetMapping("/experiencia/buscar/{id}")
    @ResponseBody
    public Experiencia buscarExperiencia(@PathVariable Long id) {
        return ExperienciaService.buscarExperiencia(id);
    }
    
     @PutMapping("/experiencia/editar/{id}")
    public void editarExperiencia(@PathVariable Long id, @RequestBody Experiencia experiencia) {
        ExperienciaService.editarExperiencia(experiencia);
    }
}
