public class Exercicio07 {

    public static void executar(){

        Double[] vet1 = new Double[5];
        for (int i = 0; i < vet1.length; i++) {

            vet1[i] = Prompt.lerDecimal("Digite um número pro índice " + i + " do vetor 1: ");    
        }

        Prompt.linhaEmBranco();

        Double[] vet2 = new Double[5];
        for (int i = 0; i < vet2.length; i++) {

            vet2[i] = Prompt.lerDecimal("Digite um número pro índice " + i + " do vetor 2: ");    
        }

        int cont = 0;
        for (int i = 0; i < vet1.length; i++) {

            if(Math.abs(vet1[i] - vet2[i]) < 0.001){
                cont++;
            }   
        }

        if(cont == 5){
            Prompt.imprimir("Os dois vetores são iguais!");
        }else{
            Prompt.imprimir("Os dois vetores não são iguais!");
        }
    }
}
