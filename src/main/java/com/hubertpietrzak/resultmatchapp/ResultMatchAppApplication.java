package com.hubertpietrzak.resultmatchapp;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hubertpietrzak.resultmatchapp.domain.Event;
import com.hubertpietrzak.resultmatchapp.service.EventService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@SpringBootApplication
public class ResultMatchAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResultMatchAppApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(EventService eventService) {
		return args -> {
			// read json and write to db
			ObjectMapper mapper = new ObjectMapper();
			TypeReference<List<Event>> typeReference = new TypeReference<>() {};
			InputStream inputStream = TypeReference.class.getResourceAsStream("/json/BE_data.json");
			try {
				List<Event> events = mapper.readValue(inputStream,typeReference);
				eventService.save(events);
				System.out.println("Events Saved!");
			} catch (IOException e){
				System.out.println("Unable to save events: " + e.getMessage());
			}
		};
	}

}
