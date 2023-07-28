package com.dinossauros.mundoperdido.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Dinossauro {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "altura", nullable = false)
    private double altura;

    @Column(name = "peso", nullable = false)
    private double peso;

    @Column(name = "especie", nullable = false)
    private String especie;

    @Column(name = "localizacao", nullable = false)
    private String localizacao;

    @Column(name = "data_criacao", nullable = false)
    private LocalDateTime dataCriacao;
}

