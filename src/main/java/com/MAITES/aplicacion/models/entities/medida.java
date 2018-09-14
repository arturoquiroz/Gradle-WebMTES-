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
@Table (name="medida")
public class medida {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idmedida;
	
	@NotNull
	@NotEmpty
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date fecha;
	
	@NotNull
	@NotEmpty
	@Temporal(TemporalType.TIME)
	private Date hora;
	
	@NotNull
	@NotEmpty
	private float temperatura_ambiente;
	
	@NotNull
	@NotEmpty
	private float humedad_ambiente;
	
	@NotNull
	@NotEmpty
	private float temperatura_suelo;
	
	@NotNull
	@NotEmpty
	private float humedad_suelo;
	
	@NotNull
	@NotEmpty
	private int luxes;
	
	@NotNull
	@NotEmpty
	private float co2;

	public int getIdmedida() {
		return idmedida;
	}

	public void setIdmedida(int idmedida) {
		this.idmedida = idmedida;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Date getHora() {
		return hora;
	}

	public void setHora(Date hora) {
		this.hora = hora;
	}

	public float getTemperatura_ambiente() {
		return temperatura_ambiente;
	}

	public void setTemperatura_ambiente(float temperatura_ambiente) {
		this.temperatura_ambiente = temperatura_ambiente;
	}

	public float getHumedad_ambiente() {
		return humedad_ambiente;
	}

	public void setHumedad_ambiente(float humedad_ambiente) {
		this.humedad_ambiente = humedad_ambiente;
	}

	public float getTemperatura_suelo() {
		return temperatura_suelo;
	}

	public void setTemperatura_suelo(float temperatura_suelo) {
		this.temperatura_suelo = temperatura_suelo;
	}

	public float getHumedad_suelo() {
		return humedad_suelo;
	}

	public void setHumedad_suelo(float humedad_suelo) {
		this.humedad_suelo = humedad_suelo;
	}

	public int getLuxes() {
		return luxes;
	}

	public void setLuxes(int luxes) {
		this.luxes = luxes;
	}

	public float getCo2() {
		return co2;
	}

	public void setCo2(float co2) {
		this.co2 = co2;
	}

}
