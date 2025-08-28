package school.sptech.useCases;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import school.sptech.interfaces.ClienteRepository;
import school.sptech.entities.Cliente;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }


    public Cliente cadastrarCliente(Cliente cliente) {
        if (clienteRepository.existsByCpf(cliente.getCpf())) {
            throw new ResponseStatusException(
                    HttpStatus.CONFLICT, "Cliente já cadastrado!"
            );
        }
        return clienteRepository.save(cliente);
    }

    public Cliente buscarClientePorId (Integer id) {
        return clienteRepository.findById(id)
                .orElseThrow(() ->
                        new ResponseStatusException
                                (HttpStatus.NOT_FOUND, "Cliente não encontrado"));
    }
}
