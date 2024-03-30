package lab4.tp2.NoticiasBackend.services;

import jakarta.transaction.Transactional;
import lab4.tp2.NoticiasBackend.entities.Empresa;
import lab4.tp2.NoticiasBackend.entities.Noticia;
import lab4.tp2.NoticiasBackend.repositories.BaseRepository;
import lab4.tp2.NoticiasBackend.repositories.EmpresaRepository;
import lab4.tp2.NoticiasBackend.repositories.NoticiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NoticiaServiceImpl extends BaseServiceImpl<Noticia,Long> implements NoticiaService {
    @Autowired
    private NoticiaRepository noticiaRepository;
    private EmpresaRepository empresaRepository;
    public NoticiaServiceImpl(BaseRepository<Noticia, Long> baseRepository ,NoticiaRepository noticiaRepository,EmpresaRepository empresaRepository) {
        super(baseRepository);
        this.noticiaRepository = noticiaRepository;
        this.empresaRepository = empresaRepository;
    }
    @Transactional
    public Noticia saveNoticiaId(Noticia entity,Long id) throws Exception {
        try {
            if(empresaRepository.existsById(id)){
                Optional<Empresa> empresa = empresaRepository.findById(id);

                entity.setEmpresa(empresa.get());
                return noticiaRepository.save(entity);
            }else{
                throw new Exception("No existe la empresa");
            }
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }

    }
}
