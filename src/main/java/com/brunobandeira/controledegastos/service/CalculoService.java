package com.brunobandeira.controledegastos.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.brunobandeira.controledegastos.entity.Gasto;
import com.brunobandeira.controledegastos.repository.GastoRepository;

@Service
public class CalculoService {
    
    private GastoRepository gastoRepository;

    public CalculoService(GastoRepository gastoRepository) {
        this.gastoRepository = gastoRepository;
    }
    

    // SERVIÇOS

    public double calcularGastoMensal(int mes, int ano) {
        double soma = 0;
        List<Gasto> gastos = gastoRepository.findAll();

        for(Gasto gasto: gastos ) {
            if(gasto.getData().getMonthValue() == mes && gasto.getData().getYear() == ano) {
                soma +=gasto.getValor() * gasto.getQuantidade();
            }
        }
        return soma;
    }
}
