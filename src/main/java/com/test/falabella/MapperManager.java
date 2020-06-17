package com.test.falabella;

import com.test.falabella.api.model.Local;
import com.test.falabella.entity.LocalEntity;

import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

public class MapperManager {
	private MapperFactory mapperFactory;

	public MapperManager() {
		this.mapperFactory = new DefaultMapperFactory.Builder().build();
		this.mapperFactory.classMap(Local.class, LocalEntity.class).mapNulls(false).mapNullsInReverse(false).byDefault()
				.field("local_id", "localId")
				.field("local_nombre", "localNombre")
				.field("comuna_nombre", "comunaNombre")
				.field("localidad_nombre", "localidadNombre")
				.field("vlocal_direccion", "localId")
				.field("funcionamiento_hora_apertura", "funcionamientoHoraApertura")
				.field("funcionamiento_hora_cierre", "funcionamientoHoraCierre")
				.field("local_telefono", "localTelefono")
				.field("local_lat", "localLat")
				.field("local_lng", "localLng")
				.field("funcionamiento_dia", "funcionamientoDia")
				.field("fk_region", "fkRegion")
				.field("fk_comuna", "fkComuna")
				.register();
	}

	public <S, D> D map(S s, Class<D> type) {
		return this.mapperFactory.getMapperFacade().map(s, type);
	}
}
