public class Exercicio10 {

    public static void executar(){

        Double[] vetA = new Double[5];
        Double[] vetB = new Double[5];
        for (int i = 0; i < vetA.length; i++) {

            vetA[i] = Prompt.lerDecimal("Digite um número pro índice " + i + " do vetor A: ");    
        }

        for (int i = 0; i < vetB.length; i++) {

            vetB[i] = vetA[4-i];   
        }


        Prompt.imprimir("\nVetor C: ");
        for (int i = 0; i < vetB.length; i++) {

            Prompt.imprimir(vetB[i]);
        }
    }
}
