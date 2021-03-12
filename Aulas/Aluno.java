package Aulas;

public class Aluno {

    //atributos
    private String  nome;
    private int     RA;


    //construtor
    public Aluno(){}


    //set
    public void setNome(String nome) {
        this.nome = nome;  
    }
    
    public void setRA(int RA) {
        this.RA = RA;
    }



    //get
    public String getNome() {
        return this.nome;
    }

    public int getRA() {
        return this.RA;
    }



    //metodos
    public void imprimirAluno() {

        System.out.println("Nome: " + this.nome);
        System.out.println("RA: " + this.RA);

    }

    public double notaFinal(double A1, double A2, double N1, double N2, double APS) {
         double notaN1 = (A1+A2+N1)/3;
         double notaN2 = (APS+N2);

        return 0.4*notaN1 + 0.6*notaN2;
    }


}
