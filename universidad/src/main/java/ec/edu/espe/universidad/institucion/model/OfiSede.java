package ec.edu.espe.universidad.institucion.model;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;

import jakarta.persistence.*;

@Entity
@Table(name = "OFI_SEDE")
public class OfiSede implements Serializable {

    @Id
    @Column(name = "COD_SEDE", nullable = false, length = 8)
    private String codigo;
    @ManyToOne
    @JoinColumn(name = "COD_INSTITUCION", nullable = false, referencedColumnName = "COD_INSTITUCION", insertable = false, updatable = false)
    private OfiInstitucion institucion;
    @NotNull
    @Column(name = "NOMBRE", nullable = false, length = 128)
    private String nombre;
    @NotNull
    @Column(name = "DIRECCION", nullable = false, length = 128)
    private String direccion;
    @Column(name = "ES_PRINCIPAL")
    private Boolean esPrincipal;
    @Column(name = "PRESUPUESTO", precision = 18, scale = 2)
    private BigDecimal presupuesto;

    public OfiSede() {
    }

    public OfiSede(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public OfiInstitucion getInstitucion() {
        return institucion;
    }

    public void setInstitucion(OfiInstitucion institucion) {
        this.institucion = institucion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Boolean getEsPrincipal() {
        return esPrincipal;
    }

    public void setEsPrincipal(Boolean esPrincipal) {
        this.esPrincipal = esPrincipal;
    }

    public BigDecimal getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(BigDecimal presupuesto) {
        this.presupuesto = presupuesto;
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
        OfiSede other = (OfiSede) obj;
        if (codigo == null) {
            if (other.codigo != null)
                return false;
        } else if (!codigo.equals(other.codigo))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "OfiSede [codigo=" + codigo + ", institucion=" + institucion + ", nombre=" + nombre + ", direccion="
                + direccion + ", esPrincipal=" + esPrincipal + ", presupuesto=" + presupuesto + "]";
    }

}
