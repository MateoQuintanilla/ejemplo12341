package ec.edu.espe.arquitectura.facturacion.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Version;

@Entity
@Table(name = "FACTURA_IMPUESTO")
public class FacturaImpuesto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "FACTURA_IMPUESTO_ID", nullable = false)
    private Long codigo;
    @Column(name = "COD_FACTURA", nullable = false)
    private Long codigoFactura;
    @Column(name = "COD_IMPUESTO", nullable = false, length = 3)
    private String codigoImpuesto;
    @Column(name = "PORCENTAJE", precision = 4, scale = 1, nullable = false)
    private BigDecimal porcentaje;
    @Column(name = "VALOR", precision = 10, scale = 2, nullable = false)
    private BigDecimal valor;

    @Version
    @Column(name = "VERSION", nullable = false)
    private Long version;

    @ManyToOne
    @JoinColumn(name = "COD_FACTURA", referencedColumnName = "COD_FACTURA", insertable = false, updatable = false, nullable = false)
    private Factura factura;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "COD_IMPUESTO", referencedColumnName = "COD_IMPUESTO", insertable = false, updatable = false, nullable = false),
            @JoinColumn(name = "PORCENTAJE", referencedColumnName = "PORCENTAJE", insertable = false, updatable = false, nullable = false)
    })
    private ImpuestoPorcentajePK pk;

    public FacturaImpuesto() {
    }

    public FacturaImpuesto(Long codigo) {
        this.codigo = codigo;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public Long getCodigoFactura() {
        return codigoFactura;
    }

    public void setCodigoFactura(Long codigoFactura) {
        this.codigoFactura = codigoFactura;
    }

    public String getCodigoImpuesto() {
        return codigoImpuesto;
    }

    public void setCodigoImpuesto(String codigoImpuesto) {
        this.codigoImpuesto = codigoImpuesto;
    }

    public BigDecimal getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(BigDecimal porcentaje) {
        this.porcentaje = porcentaje;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public ImpuestoPorcentajePK getPk() {
        return pk;
    }

    public void setPk(ImpuestoPorcentajePK pk) {
        this.pk = pk;
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
        FacturaImpuesto other = (FacturaImpuesto) obj;
        if (codigo == null) {
            if (other.codigo != null)
                return false;
        } else if (!codigo.equals(other.codigo))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "FacturaImpuesto [codigo=" + codigo + ", codigoFactura=" + codigoFactura + ", codigoImpuesto="
                + codigoImpuesto + ", porcentaje=" + porcentaje + ", valor=" + valor + ", version=" + version
                + ", factura=" + factura + ", pk=" + pk + "]";
    }

}