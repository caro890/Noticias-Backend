package lab4.tp2.NoticiasBackend.services;

import lab4.tp2.NoticiasBackend.entities.Empresa;
import lab4.tp2.NoticiasBackend.repositories.BaseRepository;
import lab4.tp2.NoticiasBackend.repositories.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpresaServiceImpl extends BaseServiceImpl<Empresa, Long> implements EmpresaService {
    @Autowired
    private EmpresaRepository empresaRepository;

    public EmpresaServiceImpl(BaseRepository<Empresa, Long> baseRepository, EmpresaRepository empresaRepository) {
        super(baseRepository);
        this.empresaRepository = empresaRepository;
    }

    @Override
    public List<Empresa> empresasData() throws Exception {
        try{
            List<Empresa> entities = empresaRepository.listIndexEmpresa();
            return entities;
        } catch(Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
