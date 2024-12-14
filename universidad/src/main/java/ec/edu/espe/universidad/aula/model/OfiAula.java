package ec.edu.espe.universidad.aula.model;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.validation.constraints.NotNull;

import jakarta.persistence.*;

@Entity
@Table(name = "OFI_AULA")
public class OfiAula implements Serializable {

    @EmbeddedId
    private OfiAulaPK pk;
    @NotNull
    @ManyToOne
    @JoinColumn(name = "COD_TIPO_AULA", nullable = false, referencedColumnName = "COD_TIPO_AULA", insertable = false, updatable = false)
    private OfiTipoAula tipoAula;
    @NotNull
    @Column(name = "COD_ALTERNO", nullable = false, length = 10)
    private String codigoAlterno;
    @NotNull
    @Column(name = "CAPACIDAD", nullable = false, length = 4)
    private Integer capacidad;
    @NotNull
    @Column(name = "PISO", nullable = false, length = 2)
    private Integer piso;
    @NotNull
    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_CREACION", nullable = false)
    private LocalDate fechaCreacion;
    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FECHA_ULT_ACTUALIZACION", nullable = false)
    private LocalDate fechaUltActualizacion;

    public OfiAula() {
    }

    public OfiAula(OfiAulaPK pk) {
        this.pk = pk;
    }

    public OfiAulaPK getPk() {
        return pk;
    }

    public void setPk(OfiAulaPK pk) {
        this.pk = pk;
    }

    public OfiTipoAula getTipoAula() {
        return tipoAula;
    }

    public void setTipoAula(OfiTipoAula tipoAula) {
        this.tipoAula = tipoAula;
    }

    public String getCodigoAlterno() {
        return codigoAlterno;
    }

    public void setCodigoAlterno(String codigoAlterno) {
        this.codigoAlterno = codigoAlterno;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public Integer getPiso() {
        return piso;
    }

    public void setPiso(Integer piso) {
        this.piso = piso;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDate getFechaUltActualizacion() {
        return fechaUltActualizacion;
    }

    public void setFechaUltActualizacion(LocalDate fechaUltActualizacion) {
        this.fechaUltActualizacion = fechaUltActualizacion;
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
        OfiAula other = (OfiAula) obj;
        if (pk == null) {
            if (other.pk != null)
                return false;
        } else if (!pk.equals(other.pk))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "OfiAula [pk=" + pk + ", tipoAula=" + tipoAula + ", codigoAlterno=" + codigoAlterno + ", capacidad="
                + capacidad + ", piso=" + piso + ", fechaCreacion=" + fechaCreacion + ", fechaUltActualizacion="
                + fechaUltActualizacion + "]";
    }

}
