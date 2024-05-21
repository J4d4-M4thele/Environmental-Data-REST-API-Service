package com.enviro.assesment.grad001.jadamathele.services;

import com.enviro.assesment.grad001.jadamathele.entities.WasteCollection;
import com.enviro.assesment.grad001.jadamathele.repositories.WasteCollectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public interface WasteCollectionService {
    public WasteCollection saveData(long year, long recyclables, long organics, long buildersRubble);

}
