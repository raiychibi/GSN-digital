package br.com.gsn.project.controller;

import antlr.TokenStreamRewriteEngine;
import br.com.gsn.project.dto.JardimDto;
import br.com.gsn.project.entity.Jardim;
import br.com.gsn.project.mapper.JardimMapper;
import br.com.gsn.project.repository.JardimRepository;
import br.com.gsn.project.service.JardimService;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jardim/")
public class JardimController {

    private final JardimService jardimService;

    public JardimController(JardimService jardimService) { this.jardimService  = jardimService; }

    @PostMapping
    public ResponseEntity<JardimDto> cadastrarJardim(@RequestBody JardimDto response) {
        try {
            jardimService.cadastrar(JardimMapper.dtoParaJardim(response));
            return new ResponseEntity<JardimDto>(response, HttpStatus.CREATED);
        }catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }

    @DeleteMapping("{id}")
    public ResponseEntity<JardimDto> deletarJardim(@PathVariable(value = "id") Long id){

        try{
          jardimService.deletar(id);
          return ResponseEntity.noContent().build();
        }catch (Exception e){
            return ResponseEntity.notFound().build();
        }

    }

    @GetMapping("{id}")
    public ResponseEntity<JardimDto> encontrarJardim(@PathVariable(value = "id") Long id){
        try {
           Jardim jardim = jardimService.encontrar(id);
           return ResponseEntity.ok(JardimMapper.jardimParaDto(jardim));
        }catch (Exception e){
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<JardimDto>> encontrarTodosJardim(){
        try {
            List<Jardim> jardim = jardimService.encontrarTodos();
            return ResponseEntity.ok(JardimMapper.listaJardimParaJardimDto(jardim));
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("{id}")
    public ResponseEntity<JardimDto> atualizarJardim(@PathVariable(value = "id") Long id, @RequestBody JardimDto jardimDto){
        try {
            Jardim jardim = jardimService.atualizar(id, JardimMapper.dtoParaJardim(jardimDto));
           return ResponseEntity.ok(JardimMapper.jardimParaDto(jardim));
        }catch (Exception e){
            return ResponseEntity.notFound().build();
        }
    }


}
