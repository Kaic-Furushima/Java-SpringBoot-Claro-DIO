package one.digitalinnovation.desafio7.repository;

import one.digitalinnovation.desafio7.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
