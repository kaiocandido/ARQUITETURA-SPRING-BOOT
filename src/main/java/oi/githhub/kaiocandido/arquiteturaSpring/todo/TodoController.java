package oi.githhub.kaiocandido.arquiteturaSpring.todo;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.io.IOException;
import java.util.Optional;

@RestController
@RequestMapping("todos")
public class TodoController {

    private TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @PostMapping
    public TodoEntity salvar(@RequestBody TodoEntity todo){
        try {
            return this.todoService.salvar(todo);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }

    }

    @PutMapping("{id}")
    public void atualizarStatus(@PathVariable("id") Integer id, @RequestBody TodoEntity  todo){
        todo.setId(id);
        todoService.atualizarStatus(todo);
    }

    @GetMapping("{id}")
    public Optional<TodoEntity> returnDadosTodo(@PathVariable("id") Integer id){
        return todoService.buscarId(id);
    }
}
