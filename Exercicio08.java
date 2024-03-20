public class Exercicio08 {

    public static void executar(){

        Double[] vetA = new Double[5];
        for (int i = 0; i < vetA.length; i++) {

            vetA[i] = Prompt.lerDecimal("Digite um número pro índice " + i + " do vetor A: ");    
        }

        Double[] vetB = new Double[5];
        for (int i = 0; i < vetB.length; i++) {

            vetB[i] = Prompt.lerDecimal("Digite um número pro índice " + i + " do vetor B: ");    
        }

        Double[] vetC = new Double[vetA.length + vetB.length];

        for (int i = 0; i < vetA.length; i++){

                vetC[i] = vetA[i];

        }

        for (int i = 0; i < vetB.length; i++){
            
            vetC[vetA.length + i] = vetB[i];

        }

        Prompt.imprimir("\nVetor C (concatenação dos vetores A e B): ");
        for (int i = 0; i < vetC.length; i++){
            
            Prompt.imprimir(vetC[i]);

        }
    }
}
