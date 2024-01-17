package com.brunobandeira.controledegastos.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import com.brunobandeira.controledegastos.entity.Gasto;
import com.brunobandeira.controledegastos.repository.GastoRepository;
import com.brunobandeira.controledegastos.util.TipoDeGasto;

@Service
public class GastoService {
    
    private GastoRepository gastoRepository;

    public GastoService(GastoRepository gastoRepository) {
        this.gastoRepository = gastoRepository;
    }

    // SERVIÇOS

    public List<Gasto> listarTudo() {
        return gastoRepository.findAll();
    }

    public List<Gasto> listarPorNome(String nome) {
        return gastoRepository.findByNome(nome);
    }

    public List<Gasto> listarPorTipoDeGasto(TipoDeGasto gasto) {
        return gastoRepository.findByTipoDeGasto(gasto);
    }

    public List<Gasto> listarPorData(LocalDate data) {
        return gastoRepository.findByData(data);
    }
    
    public List<Gasto> adicionar(Gasto gasto) {
        gastoRepository.save(gasto);
        return listarTudo();
    }

    public List<Gasto> atualizar(Gasto gasto) {
        gastoRepository.save(gasto);
        return listarTudo();
    }

    public List<Gasto> deletar(Long id) {
        gastoRepository.deleteById(id);
        return listarTudo();
    }
}
