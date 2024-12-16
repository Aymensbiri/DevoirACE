package org.example.devoirsurveillercar.service;

import lombok.AllArgsConstructor;
import org.example.devoirsurveillercar.dao.entities.Voiture;
import org.example.devoirsurveillercar.dao.repositories.VoitureRepository;
import org.example.devoirsurveillercar.dto.VoitureDTO;
import org.example.devoirsurveillercar.mapper.CarMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class CarManager implements CarService {

    private CarMapper carMapper;
    private VoitureRepository voitureRepository;


    @Override
    public VoitureDTO Save(VoitureDTO voitureDTO) {
        Voiture voiture = carMapper.fromVoitureDtoToVoiture(voitureDTO);
        voiture = voitureRepository.save(voiture);
        voitureDTO = carMapper.fromVoitureToVoitureDto(voiture);
        return voitureDTO;
    }

    @Override
    public List<VoitureDTO> findByModel(String model) {
        List<Voiture> voitures = voitureRepository.findByModel(model);
        List<VoitureDTO> voitureDTOs = new ArrayList<>();
        for (Voiture voiture : voitures) {
            voitureDTOs.add(CarMapper.fromVoitureToVoitureDto(voiture));
        }
        return voitureDTOs;
    }

}
