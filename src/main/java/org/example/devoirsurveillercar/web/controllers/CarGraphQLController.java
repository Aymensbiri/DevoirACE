package org.example.devoirsurveillercar.web.controllers;

import org.example.devoirsurveillercar.dto.VoitureDTO;
import org.example.devoirsurveillercar.service.CarService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;

import java.util.List;

public class CarGraphQLController {
    private CarService carService;

    @MutationMapping
    public VoitureDTO saveVoiture(@Argument VoitureDTO voiture) {
        return carService.Save(voiture);
    }

    @QueryMapping
    public List<VoitureDTO> getVoitureByModel(@Argument String model) {
        return (List<VoitureDTO>) carService.findByModel(model);
    }


}
