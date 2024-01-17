package com.brunobandeira.controledegastos.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brunobandeira.controledegastos.entity.Gasto;
import com.brunobandeira.controledegastos.service.GastoService;
import com.brunobandeira.controledegastos.util.TipoDeGasto;

@RestController
@RequestMapping("gastos")
public class GastoController {
    
    private GastoService gastoService;

    public GastoController(GastoService gastoService) {
        this.gastoService = gastoService;
    }

    // REQUISIÇÕES HTTP

    @PostMapping
    public List<Gasto> adicionar(@RequestBody Gasto gasto) {
        return gastoService.adicionar(gasto);
    }

    @PutMapping
    public List<Gasto> atualizar(@RequestBody Gasto gasto) {
        return gastoService.atualizar(gasto);
    }

    @GetMapping
    public List<Gasto> listarTudo() {
        return gastoService.listarTudo();
    }

    @GetMapping("/nome/{nome}")
    public List<Gasto> listarPorNome(@PathVariable String nome) {
        return gastoService.listarPorNome(nome);
    }

    @GetMapping("/gasto/{gasto}")
    public List<Gasto> listarPorTipoDeGasto(@PathVariable TipoDeGasto gasto) {
        return gastoService.listarPorTipoDeGasto(gasto);
    }
    
    @GetMapping("/data/{data}")
    public List<Gasto> listarPorData(@PathVariable LocalDate data) {
        return gastoService.listarPorData(data);
    }

    @DeleteMapping("/{id}")
    public List<Gasto> deletar(@PathVariable Long id) {
        return gastoService.deletar(id);
    }

}
