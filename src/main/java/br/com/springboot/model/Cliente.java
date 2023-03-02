package br.com.springboot.model;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

/*
Foram criados os dados(variáveis) da classe que serão persistidos no BD
Foram criados o métodos de definição e acesso(Getters and Setters)
Foi inserido os pacotes JPA(Hibernate) e MySQL Conector
Foi feito o mapeamento objeto relacional
Foi Feito uma interfae CRUD
Foi Criado uma ClienteDAO que segue a interface CRUD(Que é responsável por persistir os dados da entidade Cliente)
*/
@Entity
@Table(name="clientes")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 50)
    private String nome;
    @Column(length = 11)
    private String cpf;
    @Column(name = "data_nascimento",columnDefinition = "DATE")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate dataDeNascimento;
    @Enumerated(EnumType.STRING)
    private Sexo sexo;
    @Column(length = 10)
    private String telefone;
    @Column(length = 11)
    private String celular;
    @Column(length = 50)
    private String email;
    private String ativo;

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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAtivo() {
        return ativo;
    }

    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }
}
