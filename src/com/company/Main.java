package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Conta contaRenan = new Conta();
        Conta contaGustavo = new Conta();
        contaRenan.depositar(100.50);

        try {
            contaRenan.sacar(450);
            System.out.println("Saque realizado com sucesso.");
        }catch(SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
            System.out.println("Infelizmente não temos limite disponivel no momento");
        }catch(Exception outrosCasos) {
            System.out.println(outrosCasos.getMessage());
        }

        System.out.println("O seu saldo é:");
        System.out.println(contaRenan.getSaldo());

        try {
            contaRenan.transferir(contaGustavo, new Pix(), 20);
            contaRenan.transferir(contaGustavo, new Ted(), 20);
            contaRenan.transferir(contaGustavo, new Doc(), 20);
        }catch (Exception deuMerda) {
            System.out.println(deuMerda.getMessage());
        }

        // metodo de pagamento
        contaRenan.calcularImposto(new Ted());
        contaRenan.calcularImposto(new Pix());

        System.out.println("O seu saldo é:");
        System.out.println(contaRenan.getSaldo());

        // conta
        contaRenan.calcularImposto(new ContaCorrente());
        ContaCorrente cc = new ContaCorrente();

    }
}
