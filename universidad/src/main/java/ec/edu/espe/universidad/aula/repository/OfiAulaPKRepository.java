package ec.edu.espe.universidad.aula.repository;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.espe.universidad.aula.model.OfiAulaPK;

public interface OfiAulaPKRepository extends JpaRepository<OfiAulaPK, BigDecimal> {

}
