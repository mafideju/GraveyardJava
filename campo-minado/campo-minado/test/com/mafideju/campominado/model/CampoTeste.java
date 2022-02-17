package com.mafideju.campominado.model;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.mafideju.campominado.exception.ExplosaoException;

class CampoTeste {

	private Campo campo = new Campo(3,3);
	
	@Test
	void testeVizinhoAcima() {
		Campo vizinho = new Campo(2,3);
		
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertTrue(resultado);
	}
	
	@Test
	void testeVizinhoAbaixo() {
		Campo vizinho = new Campo(4,3);
		
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertTrue(resultado);
	}

	@Test
	void testeVizinhoEsquerda() {
		Campo vizinho = new Campo(3,2);
		
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertTrue(resultado);
	}
	
	@Test
	void testeVizinhoDireita() {
		Campo vizinho = new Campo(3,4);
		
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertTrue(resultado);
	}
	
	@Test
	void testeDiagonal() {
		Campo vizinho = new Campo(4,4);
		Campo vizinho2 = new Campo(2,2);
		Campo vizinho3 = new Campo(2,4);
		Campo vizinho4 = new Campo(4,2);
		
		boolean diag1 = campo.adicionarVizinho(vizinho);
		boolean diag2 = campo.adicionarVizinho(vizinho2);
		boolean diag3 = campo.adicionarVizinho(vizinho3);
		boolean diag4 = campo.adicionarVizinho(vizinho4);
		boolean resultado = diag1 && diag2 && diag3 && diag4;
		assertTrue(resultado);
	}
	
	
	@Test
	void testeNaoVizinhoLado() {
		Campo vizinho = new Campo(3,1);
		
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertFalse(resultado);
	}
	
	
	@Test
	void testeNaoVizinhoDiagonal() {
		Campo vizinho = new Campo(1,1);
		
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertFalse(resultado);
	}
	
	@Test
	void testeAlternarMarcacaoDefault() {
		assertFalse(campo.isMarcado());
	}
	
	@Test
	void testeAlternarMarcacaoTrue() {
		campo.alternarMarcacao();
		assertTrue(campo.isMarcado());
	}
	
	@Test
	void testeAbrirCampoNaoMinadoNaoMarcado() {
		assertTrue(campo.abrir());
	}
	
	@Test
	void testeAbrirCampoNaoMinadoMarcado() {
		campo.alternarMarcacao();
		assertFalse(campo.abrir());
	}
	
	@Test
	void testeAbrirCampoMinadoMarcado() {
		campo.alternarMarcacao();
		campo.minar();
		assertFalse(campo.abrir());
	}
	
	@Test
	void testeAbrirCampoMinadoNaoMarcado() {
		campo.minar();
		
		assertThrows(ExplosaoException.class, () -> campo.abrir());
	}
	
	@Test
	void testeAbrirComVizinhos() {
		Campo vizinho1 = new Campo(2,2);
		Campo vizinho2 = new Campo(2,3);
		Campo vizinho3 = new Campo(2,4);
		
		campo.adicionarVizinho(vizinho1);
		campo.adicionarVizinho(vizinho2);
		campo.adicionarVizinho(vizinho3);
		campo.abrir();

		
		boolean tudoAberto = vizinho1.isAberto() && vizinho2.isAberto() && vizinho3.isAberto();
		
		assertTrue(tudoAberto);
	}
	
}
