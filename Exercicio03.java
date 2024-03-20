public class Exercicio03 {

    public static void executar(){

        int tamanho = Prompt.lerInteiro("Digite o tamanho do vetor: ");
        
        Double[] vet = new Double[tamanho];
        Double[] dobro = new Double[tamanho];

        for (int i = 0; i < vet.length; i++) { 

            vet[i] = Prompt.lerDecimal("Digite um número pro índice " + i + ": ");

            dobro[i] = vet[i] * 2;
        }

        Prompt.linhaEmBranco();

        for (int i = 0; i < dobro.length; i++) {

            Prompt.imprimir(dobro[i]);
        }

    }
}
