package br.org.fundatec.exercicio4.model;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name = "tb_pessoaFisica")
public class PessoaFisica extends Pessoa {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 100, nullable = false)
    private String cpf;
    @Column
    private String nome;

    public PessoaFisica() {

    }

    public PessoaFisica(Long id, String nome, LocalDate dataNascimento, Endereco endereco, long id1, String cpf, String nome1) {
        super(id, nome, dataNascimento, endereco);
        this.id = id1;
        this.cpf = cpf;
        this.nome = nome1;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PessoaFisica)) return false;
        if (!super.equals(o)) return false;
        PessoaFisica that = (PessoaFisica) o;
        return id == that.id;
    }

    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), id);
    }
}




