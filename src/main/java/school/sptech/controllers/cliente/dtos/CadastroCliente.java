package school.sptech.controllers.cliente.dtos;

import jakarta.validation.constraints.*;
import school.sptech.useCases.Email;
import school.sptech.useCases.Cpf;
import school.sptech.useCases.Telefone;

public class CadastroCliente {

    @NotBlank
    private String nome;

    @NotBlank
    private Email email;

    @NotBlank
    private Telefone telefone;

    @NotBlank
    private Cpf cpf;

    @PositiveOrZero
    private float rendaMensal;

    @PositiveOrZero
    private int idade;

    private String profissao;


    public CadastroCliente(String nome, Email email, Telefone telefone, Cpf cpf, float rendaMensal, int idade, String profissao) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.cpf = cpf;
        this.rendaMensal = rendaMensal;
        this.idade = idade;
        this.profissao = profissao;
    }

    public @NotBlank String getNome() {
        return nome;
    }

    public void setNome(@NotBlank String nome) {
        this.nome = nome;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public Cpf getCpf() {
        return cpf;
    }

    public void setCpf(Cpf cpf) {
        this.cpf = cpf;
    }

    @PositiveOrZero
    public float getRendaMensal() {
        return rendaMensal;
    }

    public void setRendaMensal(@PositiveOrZero float rendaMensal) {
        this.rendaMensal = rendaMensal;
    }

    @PositiveOrZero
    public int getIdade() {
        return idade;
    }

    public void setIdade(@PositiveOrZero int idade) {
        this.idade = idade;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
}
