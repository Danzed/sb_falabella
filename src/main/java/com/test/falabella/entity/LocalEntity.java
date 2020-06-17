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



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getLocalId() {
		return localId;
	}

	public void setLocalId(String localId) {
		this.localId = localId;
	}

	public String getLocalNombre() {
		return localNombre;
	}

	public void setLocalNombre(String localNombre) {
		this.localNombre = localNombre;
	}

	public String getComunaNombre() {
		return comunaNombre;
	}

	public void setComunaNombre(String comunaNombre) {
		this.comunaNombre = comunaNombre;
	}

	public String getLocalidadNombre() {
		return localidadNombre;
	}

	public void setLocalidadNombre(String localidadNombre) {
		this.localidadNombre = localidadNombre;
	}

	public String getVlocalDireccion() {
		return vlocalDireccion;
	}

	public void setVlocalDireccion(String vlocalDireccion) {
		this.vlocalDireccion = vlocalDireccion;
	}

	public String getFuncionamientoHoraApertura() {
		return funcionamientoHoraApertura;
	}

	public void setFuncionamientoHoraApertura(String funcionamientoHoraApertura) {
		this.funcionamientoHoraApertura = funcionamientoHoraApertura;
	}

	public String getFuncionamientoHoraCierre() {
		return funcionamientoHoraCierre;
	}

	public void setFuncionamientoHoraCierre(String funcionamientoHoraCierre) {
		this.funcionamientoHoraCierre = funcionamientoHoraCierre;
	}

	public String getLocalTelefono() {
		return localTelefono;
	}

	public void setLocalTelefono(String localTelefono) {
		this.localTelefono = localTelefono;
	}

	public String getLocalLat() {
		return localLat;
	}

	public void setLocalLat(String localLat) {
		this.localLat = localLat;
	}

	public String getLocalLng() {
		return localLng;
	}

	public void setLocalLng(String localLng) {
		this.localLng = localLng;
	}

	public String getFuncionamientoDia() {
		return funcionamientoDia;
	}

	public void setFuncionamientoDia(String funcionamientoDia) {
		this.funcionamientoDia = funcionamientoDia;
	}

	public String getFkRegion() {
		return fkRegion;
	}

	public void setFkRegion(String fkRegion) {
		this.fkRegion = fkRegion;
	}

	public String getFkComuna() {
		return fkComuna;
	}

	public void setFkComuna(String fkComuna) {
		this.fkComuna = fkComuna;
	}
}
