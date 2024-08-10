package br.com.brumota.gerenciamento_tarefas.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.brumota.gerenciamento_tarefas.entity.Todo;

@RestController
@RequestMapping("/todos")
public class TodoController {

    List<Todo> create(Todo todo) {

    }

    
}
