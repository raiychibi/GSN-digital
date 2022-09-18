package br.com.gsn.project.entity;

import javax.persistence.*;
import java.util.List;

@Table(name = "TB_JARDIM")
@SequenceGenerator(name = "SQ_JARDIM", sequenceName = "SQ_JARDIM", initialValue = 1)
@Entity
public class Jardim {

    @Id
    @Column(name = "cd_jardim")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_JARDIM")
    private Long id;

    @Column(name = "nm_jardim")
    private String name;
    @Column(name = "nr_planta")
    private int number;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cd_usuario")
    private Usuario usuario;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "TB_PLANTA_JARDIM", joinColumns = @JoinColumn(name = "cd_jardim"), inverseJoinColumns = @JoinColumn(name = "cd_planta"))
    private List<Planta> plantas;

    public Jardim() {
    }

    public Jardim(Long id, String name, int number, Usuario usuario, List<Planta> plantas) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.usuario = usuario;
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

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Planta> getPlantas() {
        return plantas;
    }

    public void setPlantas(List<Planta> plantas) {
        this.plantas = plantas;
    }
}
