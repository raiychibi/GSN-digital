package br.com.gsn.project.entity;


import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;


@Table(name = "TB_PLANTA")
@SequenceGenerator(name = "SQ_PLANTA", sequenceName = "SQ_PLANTA", initialValue = 1)
@Entity
public class Planta {

    @Id
    @Column(name = "cd_planta")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_PLANTA")
    private Long id;
    @Column(name = "nm_planta")
    private String name;

    @Column(name = "qt_irrigacao")
    private float irrigacao;
    @Column(name = "dt_iluminacao1")
    private LocalDateTime iluminacao1;
    @Column(name="dt_iluminacao2")
    private LocalDateTime iluminacao2;

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "plantas")
    private List<Rotina> rotinas;

    @ManyToMany(cascade = CascadeType.ALL,  mappedBy = "plantas")
    private List<Jardim> jardins;

    public Planta() {
    }

    public Planta(Long id, String name, float irrigacao, LocalDateTime iluminacao1, LocalDateTime iluminacao2, List<Rotina> rotinas, List<Jardim> jardins) {
        this.id = id;
        this.name = name;
        this.irrigacao = irrigacao;
        this.iluminacao1 = iluminacao1;
        this.iluminacao2 = iluminacao2;
        this.rotinas = rotinas;
        this.jardins = jardins;
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

    public float getIrrigacao() {
        return irrigacao;
    }

    public void setIrrigacao(float irrigacao) {
        this.irrigacao = irrigacao;
    }

    public LocalDateTime getIluminacao1() {
        return iluminacao1;
    }

    public void setIluminacao1(LocalDateTime iluminacao1) {
        this.iluminacao1 = iluminacao1;
    }

    public LocalDateTime getIluminacao2() {
        return iluminacao2;
    }

    public void setIluminacao2(LocalDateTime iluminacao2) {this.iluminacao2 = iluminacao2;}

    public List<Rotina> getRotinas() {
        return rotinas;
    }

    public void setRotinas(List<Rotina> rotinas) {
        this.rotinas = rotinas;
    }

    public List<Jardim> getJardins() {
        return jardins;
    }

    public void setJardins(List<Jardim> jardins) {
        this.jardins = jardins;
    }
}