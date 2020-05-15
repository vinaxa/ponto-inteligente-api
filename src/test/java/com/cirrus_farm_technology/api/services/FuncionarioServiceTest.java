package com.cirrus_farm_technology.api.services;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mockitoSession;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.cirrus_farm_technology.api.entities.Funcionario;
import com.cirrus_farm_technology.api.repositories.EmpresaRepository;
import com.cirrus_farm_technology.api.repositories.FuncionarioRepository;

@SpringBootTest
@ActiveProfiles("test")
@TestInstance(Lifecycle.PER_CLASS)
@ExtendWith(SpringExtension.class)
public class FuncionarioServiceTest {

	@MockBean
	private FuncionarioRepository funcionarioRepository;
	
	@Autowired
	private FuncionarioService funcionarioService;

	
	@BeforeEach
	public void setUp()throws Exception {
		BDDMockito.given(this.funcionarioRepository.save(Mockito.any(Funcionario.class))).willReturn(new Funcionario());
		BDDMockito.given(this.funcionarioRepository.findById(Mockito.anyLong())).willReturn(Optional.of(new Funcionario()));
		BDDMockito.given(this.funcionarioRepository.findByEmail(Mockito.anyString())).willReturn(new Funcionario());
		BDDMockito.given(this.funcionarioRepository.findByCpf(Mockito.anyString())).willReturn(new Funcionario());
	}
	
	
	@Test
	public void testPersistirFuncionario() {
		Funcionario funcionario = this.funcionarioService.persistir(new Funcionario());
		assertNotNull(funcionario);
	}
	
	@Test
	public void testBuscarFuncionarioPorId() {
		Optional<Funcionario> funcionario = this.funcionarioService.buscarPorId(1L);
		
		assertTrue(funcionario.isPresent());
	}
	
	
	@Test
	public void testBuscarFuncionarioPorCpf() {
		Optional<Funcionario> funcionario = this.funcionarioService.buscarPorCpf("24291173474");
		
		assertTrue(funcionario.isPresent());
	}
	
	@Test
	public void testBuscarFuncionarioPorEmail() {
		Optional<Funcionario> funcionario = this.funcionarioService.buscarPorEmail("email@email.com.br");
		
		assertTrue(funcionario.isPresent());
	}
	
	
}
