package com.enviro.assesment.grad001.jadamathele.controller;

import java.sql.ResultSet;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.enviro.assesment.grad001.jadamathele.domain.WasteData;
import com.enviro.assesment.grad001.jadamathele.service.WasteDataService;

@RestController
@RequestMapping(path = "/api/data")
public class WasteDataController {

	private WasteDataService service;

	public WasteDataController(WasteDataService service) {
		this.service = service;
	}

	@GetMapping
	public Iterable<WasteData> listWasteData() {
		return service.listAll();
	}

	@GetMapping(path = "/{year}")
	public Optional<WasteData> listWasteDataByYear(@PathVariable String year) {
		return service.listByYear(year);
	}

	@PostMapping
	public ResponseEntity<WasteData> createData(@RequestBody WasteData data) {
		// details are added
		WasteData newData = service.createData(data);
		// data is then saved
		service.save(newData);
		return new ResponseEntity(newData, HttpStatus.CREATED);
	}

	@PutMapping(path = "/{year}")
	public ResponseEntity<WasteData> updateData(@PathVariable String year, @RequestBody WasteData data) {
		// object is updated then returned as a response
		WasteData updatedData = service.updateData(year, data);
		service.save(updatedData);
		return ResponseEntity.ok(updatedData);
	}

	@DeleteMapping(path = "/{year}")
	public ResponseEntity<String> deleteData(@PathVariable String year) {
		service.deleteData(year);
		return ResponseEntity.ok("Data for the year " + year + " has been successully deleted.");
	}

	@DeleteMapping
	public ResponseEntity<String> deleteAllData() {
		service.deleteAllData();
		return ResponseEntity.ok("All data has been successully deleted. The database is now empty.");
	}
}
