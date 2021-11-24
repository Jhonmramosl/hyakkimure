package Backend.spring.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Backend.spring.ModelEntity.ArticulosDororo;
import Backend.spring.ModeloDao.IArticulosDororo;

@Service
public class ArticuloDororoService implements IArticuloDororoServicio {
	@Autowired
	private IArticulosDororo articuloDororo;
	@Override
	public List<ArticulosDororo> listar() {
		// TODO Auto-generated method stub
		return articuloDororo.findAll();
	}
	@Override
	public ArticulosDororo save(ArticulosDororo d) {
		// TODO Auto-generated method stub
		return articuloDororo.save(d);
	}
	@Override
	public ArticulosDororo encontrarPorId(Long id) {
		// TODO Auto-generated method stub
		return articuloDororo.findById(id).orElse(null);
	}

}
