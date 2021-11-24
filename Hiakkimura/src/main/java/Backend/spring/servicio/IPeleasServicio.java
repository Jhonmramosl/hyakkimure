package Backend.spring.servicio;

import java.util.List;

import Backend.spring.ModelEntity.Peleas;

public interface IPeleasServicio {
	public List<Peleas> listar();
	public Peleas save(Peleas e);
	public Peleas encontrarPorId(Long id);

}
