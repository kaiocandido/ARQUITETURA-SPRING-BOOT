package oi.githhub.kaiocandido.arquiteturaSpring;

import oi.githhub.kaiocandido.arquiteturaSpring.todo.TodoEntity;
import oi.githhub.kaiocandido.arquiteturaSpring.todo.TodoValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;


//@Lazy //default true
@Component
@Scope(BeanDefinition.SCOPE_SINGLETON) // Normalmente é o scope padrão dos bean
//@Scope(WebApplicationContext.SCOPE_REQUEST)
//@Scope(WebApplicationContext.SCOPE_APPLICATION)
//@Scope(WebApplicationContext.SCOPE_SESSION)
public class BeanGerenciado {

    //forma 1 de injeção
    @Autowired
    private TodoValidator validator;

    public void utilizar(){
        var todo = new TodoEntity();
        validator.validar(todo);
    }

    //forma 2 de injeção
    @Autowired
    public void setValidator(TodoValidator validator){
        this.validator = validator;
    }

    //forma 3 de injeção
    public BeanGerenciado(TodoValidator validator) {
        this.validator = validator;
    }
}
