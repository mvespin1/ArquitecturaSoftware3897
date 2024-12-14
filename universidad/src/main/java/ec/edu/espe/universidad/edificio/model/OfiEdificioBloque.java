package ec.edu.espe.universidad.edificio.model;

import java.io.Serializable;

import jakarta.validation.constraints.NotNull;

import jakarta.persistence.*;

@Entity
@Table(name = "OFI_EDIFICIO_BLOQUE")
public class OfiEdificioBloque implements Serializable {

    @Id
    @Column(name = "COD_EDIFICIO_BLOQUE", nullable = false, length = 8)
    private String codigo;
    @NotNull
    @ManyToOne
    @JoinColumn(name = "COD_EDIFICIO", nullable = false, referencedColumnName = "COD_EDIFICIO", insertable = false, updatable = false)
    private OfiEdificio edificio;
    @NotNull
    @Column(name = "NOMBRE_BLOQUE", nullable = false, length = 128)
    private String nombreBloque;
    @NotNull
    @Column(name = "DESCRIPCION", nullable = false, length = 500)
    private String descripcion;

    public OfiEdificioBloque() {
    }

    public OfiEdificioBloque(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public OfiEdificio getEdificio() {
        return edificio;
    }

    public void setEdificio(OfiEdificio edificio) {
        this.edificio = edificio;
    }

    public String getNombreBloque() {
        return nombreBloque;
    }

    public void setNombreBloque(String nombreBloque) {
        this.nombreBloque = nombreBloque;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
        OfiEdificioBloque other = (OfiEdificioBloque) obj;
        if (codigo == null) {
            if (other.codigo != null)
                return false;
        } else if (!codigo.equals(other.codigo))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "OfiEdificioBloque [codigo=" + codigo + ", edificio=" + edificio + ", nombreBloque=" + nombreBloque
                + ", descripcion=" + descripcion + "]";
    }

}
