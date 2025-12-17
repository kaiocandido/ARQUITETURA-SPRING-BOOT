package oi.githhub.kaiocandido.arquiteturaSpring.todo;

import org.springframework.stereotype.Service;

@Service
public class TodoService {

    private TodoRepository repository;

    public TodoService(TodoRepository todoRepository){
        this.repository = todoRepository;
    }

    public TodoEntity salvar(TodoEntity todo){
        return repository.save(todo);
    }
}
