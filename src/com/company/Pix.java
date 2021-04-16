package com.company;

public class Pix implements MetodoTransferencia, Tributavel {
    @Override
    public double getTaxa() {
        return 0;
    }

    @Override
    public double getImposto() {
        return 0;
    }
}
