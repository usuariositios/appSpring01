package com.empresa.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

//import org.hibernate.annotations.GenericGenerator;
//import org.hibernate.annotations.Parameter;

//import lombok.Getter;
//import lombok.Setter;

@Entity
@Table(name="pais")

//@GenericGenerator(name="seqPais", strategy = "native", parameters = { @Parameter(name="sequence", value="seqPais")})
public class Pais {
	
	@Column(name="cod_pais")
	@Id	
	@SequenceGenerator(name="seqPais",sequenceName="\"seqpais\"", allocationSize=1, schema = "public")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqPais")//se va auto incrementar desde la base de datos
	
	private int codPais;
	@Column(name="nombre_pais")
	private String nombrePais;
	
	
	//@Column(name="cod_estado_registro")
	//private int codEstadoRegistro;
	@ManyToOne
	@JoinColumn(name="cod_estado_registro")
	private EstadosRegistro estadosRegistro;
	
	
	
	
	
	public int getCodPais() {
		return codPais;
	}
	public void setCodPais(int codPais) {
		this.codPais = codPais;
	}
	public String getNombrePais() {
		return nombrePais;
	}
	public void setNombrePais(String nombrePais) {
		this.nombrePais = nombrePais;
	}
	public EstadosRegistro getEstadosRegistro() {
		return estadosRegistro;
	}
	public void setEstadosRegistro(EstadosRegistro estadosRegistro) {
		this.estadosRegistro = estadosRegistro;
	}
	
	
	
	
	
	
	
	

}
