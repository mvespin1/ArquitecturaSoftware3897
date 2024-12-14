package ec.edu.espe.universidad.institucion.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

import jakarta.persistence.*;

@Entity
@Table(name = "OFI_INSTITUCION")
public class OfiInstitucion implements Serializable {

    @Id
    @Column(name = "COD_INSTITUCION", nullable = false, length = 3)
    private Integer codigo;
    @NotNull
    @Column(name = "RUC", nullable = false, length = 13)
    private String ruc;
    @NotNull
    @Column(name = "RAZON_SOCIAL", nullable = false, length = 250)
    private String razonSocial;
    @NotNull
    @Column(name = "NOMBRE_COMERCIAL", nullable = false, length = 250)
    private String nombreComercial;

    public OfiInstitucion() {
    }

    public OfiInstitucion(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
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
        OfiInstitucion other = (OfiInstitucion) obj;
        if (codigo == null) {
            if (other.codigo != null)
                return false;
        } else if (!codigo.equals(other.codigo))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "OfiInstitucion [codigo=" + codigo + ", ruc=" + ruc + ", razonSocial=" + razonSocial
                + ", nombreComercial=" + nombreComercial + "]";
    }

}
