package school.sptech.controllers.cliente.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;

public class AtualizarCliente {
    @NotBlank
    private Email email;

    @NotBlank
    private Telefone telefone;

    @PositiveOrZero
    private float rendaMensal;

    @PositiveOrZero
    private int idade;

    private String profissao;

    public AtualizarCliente(Email email, Telefone telefone, float rendaMensal, int idade, String profissao) {
        this.email = email;
        this.telefone = telefone;
        this.rendaMensal = rendaMensal;
        this.idade = idade;
        this.profissao = profissao;
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
