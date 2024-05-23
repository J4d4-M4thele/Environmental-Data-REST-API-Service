package com.enviro.assesment.grad001.jadamathele.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.enviro.assesment.grad001.jadamathele.domain.*;

public interface WasteDataRepository extends CrudRepository<WasteData, Long>{

	Optional<WasteData> findByYear(String year);
	
}
