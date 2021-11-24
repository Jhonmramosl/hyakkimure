package Backend.spring.ModeloDao;

import org.springframework.data.jpa.repository.JpaRepository;

import Backend.spring.ModelEntity.Peleas;


public interface IPeleasDao extends JpaRepository<Peleas, Long> {

}
