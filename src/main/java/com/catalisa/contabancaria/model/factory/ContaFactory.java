package com.catalisa.contabancaria.model.factory;

public class ContaFactory {

    public TipoDeOperacao tipoDeOperacao(String tipoDeServico) {
        if (tipoDeServico.equalsIgnoreCase("sacar")) {
            return new Sacar();
        } else  if (tipoDeServico.equalsIgnoreCase("depositar")) {
            return new Depositar();
        } else {
            return null;
        }
    }
}
