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
 * @author Henry Valdivia
 */
@Entity
@Table(name="cargo",schema = "public")
public class Cargo {
	@Column(name="cod_cargo")
	@Id
	@SequenceGenerator(name="seqCargo",sequenceName="\"seqcargo\"", allocationSize=1, schema = "public")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqCargo")//se va auto incrementar desde la base de datos
    private int codCargo;
	@Column(name="nombre_cargo")
    private String nombreCargo;
	@ManyToOne
	@JoinColumn(name="cod_estado_registro")
    private EstadosRegistro estadosRegistro = new EstadosRegistro();

    public int getCodCargo() {
        return codCargo;
    }

    public void setCodCargo(int codCargo) {
        this.codCargo = codCargo;
    }

    public String getNombreCargo() {
        return nombreCargo;
    }

    public void setNombreCargo(String nombreCargo) {
        this.nombreCargo = nombreCargo;
    }

    public EstadosRegistro getEstadosRegistro() {
        return estadosRegistro;
    }

    public void setEstadosRegistro(EstadosRegistro estadosRegistro) {
        this.estadosRegistro = estadosRegistro;
    }
    
    
    
}
