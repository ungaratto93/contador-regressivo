package br.com.ungaratto93.contador;

public class TarefaContagemRegressiva implements Runnable {

	private Contador contador;

	public TarefaContagemRegressiva(Contador contador) {
		this.contador = contador;
	}
	
	@Override
	public void run() {
		contador.contagemRegressiva();
	}

}
