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
@Table(name="areas_empresa")
public class AreasEmpresa {
	@Column(name="cod_area_empresa")
	@Id	
	@SequenceGenerator(name="seqAreasEmpresa",sequenceName="\"seqareasempresa\"", allocationSize=1, schema = "public")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqAreasEmpresa")//se va auto incrementar desde la base de datos
    private int codAreaEmpresa;
	@Column(name="nombre_area_empresa")
    private String nombreAreaEmpresa;
	@ManyToOne
	@JoinColumn(name="cod_estado_registro")
    private EstadosRegistro estadosRegistro = new EstadosRegistro();

    public int getCodAreaEmpresa() {
        return codAreaEmpresa;
    }

    public void setCodAreaEmpresa(int codAreaEmpresa) {
        this.codAreaEmpresa = codAreaEmpresa;
    }

    public String getNombreAreaEmpresa() {
        return nombreAreaEmpresa;
    }

    public void setNombreAreaEmpresa(String nombreAreaEmpresa) {
        this.nombreAreaEmpresa = nombreAreaEmpresa;
    }
    
    
    
}
