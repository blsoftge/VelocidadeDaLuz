/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v03iteracaoVSrecursao;

/**
 *
 * @author blsoft
 */
public class Main {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		
		int fatorial = 15000;
		
		long t1 = System.currentTimeMillis();
		
		FatorialIterativo iterativo = new FatorialIterativo();
		iterativo.fatorialIterativo(fatorial);
		
//		FatorialRecursivo recursivo = new FatorialRecursivo();
//		recursivo.fatorialRecursivo(fatorial);
		
		long t2 = System.currentTimeMillis();
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t2 - t1);
		
		
	}

}
