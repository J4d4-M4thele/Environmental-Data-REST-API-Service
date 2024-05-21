package com.enviro.assesment.grad001.jadamathele.services.impl;

import com.enviro.assesment.grad001.jadamathele.entities.WasteCollection;
import com.enviro.assesment.grad001.jadamathele.repositories.WasteCollectionRepository;
import com.enviro.assesment.grad001.jadamathele.services.WasteCollectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WasteCollectionServiceImpl implements WasteCollectionService {

    @Autowired
    private WasteCollectionRepository repository;

    @Override
    public WasteCollection saveData(long year, long recyclables, long organics, long buildersRubble){
        return new WasteCollection();
    }
}
