package escola;

/**
 *
 * @author Gustavo
 */
public abstract class Pessoa {
    private String nomeCompleto;
    private String endereco;
    private String sexo;
    private int idade; 
    private int rg;
    private int data_nascimento;  
    
    public Pessoa(){}

    public Pessoa(String nomeCompleto, String endereco, String sexo, int idade, int rg, int data_nascimento){
        this.nomeCompleto = nomeCompleto;
        this.endereco = endereco;
        this.sexo = sexo;
        this.idade = idade;
        this.rg = rg;
        this.data_nascimento = data_nascimento;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public int getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(int data_nascimento) {
        this.data_nascimento = data_nascimento;
    }
    
    
}
