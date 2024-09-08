package com.empresa.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="estados_registro")
public class EstadosRegistro {
	@Column(name="cod_estado_registro")
	@Id	
	@SequenceGenerator(name="seqEstadosRegistro",sequenceName="\"seqestadosregistro\"", allocationSize=1, schema = "public")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqEstadosRegistro")//se va auto incrementar desde la base de datos
	private int codEstadoRegistro = 0;
	
	
	@Column(name="nombre_estado_registro")
	private String nombreEstadoRegistro = "";
	
	@JsonIgnore
	@OneToMany(mappedBy = "estadosRegistro")
	private List<Pais> paises;
	
	
	public int getCodEstadoRegistro() {
		return codEstadoRegistro;
	}
	public void setCodEstadoRegistro(int codEstadoRegistro) {
		this.codEstadoRegistro = codEstadoRegistro;
	}
	public String getNombreEstadoRegistro() {
		return nombreEstadoRegistro;
	}
	public void setNombreEstadoRegistro(String nombreEstadoRegistro) {
		this.nombreEstadoRegistro = nombreEstadoRegistro;
	}
	public List<Pais> getPaises() {
		return paises;
	}
	public void setPaises(List<Pais> paises) {
		this.paises = paises;
	}
	
	
	

}
