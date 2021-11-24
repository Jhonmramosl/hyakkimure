package Backend.spring.servicio;

import java.util.List;

import Backend.spring.ModelEntity.PartesDelCuerpo;

public interface IPartesDelCuerpoServicio  {

	public List<PartesDelCuerpo> listar();
	public PartesDelCuerpo save(PartesDelCuerpo p);
	public PartesDelCuerpo encontrarPorId(Long id);
}
