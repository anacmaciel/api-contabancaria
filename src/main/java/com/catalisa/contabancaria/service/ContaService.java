package com.catalisa.contabancaria.service;

import com.catalisa.contabancaria.model.ContaModel;
import com.catalisa.contabancaria.model.factory.ContaFactory;
import com.catalisa.contabancaria.repository.ContaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class ContaService {

    @Autowired
    private ContaRepository contaRepository;


    public ContaModel cadastrar(ContaModel contaModel) {
        ContaFactory factory = new ContaFactory();
        BigDecimal resultado = factory.tipoDeOperacao(contaModel.getTipoDeServico()).calculoTipoOperacao(contaModel);
        contaModel.getId();
        contaModel.getNumeroDeConta();
        contaModel.getAgencia();
        contaModel.getNomeDoUsuario();
        contaModel.getValorAtualDaConta();
        contaModel.getValorFornecido();
        contaModel.getTipoDeServico();
        contaModel.setValorFinal(resultado);
        return contaRepository.save(contaModel);
    }

    public List<ContaModel> buscartodas() {
        return contaRepository.findAll();
    }

    public Optional<ContaModel> buscarPorId(Long id) {
        return contaRepository.findById(id);
    }

    public void deletar(Long id) {
        contaRepository.deleteById(id);
    }

}