package one.digitalinnovation.Desafio_6.repositories;

import one.digitalinnovation.Desafio_6.model.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}
