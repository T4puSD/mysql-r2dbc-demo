package com.example.demoreactive;

import com.example.demoreactive.domain.Event;
import com.example.demoreactive.domain.enumuration.EventName;
import com.example.demoreactive.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoreactiveApplication implements ApplicationRunner{

	public static void main(String[] args) {
		SpringApplication.run(DemoreactiveApplication.class, args);
	}

	@Autowired
	EventRepository eventRepository;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("RUnning");
		eventRepository.save(new Event(EventName.QUOTE, "This is a first event"))
				.subscribe(event -> {
					System.out.println("Id is:"+ event.getId());
				});
		System.out.println("Ran");
	}
}
