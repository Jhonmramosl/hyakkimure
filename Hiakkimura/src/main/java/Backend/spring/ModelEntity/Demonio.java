package Backend.spring.ModelEntity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="demonio")
public class Demonio implements Serializable {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private long id_demonio;
@Column
private String demonio_nombre;
@Column
private long id_parte_cuerpo;
@Column
private String foto;
public long getId_demonio() {
	return id_demonio;
}
public void setId_demonio(long id_demonio) {
	this.id_demonio = id_demonio;
}
public String getDemonio_nombre() {
	return demonio_nombre;
}
public void setDemonio_nombre(String demonio_nombre) {
	this.demonio_nombre = demonio_nombre;
}
public long getId_parte_cuerpo() {
	return id_parte_cuerpo;
}
public void setId_parte_cuerpo(long id_parte_cuerpo) {
	this.id_parte_cuerpo = id_parte_cuerpo;
}
public String getFoto() {
	return foto;
}
public void setFoto(String foto) {
	this.foto = foto;
}

}
