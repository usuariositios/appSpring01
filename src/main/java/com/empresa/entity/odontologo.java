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
@Table(name="odontologo", schema = "odontologia")
public class odontologo {
	@Column(name="cod_odontologo")
	@Id
	@SequenceGenerator(name="seqOdontologo",sequenceName="\"seqodontologo\"", allocationSize=1, schema = "odontologia")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqOdontologo")//se va auto incrementar desde la base de datos
	private int codOdontologo;
	@ManyToOne
	@JoinColumn(name="cod_personal")
	private Personal personal;
	@Column(name="cod_turno")
	private int codTurno;
	
	
	public int getCodOdontologo() {
		return codOdontologo;
	}
	public void setCodOdontologo(int codOdontologo) {
		this.codOdontologo = codOdontologo;
	}
	public Personal getPersonal() {
		return personal;
	}
	public void setPersonal(Personal personal) {
		this.personal = personal;
	}
	public int getCodTurno() {
		return codTurno;
	}
	public void setCodTurno(int codTurno) {
		this.codTurno = codTurno;
	}
	
	
	

}
