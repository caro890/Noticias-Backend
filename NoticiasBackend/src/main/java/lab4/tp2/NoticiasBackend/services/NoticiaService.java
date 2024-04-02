package lab4.tp2.NoticiasBackend.services;

import lab4.tp2.NoticiasBackend.entities.Noticia;

import java.util.List;

public interface NoticiaService extends BaseService<Noticia, Long>{
    public List<Noticia> search(Long idEmpresa, String palabras) throws Exception;
    public List<Noticia> getLastFive(Long idEmpresa) throws Exception;
}
