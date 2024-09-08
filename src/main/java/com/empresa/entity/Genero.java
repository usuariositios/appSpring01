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
 * @author Henry Valdivia
 */
@Entity
@Table(name="genero")
public class Genero{
	@Column(name="cod_genero")
	@Id
	@SequenceGenerator(name="seqGenero",sequenceName="\"seqgenero\"", allocationSize=1, schema = "public")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqGenero")//se va auto incrementar desde la base de datos
    private int codGenero;
	@Column(name="nombre_genero")
    private String nombreGenero;
    //OrdenProduccionDetalleTalla ordenProduccionDetalleTalla = new OrdenProduccionDetalleTalla();

    public int getCodGenero() {
        return codGenero;
    }

    public void setCodGenero(int codGenero) {
        this.codGenero = codGenero;
    }

    public String getNombreGenero() {
        return nombreGenero;
    }

    public void setNombreGenero(String nombreGenero) {
        this.nombreGenero = nombreGenero;
    }

   
    
    
}
