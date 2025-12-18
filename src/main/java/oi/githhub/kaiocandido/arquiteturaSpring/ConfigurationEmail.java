package oi.githhub.kaiocandido.arquiteturaSpring;

import oi.githhub.kaiocandido.arquiteturaSpring.todo.MailSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

public class ConfigurationEmail {

    @Autowired
    private AppProperties properties;

    @Bean
    public MailSender mailSender(){
        return null;
    }
}
