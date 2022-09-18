package br.com.gsn.project.service;

import br.com.gsn.project.entity.Usuario;
import br.com.gsn.project.repository.UsuarioRepository;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    private final UsuarioRepository repository;
//    private final PasswordEncoder passwordEncoder;

    public UsuarioService(UsuarioRepository repository) { this.repository = repository;
//        this.passwordEncoder = passwordEncoder;
    }

    public Usuario cadastrar(Usuario usuario){
//        usuario.setPassword(passwordEncoder.encode(usuario.getPassword()));
        return repository.save(usuario);
    }

}
