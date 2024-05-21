package com.enviro.assesment.grad001.jadamathele.controller;

import com.enviro.assesment.grad001.jadamathele.entity.WasteCollection;
import com.enviro.assesment.grad001.jadamathele.service.impl.WasteCollectionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class WasteCollectionController {
    @Autowired
    private final WasteCollectionServiceImpl service;

    public WasteCollectionController(WasteCollectionServiceImpl wasteService) {
        this.service = wasteService;
    }

    @GetMapping("/data")
    public Iterable<WasteCollection> getWasteData() {
        return service.listWasteData();
    }
}
