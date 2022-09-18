package br.com.gsn.project.dto;

import javax.persistence.Column;

public class RotinaDto {


    private String name;


    private int tarefa;


    private String descricaoTarefa;


    public RotinaDto(String name, int tarefa, String descricaoTarefa){
        this.name = name;
        this.tarefa = tarefa;
        this.descricaoTarefa = descricaoTarefa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTarefa() {
        return tarefa;
    }

    public void setTarefa(int tarefa) {
        this.tarefa = tarefa;
    }

    public String getDescricaoTarefa() {
        return descricaoTarefa;
    }

    public void setDescricaoTarefa(String descricaoTarefa) {
        this.descricaoTarefa = descricaoTarefa;
    }
}
