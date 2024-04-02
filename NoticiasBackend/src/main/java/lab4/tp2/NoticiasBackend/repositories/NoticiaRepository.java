package lab4.tp2.NoticiasBackend.repositories;

import lab4.tp2.NoticiasBackend.entities.Noticia;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NoticiaRepository extends BaseRepository<Noticia, Long> {
    @Query(value = "SELECT * FROM noticia WHERE empresa_id = ?1 " +
            "AND (CONCAT(titulo_noticia, ' ', resumen_noticia) LIKE %?2%) " +
            "ORDER BY fecha_publicacion DESC",
            nativeQuery = true)
    List<Noticia> search(Long idEmpresa, String palabras);

    @Query( value  = "SELECT * from noticia WHERE empresa_id = ?1 " +
            "ORDER BY fecha_publicacion DESC",
            nativeQuery = true)
    List<Noticia> search(Long idEmpresa);

    @Query( value = "SELECT * FROM noticia WHERE empresa_id = ?1 " +
            "ORDER BY fecha_publicacion DESC LIMIT 5",
            nativeQuery = true)
    List<Noticia> getLastFive(Long idEmpresa);
}