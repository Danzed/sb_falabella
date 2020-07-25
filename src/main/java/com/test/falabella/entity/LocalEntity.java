package com.test.falabella.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class LocalEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String fecha;
	private String localId;
	private String localNombre;
	private String comunaNombre;
	private String localidadNombre;
	private String vlocalDireccion;
	private String funcionamientoHoraApertura;
	private String funcionamientoHoraCierre;
	private String localTelefono;
	private String localLat;
	private String localLng;
	private String funcionamientoDia;
	private String fkRegion;
	private String fkComuna;

	protected LocalEntity() {
	}	

	public LocalEntity(Long id, String fecha, String localId, String localNombre, String comunaNombre,
			String localidadNombre, String vlocalDireccion, String funcionamientoHoraApertura,
			String funcionamientoHoraCierre, String localTelefono, String localLat, String localLng,
			String funcionamientoDia, String fkRegion, String fkComuna) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.localId = localId;
		this.localNombre = localNombre;
		this.comunaNombre = comunaNombre;
		this.localidadNombre = localidadNombre;
		this.vlocalDireccion = vlocalDireccion;
		this.funcionamientoHoraApertura = funcionamientoHoraApertura;
		this.funcionamientoHoraCierre = funcionamientoHoraCierre;
		this.localTelefono = localTelefono;
		this.localLat = localLat;
		this.localLng = localLng;
		this.funcionamientoDia = funcionamientoDia;
		this.fkRegion = fkRegion;
		this.fkComuna = fkComuna;
	}
}
