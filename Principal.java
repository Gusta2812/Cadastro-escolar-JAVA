package escola;


/**
 *
 * @author Gustavo
 */
public class Principal {

    public static void main(String[]args) throws Exception{   
        AlunoDAO alunodao = new AlunoDAO();
        Aluno aluno = new Aluno("Gatilsn", "Rua rua", "Masculindo", 18, 22555, 2002, 233569, "Tu") ;
        alunodao.adicionarCadastro(aluno);
        
        
        System.out.println(alunodao.listarCadastros());
        
    }
}
