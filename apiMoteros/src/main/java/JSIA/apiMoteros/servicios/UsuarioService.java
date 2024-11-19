package JSIA.apiMoteros.servicios;

import JSIA.apiMoteros.daos.Usuarios;
import JSIA.apiMoteros.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public List<Usuarios> getAllUsuarios() {
        return usuarioRepository.findAll();
    }

    public Usuarios loginUsuario(String mail, String contrasenya) {
        Optional<Usuarios> usuario = usuarioRepository.findByMailUsuarioAndContrasenyaUsuario(mail, contrasenya);
        return usuario.orElse(null);
    }

    public Usuarios createUsuario(Usuarios usuario) {
        return usuarioRepository.save(usuario);
    }

    public Usuarios updateUsuario(Long id, Usuarios usuarioDetails) {
        Usuarios usuario = usuarioRepository.findById(id).orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
        usuario.setNombreUsuario(usuarioDetails.getNombreUsuario());
        usuario.setApellidosUsuario(usuarioDetails.getApellidosUsuario());
        usuario.setMailUsuario(usuarioDetails.getMailUsuario());
        usuario.setFechaNacimientoUsuario(usuarioDetails.getFechaNacimientoUsuario());
        usuario.setNicknameUsuario(usuarioDetails.getNicknameUsuario());
        usuario.setContrasenyaUsuario(usuarioDetails.getContrasenyaUsuario());
        usuario.setFechaAltaUsuario(usuarioDetails.getFechaAltaUsuario());
        usuario.setDescripcionUsuario(usuarioDetails.getDescripcionUsuario());
        usuario.setDniUsuario(usuarioDetails.getDniUsuario());
        usuario.setTelefonoUsuario(usuarioDetails.getTelefonoUsuario());
        usuario.setImgUsuario(usuarioDetails.getImgUsuario());
        usuario.setRolUsuario(usuarioDetails.getRolUsuario());
        return usuarioRepository.save(usuario);
    }

    public void deleteUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }
}
