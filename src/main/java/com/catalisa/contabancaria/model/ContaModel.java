package com.catalisa.contabancaria.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
@Table(name = "conta")
public class ContaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "numero_de_conta", length = 5, nullable = false)
    private int numeroDeConta;
    @Column(name = "agencia", length = 4, nullable = false)
    private int agencia;
    @Column(name = "nome_do_usuario", length = 50, nullable = false)
    private String nomeDoUsuario;
    @Column(name = "valorAtualDaConta", length = 50, nullable = false)
    private BigDecimal valorAtualDaConta;
    @Column(name = "valor_fornecido", length = 50, nullable = false)
    private BigDecimal valorFornecido;
    @Column(name = "valor_final", length = 60)
    private BigDecimal valorFinal;
    @Column(name = "tipo_de_servico", length = 9, nullable = false)
    private String tipoDeServico;
}
