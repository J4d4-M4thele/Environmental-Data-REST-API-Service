package com.enviro.assesment.grad001.jadamathele.services;

import com.enviro.assesment.grad001.jadamathele.entities.WasteCollection;
import com.enviro.assesment.grad001.jadamathele.repositories.WasteCollectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface WasteCollectionService {

    public List<WasteCollection> parseFile(String filename);

}
