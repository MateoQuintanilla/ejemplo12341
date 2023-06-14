package ec.edu.espe.arquitectura.facturacion.model;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class ImpuestoPorcentajePK implements Serializable {
    @Column(name = "COD_IMPUESTO", length = 3, nullable = false)
    private String codigo;
    @Column(name = "PORCENTAJE", precision = 4, scale = 1, nullable = false)
    private BigDecimal porcentaje;

    public ImpuestoPorcentajePK() {
    }

    public ImpuestoPorcentajePK(String codigo, BigDecimal porcentaje) {
        this.codigo = codigo;
        this.porcentaje = porcentaje;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public BigDecimal getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(BigDecimal porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
        result = prime * result + ((porcentaje == null) ? 0 : porcentaje.hashCode());
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
        ImpuestoPorcentajePK other = (ImpuestoPorcentajePK) obj;
        if (codigo == null) {
            if (other.codigo != null)
                return false;
        } else if (!codigo.equals(other.codigo))
            return false;
        if (porcentaje == null) {
            if (other.porcentaje != null)
                return false;
        } else if (!porcentaje.equals(other.porcentaje))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "ImpuestoPorcentajePK [codigo=" + codigo + ", porcentaje=" + porcentaje + "]";
    }

}