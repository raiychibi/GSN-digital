package br.com.gsn.project.controller;

import br.com.gsn.project.dto.UsuarioDto;
import br.com.gsn.project.entity.Usuario;
import br.com.gsn.project.mapper.UsuarioMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import br.com.gsn.project.service.UsuarioService;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }
    @PostMapping
    public ResponseEntity<UsuarioDto> cadastrarUsuario(@RequestBody UsuarioDto response){
        try{
            usuarioService.cadastrar(UsuarioMapper.dtoParaUsuario(response));
            return new ResponseEntity<UsuarioDto>(response, HttpStatus.CREATED);
        }catch (Exception e){
            return ResponseEntity.internalServerError().build();
        }
    }
}
