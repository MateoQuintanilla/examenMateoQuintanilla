package ec.edu.espe.arquitectura.examenmateoquintanilla.model;

import java.security.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Version;

@Entity
@Table(name = "SEG_USUARIO_PERFIL")
public class segUsuarioPerfil {

    @EmbeddedId
    private segUsuarioPerfilPK pk;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FECHA_CREACION", nullable = false)
    private Timestamp fechaCreacion;

    @Column(name = "ES_ACTIVO", nullable = false)
    private Boolean estado;

    @Version
    @Column(name = "VERSION", nullable = false)
    private Long version;

    @ManyToOne
    @JoinColumn(name = "COD_USUARIO", referencedColumnName = "COD_USUARIO", insertable = false, updatable = false, nullable = false)
    private segUsuario usuario;

    @ManyToOne
    @JoinColumn(name = "COD_PERFIL", referencedColumnName = "COD_PERFIL", insertable = false, updatable = false, nullable = false)
    private segPerfil perfil;

    public segUsuarioPerfil() {
    }

    public segUsuarioPerfil(segUsuarioPerfilPK pk) {
        this.pk = pk;
    }

    public segUsuarioPerfilPK getPk() {
        return pk;
    }

    public void setPk(segUsuarioPerfilPK pk) {
        this.pk = pk;
    }

    public Timestamp getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Timestamp fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "segUsuarioPerfil [pk=" + pk + ", fechaCreacion=" + fechaCreacion + ", estado=" + estado + ", version="
                + version + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((pk == null) ? 0 : pk.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        segUsuarioPerfil other = (segUsuarioPerfil) obj;
        if (pk == null) {
            if (other.pk != null)
                return false;
        } else if (!pk.equals(other.pk))
            return false;
        return true;
    }

}
