package ec.edu.espe.arquitectura.examenmateoquintanilla.model;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Version;

@Entity
@Table(name = "SEG_USUARIO")
public class segUsuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "COD_USUARIO", nullable = false)
    private Integer codigo;

    @Column(name = "MAIL", length = 128, nullable = false)
    private String correo;

    @Column(name = "CLAVE", length = 64, nullable = false)
    private String clave;

    @Column(name = "NOMBRE", length = 128, nullable = false)
    private String nombre;

    @Column(name = "INTENTOS_FALLIDOS", precision = 8, scale = 0, nullable = false)
    private BigDecimal intentosFallidos;

    @Column(name = "SUELDO", precision = 8, scale = 2, nullable = false)
    private BigDecimal sueldo;

    @Column(name = "FECHA_NACIMIENTO", nullable = false)
    private Date fechaNacimiento;

    @Version
    @Column(name = "VERSION", nullable = false)
    private Long version;

    public segUsuario() {
    }

    public segUsuario(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getIntentosFallidos() {
        return intentosFallidos;
    }

    public void setIntentosFallidos(BigDecimal intentosFallidos) {
        this.intentosFallidos = intentosFallidos;
    }

    public BigDecimal getSueldo() {
        return sueldo;
    }

    public void setSueldo(BigDecimal sueldo) {
        this.sueldo = sueldo;
    }

    

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
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
        segUsuario other = (segUsuario) obj;
        if (codigo == null) {
            if (other.codigo != null)
                return false;
        } else if (!codigo.equals(other.codigo))
            return false;
        return true;
    }


    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "segUsuario [codigo=" + codigo + ", correo=" + correo + ", clave=" + clave + ", nombre=" + nombre
                + ", intentosFallidos=" + intentosFallidos + ", sueldo=" + sueldo + ", fechaNacimiento="
                + fechaNacimiento + ", version=" + version + "]";
    }

    
}
