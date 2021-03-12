package exercicios;

import java.util.Scanner;

public class Exercicios {

   

    public static void main(String[] args) {
        
        
        Scanner entrada = new Scanner(System.in);
        String [] names = new String[3];


        for(int i=0; i < names.length; i++) {
            System.out.println("Nomes: ");
            names[i] = entrada.nextLine();
        }

        for(int i = names.length - 1; i >= 0; i--) {
            System.out.println(names[i] + " ");
        }

        entrada.close();

    }

    
}