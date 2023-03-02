package com.example.servletboasvindas.exception;

public class EntradaDeDadosException extends Exception{
    @Override
    public String getMessage() {
        return "Entrada inválida. Não deixe em branco";
    }
}
