package ocorrenciasString;

public class ocorrenciaString {
    public static void verificaAparicaoString(String e, char letraProcurada){
        int quantidadeDeOcorrencias = 0;
        // string auxiliar para utilizar o toLowerCase
        String aux = String.valueOf(letraProcurada);

        for (int i = 0; i < e.length(); i++) {
            //comparando o char em letra minuscula com cada caracter da string também em letra minúscula
            if(aux.toLowerCase().charAt(0) == e.toLowerCase().charAt(i) ){
                System.out.println("Letras encontrada: " + e.charAt(i));
                //  somatório de ocorrências da letra
                quantidadeDeOcorrencias++;
            }

        }
        System.out.println("Quantidade de ocorrencias da letra " + letraProcurada + ": " + quantidadeDeOcorrencias);
    }
    public static void main(String[] args) {
        verificaAparicaoString("Arroz com feijao e ovo",'a');


    }
}
