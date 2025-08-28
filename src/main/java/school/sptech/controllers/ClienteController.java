package school.sptech.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import school.sptech.controllers.dtos.CadastroCliente;
import school.sptech.controllers.dtos.RespostaCliente;
import school.sptech.useCases.ClienteService;
import school.sptech.entities.Cliente;
import school.sptech.entities.ClassificacaoRisco;

@Controller
@RequestMapping("/clientes")
public class ClienteController {

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    private final ClienteService clienteService;

    @PostMapping
    public ResponseEntity<RespostaCliente> cadastrarCliente(@RequestBody CadastroCliente request) {
        return ResponseEntity.ok(MapperCliente.toResponseDto
                (clienteService.cadastrarCliente
                        (MapperCliente.toEntity(request)),
                        ClassificacaoRisco.avaliarClassificacao(
                                        request.getRendaMensal(),
                                            request.getIdade())));
    }

    @GetMapping("/{id}")
    public ResponseEntity<RespostaCliente> buscarCliente(@PathVariable int id) {
        Cliente cliente = clienteService.buscarClientePorId(id);
        return ResponseEntity.ok(
                MapperCliente.toResponseDto
                        (cliente,
                                ClassificacaoRisco.avaliarClassificacao
                                        (cliente.getRendaMensal(), cliente.getIdade())));
    }
}
