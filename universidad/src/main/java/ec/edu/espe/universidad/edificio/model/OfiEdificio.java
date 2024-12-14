package ec.edu.espe.universidad.edificio.model;

import java.io.Serializable;

import jakarta.validation.constraints.NotNull;

import jakarta.persistence.*;
import ec.edu.espe.universidad.institucion.model.*;

@Entity
@Table(name = "OFI_EDIFICIO")
public class OfiEdificio implements Serializable {

    @Id
    @Column(name = "COD_EDIFICIO", nullable = false, length = 8)
    private String codigo;
    @NotNull
    @ManyToOne
    @JoinColumn(name = "COD_SEDE", nullable = false, referencedColumnName = "COD_SEDE", insertable = false, updatable = false)
    private OfiSede sede;
    @NotNull
    @Column(name = "NOMBRE", nullable = false, length = 128)
    private String nombre;
    @NotNull
    @Column(name = "COD_ALTERNO", length = 16)
    private String codigoAlterno;
    @NotNull
    @Column(name = "DESCRIPCION", length = 500)
    private String descripcion;
    @NotNull
    @Column(name = "DIRECCION", length = 256)
    private String direccion;
    @NotNull
    @Column(name = "COMENTARIO", length = 1000)
    private String comentario;
    @NotNull
    @Column(name = "MANEJA_BLOQUES")
    private Boolean manejaBloques;
    @NotNull
    @Column(name = "POSEE_AULAS")
    private Boolean poseeAulas;
    @NotNull
    @Column(name = "PISOS", length = 2)
    private Integer pisos;

    public OfiEdificio() {
    }

    public OfiEdificio(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public OfiSede getSede() {
        return sede;
    }

    public void setSede(OfiSede sede) {
        this.sede = sede;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigoAlterno() {
        return codigoAlterno;
    }

    public void setCodigoAlterno(String codigoAlterno) {
        this.codigoAlterno = codigoAlterno;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Boolean getManejaBloques() {
        return manejaBloques;
    }

    public void setManejaBloques(Boolean manejaBloques) {
        this.manejaBloques = manejaBloques;
    }

    public Boolean getPoseeAulas() {
        return poseeAulas;
    }

    public void setPoseeAulas(Boolean poseeAulas) {
        this.poseeAulas = poseeAulas;
    }

    public Integer getPisos() {
        return pisos;
    }

    public void setPisos(Integer pisos) {
        this.pisos = pisos;
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
        OfiEdificio other = (OfiEdificio) obj;
        if (codigo == null) {
            if (other.codigo != null)
                return false;
        } else if (!codigo.equals(other.codigo))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "OfiEdificio [codigo=" + codigo + ", sede=" + sede + ", nombre=" + nombre + ", codigoAlterno="
                + codigoAlterno + ", descripcion=" + descripcion + ", direccion=" + direccion + ", comentario="
                + comentario + ", manejaBloques=" + manejaBloques + ", poseeAulas=" + poseeAulas + ", pisos=" + pisos
                + "]";
    }

}