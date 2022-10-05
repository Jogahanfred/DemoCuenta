package com.company.exception;

public class CantidadNegativaError extends ArithmeticException {

    public CantidadNegativaError(String string) {
        super(string);
    }

}
