package ec.edu.espe.universidad.institucion.services;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import ec.edu.espe.universidad.institucion.repository.*;
import ec.edu.espe.universidad.institucion.model.*;

import java.util.List;

@Service
public class InstitucionService {

    @Autowired
    private OfiInstitucionRepository institucionRepository;

    public List<OfiInstitucion> findAll() {
        return institucionRepository.findAll();
    }

    public OfiInstitucion findById(Integer codigo) {
        return institucionRepository.findById(codigo).orElse(null);
    }

    public OfiInstitucion save(OfiInstitucion institucion) {
        return institucionRepository.save(institucion);
    }

    public void deleteById(Integer codigo) {
        institucionRepository.deleteById(codigo);
    }
}