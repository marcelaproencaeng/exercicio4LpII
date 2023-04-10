package br.org.fundatec.exercicio4.model;


import javax.persistence.*;

import java.time.temporal.ChronoUnit;


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@Entity
@Table(name = "tb_pessoa")
@Inheritance(strategy = InheritanceType.JOINED)
public class Pessoa {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 100, nullable = false)
    private String nome;
    private LocalDate dataNascimento;
    @OneToOne
    @JoinColumn(name = "id_endereco")
    private Endereco endereco;

    public Pessoa() {

    }

    public Pessoa(Long id, String nome, LocalDate dataNascimento, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public long getIdade(LocalDate dataNascimento) {
        if (this.dataNascimento == null) {
            return 0;
        }
        LocalDate now = LocalDate.now();
        long idade = ChronoUnit.YEARS.between(this.dataNascimento, now);
        return idade;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Pessoa)) return false;
        if (!super.equals(object)) return false;
        Pessoa pessoa = (Pessoa) object;
        return id.equals(pessoa.id);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), id);
    }
}

