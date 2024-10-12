package one.digitalinnovation.Desafio_6.repositories;

import one.digitalinnovation.Desafio_6.model.Endereco;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String> {

}
