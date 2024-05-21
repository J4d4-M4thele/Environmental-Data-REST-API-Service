package com.enviro.assesment.grad001.jadamathele.service;

import com.enviro.assesment.grad001.jadamathele.entity.WasteCollection;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface WasteCollectionService {

    public List<WasteCollection> parseFile(String filename);

}
