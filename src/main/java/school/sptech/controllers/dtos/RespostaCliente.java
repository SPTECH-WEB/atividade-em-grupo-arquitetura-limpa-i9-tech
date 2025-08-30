package school.sptech.controllers.dtos;

import school.sptech.entities.Cpf;
import school.sptech.entities.Email;
import school.sptech.entities.Telefone;
import school.sptech.entities.ClassificacaoRisco;

public class RespostaCliente {

    private int id;
    private String nome;
    private Email email;
    private Telefone telefone;
    private Cpf cpf;
    private float rendaMensal;
    private int idade;
    private String profissao;
    private ClassificacaoRisco risco;

    public RespostaCliente(int id, String nome, Email email, Telefone telefone, Cpf cpf, float rendaMensal, int idade, String profissao, ClassificacaoRisco risco) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.cpf = cpf;
        this.rendaMensal = rendaMensal;
        this.idade = idade;
        this.profissao = profissao;
        this.risco = risco;
    }

    public RespostaCliente() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
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

    public float getRendaMensal() {
        return rendaMensal;
    }

    public void setRendaMensal(float rendaMensal) {
        this.rendaMensal = rendaMensal;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public ClassificacaoRisco getRisco() {
        return risco;
    }

    public void setRisco(ClassificacaoRisco risco) {
        this.risco = risco;
    }
}
