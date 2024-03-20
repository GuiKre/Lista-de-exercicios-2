public class Exercicio05 {

    public static void executar(){

        Double[] vet = new Double[5];

        Double num = Prompt.lerDecimal("Digite um número: ");

        for (int i = 0; i < vet.length; i++) {

            vet[i] = Prompt.lerDecimal("Digite um número pro índice " + i + ": ");    
        }

        int cont = 0;
        for (int i = 0; i < vet.length; i++) {

            if(Math.abs(vet[i] - num) < 0.001){
                cont++;
            }
        }

        if(cont == 1){
            Prompt.imprimir("O número " + num + " Apareceu " + cont + " vez no vetor.");
        }else{
            Prompt.imprimir("O número " + num + " Apareceu " + cont + " vezes no vetor.");
        }
    }
}
