package com.test.falabella.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LocalEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String fecha;
	private String local_id;
	private String local_nombre;
	private String comuna_nombre;
	private String localidad_nombre;
	private String vlocal_direccion;
	private String funcionamiento_hora_apertura;
	private String funcionamiento_hora_cierre;
	private String local_telefono;
	private String local_lat;
	private String local_lng;
	private String funcionamiento_dia;
	private String fk_region;
	private String fk_comuna;

	protected LocalEntity() {
	}

	public LocalEntity(Long id, String fecha, String local_id, String local_nombre, String comuna_nombre,
			String localidad_nombre, String vlocal_direccion, String funcionamiento_hora_apertura,
			String funcionamiento_hora_cierre, String local_telefono, String local_lat, String local_lng,
			String funcionamiento_dia, String fk_region, String fk_comuna) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.local_id = local_id;
		this.local_nombre = local_nombre;
		this.comuna_nombre = comuna_nombre;
		this.localidad_nombre = localidad_nombre;
		this.vlocal_direccion = vlocal_direccion;
		this.funcionamiento_hora_apertura = funcionamiento_hora_apertura;
		this.funcionamiento_hora_cierre = funcionamiento_hora_cierre;
		this.local_telefono = local_telefono;
		this.local_lat = local_lat;
		this.local_lng = local_lng;
		this.funcionamiento_dia = funcionamiento_dia;
		this.fk_region = fk_region;
		this.fk_comuna = fk_comuna;
	}

	// Getter Methods

	public String getFecha() {
		return fecha;
	}

	public String getLocal_id() {
		return local_id;
	}

	public String getLocal_nombre() {
		return local_nombre;
	}

	public String getComuna_nombre() {
		return comuna_nombre;
	}

	public String getLocalidad_nombre() {
		return localidad_nombre;
	}

	public String getVlocal_direccion() {
		return vlocal_direccion;
	}

	public String getFuncionamiento_hora_apertura() {
		return funcionamiento_hora_apertura;
	}

	public String getFuncionamiento_hora_cierre() {
		return funcionamiento_hora_cierre;
	}

	public String getLocal_telefono() {
		return local_telefono;
	}

	public String getLocal_lat() {
		return local_lat;
	}

	public String getLocal_lng() {
		return local_lng;
	}

	public String getFuncionamiento_dia() {
		return funcionamiento_dia;
	}

	public String getFk_region() {
		return fk_region;
	}

	public String getFk_comuna() {
		return fk_comuna;
	}

	// Setter Methods

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public void setLocal_id(String local_id) {
		this.local_id = local_id;
	}

	public void setLocal_nombre(String local_nombre) {
		this.local_nombre = local_nombre;
	}

	public void setComuna_nombre(String comuna_nombre) {
		this.comuna_nombre = comuna_nombre;
	}

	public void setLocalidad_nombre(String localidad_nombre) {
		this.localidad_nombre = localidad_nombre;
	}

	public void setVlocal_direccion(String vlocal_direccion) {
		this.vlocal_direccion = vlocal_direccion;
	}

	public void setFuncionamiento_hora_apertura(String funcionamiento_hora_apertura) {
		this.funcionamiento_hora_apertura = funcionamiento_hora_apertura;
	}

	public void setFuncionamiento_hora_cierre(String funcionamiento_hora_cierre) {
		this.funcionamiento_hora_cierre = funcionamiento_hora_cierre;
	}

	public void setLocal_telefono(String local_telefono) {
		this.local_telefono = local_telefono;
	}

	public void setLocal_lat(String local_lat) {
		this.local_lat = local_lat;
	}

	public void setLocal_lng(String local_lng) {
		this.local_lng = local_lng;
	}

	public void setFuncionamiento_dia(String funcionamiento_dia) {
		this.funcionamiento_dia = funcionamiento_dia;
	}

	public void setFk_region(String fk_region) {
		this.fk_region = fk_region;
	}

	public void setFk_comuna(String fk_comuna) {
		this.fk_comuna = fk_comuna;
	}
}
