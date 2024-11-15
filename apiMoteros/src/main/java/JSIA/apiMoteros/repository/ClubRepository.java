package JSIA.apiMoteros.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import JSIA.apiMoteros.daos.Clubs;
import java.util.Optional;

@Repository
public interface ClubRepository extends JpaRepository<Clubs, Long> { 
	Optional<Clubs> findByMailClubAndContrasenyaClub(String mailClub, String contrasenyaClub);
}
