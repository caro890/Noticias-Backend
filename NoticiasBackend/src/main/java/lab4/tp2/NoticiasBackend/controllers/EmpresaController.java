package lab4.tp2.NoticiasBackend.controllers;

import lab4.tp2.NoticiasBackend.entities.Empresa;
import lab4.tp2.NoticiasBackend.services.EmpresaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/api/empresas")
public class EmpresaController extends BaseControllerImpl<Empresa, EmpresaServiceImpl>{

}
