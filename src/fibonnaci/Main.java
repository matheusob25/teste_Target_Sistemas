package fibonnaci;

public class Main {

    //parâmetros 'n' para saber até que número a soma de fibonnaci vai, e 'comparacao' vai ser o número ...
    // que será comparado com todos os números gerados na soma
    public static int fibonnaci(int n){
        if(n == 0 || n == 1){
            return n;
        }

        return fibonnaci(n-1) + fibonnaci(n-2);
    }


    public static void main(String[] args) {
        int n = 22;
        int comparacao = 6765;
        for (int i = 0; i < n; i++) {
            if(comparacao == fibonnaci(i)){
                System.out.println("valor achado dentro de fibonnaci");
            }
            System.out.println(fibonnaci(i));
        }
    }
}