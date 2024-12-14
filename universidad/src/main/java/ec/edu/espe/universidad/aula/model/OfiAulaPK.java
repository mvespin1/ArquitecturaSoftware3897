package ec.edu.espe.universidad.aula.model;

import jakarta.validation.constraints.NotNull;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;

@Embeddable
public class OfiAulaPK implements Serializable {

    @NotNull
    @Column(name = "COD_AULA", nullable = false)
    private BigDecimal codigoAula;
    @NotNull
    @Column(name = "COD_EDIFICIO", length = 8, nullable = false)
    private String codigoEdificio;
    @NotNull
    @Column(name = "COD_EDIFICIO_BLOQUE", length = 8, nullable = false)
    private String codigoEdificioBloque;

    public OfiAulaPK() {
    }

    public OfiAulaPK(@NotNull BigDecimal codigoAula) {
        this.codigoAula = codigoAula;
    }

    public BigDecimal getCodigoAula() {
        return codigoAula;
    }

    public void setCodigoAula(BigDecimal codigoAula) {
        this.codigoAula = codigoAula;
    }

    public String getCodigoEdificio() {
        return codigoEdificio;
    }

    public void setCodigoEdificio(String codigoEdificio) {
        this.codigoEdificio = codigoEdificio;
    }

    public String getCodigoEdificioBloque() {
        return codigoEdificioBloque;
    }

    public void setCodigoEdificioBloque(String codigoEdificioBloque) {
        this.codigoEdificioBloque = codigoEdificioBloque;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codigoAula == null) ? 0 : codigoAula.hashCode());
        result = prime * result + ((codigoEdificio == null) ? 0 : codigoEdificio.hashCode());
        result = prime * result + ((codigoEdificioBloque == null) ? 0 : codigoEdificioBloque.hashCode());
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
        OfiAulaPK other = (OfiAulaPK) obj;
        if (codigoAula == null) {
            if (other.codigoAula != null)
                return false;
        } else if (!codigoAula.equals(other.codigoAula))
            return false;
        if (codigoEdificio == null) {
            if (other.codigoEdificio != null)
                return false;
        } else if (!codigoEdificio.equals(other.codigoEdificio))
            return false;
        if (codigoEdificioBloque == null) {
            if (other.codigoEdificioBloque != null)
                return false;
        } else if (!codigoEdificioBloque.equals(other.codigoEdificioBloque))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "OfiAulaPK [codigoAula=" + codigoAula + ", codigoEdificio=" + codigoEdificio + ", codigoEdificioBloque="
                + codigoEdificioBloque + "]";
    }

}
