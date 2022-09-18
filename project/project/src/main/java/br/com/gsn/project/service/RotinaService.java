package br.com.gsn.project.service;

import br.com.gsn.project.entity.Rotina;
import br.com.gsn.project.repository.RotinaRepository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
public class RotinaService {

    private final RotinaRepository repository;

    public RotinaService(RotinaRepository repository) {this.repository = repository;}

    public Rotina cadastrar(Rotina rotina) { return repository.save(rotina); }

    public void deletar(Long id){
        Rotina rotina = repository.findById(id).orElseThrow(()->new EntityNotFoundException("id não encontrado"));
        repository.delete(rotina);
    }


}
