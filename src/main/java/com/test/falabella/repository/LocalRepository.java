package com.test.falabella.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.test.falabella.entity.LocalEntity;

public interface LocalRepository extends CrudRepository<LocalEntity, Long> {
	List<LocalEntity> findByLocalNombre(String localNombre);
}
