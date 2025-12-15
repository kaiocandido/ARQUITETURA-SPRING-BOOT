package oi.githhub.kaiocandido.arquiteturaSpring.montadora;

import java.awt.*;

public class HondaHRV extends Carro{

    public HondaHRV() {
    }

    public HondaHRV(String modelo, Color cor, Motor motor, Montadora montadora) {
        super(modelo, cor, motor, montadora);
        setModelo("HRV");
        setCor(Color.black);
        setMontadora(montadora.HONDA);
    }

}
