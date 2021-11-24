package Backend.spring.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import Backend.spring.ModelEntity.Demonio;
import Backend.spring.servicio.IDemonioServicio;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="*")
public class DemonioController {
	@Autowired
	private IDemonioServicio demonioservicio;
	@GetMapping("/demonios")
	public List<Demonio> listar(){
	return demonioservicio.listar();
	}
	@PostMapping("/demonios")
	@ResponseStatus(HttpStatus.CREATED)
	public Demonio guardar(@RequestBody Demonio d){
		return demonioservicio.save(d);
	}
	
	
	
	@GetMapping("/demonios/{id}")
	public Demonio encontratPorId(@PathVariable Long id) {
		return demonioservicio.encontrarPorId(id);
	}
	
	@PutMapping("/demonios/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public Demonio editar(@PathVariable Long id, @RequestBody Demonio d){
		Demonio actual=demonioservicio.encontrarPorId(id);
		actual.setDemonio_nombre(d.getDemonio_nombre());
		actual.setId_parte_cuerpo(d.getId_parte_cuerpo());
		actual.setFoto(d.getFoto());
		
		return demonioservicio.save(d);
	}
	
	/*@PostMapping("/demonios")
	public ResponseEntity<?> Upload(@RequestParam("Archivo")MultipartFile archivo,
			@RequestParam("id")Long id){
		Map<String.Object> response=new HashMap<>();
		Demonio actual=demonioservicio.f
		
	}*/
	
}
