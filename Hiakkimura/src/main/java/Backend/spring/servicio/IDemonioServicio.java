package Backend.spring.servicio;

import java.util.List;

import Backend.spring.ModelEntity.Demonio;

public interface IDemonioServicio {
	public List<Demonio> listar();
	public Demonio save(Demonio d);
	public Demonio encontrarPorId(Long id);
	
	
}
