package org.example.devoirsurveillercar.dto;

import lombok.*;

@Getter
@Setter
@Builder
@ToString
public class VoitureDTO {
    public String model;
    public String color;
    public String matricul;
    public Double price;

    public VoitureDTO(String model, String color, String matricul, Double price) {
        this.model = model;
        this.color = color;
        this.matricul = matricul;
        this.price = price;
    }
    public VoitureDTO() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMatricul() {
        return matricul;
    }

    public void setMatricul(String matricul) {
        this.matricul = matricul;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
