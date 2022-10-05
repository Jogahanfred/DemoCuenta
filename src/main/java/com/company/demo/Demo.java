package com.company.demo;

import com.company.exception.CantidadNegativaError;
import com.company.exception.MontoExcedidoError;
import com.company.model.Cuenta;

public class Demo {

    public static void main(String[] args) {
        System.out.println("==========  APP DE CUENTA ==========");
        Cuenta c1 = new Cuenta("Andersson");
        System.out.println(c1.toString());
        Cuenta c2 = new Cuenta("Gabriela", 1300);
        try {
            c2.imprimirSaldo();
            c2.retirarSaldo(1000);
            c2.depositoSaldo(29);
            c2.retirarSaldo(330);
        } catch (MontoExcedidoError | CantidadNegativaError error) {
            System.out.println(error.getMessage());
        }

    }
}
