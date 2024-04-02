package lab4.tp2.NoticiasBackend.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Empresa")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Audited
public class Empresa extends Base{

    @Column(name = "denominacion")
    private String denominacion;

    @Column(name="telefono")
    private String telefono;

    @Column(name = "horario_de_atencion")
    private String horario_de_atencion;

    @Column(name = "quienes_somos")
    private String quienes_somos;

    @Column(name = "latitud")
    private Double latitud;

    @Column(name = "longitud")
    private Double longitud;

    @Column(name = "domicilio")
    private String domicilio;

    @Column(name = "email")
    private String email;

    @OneToMany(mappedBy = "idEmpresa",cascade = CascadeType.ALL)
    private List<Noticia> noticias = new ArrayList<Noticia>();
}
