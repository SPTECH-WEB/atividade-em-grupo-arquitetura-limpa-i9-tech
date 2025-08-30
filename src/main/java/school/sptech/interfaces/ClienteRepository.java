package school.sptech.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import school.sptech.entities.Cliente;
import school.sptech.entities.Cpf;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

    boolean existsByCpf(Cpf cpf);
}
