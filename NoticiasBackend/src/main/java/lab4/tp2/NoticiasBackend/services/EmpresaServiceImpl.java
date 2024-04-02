package lab4.tp2.NoticiasBackend.services;

import jakarta.transaction.Transactional;
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
    @Transactional
    public List<EmpresaRepository.EmpresaIdDenominacionProjection> empresasData() throws Exception {
        try{
            List<EmpresaRepository.EmpresaIdDenominacionProjection> entities = empresaRepository.findAllProjectedBy();
            return entities;
        } catch(Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
