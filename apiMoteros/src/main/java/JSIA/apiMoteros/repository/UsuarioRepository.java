package JSIA.apiMoteros.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import JSIA.apiMoteros.daos.Usuarios;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuarios, Long> {
    Optional<Usuarios> findByMailUsuarioAndContrasenyaUsuario(String mailUsuario, String contrasenyaUsuario);
}
