package me.massoudi.keynoteservice;

import me.massoudi.keynoteservice.model.KeyNote;
import me.massoudi.keynoteservice.repo.KeyNoteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class KeynoteServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(KeynoteServiceApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(KeyNoteRepository repository) {
        return args -> {
            KeyNote keynote1 = new KeyNote();
            keynote1.setFirstName("Keynote 1");
            keynote1.setLastName("Speaker 1");
            keynote1.setEmail("ji");
            keynote1.setFunction("Speaker");


            KeyNote keynote2 = new KeyNote();
            keynote2.setFirstName("Keynote 2");
            keynote2.setLastName("Speaker 2");
            keynote2.setEmail("ji");
            keynote2.setFunction("Speaker");


            repository.save(keynote1);
            repository.save(keynote2);
        };
    }

}
