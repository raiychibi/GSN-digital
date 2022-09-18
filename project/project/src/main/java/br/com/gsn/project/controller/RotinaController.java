package br.com.gsn.project.controller;

import br.com.gsn.project.dto.RotinaDto;
import br.com.gsn.project.mapper.RotinaMapper;
import br.com.gsn.project.service.RotinaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/rotina")
public class RotinaController {

    private final RotinaService rotinaService;

    public RotinaController(RotinaService rotinaService) {this.rotinaService = rotinaService;}
    @PostMapping
    public ResponseEntity<RotinaDto> cadastrarRotina(@RequestBody RotinaDto response){
        try{
           rotinaService.cadastrar(RotinaMapper.dtoParaRotina(response));
           return new ResponseEntity<RotinaDto>(response, HttpStatus.CREATED);
        }catch (Exception e){
            System.out.println(e.getMessage());
            return ResponseEntity.internalServerError().build();
        }
    }

}
