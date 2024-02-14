package com.brunobandeira.controledegastos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brunobandeira.controledegastos.service.CalculoService;

@RestController
@RequestMapping("calculos")
public class CalculoController {
    
    CalculoService calculoService;

    public CalculoController(CalculoService calculoService) {
        this.calculoService = calculoService;
    }

    @GetMapping
    public double calcularGastoMensal(int mes, int ano) {
        return calculoService.calcularGastoMensal(mes, ano);
    }
}
