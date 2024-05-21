package com.enviro.assesment.grad001.jadamathele.service.impl;

import com.enviro.assesment.grad001.jadamathele.entity.WasteCollection;
import com.enviro.assesment.grad001.jadamathele.repository.WasteCollectionRepository;
import com.enviro.assesment.grad001.jadamathele.service.WasteCollectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class WasteCollectionServiceImpl implements WasteCollectionService {

    @Autowired
    private WasteCollectionRepository repository;

    //uploading the file/filePath

    @Override
    public List<WasteCollection> parseFile(String filePath) {
        //add file path (we get it from postman)
        List<WasteCollection> wasteDataList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                //txt file is CSV formatted
                String[] data = line.split(",");
                WasteCollection wasteData = new WasteCollection();
                wasteData.setYear(Long.parseLong(data[0]));
                wasteData.setRecyclables(Long.parseLong(data[1]));
                wasteData.setOrganics(Long.parseLong(data[2]));
                wasteData.setBuildersRubble(Long.parseLong(data[3]));
                wasteDataList.add(wasteData);
            }
            repository.saveAll(wasteDataList);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return wasteDataList;
    }

}
