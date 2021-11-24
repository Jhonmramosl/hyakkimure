package Backend.spring.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import Backend.spring.ModelEntity.PartesDelCuerpo;
import Backend.spring.servicio.IPartesDelCuerpoServicio;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="*")
public class PartesDelCuerpoController {
	@Autowired
	private IPartesDelCuerpoServicio partesdelcuerpo;
	@GetMapping("/partesdelcuerpo")
	public List<PartesDelCuerpo> listar(){
	return partesdelcuerpo.listar();
		
	}
	
	@PostMapping("/partesdelcuerpo")
	@ResponseStatus(HttpStatus.CREATED)
	public PartesDelCuerpo guardar(@RequestBody PartesDelCuerpo p) {
		return partesdelcuerpo.save(p);
	}

	@GetMapping("/partesdelcuerpo/{id}")
	public PartesDelCuerpo encontrarPorId(@PathVariable Long id){
		return partesdelcuerpo.encontrarPorId(id);
	}
}
