package Backend.spring.servicio;

import java.util.List;

import Backend.spring.ModelEntity.ArticulosDororo;

public interface IArticuloDororoServicio   {
	public List<ArticulosDororo> listar();
	public ArticulosDororo save(ArticulosDororo d);
	public ArticulosDororo encontrarPorId(Long id);

}
