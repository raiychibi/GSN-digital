package br.com.gsn.project.dto;


import java.time.LocalDateTime;

public class PlantaDto {

    private String name;

    private float irrigacao;

    private LocalDateTime iluminacao1;

    private LocalDateTime iluminacao2;

    public PlantaDto(String name, float irrigacao, LocalDateTime iluminacao1, LocalDateTime iluminacao2) {
        this.name = name;
        this.irrigacao = irrigacao;
        this.iluminacao1 = iluminacao1;
        this.iluminacao2 = iluminacao2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getIrrigacao() {
        return irrigacao;
    }

    public void setIrrigacao(float irrigacao) {
        this.irrigacao = irrigacao;
    }

    public LocalDateTime getIluminacao1() {
        return iluminacao1;
    }

    public void setIluminacao1(LocalDateTime iluminacao1) {
        this.iluminacao1 = iluminacao1;
    }

    public LocalDateTime getIluminacao2() {
        return iluminacao2;
    }

    public void setIluminacao2(LocalDateTime iluminacao2) {
        this.iluminacao2 = iluminacao2;
    }
}
