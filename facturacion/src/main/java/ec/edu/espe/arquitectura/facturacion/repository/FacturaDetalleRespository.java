package ec.edu.espe.arquitectura.facturacion.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.espe.arquitectura.facturacion.model.FacturaDetalle;

public interface FacturaDetalleRespository extends JpaRepository<FacturaDetalle, Long> {

    List<FacturaDetalle> findByCodigo(Long codigo);

    List<FacturaDetalle> findByCodigoFactura(Long codigoFactura);

    List<FacturaDetalle> findByCodigoProducto(String codigoProducto);

    List<FacturaDetalle> findByExistenciaGreaterThan(BigDecimal existencia);

    List<FacturaDetalle> findByNombreLikeOrderByNombre(String nombre);

}
