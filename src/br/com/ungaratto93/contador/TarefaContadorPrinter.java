package br.com.ungaratto93.contador;

import java.util.concurrent.TimeUnit;

public class TarefaContadorPrinter implements Runnable {
    private Contador contador;

    public TarefaContadorPrinter(Contador contador) {
        this.contador = contador;
    }

    @Override
    public void run() {
        while (contador.getTempo() > 0) {
			System.out.print("\rTempo Restante: " + this.contador.getTempo());
            
			try {
				Thread.sleep(1200);
			} catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\nContagem regressiva finalizada.");
    }
}