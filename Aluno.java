package escola;

/**
 *
 * @author Gustavo
 */
public class Aluno extends Pessoa{
    private int matricula;
    private String classe;
    
    public Aluno(){}
  

    public Aluno(String nomeCompleto, String endereco, String sexo, int idade, int rg, int data_nascimento, int matricula, String classe) {
        super(nomeCompleto, endereco, sexo, idade, rg, data_nascimento);
        this.matricula = matricula;
        this.classe = classe;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatriculo(int matricula) {
        this.matricula = matricula;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    
}
