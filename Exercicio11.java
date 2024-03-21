public class Exercicio11 {

    public static void executar(){

        int[] vetA = new int[5];
        for (int i = 0; i < vetA.length; i++) {

            vetA[i] = Prompt.lerInteiro("Digite um número inteiro pro índice " + i + " do vetor A: ");    
        }

        int[] vetB = new int[5];
        for (int i = 0; i < vetB.length; i++) {

            vetB[i] = Prompt.lerInteiro("Digite um número inteiro pro índice " + i + " do vetor B: ");    
        }

        int escalar  = 0;

        for (int i = 0; i < vetA.length; i++){

            escalar += vetA[i] * vetB[i]; 
        }

        Prompt.imprimir("Produto escalar entre os dois vetores: " + escalar);
    }
}
