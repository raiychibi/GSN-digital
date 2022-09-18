package br.com.gsn.project.mapper;

import br.com.gsn.project.dto.UsuarioDto;
import br.com.gsn.project.entity.Usuario;

public class UsuarioMapper {

    public static Usuario dtoParaUsuario(UsuarioDto dto){
        return new Usuario(null, dto.getName(), dto.getEmail(), dto.getPassword(), null);
    }

}
