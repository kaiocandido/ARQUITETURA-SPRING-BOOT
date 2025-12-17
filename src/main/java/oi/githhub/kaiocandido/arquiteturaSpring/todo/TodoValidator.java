package oi.githhub.kaiocandido.arquiteturaSpring.todo;

import org.springframework.stereotype.Component;

@Component
public class TodoValidator {

    private TodoRepository repository;

    public TodoValidator(TodoRepository repository) {
        this.repository = repository;
    }

    public void validar(TodoEntity todo){
        if (existeTodoDescricao(todo.getDescricao().toString())){
            throw new IllegalArgumentException("Já existe um todo com essa descrição!");
        }
    }

    private boolean existeTodoDescricao(String todo){
        return repository.existsByDescricao(todo);
    }
}
