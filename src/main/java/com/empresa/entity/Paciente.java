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
@Table(name="paciente", schema = "odontologia")
public class Paciente {
	@Column(name="cod_paciente")
	@Id
	@SequenceGenerator(name="seqPaciente",sequenceName="\"seqpaciente\"", allocationSize=1, schema = "public")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqPaciente")//se va auto incrementar desde la base de datos
	private int codPaciente;
	@ManyToOne
	@JoinColumn(name="cod_personal")
	private Personal personal = new Personal();
	public int getCodPaciente() {
		return codPaciente;
	}
	public void setCodPaciente(int codPaciente) {
		this.codPaciente = codPaciente;
	}
	public Personal getPersonal() {
		return personal;
	}
	public void setPersonal(Personal personal) {
		this.personal = personal;
	}
	
	
	

}
