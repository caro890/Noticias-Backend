package lab4.tp2.NoticiasBackend.controllers;

import lab4.tp2.NoticiasBackend.entities.Noticia;
import lab4.tp2.NoticiasBackend.services.EmpresaServiceImpl;
import lab4.tp2.NoticiasBackend.services.NoticiaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/api/noticias")
public class NoticiaController extends BaseControllerImpl<Noticia, NoticiaServiceImpl>{
    @Autowired
    private NoticiaServiceImpl noticiaService;

    @GetMapping("/ultimasNoticias/{id}")
    public ResponseEntity<?> getLastNews(@PathVariable Long id) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(noticiaService.getLastFive(id));
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

    @GetMapping("search")
    public ResponseEntity<?> search(@RequestParam Long id, @RequestParam String palabras){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(noticiaService.search(id, palabras));
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }
}
