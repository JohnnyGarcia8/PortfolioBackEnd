
package com.portfolio.Jonathan.Controller;


import com.portfolio.Jonathan.Entity.Habilidades;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.portfolio.Jonathan.Interface.IHabilidadesInterface;


@RestController
@CrossOrigin(origins = "https://portfoliojg-3a7ff.web.app")
public class HabilidadesController {
    
    @Autowired
    private IHabilidadesInterface HabilidadesService;
    
    @GetMapping("/habilidades/ver")
    @ResponseBody
    public List<Habilidades> verHabilidades() {
        return HabilidadesService.verHabilidades();
    }
    
    @PostMapping("/habilidades/crear")
    public void crearHabilidades(@RequestBody Habilidades habilidades) {
        HabilidadesService.crearHabilidades(habilidades);
    }
    
    @DeleteMapping("/habilidades/borrar/{id}")
    public void borrarHabilidades(@PathVariable Long id) {
        HabilidadesService.borrarHabilidades(id);
    }
    
    @GetMapping("/habilidades/buscar/{id}")
    @ResponseBody
    public Habilidades buscarHabilidades(@PathVariable Long id) {
        return HabilidadesService.buscarHabilidades(id);
    }
    
     @PutMapping("/habilidades/editar/{id}")
    public void editarHabilidades(@PathVariable Long id, @RequestBody Habilidades habilidades) {
        HabilidadesService.editarHabilidades(habilidades);
    }
}
