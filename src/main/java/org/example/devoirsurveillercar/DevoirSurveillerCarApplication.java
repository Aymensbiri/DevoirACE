package org.example.devoirsurveillercar;

import org.example.devoirsurveillercar.dao.repositories.VoitureRepository;
import org.example.devoirsurveillercar.dto.VoitureDTO;
import org.example.devoirsurveillercar.service.CarManager;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DevoirSurveillerCarApplication {

    public static void main(String[] args) {
        SpringApplication.run(DevoirSurveillerCarApplication.class, args);
    }
    @Bean
    CommandLineRunner start(VoitureRepository voitureRepository, CarManager voitureManager) {
        return args -> {

            VoitureDTO voiture1 = new VoitureDTO("Toyota Corolla", "Blanche", "ABC123", 20000.0);
            VoitureDTO voiture2 = new VoitureDTO("Ford Mustang", "Bleue", "DEF456", 45000.0);
            VoitureDTO voiture3 = new VoitureDTO("Honda Civic", "Rouge", "GHI789", 22000.0);


            voitureManager.Save(voiture1);
            voitureManager.Save(voiture2);
            voitureManager.Save(voiture3);


            System.out.println("Voitures ajoutées :");
            System.out.println(voiture1.getModel());
            System.out.println(voiture2.getModel());
            System.out.println(voiture3.getModel());
        };
    }


}
