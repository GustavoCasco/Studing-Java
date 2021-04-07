package POO.P3E03;

public class turma {
    
    private int idTurma; 
    private int qtdAlunos;
    private double notas [];
    
    public int getIdAluno()
    {
        return idTurma;
    }

    public int getQtdAlunos()
    {
        return qtdAlunos;
    }

    public void setSala(int id, int qtd)
    {
        this.idTurma = id;
        this.qtdAlunos = qtd;
    }

    public void setNota(double nota[])
    {
        this.notas = nota;
        
    }

    public double mediaSala() {
        return (notas[0]+notas[1]+notas[2]+notas[3])/4;
    }
    
}
