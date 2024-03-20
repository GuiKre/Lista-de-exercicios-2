public class Exercicio01 {

    public static void executar(){

        Double[] vet = new Double[5];

        for (int i = 0; i < vet.length; i++) {

            vet[i] = Prompt.lerDecimal("Digite um número pro índice " + i + ": ");
            
        }

        Double soma = 0.0;
        for (int i = 0; i < vet.length; i++) {
            soma += vet[i];
        }

        Double media = soma / vet.length;

        Prompt.imprimir("\nMédia: " + media);

        Prompt.imprimir("\nValores menores que a média: ");
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] < media) {
                Prompt.imprimir(vet[i] + "\n");
            }
        }
        Prompt.imprimir("\nValores iguais a média: ");
        for (int i = 0; i < vet.length; i++) {
            if (Math.abs(vet[i] - media) < 0.001) {
                Prompt.imprimir(vet[i] + "\n");
            }
        }
        Prompt.imprimir("\nValores maiores que a média: ");
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] > media) {
                Prompt.imprimir(vet[i] + "\n");
            }
        }
    }
}
