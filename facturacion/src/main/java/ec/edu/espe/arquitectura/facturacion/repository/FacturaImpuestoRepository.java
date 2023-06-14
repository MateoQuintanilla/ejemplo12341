package ec.edu.espe.arquitectura.facturacion.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.espe.arquitectura.facturacion.model.FacturaImpuesto;

public interface FacturaImpuestoRepository extends JpaRepository<FacturaImpuesto, Long> {

    List<FacturaImpuesto> findByCodigo(Long codigo);

    List<FacturaImpuesto> findByCodigoFactura(Long codigoFactura);

    List<FacturaImpuesto> findByCodigoImpuesto(String codigoImpuesto);
}
