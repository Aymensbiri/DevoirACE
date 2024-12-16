package org.example.devoirsurveillercar.mapper;

import org.example.devoirsurveillercar.dao.entities.Voiture;
import org.example.devoirsurveillercar.dto.VoitureDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class CarMapper {

    private static ModelMapper mapper;

    public CarMapper(ModelMapper mapper) {
        this.mapper = mapper;
    }

    public Voiture fromVoitureDtoToVoiture(VoitureDTO voitureDTO){
        return mapper.map(voitureDTO, Voiture.class);
    }

    public static VoitureDTO fromVoitureToVoitureDto(Voiture voiture){
        return mapper.map(voiture, VoitureDTO.class);
    }
}
