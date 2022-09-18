package br.com.gsn.project.controller;

import br.com.gsn.project.dto.PlantaDto;
import br.com.gsn.project.mapper.PlantaMapper;
import br.com.gsn.project.service.PlantaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/planta")
public class PlantaController {

    private final PlantaService plantaService;

    public PlantaController(PlantaService plantaService) {
        this.plantaService = plantaService;
    }
    @PostMapping
    public ResponseEntity<PlantaDto> cadastrarPlanta(@RequestBody PlantaDto response) {
        try {
            plantaService.cadastrar(PlantaMapper.dtoParaPlanta(response));
            return new ResponseEntity<PlantaDto>(response, HttpStatus.CREATED);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }

    @DeleteMapping("{id}")
    public ResponseEntity<PlantaDto> deletarPlanta(@PathVariable(value = "id")Long id){
        try{
            plantaService.deletar(id);
            return ResponseEntity.noContent().build();
        }catch (Exception e){
            return ResponseEntity.notFound().build();
        }
    }
}