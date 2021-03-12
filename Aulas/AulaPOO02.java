package Aulas;

public class AulaPOO02 {
    public static void main(String[] args) {
        
        Aluno patrick = new Aluno();

        patrick.setNome("Patrick");
        patrick.setRA(21367073);

        patrick.imprimirAluno();
        double media = patrick.notaFinal(10, 10, 10, 4, 1);   

        System.out.println("O nome do aluno é " + patrick.getNome());
        System.out.println("O RA do aluno é " + patrick.getRA());
        System.out.println(media);

    }
}
