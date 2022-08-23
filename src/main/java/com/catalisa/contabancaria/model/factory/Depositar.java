package com.catalisa.contabancaria.model.factory;

import com.catalisa.contabancaria.model.ContaModel;

import java.math.BigDecimal;

public class Depositar implements TipoDeOperacao {

    @Override
    public BigDecimal calculoTipoOperacao(ContaModel contaModel) {
        return contaModel.getValorAtualDaConta().add(contaModel.getValorFornecido());
    }
}
