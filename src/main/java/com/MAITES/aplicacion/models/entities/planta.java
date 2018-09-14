package com.MAITES.aplicacion.models.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table (name="planta")
public class planta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idplanta;

	@NotNull
	@NotEmpty
	private float co2max;
	
	@NotNull
	@NotEmpty
	private float co2min;
	
	@NotNull
	@NotEmpty
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date fechadeactualziacion;
	
	@NotNull
	@NotEmpty
	private float hamax;
	
	@NotNull
	@NotEmpty
	private float hamin;
	
	@NotNull
	@NotEmpty
	private float hsmax;

	@NotNull
	@NotEmpty
	private float hsmin;

	@NotNull
	@NotEmpty
	private int luxmax;

	@NotNull
	@NotEmpty
	private int luxmin;

	@NotNull
	@NotEmpty
	private String nombre;

	@NotNull
	@NotEmpty
	private float tamax;

	@NotNull
	@NotEmpty
	private float tamin;

	@NotNull
	@NotEmpty
	private float tsmax;

	@NotNull
	@NotEmpty
	private float tsmin;

	@NotNull
	@NotEmpty
	private int versiondeactualizacion;

	public int getIdplanta() {
		return idplanta;
	}

	public void setIdplanta(int idplanta) {
		this.idplanta = idplanta;
	}

	public float getCo2max() {
		return co2max;
	}

	public void setCo2max(float co2max) {
		this.co2max = co2max;
	}

	public float getCo2min() {
		return co2min;
	}

	public void setCo2min(float co2min) {
		this.co2min = co2min;
	}

	public Date getFechadeactualziacion() {
		return fechadeactualziacion;
	}

	public void setFechadeactualziacion(Date fechadeactualziacion) {
		this.fechadeactualziacion = fechadeactualziacion;
	}

	public float getHamax() {
		return hamax;
	}

	public void setHamax(float hamax) {
		this.hamax = hamax;
	}

	public float getHamin() {
		return hamin;
	}

	public void setHamin(float hamin) {
		this.hamin = hamin;
	}

	public float getHsmax() {
		return hsmax;
	}

	public void setHsmax(float hsmax) {
		this.hsmax = hsmax;
	}

	public float getHsmin() {
		return hsmin;
	}

	public void setHsmin(float hsmin) {
		this.hsmin = hsmin;
	}

	public int getLuxmax() {
		return luxmax;
	}

	public void setLuxmax(int luxmax) {
		this.luxmax = luxmax;
	}

	public int getLuxmin() {
		return luxmin;
	}

	public void setLuxmin(int luxmin) {
		this.luxmin = luxmin;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getTamax() {
		return tamax;
	}

	public void setTamax(float tamax) {
		this.tamax = tamax;
	}

	public float getTamin() {
		return tamin;
	}

	public void setTamin(float tamin) {
		this.tamin = tamin;
	}

	public float getTsmax() {
		return tsmax;
	}

	public void setTsmax(float tsmax) {
		this.tsmax = tsmax;
	}

	public float getTsmin() {
		return tsmin;
	}

	public void setTsmin(float tsmin) {
		this.tsmin = tsmin;
	}

	public int getVersiondeactualizacion() {
		return versiondeactualizacion;
	}

	public void setVersiondeactualizacion(int versiondeactualizacion) {
		this.versiondeactualizacion = versiondeactualizacion;
	}

}
