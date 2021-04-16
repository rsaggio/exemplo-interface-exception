package com.company;

public class Ted implements MetodoTransferencia, Tributavel {
    @Override
    public double getTaxa() {
        return 10;
    }

    @Override
    public double getImposto() {
        return 10;
    }
}
