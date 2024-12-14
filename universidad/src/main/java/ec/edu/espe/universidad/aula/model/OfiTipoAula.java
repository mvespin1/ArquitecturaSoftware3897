package ec.edu.espe.universidad.aula.model;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.validation.constraints.NotNull;

import jakarta.persistence.*;

@Entity
@Table(name = "OFI_TIPO_AULA")
public class OfiTipoAula implements Serializable {

    @Id
    @Column(name = "COD_TIPO_AULA", nullable = false, length = 10)
    private String codigo;
    @NotNull
    @Column(name = "DESCRIPCION", nullable = false, length = 128)
    private String nombre;
    @NotNull
    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_CREACION", nullable = false)
    private LocalDate fechaCreacion;

    public OfiTipoAula() {
    }

    public OfiTipoAula(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
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
        OfiTipoAula other = (OfiTipoAula) obj;
        if (codigo == null) {
            if (other.codigo != null)
                return false;
        } else if (!codigo.equals(other.codigo))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "OfiTipoAula [codigo=" + codigo + ", nombre=" + nombre + ", fechaCreacion=" + fechaCreacion + "]";
    }

}
