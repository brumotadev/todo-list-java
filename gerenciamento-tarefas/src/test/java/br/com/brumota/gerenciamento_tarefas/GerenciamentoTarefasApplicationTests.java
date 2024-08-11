package br.com.brumota.gerenciamento_tarefas;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

import br.com.brumota.gerenciamento_tarefas.entity.Todo;

@SpringBootTest
class GerenciamentoTarefasApplicationTests {
	@Autowired
	private WebTestClient webTestClient;

	@Test
	void testeCreateTodoSuccess() {
		var todo = new Todo("todo1", "desc todo 1", false, 1);
	}

	@Test
	void testCreateTodoFailure() {

	}

}
