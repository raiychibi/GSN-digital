package br.com.gsn.project.service;

import br.com.gsn.project.entity.Planta;
import br.com.gsn.project.repository.PlantaRepository;
import org.springframework.stereotype.Service;

@Service
public class PlantaService {

    private final PlantaRepository repository;

    public PlantaService(PlantaRepository repository) {this.repository = repository;}


    public Planta cadastrar(Planta planta){
        return repository.save(planta);
    }

}
