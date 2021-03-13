package exercicios;

import java.util.Scanner;


public class Exercicios {

   

    public static void main(String[] args) {
        
        double media = 0;;
        int maiores = 0;

        Scanner entrada = new Scanner(System.in);
        //String [] names = new String[3];
        //

        //for(int i=0; i < names.length; i++) {
        //    System.out.println("Nomes: ");
        //    names[i] = entrada.nextLine();
        //}

        //for(int i = names.length - 1; i >= 0; i--) {
            //System.out.println(names[i] + " ");
        //}

        double [] grades = new double[3];

        for (int i=0; i < grades.length; i++) {
            System.out.println(grades.length + "ª Notas: ");
            grades[i] = entrada.nextDouble();           

            media += grades[i];
        }

        media /= grades.length;

        System.out.println("Todas as notas: ");

        for (int i=0; i < grades.length; i++) {
            if (grades[i] > media) {
                maiores++;
            }
        }

        System.out.println("Média: " + media);
        System.out.println("Notas acima da média" + maiores);
            
        
        entrada.close();


    }
}