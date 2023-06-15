package ec.edu.espe.arquitectura.examenmateoquintanilla.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.espe.arquitectura.examenmateoquintanilla.model.segUsuarioPerfil;
import ec.edu.espe.arquitectura.examenmateoquintanilla.model.segUsuarioPerfilPK;

public interface segUsuarioPerfilRepository extends JpaRepository<segUsuarioPerfil,segUsuarioPerfilPK>{
    
    List<segUsuarioPerfil> findByEstado(Boolean estado);
}
