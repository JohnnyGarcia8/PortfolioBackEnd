
package com.portfolio.Jonathan.Controller;


import com.portfolio.Jonathan.Entity.Estudios;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.portfolio.Jonathan.Interface.IEstudiosInterface;
 

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class EstudiosController {
    
    @Autowired
    private IEstudiosInterface EstudiosService;
    
    @GetMapping("/estudios/ver")
    @ResponseBody
    public List<Estudios> verEstudios() {
        return EstudiosService.verEstudios();
    }
    
    @PostMapping("/estudios/crear")
    public void crearEstudios(@RequestBody Estudios estudios) {
        EstudiosService.crearEstudios(estudios);
    }
    
    @DeleteMapping("/estudios/borrar/{id}")
    public void borrarEstudios(@PathVariable Long id) {
        EstudiosService.borrarEstudios(id);
    }
    
    @GetMapping("/estudios/buscar/{id}")
    @ResponseBody
    public Estudios buscarEstudios(@PathVariable Long id) {
        return EstudiosService.buscarEstudios(id);
    }
    
     @PutMapping("/estudios/editar/{id}")
    public void editarEstudios(@PathVariable Long id, @RequestBody Estudios estudios) {
        EstudiosService.editarEstudios(estudios);
    }
    
}
