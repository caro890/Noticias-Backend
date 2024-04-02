package lab4.tp2.NoticiasBackend.services;

import lab4.tp2.NoticiasBackend.entities.Empresa;
import lab4.tp2.NoticiasBackend.repositories.EmpresaRepository;

import java.util.List;

public interface EmpresaService extends BaseService<Empresa, Long>{
    public List<EmpresaRepository.EmpresaIdDenominacionProjection> empresasData() throws Exception;
}
