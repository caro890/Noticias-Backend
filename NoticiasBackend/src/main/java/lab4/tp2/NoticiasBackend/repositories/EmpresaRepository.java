package lab4.tp2.NoticiasBackend.repositories;

import lab4.tp2.NoticiasBackend.entities.Empresa;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpresaRepository extends BaseRepository<Empresa, Long> {
    @Query("SELECT id,denominacion FROM empresa")
    List<Empresa> listIndexEmpresa();
}
