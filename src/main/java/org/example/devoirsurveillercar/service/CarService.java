package org.example.devoirsurveillercar.service;

import org.example.devoirsurveillercar.dto.VoitureDTO;

import java.util.List;

public interface CarService {


    VoitureDTO Save(VoitureDTO voitureDTO);

    List<VoitureDTO> findByModel(String model);
}
