package com.company.interfaces;

public interface IOperaciones {

    public static final String RETIRO = "RETIRO DE CUENTA";
    public static final String DEPOSITO = "DEPOSITO EN CUENTA";
    public static final String SALDO_INSUFICIENTE = "SALDO INSUFICIENTE EN CUENTA";

    public void retirarSaldo(double monto);

    public void depositoSaldo(double monto);

    public void imprimirSaldo();
}
