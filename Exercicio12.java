public class Exercicio12 {

    public static void executar(){
    
        Double[] vet = new Double[12];
        for (int i = 0; i < vet.length; i++) {
    
            vet[i] = Prompt.lerDecimal("Digite um número pro índice " + i + " do vetor: ");    
        }

        int produtopar = 1;
        for (int i = 0; i < vet.length; i++) {
    
            if (vet[i] % 2 == 0 && vet[i] > 0) {
                produtopar *= vet[i];
            }  
        }

        if (produtopar != 1) {
            System.out.println("O produto dos elementos pares positivos é: " + produtopar);
        } else {
            System.out.println("Não há números pares positivos para calcular o produto!");
        }

    }  
}
