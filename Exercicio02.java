public class Exercicio02 {

    public static void executar(){

        int tamanho = Prompt.lerInteiro("Digite o tamanho do vetor: ");
        
        Double[] vet = new Double[tamanho];

        for (int i = 0; i < vet.length; i++) { 

            vet[i] = Prompt.lerDecimal("Digite um número pro índice " + i + ": ");
            
        }

        for (int i = 0; i < vet.length; i++) { 

           if(vet[i] < 0){
            Prompt.imprimir("índice " + i + ": " + "negativo");
           }else if(vet[i] > 0){
            Prompt.imprimir("índice " + i + ": " + "positivo");
           }else{
            Prompt.imprimir("índice " + i + ": " + "zero");
           }
            
        }
    }
}
