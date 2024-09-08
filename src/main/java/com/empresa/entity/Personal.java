/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author henry
 */
@Entity
@Table(name="personal")
public class Personal{
	@Column(name="cod_personal")
	@Id	
	@SequenceGenerator(name="seqPersonal",sequenceName="\"seqpersonal\"", allocationSize=1, schema = "public")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqPersonal")//se va auto incrementar desde la base de datos
    int codPersonal;
	@Column(name="ap_paterno_personal")
    private String apPaternoPersonal;
	@Column(name="ap_materno_personal")
	private String apMaternoPersonal;
    @Column(name="nombres_personal")
    private String nombrePersonal;
    @Column(name="nro_carnet")
    private String nroCarnet;
    //Many to one
    @ManyToOne
	@JoinColumn(name="cod_estado_civil")
    @org.hibernate.annotations.ForeignKey(name = "none")
    private EstadoCivil estadoCivil = new EstadoCivil();
    @ManyToOne
	@JoinColumn(name="cod_area_empresa")
    @org.hibernate.annotations.ForeignKey(name = "none")
    private AreasEmpresa areasEmpresa = new AreasEmpresa();
    @ManyToOne
	@JoinColumn(name="cod_cargo")
    @org.hibernate.annotations.ForeignKey(name = "none")
    private Cargo cargo = new Cargo();
    @Column(name="direccion_personal")
    private String direccionPersonal;
    @Column(name="fecha_nac_personal")
    @DateTimeFormat(pattern="dd/MM/yyyy")
    @Temporal(TemporalType.DATE)
    private Date fechaNacPersonal;
    @ManyToOne
	@JoinColumn(name="cod_pais")
    @org.hibernate.annotations.ForeignKey(name = "none")
    private Pais pais = new Pais();
    @Column(name="telf_personal")
    private String telfPersonal;
    @Column(name="celular_personal")
    private String celularPersonal;
    @ManyToOne
	@JoinColumn(name="cod_genero")
    @org.hibernate.annotations.ForeignKey(name = "none")
    private Genero genero = new Genero();
    @Column(name="email_personal")
    private String emailPersonal;
    @ManyToOne
	@JoinColumn(name="cod_ciudad")
    @org.hibernate.annotations.ForeignKey(name = "none")
    private Ciudad ciudad = new Ciudad();
    @ManyToOne
	@JoinColumn(name="cod_estado_registro")
    @org.hibernate.annotations.ForeignKey(name = "none")
    private EstadosRegistro estadosRegistro = new EstadosRegistro();
    @Column(name="personal_externo")
    private int personalExterno;
    
    
    

    public int getCodPersonal() {
        return codPersonal;
    }

    public void setCodPersonal(int codPersonal) {
        this.codPersonal = codPersonal;
    }

    public String getApPaternoPersonal() {
        return apPaternoPersonal;
    }

    public void setApPaternoPersonal(String apPaternoPersonal) {
        this.apPaternoPersonal = apPaternoPersonal;
    }

    public String getApMaternoPersonal() {
        return apMaternoPersonal;
    }

    public void setApMaternoPersonal(String apMaternoPersonal) {
        this.apMaternoPersonal = apMaternoPersonal;
    }

    public String getNombrePersonal() {
        return nombrePersonal;
    }

    public void setNombrePersonal(String nombrePersonal) {
        this.nombrePersonal = nombrePersonal;
    }

    public String getNroCarnet() {
        return nroCarnet;
    }

    public void setNroCarnet(String nroCarnet) {
        this.nroCarnet = nroCarnet;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public AreasEmpresa getAreasEmpresa() {
        return areasEmpresa;
    }

    public void setAreasEmpresa(AreasEmpresa areasEmpresa) {
        this.areasEmpresa = areasEmpresa;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public String getDireccionPersonal() {
        return direccionPersonal;
    }

    public void setDireccionPersonal(String direccionPersonal) {
        this.direccionPersonal = direccionPersonal;
    }

     

    public Date getFechaNacPersonal() {
		return fechaNacPersonal;
	}

	public void setFechaNacPersonal(Date fechaNacPersonal) {
		this.fechaNacPersonal = fechaNacPersonal;
	}

	public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }    

    public String getTelfPersonal() {
		return telfPersonal;
	}

	public void setTelfPersonal(String telfPersonal) {
		this.telfPersonal = telfPersonal;
	}

	public String getCelularPersonal() {
        return celularPersonal;
    }

    public void setCelularPersonal(String celularPersonal) {
        this.celularPersonal = celularPersonal;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public String getEmailPersonal() {
        return emailPersonal;
    }

    public void setEmailPersonal(String emailPersonal) {
        this.emailPersonal = emailPersonal;
    }

    public EstadosRegistro getEstadosRegistro() {
        return estadosRegistro;
    }

    public void setEstadosRegistro(EstadosRegistro estadosRegistro) {
        this.estadosRegistro = estadosRegistro;
    }

	public int getPersonalExterno() {
		return personalExterno;
	}

	public void setPersonalExterno(int personalExterno) {
		this.personalExterno = personalExterno;
	}

	

        
    
    
    
}
