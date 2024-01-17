package com.brunobandeira.controledegastos.entity;

import com.brunobandeira.controledegastos.util.TipoDeGasto;
import com.brunobandeira.controledegastos.util.TipoDeQuantidade;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "gastos")
public class Gasto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private TipoDeGasto TipoDeGasto;
    private String nome;
    private int quantidade;
    @Enumerated(EnumType.STRING)
    private TipoDeQuantidade TipoDeQuantidade;
    private double valor;
    private LocalDate data;

    // GETTERS E SETTERS

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public TipoDeGasto getTipoDeGasto() {
        return TipoDeGasto;
    }
    public void setTipoDeGasto(TipoDeGasto tipoDeGasto) {
        TipoDeGasto = tipoDeGasto;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public TipoDeQuantidade getTipoDeQuantidade() {
        return TipoDeQuantidade;
    }
    public void setTipoDeQuantidade(TipoDeQuantidade tipoDeQuantidade) {
        TipoDeQuantidade = tipoDeQuantidade;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
}
