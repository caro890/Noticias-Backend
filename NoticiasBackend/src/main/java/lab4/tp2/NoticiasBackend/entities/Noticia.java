package lab4.tp2.NoticiasBackend.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import java.util.Date;

@Entity
@Table(name = "Noticia")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Audited
public class Noticia extends Base{
    @Column(name = "titulo_noticia", length = 128)
    private String titulo;

    @Column(name = "resumen_noticia", length = 1024)
    private String resumen;

    @Column(name = "imagen_noticia", length = 128)
    private String imagen;

    @Column(name = "contenido_html", length = 20480)
    private String contenido_html;

    @Column(name = "publicada", length = 1)
    private char publicada;

    @Column(name = "fecha_publicacion")
    private Date fecha;

    @Column(name = "empresa_id")
    private Long idEmpresa;
}