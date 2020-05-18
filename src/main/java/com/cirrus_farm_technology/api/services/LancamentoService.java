package com.cirrus_farm_technology.api.services;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.cirrus_farm_technology.api.entities.Lancamento;

public interface LancamentoService {

	
	/**
	 * Retorna uma lista paginada de lançamentos de um determinado funcionário
	 * 
	 * @param funcionarioId
	 * @param pageRequest
	 * @return Page<Lancamento>
	 */
	
Page<Lancamento> buscarPorFuncionarioId(Long funcionarioId, PageRequest pageRequest);


/** 
 * Retorna lançamento por ID
 */

Optional<Lancamento> buscarPorId(Long id);



/** 
 * Persistir um lançamento na base de dados
 */

Lancamento persistir(Lancamento lancamento);


/** 
 * Remover um lancamento da base de dados 
 */

void remover (Long id);


}

