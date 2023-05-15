
package com.portfolio.Jonathan.Controller;


import com.portfolio.Jonathan.Entity.Proyectos;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.portfolio.Jonathan.Interface.IProyectosInterface;


@RestController
@CrossOrigin(origins = "https://portfoliojg-3a7ff.web.app")
public class ProyectosController {
    
    @Autowired
    private IProyectosInterface ProyectosService;
    
    @GetMapping("/proyectos/ver")
    @ResponseBody
    public List<Proyectos> verProyectos() {
        return ProyectosService.verProyectos();
    }
    
    @PostMapping("/proyectos/crear")
    public void crearProyectos(@RequestBody Proyectos proyectos) {
        ProyectosService.crearProyectos(proyectos);
    }
    
    @DeleteMapping("/proyectos/borrar/{id}")
    public void borrarProyectos(@PathVariable Long id) {
        ProyectosService.borrarProyectos(id);
    }
    
    @GetMapping("/proyectos/buscar/{id}")
    @ResponseBody
    public Proyectos buscarProyectos(@PathVariable Long id) {
        return ProyectosService.buscarProyectos(id);
    }
    
     @PutMapping("/proyectos/editar/{id}")
    public void editarProyectos(@PathVariable Long id, @RequestBody Proyectos proyectos) {
        ProyectosService.editarProyectos(proyectos);
    }
}
