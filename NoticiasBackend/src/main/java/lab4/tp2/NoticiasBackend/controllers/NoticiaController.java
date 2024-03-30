package lab4.tp2.NoticiasBackend.controllers;

import lab4.tp2.NoticiasBackend.entities.Noticia;
import lab4.tp2.NoticiasBackend.services.NoticiaServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/api/noticias")
public class NoticiaController extends BaseControllerImpl<Noticia, NoticiaServiceImpl>{

    @PostMapping("/{id}")
    public ResponseEntity<?> save(@RequestBody Noticia entity,@PathVariable Long id) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.saveNoticiaId(entity,id));
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }
}
