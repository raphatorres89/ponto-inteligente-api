package com.rct.pontointeligente.api.services.impl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rct.pontointeligente.api.entities.Funcionario;
import com.rct.pontointeligente.api.repositories.FuncionarioRepository;
import com.rct.pontointeligente.api.services.FuncionarioService;

@Service
public class FuncionarioServiceImpl implements FuncionarioService {

	private static final Logger log = LoggerFactory.getLogger(FuncionarioServiceImpl.class);
	
	@Autowired
	private FuncionarioRepository funcionarioRepository;

	@Override
	public Funcionario persistir(Funcionario funcionario) {
		log.info("Persistindo funcionario: {}", funcionario);
		return this.funcionarioRepository.save(funcionario);
	}

	@Override
	public Optional<Funcionario> buscarPorId(long id) {
		log.info("Buscando um funcionario para o id {}", id);
		return Optional.ofNullable(funcionarioRepository.findOne(id));
	}

	@Override
	public Optional<Funcionario> buscarPorEmail(String email) {
		log.info("Buscando um funcionario para o email {}", email);
		return Optional.ofNullable(funcionarioRepository.findByEmail(email));
	}
	
	@Override
	public Optional<Funcionario> buscarPorCpf(String cpf) {
		log.info("Buscando um funcionario para o cpf {}", cpf);
		return Optional.ofNullable(funcionarioRepository.findByCpf(cpf));
	}

}
