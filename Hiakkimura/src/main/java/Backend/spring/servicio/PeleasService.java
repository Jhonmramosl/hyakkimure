package Backend.spring.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Backend.spring.ModelEntity.Peleas;
import Backend.spring.ModeloDao.IPeleasDao;
@Service
public class PeleasService implements IPeleasServicio {
	@Autowired
	public IPeleasDao peleasdao;
	@Override
	public List<Peleas> listar() {
		// TODO Auto-generated method stub
		return peleasdao.findAll();
	}
	@Override
	public Peleas save(Peleas e) {
		// TODO Auto-generated method stub
		return peleasdao.save(e);
	}
	@Override
	public Peleas encontrarPorId(Long id) {
		// TODO Auto-generated method stub
		return peleasdao.findById(id).orElse(null);
	}

}
