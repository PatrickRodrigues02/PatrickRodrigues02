package Aulas;

import java.util.Scanner;

public class AulaPOO_01 {

    public static void main(String[] args) {
        
        System.out.println("\nHello World\n");

        int a = 2;
        double b = 5.8;

        //int vetor[] = {1,2,3,4,5,6};
        int[] vetor2 = {1,2,3,4,5,6};
        int c = vetor2[0];

        //String texto = "Aluno";

        System.out.printf("%d esse é o número vadia\n", a);
        System.out.println("o valor de c: " + c);

        System.out.println("o valor de b: " + b);
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite: ");
        int leitura = entrada.nextInt();
        System.out.println(leitura);    
        
        
        //colocar a class na main
        operacao op = new operacao();

            double ressoma = op.soma(4,5);
            System.out.println("A soma é: " + ressoma);


        entrada.close();


    }

}