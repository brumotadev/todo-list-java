package br.com.brumota.gerenciamento_tarefas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.brumota.gerenciamento_tarefas.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

    
}
