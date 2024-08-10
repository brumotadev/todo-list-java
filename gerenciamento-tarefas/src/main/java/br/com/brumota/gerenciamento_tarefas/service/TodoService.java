package br.com.brumota.gerenciamento_tarefas.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.brumota.gerenciamento_tarefas.entity.Todo;
import br.com.brumota.gerenciamento_tarefas.repository.TodoRepository;

// a anotação @service serve para ser um service no spring e passivel de injeção
@Service
public class TodoService {

    private TodoRepository todoRepository;


    // existem 3 formas de fazer injeção de dependencias no spring.
    /*
     * Via Atributo com @Autowired
     * Via metodo
     * Via construtor
     */

     // nessa forma de injeção por construtor, não é necessario o @Autowired. Pois esta implicito pelo framework spring
    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> create(Todo todo) {
        todoRepository.save(todo);
        return list();
    }

    public List<Todo> list() {
        Sort sort = Sort.by("prioridade").descending().and(Sort.by("nome").ascending());
        return todoRepository.findAll(sort); // retorna tudo
    }

    public List<Todo> update(Todo todo) {
        todoRepository.save(todo);
        return list();
    }

    public List<Todo> delete(Long id) {
        todoRepository.deleteById(id);;
        return list();
    }
}
