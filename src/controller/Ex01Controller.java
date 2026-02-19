package controller;

public class Ex01Controller {

	public Ex01Controller() {
		// TODO Auto-generated constructor stub
		super();
	}
	public double tpGasto(int tamVet) {
		int [] vet = new int[tamVet];
		
		double tpInicio= System.nanoTime();
		for(int i = 0; i<tamVet; i++) {
			vet[i] = 0;
		}
		double tempoFinal = System.nanoTime();

		double tempoTotal = tempoFinal - tpInicio;

		tempoTotal = tempoTotal / Math.pow(10, 9);
		
		return tempoTotal;
		
	}

}
