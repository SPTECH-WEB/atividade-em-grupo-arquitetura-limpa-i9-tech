[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/agYdFiud)

![Java](https://img.shields.io/badge/Java-17-red)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.2-green)
![Maven](https://img.shields.io/badge/Maven-3.9-blue)
![License](https://img.shields.io/badge/license-MIT-lightgrey)

# 📊 API de Avaliação de Risco de Crédito

Este projeto é uma prova de conceito para uma API REST que permite o cadastro de clientes e a avaliação automática de risco de crédito, baseada em critérios simples como renda e idade.

A solução foi pensada para ser **modular, extensível e preparada para integração futura** com serviços externos como bureaus de crédito ou sistemas CRM.

---
<!-- TOC -->

## 📌 Índice
* [👥 Integrantes](#-integrantes)
* [🛠️ Divisão de Tarefas](#-divisão-de-tarefas)
* [🧠 Contexto](#-contexto)
* [🚀 Funcionalidades](#-funcionalidades)
* [⚙️ Como Executar o Projeto](#-como-executar-o-projeto)
* [🧾 Modelo de Dados](#-modelo-de-dados)
* [📊 Regras de Classificação de Risco](#-regras-de-classificação-de-risco)
* [🏗 Estrutura Recomendada](#-estrutura-recomendada)

<!-- TOC -->

---

## 👥 Integrantes

| Nome             | RA       |
|------------------|----------|
| Guilherme Borin  | 01232168 |
| Isabela Rosa     | 01232152 |
| Maykon Nogueira  | 01241215 |
| Walleska Lima    | 01241124 |
| Yasmim Conceição | 01241046 |

---

## 🛠️ Divisão de Tarefas

| Integrante       | Tarefa                 |
|------------------|------------------------|
| Guilherme Borin  | ReadMe                 |
| Isabela Rosa     | Principais Classes     |
| Maykon Nogueira  | EndPoints e Controller |
| Walleska Lima    | Enum                   |
| Yasmim Conceição | DTO´s                  |

---

## 🧠 Contexto

Uma fintech está desenvolvendo um sistema para facilitar a **análise de crédito de novos clientes**. O objetivo desta API é permitir:

- Cadastro de clientes com dados pessoais e financeiros
- Aplicação de uma regra automática de avaliação de risco
- Retorno da classificação com sugestão de estratégia de contato
- Persistência dos dados em memória (com abstração para trocar por banco real ou microserviço externo futuramente)

---

## 🚀 Funcionalidades

- `POST /clientes`  
  Cadastra um cliente e aplica automaticamente a classificação de risco

- `GET /clientes/{id}`  
  Retorna os dados do cliente e sua classificação de risco

---

## ⚙️ Como Executar o Projeto

### ✅ Pré-requisitos
Antes de começar, certifique-se de ter instalado:
- [Java 17+](https://adoptium.net/)
- [Maven 3.9+](https://maven.apache.org/)
- Um editor/IDE de sua preferência (recomendado: [IntelliJ IDEA](https://www.jetbrains.com/idea/) ou [VS Code](https://code.visualstudio.com/))

---

### ▶️ Passo a passo
1. **Clonar o repositório**
   ```bash
   git clone https://github.com/SPTECH-WEB/atividade-em-grupo-arquitetura-limpa-i9-tech
   cd atividade-em-grupo-arquitetura-limpa-i9-tech 

2. **(Opcional) Acessar a branch correta**
   ```bash
   git checkout nome-da-branch

3. **Compilar o Projeto**
   ```bash
   mvn clean install 
 
4. **Rodar a aplicação**
   ```bash
   mvn spring-boot:run
   
5. **Acessar a API**
   ```bash
   http://localhost:8080
   
---

### 📖 Exemplos de uso

- Cadastrar cliente (POST):
   ```bash
  POST http://localhost:8080/clientes
  
- Exemplo de JSON:
   ```json
  {
    "nome": "João Silva",
    "email": "joao@email.com",
    "telefone": "11999999999",
    "cpf": "123.456.789-00",
    "rendaMensal": 4500.00,
    "idade": 28,
    "profissao": "Engenheiro"
  }

- Consultar cliente (GET):
   ```bash
  GET http://localhost:8080/clientes/{id}

- Exemplo de JSON retornado
   ```json
  {
    "id": "e7b8f3c0-1234-4567-89ab-1234567890ab",
    "nome": "João Silva",
    "email": "joao@email.com",
    "telefone": "11999999999",
    "cpf": "123.456.789-00",
    "rendaMensal": 4500.0,
    "idade": 28,
    "profissao": "Engenheiro",
    "risco": "Médio",
    "estrategiaContato": "Análise manual em até 48h"
  }

---

## 🧾 Modelo de Dados

### Cliente
| Campo         | Tipo      | Validação                            |
|---------------|-----------|--------------------------------------|
| `id`          | UUID/int  | Gerado automaticamente               |
| `nome`        | string    | Obrigatório                          |
| `email`       | string    | Deve conter `@`                      |
| `telefone`    | string    | Deve conter ao menos 10 dígitos      |
| `cpf`         | string    | Formato: `XXX.XXX.XXX-XX`            |
| `rendaMensal` | float     | Obrigatório                          |
| `idade`       | int       | Obrigatório                          |
| `profissao`   | string    | Opcional                             |

---

## 📊 Regras de Classificação de Risco

| Risco   | Critérios                                 | Prioridade | Estratégia de Contato                          |
|---------|--------------------------------------------|------------|------------------------------------------------|
| Baixo   | Renda > 6000 **e** idade > 30              | 3          | Contato automático por e-mail                  |
| Médio   | Renda entre 3000 e 6000 **ou** idade ≤ 30  | 2          | Análise manual em até 48h                      |
| Alto    | Renda < 3000                               | 1          | Contato telefônico em até 24h + análise crítica|

---

## 🏗 Estrutura Recomendada

     +---------------------------+
     |       Controllers        |  --> Camada de Entrada (HTTP)
     +---------------------------+
                 ↓
     +---------------------------+
     |       Use Cases          |  --> Lógica de Negócio
     +---------------------------+
                 ↓
     +---------------------------+
     |       Entities           |  --> Entidades do Domínio
     +---------------------------+
                 ↑
     +---------------------------+
     |     Interfaces/Ports     |  --> Interfaces de Entrada/Saída
     +---------------------------+
                 ↓
     +---------------------------+
     |     Adapters (Infra)     |  --> Implementações: DB, APIs etc.
     +---------------------------+
