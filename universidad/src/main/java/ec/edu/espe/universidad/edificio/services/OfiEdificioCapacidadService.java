package ec.edu.espe.universidad.edificio.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ec.edu.espe.universidad.aula.repository.OfiAulaRepository;

@Service
public class OfiEdificioCapacidadService {

    @Autowired
    private OfiAulaRepository ofiAulaRepository;

    public Integer calcularCapacidadTotal(String codigoSede, String codigoEdificio) {
        return ofiAulaRepository.getCapacidadTotal(codigoSede, codigoEdificio);
    }
}
