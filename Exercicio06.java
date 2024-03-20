public class Exercicio06 {

    public static void executar(){

        Double[] notas = new Double[5];

        for (int i = 0; i < notas.length; i++) {

            notas[i] = Prompt.lerDecimal("Digite a nota " + (i + 1) + ": ");    
        }

        Double[] pesos = new Double[5];

        for (int i = 0; i < pesos.length; i++) {

            pesos[i] = Prompt.lerDecimal("Digite o peso  da nota " + (i + 1) + ": ");    
        }

        Double somaNotas = 0.0;
        Double somaPesos = 0.0;

        for (int i = 0; i < notas.length; i++) {

            somaNotas += notas[i] * pesos[i];
            somaPesos += pesos[i];                
        }

        Double mediaPond = somaNotas / somaPesos;

        Prompt.imprimir("Média ponderada: " + mediaPond);
    }
}
