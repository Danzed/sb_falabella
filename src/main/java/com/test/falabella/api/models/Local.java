package com.test.falabella.api.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Local {
	public String fecha;
	public String local_id;
	public String local_nombre;
	public String comuna_nombre;
	public String localidad_nombre;
	public String vlocal_direccion;
	public String funcionamiento_hora_apertura;
	public String funcionamiento_hora_cierre;
	public String local_telefono;
	public String local_lat;
	public String local_lng;
	public String funcionamiento_dia;
	public String fk_region;
	public String fk_comuna;

	@Override
	public String toString() {
		return "Local [fecha=" + fecha + ", local_id=" + local_id + ", local_nombre=" + local_nombre
				+ ", comuna_nombre=" + comuna_nombre + ", localidad_nombre=" + localidad_nombre + ", vlocal_direccion="
				+ vlocal_direccion + ", funcionamiento_hora_apertura=" + funcionamiento_hora_apertura
				+ ", funcionamiento_hora_cierre=" + funcionamiento_hora_cierre + ", local_telefono=" + local_telefono
				+ ", local_lat=" + local_lat + ", local_lng=" + local_lng + ", funcionamiento_dia=" + funcionamiento_dia
				+ ", fk_region=" + fk_region + ", fk_comuna=" + fk_comuna + "]";
	}
}