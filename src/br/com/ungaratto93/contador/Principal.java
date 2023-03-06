package br.com.ungaratto93.contador;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/**
		 * O uso do sleep entre as threads � importante para controlar 
		 * o tempo entre as itera��es e permitir que a thread tenha tempo 
		 * suficiente para imprimir a mensagem na tela antes de 
		 * iniciar a pr�xima itera��o.
		 */
		
		Scanner scan = new Scanner(System.in);
		int tempo = scan.nextInt();
		scan.close();
		Contador contador = new Contador(tempo);
		Thread t = new Thread(new TarefaContadorPrinter(contador));
		t.setPriority(10);
		t.start();
		new Thread(new TarefaContagemRegressiva(contador)).start();
	}
	
}
