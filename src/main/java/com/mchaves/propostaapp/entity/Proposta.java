package com.mchaves.propostaapp.entity;

import jakarta.persistence.*;

@Entity
public class Proposta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double valorSoliciado;
    private int prazoPagamento;
    private Boolean aprovado;
    private boolean integrada;
    private String observacao;
    @OneToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;




}
