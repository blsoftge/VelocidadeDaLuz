package v03iteracaoVSrecursao;

public class FatorialRecursivo {
	public long fatorialRecursivo(long numero) {
		if(numero == 1) {
			return 1;
		}
		return numero * fatorialRecursivo(numero - 1);
	}
}
