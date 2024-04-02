package lab4.tp2.NoticiasBackend.services;

import lab4.tp2.NoticiasBackend.entities.Empresa;

import java.util.List;

public interface EmpresaService extends BaseService<Empresa, Long>{
    public List<Empresa> empresasData() throws Exception;
}
