package com.catalisa.contabancaria.model.factory;

import com.catalisa.contabancaria.model.ContaModel;

import java.math.BigDecimal;

public class Sacar implements TipoDeOperacao {

    @Override
    public BigDecimal calculoTipoOperacao(ContaModel contaModel) {
        return contaModel.getValorAtualDaConta().subtract(contaModel.getValorFornecido());
    }
}
