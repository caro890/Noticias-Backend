package lab4.tp2.NoticiasBackend.services;

import lab4.tp2.NoticiasBackend.entities.Empresa;
import lab4.tp2.NoticiasBackend.repositories.BaseRepository;
import lab4.tp2.NoticiasBackend.repositories.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpresaServiceImpl extends BaseServiceImpl<Empresa, Long> implements EmpresaService {
    @Autowired
    private EmpresaRepository empresaRepository;

    public EmpresaServiceImpl(BaseRepository<Empresa, Long> baseRepository, EmpresaRepository empresaRepository) {
        super(baseRepository);
        this.empresaRepository = empresaRepository;
    }
}
