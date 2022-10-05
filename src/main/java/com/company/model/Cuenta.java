package com.company.model;

import com.company.exception.CantidadNegativaError;
import com.company.exception.MontoExcedidoError;
import com.company.interfaces.IOperaciones;

public class Cuenta implements IOperaciones {

    private String titular;
    private double saldo;

    public Cuenta(String titular) {
        this.titular = titular;
    }

    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    @Override
    public void retirarSaldo(double monto) {
        if (monto > this.saldo) {
            throw new MontoExcedidoError("\n" + this.SALDO_INSUFICIENTE + "\n"
                    + "Ud. ha intentado retirar $/" + monto + ", y su saldo actual es de $/ " + this.saldo);
        } else {
            System.out.println("\n" + this.RETIRO);
            this.saldo -= monto;
            this.imprimirSaldo();
        }
    }

    @Override
    public void depositoSaldo(double monto) {
        if (monto < 0) {
            throw new CantidadNegativaError("Monto no puede ser negativo");
        } else {
            System.out.println("\n" + this.DEPOSITO);
            this.saldo += monto;
            this.imprimirSaldo();
        }
    }

    @Override
    public void imprimirSaldo() {
        System.out.println("Su saldo actual es: " + this.saldo);
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "CUENTA: \n" + "TITULAR = " + titular + "\nSALDO = " + saldo + "\n";
    }

}
