package com.company;

public class Conta {

    private double saldo = 0;
    private double creditoPreAprovado = 500;

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) throws Exception {

        if(valor > this.saldo && valor <= this.saldo + this.creditoPreAprovado) {
            throw new Exception("Saldo insuficiente, mas temos um emprestimo pré aprovado pra você: clique aqui para contratar");
        }

        if(valor > this.saldo) {
            throw new SaldoInsuficienteException();
        }

        this.saldo -= valor;
    }

    public void transferir(Conta destino, MetodoTransferencia metodoTransferencia, double valor) throws Exception {
        try {
            this.sacar(valor + metodoTransferencia.getTaxa());
            destino.depositar(valor);
        }catch(Exception e) {
            throw new Exception("Transferência não realizada por falta de saldo/limite");
        }


    }

    public double getSaldo() {
        return saldo;
    }

    public void calcularImposto(Tributavel tributavel) {
        // nao implementado ainda
    }
}
