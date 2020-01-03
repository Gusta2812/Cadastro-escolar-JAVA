package escola;

/**
 *
 * @author Gustavo
 */
public class Professor extends Pessoa{
    private String especialidade;
    private int salario;

    public Professor(String nomeCompleto, String endereco, String sexo, int idade, int rg, int data_nascimento, String especialidade, int salario) {
        super(nomeCompleto, endereco, sexo, idade, rg, data_nascimento);
        this.especialidade = especialidade;
        this.salario = salario;
    }   

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
    
}
