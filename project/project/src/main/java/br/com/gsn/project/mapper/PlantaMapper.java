package br.com.gsn.project.mapper;

import br.com.gsn.project.dto.PlantaDto;
import br.com.gsn.project.entity.Planta;

import java.util.ArrayList;
import java.util.List;

public class PlantaMapper {

    public static Planta dtoParaPlanta(PlantaDto dto){
        return new Planta(null, dto.getName(), dto.getIrrigacao(), dto.getIluminacao1(), dto.getIluminacao2(), null, null );
    }

    public static List<Planta> listaPlantaDtoParaPlanta (List<PlantaDto> dto){
        List<Planta> plantas = new ArrayList<>();
        dto.forEach(planta-> plantas.add(new Planta(null, planta.getName(), planta.getIrrigacao(), planta.getIluminacao1(), planta.getIluminacao2(), null, null )));
        return plantas;
    }

    public static List<PlantaDto> listaPlantaParaPlantaDto (List<Planta> listPlanta){
        List<PlantaDto> plantas = new ArrayList<>();
        listPlanta.forEach(planta -> plantas.add(new PlantaDto(planta.getName(), planta.getIrrigacao(), planta.getIluminacao1(), planta.getIluminacao2())));
        return plantas;
    }

}
