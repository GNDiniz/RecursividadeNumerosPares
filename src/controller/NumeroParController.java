package controller;

public class NumeroParController {

	public NumeroParController() {
		super();
	}
	public int contParVetor(int[] vetor, int tamanho) {
		//Condição de parada ==> Quando o vetor não tiver mais posições
		if (tamanho == 0) {
			return 0;
		} else {
			int ultimaPosicao = tamanho -1;
			int valor = vetor[ultimaPosicao];
			int contPar = 0;
			if ((valor % 2) == 0) {
				contPar = contPar+1;
			}
			tamanho = tamanho -1;
			return contPar + contParVetor(vetor, tamanho);
		}
	}
}
