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

import Backend.spring.ModelEntity.ArticulosDororo;
import Backend.spring.servicio.IArticuloDororoServicio;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="*")
public class ArticulosDororoController {
		@Autowired
		private IArticuloDororoServicio articuloDororoService;
		@GetMapping("/articulosdororo")
		public List<ArticulosDororo> listar(){
		return articuloDororoService.listar();
			
		}
		
		@PostMapping("/articulosdororo")
		@ResponseStatus(HttpStatus.CREATED)
		public ArticulosDororo guardar(@RequestBody ArticulosDororo d) {
			return articuloDororoService.save(d);
		}

		@GetMapping("/articulosdororo/{id}")
		public ArticulosDororo encontratPorId(@PathVariable Long id) {
			return articuloDororoService.encontrarPorId(id);
		}

}
