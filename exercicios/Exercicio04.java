package exercicios;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int qtdeLampadas;
        boolean [] lampadas;

        System.out.println("Quantas lampadas ?");
        qtdeLampadas = in.nextInt();

        lampadas = new boolean[qtdeLampadas];

        for (int caminhada = 1; caminhada < lampadas.length; caminhada++) {
            for (int posicao = 1; posicao < lampadas.length; posicao++) {
                if (posicao % caminhada == 0 ) {

                    lampadas[posicao-1] = !lampadas[posicao-1];
                    
                }
            }

        }

        System.out.println("[");
        for (int i = 0; i < lampadas.length; i++) {
            System.out.println((lampadas[i]) ? "On":"Off" );
        }
        System.out.println("]");
        in.close();

    }
    
}
