package v01Long_long;

public class Main {
    public static void main(String[] args) throws Exception {
        long soma = 0L;
        long t1 = System.currentTimeMillis();

        for(long i = 0; i < Integer.MAX_VALUE; i++){
            soma += i;
        }

        long t2 = System.currentTimeMillis();
        System.out.println((t2 - t1));
    }
}
