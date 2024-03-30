package lab4.tp2.NoticiasBackend.repositories;

import lab4.tp2.NoticiasBackend.entities.Noticia;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NoticiaRepository extends BaseRepository<Noticia, Long> {
}