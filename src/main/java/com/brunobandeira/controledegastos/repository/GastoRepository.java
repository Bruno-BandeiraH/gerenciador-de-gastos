package com.brunobandeira.controledegastos.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brunobandeira.controledegastos.entity.Gasto;

public interface GastoRepository extends JpaRepository<Gasto, Long>{
    
    List<Gasto> findByNome(String nome);
    List<Gasto> findByTipoDeGasto(String tipoDeGasto);
    List<Gasto> findByData(LocalDate data);
}
