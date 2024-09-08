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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author henry
 */
@Entity
@Table(name="ciudad")
public class Ciudad {
	@Column(name="cod_ciudad")
	@Id
	@SequenceGenerator(name="seqCiudad",sequenceName="\"seqciudad\"", allocationSize=1, schema = "public")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqCiudad")//se va auto incrementar desde la base de datos
    private int codCiudad;
	@Column(name="nombre_ciudad")
    private String nombreCiudad = "";

    public int getCodCiudad() {
        return codCiudad;
    }

    public void setCodCiudad(int codCiudad) {
        this.codCiudad = codCiudad;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }
    
    
}
