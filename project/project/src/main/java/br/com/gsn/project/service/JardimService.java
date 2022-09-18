package br.com.gsn.project.service;

import br.com.gsn.project.entity.Jardim;
import br.com.gsn.project.repository.JardimRepository;
import org.apache.tomcat.Jar;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class JardimService {

    private final JardimRepository repository;

    public JardimService(JardimRepository repository) {this.repository = repository;}

    public Jardim cadastrar(Jardim jardim) { return repository.save(jardim);}


    public void deletar(Long id) {
        Jardim jardim = repository.findById(id).orElseThrow(()->new EntityNotFoundException("id não encontrado"));
        repository.delete(jardim);
    }


    public Jardim encontrar(Long id) {
        return repository.findById(id).orElseThrow(()->new EntityNotFoundException("id não encontrado"));

    }

    public List<Jardim> encontrarTodos() {
        return repository.findAll();

    }

    public Jardim atualizar(Long id, Jardim jardimAtualizado){
       Jardim jardim = this.encontrar(id);
       jardimAtualizado.setId(jardim.getId());
       return repository.save(jardimAtualizado);
    }


}


