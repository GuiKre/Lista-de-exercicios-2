public class Exercicio04 {

    public static void executar(){

        Double[] vet = new Double[5];

        Double num = Prompt.lerDecimal("Digite um número: ");

        for (int i = 0; i < vet.length; i++) {

            vet[i] = Prompt.lerDecimal("Digite um número pro índice " + i + ": ");    
        }

        for (int i = 0; i < vet.length; i++) {

            if(vet[i] < num){
                Prompt.imprimir("O valor do índice " + i + " é inferior a " + num);
            }
        }
    }
}
