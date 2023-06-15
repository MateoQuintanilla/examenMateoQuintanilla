package ec.edu.espe.arquitectura.examenmateoquintanilla.service;


import java.util.Optional;

import org.springframework.stereotype.Service;

import ec.edu.espe.arquitectura.examenmateoquintanilla.model.segUsuario;
import ec.edu.espe.arquitectura.examenmateoquintanilla.repository.segUsuarioRepository;
import jakarta.transaction.Transactional;

@Service
public class segUsuarioService {

    private final segUsuarioRepository segUsuarioRepository;

    public segUsuarioService(segUsuarioRepository segUsuarioRepository) {
        this.segUsuarioRepository = segUsuarioRepository;
    }

    @Transactional
    public segUsuario create(segUsuario usuario) {
        segUsuario usuarioTmp = this.segUsuarioRepository.findByCorreo(usuario.getCorreo());
        if (usuarioTmp.equals(usuario.getCorreo())) {
            return this.segUsuarioRepository.save(usuario);
        } else {
            throw new RuntimeException("Usuario ya existe");
        }
    }

    public Optional<segUsuario> listByCodigo(Integer codigo) {
        
            return this.segUsuarioRepository.findById(codigo);
         
        
    }
}
