package ec.edu.espe.arquitectura.examenmateoquintanilla.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.espe.arquitectura.examenmateoquintanilla.model.segUsuario;

public interface segUsuarioRepository extends JpaRepository<segUsuario, Integer> {

    List<segUsuario> findByNombre(String nombre);

    segUsuario findByCorreo(String correo);

    List<segUsuario> findByFechaNacimiento(Date fechaNacimiento);

}
