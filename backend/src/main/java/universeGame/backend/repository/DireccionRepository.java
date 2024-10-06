package universeGame.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import universeGame.backend.model.Direccion;

@Repository
public interface DireccionRepository extends JpaRepository<Direccion, Long> {

}
