package view;

import controller.NumeroParController;

public class Principal {

	public static void main(String[] args) {
		
		int[] vetor = {4,8,9,5,3,7,10,6,1,2};
		int tamanho = vetor.length;
		
		NumeroParController npc = new NumeroParController();
		int contPar = npc.contParVetor(vetor, tamanho);
		System.out.println("Quantidade de números pares no vetor: "+contPar);
	}
}
