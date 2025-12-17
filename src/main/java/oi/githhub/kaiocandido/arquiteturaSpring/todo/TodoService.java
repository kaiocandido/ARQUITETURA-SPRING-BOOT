package oi.githhub.kaiocandido.arquiteturaSpring.todo;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TodoService {

    private TodoRepository repository;
    private TodoValidator todoValidator;
    private MailSender mailSender;

    public TodoService(TodoRepository repository, TodoValidator todoValidator, MailSender mailSender) {
        this.repository = repository;
        this.todoValidator = todoValidator;
        this.mailSender = mailSender;
    }

    public TodoEntity salvar(TodoEntity todo){
        todoValidator.validar(todo);
        return repository.save(todo);
    }

    public void atualizarStatus(TodoEntity todo){
        repository.save(todo);
        String status = String.valueOf(todo.getConcluido() == Boolean.TRUE ? "Concluido" : "Não Concluido");
        mailSender.enviar("Todo de codigo " + todo.getDescricao() + "foi atualizado para: " + status);
    }

    public Optional<TodoEntity> buscarId(Integer id){
        return repository.findById(id);
    }
}
