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

@Entity
@Table(name="tabla", schema = "odontologia")
public class Tabla {
	@Column(name="cod_tabla")
	@Id
	@SequenceGenerator(name="seqTabla",sequenceName="\"seqtabla\"", allocationSize=1, schema = "odontologia")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqTabla")//se va auto incrementar desde la base de datos
	private int codTabla;
	@Column(name="nombre_tabla")
	private String nombreTabla;
	@Column(name="descripcion_tabla")
	private String descripcionTabla;
	@ManyToOne
	@JoinColumn(name="cod_estado_registro")
	private EstadosRegistro estadosRegistro;
	public int getCodTabla() {
		return codTabla;
	}
	public void setCodTabla(int codTabla) {
		this.codTabla = codTabla;
	}
	public String getNombreTabla() {
		return nombreTabla;
	}
	public void setNombreTabla(String nombreTabla) {
		this.nombreTabla = nombreTabla;
	}
	public String getDescripcionTabla() {
		return descripcionTabla;
	}
	public void setDescripcionTabla(String descripcionTabla) {
		this.descripcionTabla = descripcionTabla;
	}
	public EstadosRegistro getEstadosRegistro() {
		return estadosRegistro;
	}
	public void setEstadosRegistro(EstadosRegistro estadosRegistro) {
		this.estadosRegistro = estadosRegistro;
	}
	
	
	

}
