package ec.edu.espe.arquitectura.examenmateoquintanilla.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.espe.arquitectura.examenmateoquintanilla.model.segPerfil;
import java.util.List;


public interface segPerfilRepository extends JpaRepository<segPerfil, String> {

    List<segPerfil> findByCodigo(String codigo);
    List<segPerfil> findByNombreLikeOrderByNombre(String nombre);
}
