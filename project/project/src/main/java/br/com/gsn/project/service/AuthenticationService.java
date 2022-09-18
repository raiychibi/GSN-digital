//package br.com.gsn.project.service;
//
//import br.com.gsn.project.repository.UsuarioRepository;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//
//public class AuthenticationService implements UserDetailsService {
//
//    private final UsuarioRepository repository;
//
//    public AuthenticationService(UsuarioRepository repository) {
//        this.repository = repository;
//    }
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        return repository.findByEmail(username).orElseThrow(()->new UsernameNotFoundException("User Not Found"));
//    }
//}


