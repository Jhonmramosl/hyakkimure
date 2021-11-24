package Backend.spring.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Backend.spring.ModelEntity.Demonio;
import Backend.spring.ModeloDao.IDemonio;

@Service
public class DemonioService implements IDemonioServicio {

	@Autowired
	private IDemonio demoniodao;
	@Override
	public List<Demonio> listar() {
		// TODO Auto-generated method stub
		return demoniodao.findAll();
	}
	@Override
	public Demonio save(Demonio d) {
		// TODO Auto-generated method stub
		return demoniodao.save(d);
	}
	@Override
	public Demonio encontrarPorId(Long id) {
		// TODO Auto-generated method stub
		return demoniodao.findById(id).orElse(null);
	}
	

		
	}
	
	
	
	


