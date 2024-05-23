package com.enviro.assesment.grad001.jadamathele;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.enviro.assesment.grad001.jadamathele.service.WasteDataService;
import com.enviro.assesment.grad001.jadamathele.domain.WasteData;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Bean
	CommandLineRunner runner(WasteDataService service){
	    return args -> {
			// read JSON and load json
			ObjectMapper mapper = new ObjectMapper();
			TypeReference<List<WasteData>> typeReference = new TypeReference<List<WasteData>>(){};
			InputStream inputStream = TypeReference.class.getResourceAsStream("/json/data.json");
			try {
				List<WasteData> users = mapper.readValue(inputStream,typeReference);
				service.save(users);
				System.out.println("Data Saved!");
			} catch (IOException e){
				System.out.println("Unable to save data: " + e.getMessage());
			}
	    };
	}

}
