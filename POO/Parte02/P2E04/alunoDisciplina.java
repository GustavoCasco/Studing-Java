package POO.Parte02.P2E04;

public class alunoDisciplina {
    private int idAluno;
    private int idDisciplina;
    private String nomeAluno;
    private String nomeDisciplina;
    private double notab1;
    private double notab2;

    public String getnomeAluno(){
            return this.nomeAluno;
    }

    public int getIdAluno(){
        return this.idAluno;
    }   

    public int getIdDisciplina(){
        return this.idDisciplina;
    } 
    
    public String getNomeDisciplina(){
        return this.nomeDisciplina;
    }


    public void exibeAlunoDisciplina(int idDisciplina, String disciplina, int idAluno, String nomeAluno)
    {
        this.idAluno = idAluno;
        this.idDisciplina = idDisciplina;
        this.nomeDisciplina = disciplina;
        this.nomeAluno = nomeAluno;
    }

    public double mediaAritmetica(double nota1, double nota2)
    {
        this.notab1 = nota1;
        this.notab2 = nota2;

        return (notab1+notab2)/2;
    }

    
    public double mediaPonderada(double nota1, double nota2)
    {
        this.notab1 = nota1;
        this.notab2 = nota2;

        return ((notab1*4)+(notab2*6))/10;
    }
}
