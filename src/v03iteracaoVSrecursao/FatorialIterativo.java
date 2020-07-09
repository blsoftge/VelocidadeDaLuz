package v03iteracaoVSrecursao;

public class FatorialIterativo {
	public void fatorialIterativo(int numero) {
		long fatorialAtual = numero * (numero - 1);
		for (long i = (numero - 1); i > 1; i--) {
		    fatorialAtual *= (i - 1);
		}
	}
}
