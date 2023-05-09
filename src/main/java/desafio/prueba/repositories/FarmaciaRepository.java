package desafio.prueba.repositories;

import desafio.prueba.models.Farmacia;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FarmaciaRepository extends JpaRepository<Farmacia, Long> {
    List<Farmacia> findByComuna(String comuna);

}
