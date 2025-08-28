package school.sptech.controllers.cliente.dtos;

import school.sptech.useCases.Cliente;

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

    public static RespostaCliente toResponseDto(Cliente entity) {
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
        // response.setRisco(entity.getRisco);

        return response;
    }

}
