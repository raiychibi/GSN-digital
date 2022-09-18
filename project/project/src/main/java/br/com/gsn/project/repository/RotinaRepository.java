package br.com.gsn.project.repository;


import br.com.gsn.project.entity.Rotina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RotinaRepository extends JpaRepository<Rotina, Long> {
}
