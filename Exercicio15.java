public class Exercicio15 {

    public static void executar(){
        
        Double[] vet = new Double[5];

        for (int i = 0; i < vet.length; i++) {

            vet[i] = Prompt.lerDecimal("Digite um número: ");
        }

        int tamanho = 1;
        for (int i = 1; i < vet.length; i++) {
            if (vet[i] > vet[tamanho - 1]) {
                vet[tamanho] = vet[i];
                tamanho++;
            }
        }

        Double[] vetCorreto = new Double[tamanho];

        for (int i = 0; i < vetCorreto.length; i++) {
            vetCorreto[i] = vet[i];
        }

        Prompt.imprimir("\nVetor completo: ");
        for (int i = 0; i < vetCorreto.length; i++) {
            Prompt.imprimir(vetCorreto[i]);
        }
    }
}
