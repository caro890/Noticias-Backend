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
    @Column(name = "titulo_noticia")
    private String titulo;

    @Column(name = "resumen_noticia")
    private String resumen;

    @Column(name = "imagen_noticia")
    private String imagen;

    @Column(name = "contenido_html")
    private String contenido_html;

    @Column(name = "publicada")
    private char publicada;

    @Column(name = "fecha_publicacion")
    private Date fecha;

    @ManyToOne
    @JoinColumn(name = "empresa_id")
    @JsonIgnore
    private Empresa empresa;
}