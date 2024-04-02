package lab4.tp2.NoticiasBackend.controllers;

import lab4.tp2.NoticiasBackend.entities.Empresa;
import lab4.tp2.NoticiasBackend.entities.Noticia;
import lab4.tp2.NoticiasBackend.services.EmpresaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/api/empresas")
public class EmpresaController extends BaseControllerImpl<Empresa, EmpresaServiceImpl>{
    @Autowired
    private EmpresaServiceImpl empresaService;

    @GetMapping("/listaIndex")
    public ResponseEntity<?> listaIndex() {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(empresaService.empresasData());
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }
}
