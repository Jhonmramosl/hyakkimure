package Backend.spring.ModeloDao;

import org.springframework.data.jpa.repository.JpaRepository;

import Backend.spring.ModelEntity.Demonio;

public interface IDemonio extends JpaRepository<Demonio, Long> {

}
