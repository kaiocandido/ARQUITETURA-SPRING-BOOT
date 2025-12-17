package oi.githhub.kaiocandido.arquiteturaSpring.todo;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TodoService {

    private TodoRepository repository;

    public TodoService(TodoRepository todoRepository){
        this.repository = todoRepository;
    }

    public TodoEntity salvar(TodoEntity todo){
        return repository.save(todo);
    }

    public void atualizarStatus(TodoEntity todo){
        repository.save(todo);
    }

    public Optional<TodoEntity> buscarId(Integer id){
        return repository.findById(id);
    }
}
