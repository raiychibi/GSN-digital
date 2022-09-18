package br.com.gsn.project.repository;

import br.com.gsn.project.entity.Jardim;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JardimRepository extends JpaRepository<Jardim, Long> {
}
