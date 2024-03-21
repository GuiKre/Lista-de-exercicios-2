public class Exercicio09 {

    public static void executar(){

        Double[] vetA = new Double[5];
        for (int i = 0; i < vetA.length; i++) {

            vetA[i] = Prompt.lerDecimal("Digite um número pro índice " + i + " do vetor A: ");    
        }

        Double[] vetB = new Double[5];
        for (int i = 0; i < vetB.length; i++) {

            vetB[i] = Prompt.lerDecimal("Digite um número pro índice " + i + " do vetor B: ");    
        }

        Double[] vetC = new Double[5];

        for (int i = 0; i < vetA.length; i += 2) {

            vetC[i] = vetA[i]; 
        }

        for (int i = 1; i < vetB.length; i += 2) {

            vetC[i] = vetB[i];  
        }

        Prompt.imprimir("Vetor C: ");
        for (int i = 0; i < vetC.length; i++){
            
            Prompt.imprimir(vetC[i]);

        }
    }
}
