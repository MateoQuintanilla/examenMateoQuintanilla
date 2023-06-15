package ec.edu.espe.arquitectura.examenmateoquintanilla.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ec.edu.espe.arquitectura.examenmateoquintanilla.model.segPerfil;
import ec.edu.espe.arquitectura.examenmateoquintanilla.repository.segPerfilRepository;

@Service
public class segPerfilService {
    
    private final segPerfilRepository segPerfilRepository;
    
    public segPerfilService(
            ec.edu.espe.arquitectura.examenmateoquintanilla.repository.segPerfilRepository segPerfilRepository) {
        this.segPerfilRepository = segPerfilRepository;
    }

    public List<segPerfil> listByNombre(String nombre) {
        
        return this.segPerfilRepository.findByNombreLikeOrderByNombre(nombre);
        
        
    }

    
}
