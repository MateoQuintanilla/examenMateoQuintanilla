package ec.edu.espe.arquitectura.examenmateoquintanilla.controller;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.edu.espe.arquitectura.examenmateoquintanilla.model.segUsuario;
import ec.edu.espe.arquitectura.examenmateoquintanilla.service.segUsuarioService;

@RestController
@RequestMapping("/api/v1/usuarios")
public class segUsuarioController {
    
    private final segUsuarioService segUsuarioService;

    public segUsuarioController(
            ec.edu.espe.arquitectura.examenmateoquintanilla.service.segUsuarioService segUsuarioService) {
        this.segUsuarioService = segUsuarioService;
    }

        @PostMapping
    public ResponseEntity<segUsuario> create(@RequestBody segUsuario usuario) {
        try {
            segUsuario usuarioRS = this.segUsuarioService.create(usuario);
            return ResponseEntity.ok(usuarioRS);
        } catch (RuntimeException rte) {
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping("/{codigo}")
    public ResponseEntity<Optional<segUsuario>> obtainByCodigo(@PathVariable(name = "codigo") Integer codigo) {
            Optional<segUsuario> usuarios = this.segUsuarioService.listByCodigo(codigo);
            return ResponseEntity.ok(usuarios);
    }
    
}
