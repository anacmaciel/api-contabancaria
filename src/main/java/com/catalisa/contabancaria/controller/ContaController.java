package com.catalisa.contabancaria.controller;

import com.catalisa.contabancaria.model.ContaModel;
import com.catalisa.contabancaria.service.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ContaController {

    @Autowired
    private ContaService contaService;

    @PostMapping(path = "/conta")
    public ResponseEntity<ContaModel> cadastrarConta(@RequestBody ContaModel contaModel) {
        ContaModel conta = contaService.cadastrar(contaModel);
        return new ResponseEntity<>(conta, HttpStatus.CREATED);
    }

    @GetMapping(path = "/conta")
    public ResponseEntity<List<ContaModel>> buscarTodasAsContas() {
        return ResponseEntity.ok(contaService.buscartodas());
    }

    @GetMapping(path = "/conta/{id}")
    public ResponseEntity<Optional<ContaModel>> buscarContaEspecifica(@PathVariable Long id) {
        return ResponseEntity.ok(contaService.buscarPorId(id));
    }

    @DeleteMapping(path = "/conta/{id}")
    public void deletarConta(@PathVariable Long id) {
        contaService.deletar(id);
    }
}
