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
@Table(name="tabla_detalle", schema = "odontologia")
public class TablaDetalle {
	
	@ManyToOne
	@JoinColumn(name="cod_tabla")
	private Tabla tabla;
	@Column(name="cod_campo")
	@Id
	@SequenceGenerator(name="seqCampo",sequenceName="\"seqcampo\"", allocationSize=1, schema = "odontologia")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqCampo")//se va auto incrementar desde la base de datos
	private int codCampo;
	@Column(name="nombre_campo")
	private String nombreCampo;
	@Column(name="descripcion_campo")
	private String descripcionCampo;
	public Tabla getTabla() {
		return tabla;
	}
	public void setTabla(Tabla tabla) {
		this.tabla = tabla;
	}
	public int getCodCampo() {
		return codCampo;
	}
	public void setCodCampo(int codCampo) {
		this.codCampo = codCampo;
	}
	public String getNombreCampo() {
		return nombreCampo;
	}
	public void setNombreCampo(String nombreCampo) {
		this.nombreCampo = nombreCampo;
	}
	public String getDescripcionCampo() {
		return descripcionCampo;
	}
	public void setDescripcionCampo(String descripcionCampo) {
		this.descripcionCampo = descripcionCampo;
	}
	

}
