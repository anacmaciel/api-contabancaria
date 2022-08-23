package com.catalisa.contabancaria.model.factory;

import com.catalisa.contabancaria.model.ContaModel;

import java.math.BigDecimal;

public interface TipoDeOperacao {

    BigDecimal calculoTipoOperacao(ContaModel contaModel);
}
