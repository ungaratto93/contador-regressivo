package br.com.ungaratto93.contador;

import static org.junit.Assert.assertEquals;

import java.lang.Thread.State;

import org.junit.jupiter.api.Test;

public class ContadorTest {

	@Test
	public void testaDecrementoDoContador() {
		Contador contador = new Contador(5);
		contador.contagemRegressiva();
		assertEquals(-1, contador.getTempo());
	}

}
