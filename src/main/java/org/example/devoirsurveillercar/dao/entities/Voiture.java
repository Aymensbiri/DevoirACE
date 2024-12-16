package org.example.devoirsurveillercar.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Voiture {
    @Id
    @GeneratedValue
    private Long id_Car;
    private String model;
    private String matricul;
    private Double price;
}
