package JSIA.apiMoteros.Controladores;

import JSIA.apiMoteros.daos.LoginRequest;
import JSIA.apiMoteros.daos.Usuarios;
import JSIA.apiMoteros.servicios.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService;

    @Autowired
    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping
    public List<Usuarios> getAllUsuarios() {
        return usuarioService.getAllUsuarios();
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @PostMapping("/login")
    public ResponseEntity<?> loginUsuario(@RequestBody LoginRequest loginRequest) {
        Usuarios usuario = usuarioService.loginUsuario(loginRequest.getMail(), loginRequest.getContrasenya());
        if (usuario != null) {
            return ResponseEntity.ok(usuario);
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Correo o contraseña incorrectos");
        }
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @PostMapping
    public ResponseEntity<Usuarios> createUsuario(@RequestBody Usuarios usuario) {
        Usuarios nuevoUsuario = usuarioService.createUsuario(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevoUsuario);
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @PutMapping("/{id}")
    public ResponseEntity<Usuarios> updateUsuario(@PathVariable Long id, @RequestBody Usuarios usuarioDetails) {
        try {
            Usuarios updatedUsuario = usuarioService.updateUsuario(id, usuarioDetails);
            return ResponseEntity.ok(updatedUsuario);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUsuario(@PathVariable Long id) {
        usuarioService.deleteUsuario(id);
        return ResponseEntity.noContent().build();
    }
}
