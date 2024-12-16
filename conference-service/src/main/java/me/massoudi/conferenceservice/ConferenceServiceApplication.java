package me.massoudi.conferenceservice;

import me.massoudi.conferenceservice.model.Conference;
import me.massoudi.conferenceservice.repo.ConferenceRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class ConferenceServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConferenceServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner init(ConferenceRepository conferenceRepository) {
        return args -> {
            Conference conference1 = new Conference();
            conference1.setDate(new Date());
            conference1.setTitle("Conference 1");
            conference1.setDuration(100);
            conference1.setNumberOfAttendees(100);

            conferenceRepository.save(conference1);


        };
    }

}
