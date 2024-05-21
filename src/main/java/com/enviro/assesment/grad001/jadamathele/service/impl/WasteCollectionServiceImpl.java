package com.enviro.assesment.grad001.jadamathele.service.impl;

import com.enviro.assesment.grad001.jadamathele.entity.WasteCollection;
import com.enviro.assesment.grad001.jadamathele.repository.WasteCollectionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WasteCollectionServiceImpl{

    private final WasteCollectionRepository repository;

    public WasteCollectionServiceImpl(WasteCollectionRepository repository) {
        this.repository = repository;
    }

    public Iterable<WasteCollection> listWasteData() {
        return repository.findAll();
    }

    public Iterable<WasteCollection> save(List<WasteCollection> wasteData) {
        return repository.saveAll(wasteData);
    }

//    public WasteCollection dataByYear(long year) {
//        return repository.findByYear(year)
//                .orElseThrow(() -> new DataNotFoundException("Sorry, only data from 2016 to 2020 is available."));
//    }

}
