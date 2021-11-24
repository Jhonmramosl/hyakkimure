package Backend.spring.ModeloDao;


import org.springframework.data.jpa.repository.JpaRepository;

import Backend.spring.ModelEntity.ArticulosDororo;

public interface IArticulosDororo extends JpaRepository<ArticulosDororo, Long > {

}
