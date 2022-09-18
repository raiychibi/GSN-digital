package br.com.gsn.project.mapper;

import br.com.gsn.project.dto.RotinaDto;
import br.com.gsn.project.entity.Rotina;

public class RotinaMapper {

    public static Rotina dtoParaRotina(RotinaDto dto){
        return new Rotina(null, dto.getName(), dto.getTarefa(), dto.getDescricaoTarefa(), null);
    }

}
