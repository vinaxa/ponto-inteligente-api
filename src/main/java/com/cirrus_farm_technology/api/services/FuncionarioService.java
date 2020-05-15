package com.cirrus_farm_technology.api.services;

import java.util.Optional;

import com.cirrus_farm_technology.api.entities.Funcionario;

public interface FuncionarioService {

	
	
	
	/**
	 * Persiste um funcionário na base de dados
	 */
	
	Funcionario persistir (Funcionario funcionario);
	
	
	/** Busca e retorna um funcionario dado um CPF
	 * 
	 * 
	 */
	
	Optional<Funcionario> buscarPorCpf(String cpf);

	
	/** 
	 * Busca e retorna um funcionario dado um email 
	 */
	Optional<Funcionario> buscarPorEmail(String email);
	
	
	/** 
	 * Busca e retorna funcionario dado o ID
	 */
	
	Optional<Funcionario> buscarPorId(Long id);
}

