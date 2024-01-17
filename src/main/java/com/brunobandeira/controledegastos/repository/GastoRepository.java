package com.brunobandeira.controledegastos.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brunobandeira.controledegastos.entity.Gasto;
import com.brunobandeira.controledegastos.util.TipoDeGasto;

public interface GastoRepository extends JpaRepository<Gasto, Long>{
    
    List<Gasto> findByNome(String nome);
    List<Gasto> findByTipoDeGasto(TipoDeGasto tipoDeGasto);
    List<Gasto> findByData(LocalDate data);
}
