package com.rct.pontointeligente.api.services;

import java.util.Optional;

import com.rct.pontointeligente.api.entities.Funcionario;

public interface FuncionarioService {

	Funcionario persistir(Funcionario funcionario);

	Optional<Funcionario> buscarPorId(long l);

	Optional<Funcionario> buscarPorEmail(String string);

	Optional<Funcionario> buscarPorCpf(String string);

}
