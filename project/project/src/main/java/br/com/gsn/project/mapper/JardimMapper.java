package br.com.gsn.project.mapper;

import br.com.gsn.project.dto.JardimDto;
import br.com.gsn.project.dto.PlantaDto;
import br.com.gsn.project.entity.Jardim;
import br.com.gsn.project.entity.Planta;

import java.util.ArrayList;
import java.util.List;

public class JardimMapper {

    public static Jardim dtoParaJardim(JardimDto dto){
        return new Jardim(null, dto.getName(), dto.getNumber(), null, PlantaMapper.listaPlantaDtoParaPlanta(dto.getPlantas()));
    }

    public static JardimDto jardimParaDto(Jardim jardim){
        return new JardimDto(jardim.getName(), jardim.getNumber(), PlantaMapper.listaPlantaParaPlantaDto(jardim.getPlantas()));
    }

    public static List<JardimDto> listaJardimParaJardimDto (List<Jardim> listJardim){
        List<JardimDto> jardins = new ArrayList<>();
        listJardim.forEach(jardim -> jardins.add(new JardimDto(jardim.getName(), jardim.getNumber(), PlantaMapper.listaPlantaParaPlantaDto(jardim.getPlantas()))));
        return jardins;
    }


}
