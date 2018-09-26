package com.rct.pontointeligente.api.services;

import java.util.Optional;

import com.rct.pontointeligente.api.entities.Funcionario;

public interface FuncionarioService {

	/**
	 * Cadastra um novo funcionário na base de dados
	 * 
	 * @param funcionario
	 * @return Funcionario
	 */
	Funcionario persistir(Funcionario funcionario);

	/**
	 * Retorna um funcionário dado o ID
	 * @param id
	 * @return Optional<Funcionario>
	 */
	Optional<Funcionario> buscarPorId(long id);

	/**
	 * Retorna um funcionário dado o Email
	 * @param email
	 * @return Optional<Funcionario>
	 */
	Optional<Funcionario> buscarPorEmail(String email);

	/**
	 * Retorna um funcionário dado o Cpf
	 * 
	 * @param cpf
	 * @return Optional<Funcionario>
	 */
	Optional<Funcionario> buscarPorCpf(String cpf);

}
