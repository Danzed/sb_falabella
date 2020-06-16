package com.test.falabella;

import com.test.falabella.api.models.Local;
import com.test.falabella.entity.LocalEntity;

import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

public class MapperManager {
	private MapperFactory mapperFactory;

	public MapperManager() {
		this.mapperFactory = new DefaultMapperFactory.Builder().build();
		this.mapperFactory.classMap(Local.class, LocalEntity.class).mapNulls(false).mapNullsInReverse(false)
				.byDefault().register();
	}

	public <S, D> D map(S s, Class<D> type) {
		return this.mapperFactory.getMapperFacade().map(s, type);
	}
}
