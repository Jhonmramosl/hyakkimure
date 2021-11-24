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
import Backend.spring.ModelEntity.Peleas;
import Backend.spring.servicio.IPeleasServicio;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="*")
public class PeleasController {
	@Autowired
	private IPeleasServicio peleas;
	@GetMapping("/peleas")
	public List<Peleas> listar(){
	return peleas.listar();
		
	}
	
	@PostMapping("/peleas")
	@ResponseStatus(HttpStatus.CREATED)
	public Peleas guardar(@RequestBody Peleas p){
		return peleas.save(p);
	}

	@GetMapping("/peleas/{id}")
	public Peleas encontrarPorId(@PathVariable Long id){
		return peleas.encontrarPorId(id);
	}
	
}
