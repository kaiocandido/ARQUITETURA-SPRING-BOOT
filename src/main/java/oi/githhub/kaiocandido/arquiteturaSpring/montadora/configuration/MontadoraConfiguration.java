package oi.githhub.kaiocandido.arquiteturaSpring.montadora.configuration;

import oi.githhub.kaiocandido.arquiteturaSpring.montadora.Motor;
import oi.githhub.kaiocandido.arquiteturaSpring.montadora.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MontadoraConfiguration {

    @Bean
    public Motor motor(){
        var motor = new Motor();
        motor.setCavalos(120);
        motor.setCilindros(4);
        motor.setModelo("XPTO-0");
        motor.setCilindros(2);
        motor.setTipo(TipoMotor.ASPIRADO);
        return motor;
    }


}
