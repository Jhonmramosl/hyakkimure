package Backend.spring.ModelEntity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="peleas")
public class Peleas implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id_pelea;
	@Column
	private long id_demonio_gana;
	@Column
	private String lugar;
	@Column
	private long id_demonio_cont;
	public long getId_pelea() {
		return id_pelea;
	}
	public void setId_pelea(long id_pelea) {
		this.id_pelea = id_pelea;
	}
	public long getId_demonio_gana() {
		return id_demonio_gana;
	}
	public void setId_demonio_gana(long id_demonio_gana) {
		this.id_demonio_gana = id_demonio_gana;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public long getId_demonio_cont() {
		return id_demonio_cont;
	}
	public void setId_demonio_cont(long id_demonio_cont) {
		this.id_demonio_cont = id_demonio_cont;
	}
	
	
	
	
}
