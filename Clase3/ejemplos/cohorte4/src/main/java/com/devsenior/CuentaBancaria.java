package com.devsenior;

public class CuentaBancaria {
    private double saldo; //100

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void Retirar(double monto) throws SaldoInsuficienteException{ //monto = 200
        if(monto > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para retirar " + monto);
        }
        saldo -= monto;
        System.out.println("Retiro exitoso. Saldo actual: " + saldo);
    }

}
