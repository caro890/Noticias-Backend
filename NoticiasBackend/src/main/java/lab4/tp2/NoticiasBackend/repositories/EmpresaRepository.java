package lab4.tp2.NoticiasBackend.repositories;

import lab4.tp2.NoticiasBackend.entities.Empresa;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaRepository extends BaseRepository<Empresa, Long> {
}
