package org.example.catalogue;

import org.example.catalogue.repository.FleurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class CatalogueApplication implements CommandLineRunner {

    @Autowired
    FleurRepository fleurRepo;

    public static void main(String[] args) {
        SpringApplication.run(CatalogueApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
