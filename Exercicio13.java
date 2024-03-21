public class Exercicio13 {

    public static void executar(){

        int n = Prompt.lerInteiro("Digite um número n: ");

        int[] vet = new int[n];
        vet[0] = 1;
        vet[1] = 1;

        for (int i = 2; i < vet.length; i++) {
    
            vet[i] = vet[i-2] + vet[i-1];    
        }

        Prompt.imprimir("Vetor com a sequência de Firbonacci: ");
        for (int i = 0; i < vet.length; i++) {
    
            Prompt.imprimir(vet[i]);   
        }
    }
}
