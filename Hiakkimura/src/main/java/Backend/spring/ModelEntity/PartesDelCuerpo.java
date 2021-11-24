package Backend.spring.ModelEntity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="partes_cuerpo")
public class PartesDelCuerpo implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id_parte_cuerpo;
	@Column
	private String parte_cuerpo;
	@Column
	private char recuperada;
	public long getId_parte_cuerpo() {
		return id_parte_cuerpo;
	}
	public void setId_parte_cuerpo(long id_parte_cuerpo) {
		this.id_parte_cuerpo = id_parte_cuerpo;
	}
	public String getParte_cuerpo() {
		return parte_cuerpo;
	}
	public void setParte_cuerpo(String parte_cuerpo) {
		this.parte_cuerpo = parte_cuerpo;
	}
	public char getRecuperada() {
		return recuperada;
	}
	public void setRecuperada(char recuperada) {
		this.recuperada = recuperada;
	}

	
}
