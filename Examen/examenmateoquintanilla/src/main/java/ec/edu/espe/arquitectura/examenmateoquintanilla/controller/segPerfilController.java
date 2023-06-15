package ec.edu.espe.arquitectura.examenmateoquintanilla.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.edu.espe.arquitectura.examenmateoquintanilla.model.segPerfil;
import ec.edu.espe.arquitectura.examenmateoquintanilla.service.segPerfilService;

@RestController
@RequestMapping("/api/v1/perfiles")
public class segPerfilController {
    
    private final segPerfilService segPerfilService;
    
    public segPerfilController(
            ec.edu.espe.arquitectura.examenmateoquintanilla.service.segPerfilService segPerfilService) {
        this.segPerfilService = segPerfilService;
    }

    @GetMapping("/{nombre}")
    public ResponseEntity<List<segPerfil>> obtainByName(@PathVariable(name = "nombre") String nombre) {
            List<segPerfil> perfiles = this.segPerfilService.listByNombre(nombre);
            return ResponseEntity.ok(perfiles);
    }
}
