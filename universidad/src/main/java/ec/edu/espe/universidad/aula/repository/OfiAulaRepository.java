package ec.edu.espe.universidad.aula.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.espe.universidad.aula.model.OfiAula;
import ec.edu.espe.universidad.aula.model.OfiAulaPK;

public interface OfiAulaRepository extends JpaRepository<OfiAula, OfiAulaPK> {

    
}
