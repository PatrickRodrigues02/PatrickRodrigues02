package exemplos;


public class Teste01 {

    public static void main(String[] args) {
        
        int [] numbers = new int[10];

        //final int TAMANHO - 10; // << declarar constante

        for(int i=0; i<numbers.length; i++) {
            numbers[i] = (i+1);
        }

        for(int i=0; i<numbers.length; i++) {
            System.out.print(numbers[i] + " ");

        }
    }
}