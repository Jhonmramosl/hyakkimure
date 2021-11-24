package Backend.spring.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import Backend.spring.ModelEntity.PartesDelCuerpo;
import Backend.spring.ModeloDao.IPartesDelCuerpoDao;

public class PartesDelCuerpoService implements IPartesDelCuerpoServicio {
	@Autowired
	private IPartesDelCuerpoDao partesdelcuerpo;
	@Override
	public List<PartesDelCuerpo> listar() {
		// TODO Auto-generated method stub
		return partesdelcuerpo.findAll();
	}
	@Override
	public PartesDelCuerpo save(PartesDelCuerpo p) {
		// TODO Auto-generated method stub
		return partesdelcuerpo.save(p);
	}
	@Override
	public PartesDelCuerpo encontrarPorId(Long id) {
		// TODO Auto-generated method stub
		return partesdelcuerpo.findById(id).orElse(null);
	}

}
