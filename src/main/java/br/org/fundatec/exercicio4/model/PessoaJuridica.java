package br.org.fundatec.exercicio4.model;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name = "tb_pessoaJuridica")
public class PessoaJuridica extends Pessoa {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 100, nullable = false)
    private String cnpj;
    private String razaoSocial;
    private LocalDate dataCriacao;

    public PessoaJuridica() {

    }


    public PessoaJuridica(Long id, String nome, LocalDate dataNascimento, Endereco endereco, Long id1, String cnpj, String razaoSocial, LocalDate dataCriacao) {
        super(id, nome, dataNascimento, endereco);
        this.id = id1;
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.dataCriacao = dataCriacao;
    }

    public Long getId() {

        return id;
    }


    public void setId(Long id) {

        this.id = id;
    }

    public String getCnpj() {

        return cnpj;
    }

    public void setCnpj(String cnpj) {

        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {

        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {

        this.razaoSocial = razaoSocial;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof PessoaJuridica)) return false;
        if (!super.equals(object)) return false;
        PessoaJuridica that = (PessoaJuridica) object;
        return id.equals(that.id);
    }

    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), id);
    }
}
