package com.company;

public class ContaCorrente extends Conta implements Tributavel {

    @Override
    public double getImposto() {
        return 0;
    }
}
