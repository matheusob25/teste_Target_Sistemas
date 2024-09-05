package fibonnaci;

public class Main {

    //parâmetros 'n' para saber até que número a soma de fibonnaci vai
    public static int fibonnaci(int n){
        //ponto onde acaba o loop que a recursividade gera
        if(n == 0 || n == 1){
            return n;
        }
    //aplicando recursividade onde eu somo n - 1 que será o primeiro valor no looping e n - 2 o segundo,
    //e após isso de forma empilhada as funções vão somando até chegar ao ponto de parar (condição para parar a função 'if(n == 0 || n == 1)')
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