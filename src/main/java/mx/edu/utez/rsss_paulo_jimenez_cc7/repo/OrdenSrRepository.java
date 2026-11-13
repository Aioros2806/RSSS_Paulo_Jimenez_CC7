package mx.edu.utez.rsss_paulo_jimenez_cc7.repo;

import mx.edu.utez.rsss_paulo_jimenez_cc7.model.OrdenServicio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdenServicioRepository extends JpaRepository<OrdenServicio, Long> {
}
