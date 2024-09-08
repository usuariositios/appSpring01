/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
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

/**
 *
 * @author Henry
 */
@Entity
@Table(name="estado_civil")
public class EstadoCivil {
	@Column(name="cod_estado_civil")
	@Id	
	@SequenceGenerator(name="seqEstadoCivil",sequenceName="\"seqestadocivil\"", allocationSize=1, schema = "public")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqEstadoCivil")//se va auto incrementar desde la base de datos
    private int codEstadoCivil =0;
	@Column(name="nombre_estado_civil")
    private String nombreEstadoCivil;
	@ManyToOne
	@JoinColumn(name="cod_estado_registro")	
    private EstadosRegistro estadosRegistro = new EstadosRegistro();

    public int getCodEstadoCivil() {
        return codEstadoCivil;
    }

    public void setCodEstadoCivil(int codEstadoCivil) {
        this.codEstadoCivil = codEstadoCivil;
    }

    public String getNombreEstadoCivil() {
        return nombreEstadoCivil;
    }

    public void setNombreEstadoCivil(String nombreEstadoCivil) {
        this.nombreEstadoCivil = nombreEstadoCivil;
    }

    public EstadosRegistro getEstadosRegistro() {
        return estadosRegistro;
    }

    public void setEstadosRegistro(EstadosRegistro estadosRegistro) {
        this.estadosRegistro = estadosRegistro;
    }
    
    
    
}
