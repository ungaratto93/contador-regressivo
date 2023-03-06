package br.com.ungaratto93.contador;

import java.util.concurrent.TimeUnit;

public class Contador {

	private int tempo;
	private boolean contando = true;

	public Contador(int tempo) {
		this.tempo = tempo;
	}

	public void contagemRegressiva() {
		do {
			this.setTempo(this.getTempo() - 1);

			try {
                Thread.sleep(1400);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		} while (this.getTempo() > -1);
	}

	private void setTempo(int tempo) {
		this.tempo = tempo;
	}

	public int getTempo() {
		return this.tempo;
	}

	public boolean estaContando() {
		return this.contando;
	}

}
