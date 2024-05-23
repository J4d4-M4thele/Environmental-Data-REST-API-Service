package com.enviro.assesment.grad001.jadamathele.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.enviro.assesment.grad001.jadamathele.domain.WasteData;
import com.enviro.assesment.grad001.jadamathele.exception.DataNotFoundException;
import com.enviro.assesment.grad001.jadamathele.repository.WasteDataRepository;

@Service
public class WasteDataService {

	private final WasteDataRepository repository;

	public WasteDataService(WasteDataRepository repository) {
		this.repository = repository;
	}

	// creates set of data
	public WasteData createData(WasteData data) {
		// creating another row of data for another year
		WasteData wasteData = new WasteData();
		wasteData.setYear(data.getYear());
		wasteData.setRecyclables(data.getRecyclables());
		wasteData.setOrganics(data.getOrganics());
		wasteData.setBuildersRubble(data.getBuildersRubble());

		return wasteData;
	}

	// gets all data
	public Iterable<WasteData> listAll() {
		return repository.findAll();
	}

	// gets data according to the year
	public Optional<WasteData> listByYear(String year) {
		return repository.findByYear(year);
	}

	// updates data
	public WasteData updateData(String year, WasteData data) {
		// data is found by year
		WasteData existingData = repository.findByYear(year)
				.orElseThrow(() -> new DataNotFoundException("Data for the year " + year + " does not exist."));
		// fields are then updated
		existingData.setYear(data.getYear());
		existingData.setRecyclables(data.getRecyclables());
		existingData.setOrganics(data.getOrganics());
		existingData.setBuildersRubble(data.getBuildersRubble());

		return existingData;
	}

	// saves all data
	public WasteData save(WasteData data) {
		return repository.save(data);
	}

	// saves a single data object
	public void save(List<WasteData> data) {
		repository.saveAll(data);
	}

	//deleting a single row of data
	public void deleteData(String year) {
		// data is found by year
		WasteData existingData = repository.findByYear(year)
				.orElseThrow(() -> new DataNotFoundException("Data for the year " + year + " does not exist."));
		
		//existing data is then deleted
		repository.delete(existingData);
	}
	
	//deleting all data
	public void deleteAllData() {
		repository.deleteAll();
	}
	
}
