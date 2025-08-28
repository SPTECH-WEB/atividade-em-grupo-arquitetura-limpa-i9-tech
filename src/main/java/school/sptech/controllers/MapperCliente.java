package school.sptech.controllers;


import school.sptech.controllers.dtos.AtualizarCliente;
import school.sptech.controllers.dtos.CadastroCliente;
import school.sptech.controllers.dtos.RespostaCliente;
import school.sptech.entities.Cliente;
import school.sptech.entities.ClassificacaoRisco;

public class MapperCliente {

    public static Cliente toEntity(CadastroCliente dto) {
        if (dto == null) {
            return null;
        }
        Cliente entity = new Cliente();

        entity.setNome(dto.getNome());
        entity.setEmail(dto.getEmail());
        entity.setTelefone(dto.getTelefone());
        entity.setCpf(dto.getCpf());
        entity.setRendaMensal(dto.getRendaMensal());
        entity.setIdade(dto.getIdade());
        entity.setProfissao(dto.getProfissao());


        return entity;
    }

    public static Cliente toEntity(AtualizarCliente dto) {
        if (dto == null) {
            return null;
        }
        Cliente entity = new Cliente();

        entity.setEmail(dto.getEmail());
        entity.setTelefone(dto.getTelefone());
        entity.setRendaMensal(dto.getRendaMensal());
        entity.setIdade(dto.getIdade());
        entity.setProfissao(dto.getProfissao());

        return entity;
    }

    public static RespostaCliente toResponseDto(Cliente entity, ClassificacaoRisco risco) {
        if (entity == null) {
            return null;
        }
        RespostaCliente response = new RespostaCliente();

        response.setId(entity.getId());
        response.setNome(entity.getNome());
        response.setEmail(entity.getEmail());
        response.setTelefone(entity.getTelefone());
        response.setCpf(entity.getCpf());
        response.setRendaMensal(entity.getRendaMensal());
        response.setIdade(entity.getIdade());
        response.setProfissao(entity.getProfissao());
        response.setRisco(risco);

        return response;
    }

}
