package v2for_while_dowhile;

public class Main {
	public static void main(String[] args) throws Exception {
		
		executarWhile();
		executarDoWhile();
		executarFor();

		
		/**
		 * rodada1 
		 * dowhile
		 * 
		 * rodada2
		 * dowhile
		 * 
		 * rodada3
		 * dowhile
		 */
		
	}

	public static void executarFor() {
		long t1 = System.currentTimeMillis();
		long soma = 0;
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			soma += i;
		}
		long t2 = System.currentTimeMillis();
		System.out.println("FOR = " + (t2 - t1));
	}

	public static void executarWhile() {
		long t1 = System.currentTimeMillis();
		long soma = 0;
		int i = 0;
		while (i < Integer.MAX_VALUE) {
			soma += i;
			i++;
		}

		long t2 = System.currentTimeMillis();
		System.out.println("WHILE = " + (t2 - t1));
	}

	public static void executarDoWhile() {
    	long t1 = System.currentTimeMillis();
    	long soma = 0;
    	int i = 0;
    	do {
    		soma += i;
    		i++;
    	}while(i < Integer.MAX_VALUE);
    	long t2 = System.currentTimeMillis();
    	System.out.println("DO WHILE = " + (t2 - t1));
    }
    
}
