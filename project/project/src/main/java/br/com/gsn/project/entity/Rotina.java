package br.com.gsn.project.entity;

import javax.persistence.*;
import java.util.List;

@Table(name = "TB_ROTINA")
@SequenceGenerator(name = "SQ_ROTINA", sequenceName = "SQ_ROTINA", initialValue = 1)
@Entity
public class Rotina {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_ROTINA")
    @Column(name = "cd_rotina")
    private Long id;
    @Column(name = "nm_rotina")
    private String name;
    @Column(name = "nr_tarefa")
    private int tarefa;

    @Column(name = "ds_tarefa")
    private String descricaoTarefa;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "TB_PLANTA_ROTINA", joinColumns = @JoinColumn(name = "cd_rotina", referencedColumnName = "cd_rotina"), inverseJoinColumns = @JoinColumn(name = "cd_planta", referencedColumnName = "cd_planta"))
    private List<Planta> plantas;

    public Rotina() {
    }

    public Rotina(Long id, String name, int tarefa, String descricaoTarefa, List<Planta> plantas) {
        this.id = id;
        this.name = name;
        this.tarefa = tarefa;
        this.descricaoTarefa = descricaoTarefa;
        this.plantas = plantas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTarefa() {
        return tarefa;
    }

    public void setTarefa(int tarefa) {
        this.tarefa = tarefa;
    }

    public String getDescricaoTarefa() {
        return descricaoTarefa;
    }

    public void setDescricaoTarefa(String descricaoTarefa) {
        this.descricaoTarefa = descricaoTarefa;
    }

    public List<Planta> getPlantas() {
        return plantas;
    }

    public void setPlantas(List<Planta> plantas) {
        this.plantas = plantas;
    }
}
