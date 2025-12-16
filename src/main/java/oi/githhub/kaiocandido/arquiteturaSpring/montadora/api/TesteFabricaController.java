package oi.githhub.kaiocandido.arquiteturaSpring.montadora.api;

import oi.githhub.kaiocandido.arquiteturaSpring.montadora.Carro;
import oi.githhub.kaiocandido.arquiteturaSpring.montadora.CarroStatus;
import oi.githhub.kaiocandido.arquiteturaSpring.montadora.Chave;
import oi.githhub.kaiocandido.arquiteturaSpring.montadora.HondaHRV;
import oi.githhub.kaiocandido.arquiteturaSpring.montadora.Motor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteFabricaController {

    @Autowired
    private Motor motor;

    @PostMapping
    public CarroStatus startCarro(@RequestBody Chave chave){
        var carro = new HondaHRV(motor);
        return carro.darIgnicao(chave);
    }
}
