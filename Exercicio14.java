public class Exercicio14 {

    public static void executar(){

        Double[] vet = new Double[5];
        for (int i = 0; i < vet.length; i++) {

            vet[i] = Prompt.lerDecimal("Digite um número pro índice " + i + " do vetor: ");    
        }

        Double maior = vet[0];
        int indicemaior = 0;

        for (int i = 0; i < vet.length; i++) {

            if(vet[i] > maior){
                maior = vet[i];
                indicemaior = i;
            }  
        }

        Double aux = vet[5-1];
        vet[5-1] = maior;
        vet[indicemaior] = aux;

        Prompt.imprimir("\nVetor com o maior elemento na ultima posição: ");
        for (int i = 0; i < vet.length; i++) {

            Prompt.imprimir(vet[i]);    
        }
    }
}
