package JSIA.apiMoteros.servicios;

import JSIA.apiMoteros.daos.*;
import JSIA.apiMoteros.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClubService {

    private final ClubRepository clubRepository;
    private final UsuarioRepository usuarioRepository;

    @Autowired
    public ClubService(ClubRepository clubRepository, UsuarioRepository usuarioRepository) {
        this.clubRepository = clubRepository;
        this.usuarioRepository = usuarioRepository;
    }

    // Métodos para Club

    public List<Clubs> getAllClubs() {
        return clubRepository.findAll();
    }

    public Clubs loginClub(String mail, String contrasenya) { 
    Optional<Clubs> club = clubRepository.findByMailClubAndContrasenyaClub(mail, contrasenya); 
    return club.orElse(null);
    }

    public Clubs createClub(Clubs club) {
        return clubRepository.save(club);
    }

    public Clubs updateClub(Long id, Clubs clubDetails) {
        Clubs club = clubRepository.findById(id).orElseThrow(() -> new RuntimeException("Club no encontrado"));
        club.setNombreClub(clubDetails.getNombreClub());
        club.setMailClub(clubDetails.getMailClub());
        club.setContrasenyaClub(clubDetails.getContrasenyaClub());
        club.setColoresClub(clubDetails.getColoresClub());
        club.setDescripcionClub(clubDetails.getDescripcionClub());
        club.setLocalizadorClub(clubDetails.getLocalizadorClub());
        club.setFechaAltaClub(clubDetails.getFechaAltaClub());
        club.setNickClub(clubDetails.getNickClub());
        club.setImgClub(clubDetails.getImgClub());
        club.setSedeClub(clubDetails.getSedeClub());
        return clubRepository.save(club);
    }

    public void deleteClub(Long id) {
        clubRepository.deleteById(id);
    }

    // Métodos para Usuario

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
