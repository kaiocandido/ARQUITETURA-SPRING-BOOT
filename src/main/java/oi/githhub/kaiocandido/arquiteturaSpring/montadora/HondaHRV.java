package oi.githhub.kaiocandido.arquiteturaSpring.montadora;

import java.awt.*;

public class HondaHRV extends Carro{

    public HondaHRV(Motor motor) {
        super(motor);
        setModelo("HRV");
        setCor(Color.black);
        setMontadora(Montadora.HONDA);
    }

}
