package br.org.fundatec.exercicio4.model;


import javax.persistence.*;


@Entity
@Table(name = "tb_endereco")
public class Endereco {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Enumerated(EnumType.STRING)
    private TipoLogradouro tipoLogradouro;


    @Column(length = 100, nullable = false)
    private String nomeLogradouro;
    private Integer numero;
    private String complemento;
    private String cep;
    private String cidade;
    @Enumerated(EnumType.STRING)
    private UnidadeFederativa uf;

    public Endereco() {

    }

    public Endereco(Long id, TipoLogradouro tipoLogradouro, String nomeLogradouro, Integer numero, String complemento, String cep, String cidade, UnidadeFederativa uf) {
        this.id = id;
        this.tipoLogradouro = tipoLogradouro;
        this.nomeLogradouro = nomeLogradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.cidade = cidade;
        this.uf = uf;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TipoLogradouro getTipoLogradouro() {
        return tipoLogradouro;
    }

    public void setTipoLogradouro(TipoLogradouro tipoLogradouro) {
        this.tipoLogradouro = tipoLogradouro;
    }

    public String getNomeLogradouro() {
        return nomeLogradouro;
    }

    public void setNomeLogradouro(String nomeLogradouro) {
        this.nomeLogradouro = nomeLogradouro;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public UnidadeFederativa getUf() {
        return uf;
    }

    public void setUf(UnidadeFederativa uf) {
        this.uf = uf;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Endereco)) return false;
        if (!super.equals(object)) return false;
        Endereco endereco = (Endereco) object;
        return id.equals(endereco.id);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), id);
    }
}
