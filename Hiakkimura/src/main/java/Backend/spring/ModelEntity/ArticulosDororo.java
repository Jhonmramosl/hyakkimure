package Backend.spring.ModelEntity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="articulos_dororo")
public class ArticulosDororo implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id_articulo;
	@Column
	private String articulo;
	@Column
	private String procedencia;
	@Column
	private char castigo;
	public long getId_articulo() {
		return id_articulo;
	}
	public void setId_articulo(long id_articulo) {
		this.id_articulo = id_articulo;
	}
	public String getArticulo() {
		return articulo;
	}
	public void setArticulo(String articulo) {
		this.articulo = articulo;
	}
	public String getProcedencia() {
		return procedencia;
	}
	public void setProcedencia(String procedencia) {
		this.procedencia = procedencia;
	}
	public char getCastigo() {
		return castigo;
	}
	public void setCastigo(char castigo) {
		this.castigo = castigo;
	}

}
