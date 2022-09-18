package br.com.gsn.project.dto;

import br.com.gsn.project.entity.Planta;

import javax.persistence.Column;
import java.util.List;

public class JardimDto {

    private String name;

    private int number;

    private List<PlantaDto> plantas;

    public JardimDto(String name, int number, List<PlantaDto> plantas) {
        this.name = name;
        this.number = number;
        this.plantas = plantas;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List<PlantaDto> getPlantas() {
        return plantas;
    }

    public void setPlantas(List<PlantaDto> plantas) {
        this.plantas = plantas;
    }
}
