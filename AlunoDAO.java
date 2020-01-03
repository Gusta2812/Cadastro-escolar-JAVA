/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escola;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Adilson
 */
public class AlunoDAO {
    
    public AlunoDAO(){}
    
     public void adicionarCadastro(Aluno aluno) {
        ConecaoPostgres postgres = new  ConecaoPostgres();
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("INSERT INTO Aluno(nomeCompleto, endereco, sexo, idade, rg, data_nascimento, matricula, classe) VALUES (?,?,?,?,?,?,?,?)");
            stmt.setString(1, aluno.getNomeCompleto());
            stmt.setString(2, aluno.getEndereco());
            stmt.setString(3, aluno.getSexo());
            stmt.setInt(4, aluno.getIdade());
            stmt.setInt(5, aluno.getRg());
            stmt.setInt(6, aluno.getData_nascimento());
            stmt.setInt(7, aluno.getMatricula());
            stmt.setString(8, aluno.getClasse());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(null, stmt, conexao);
        }
    }
     
    public void deletarCadastro(int matricula) {
        ConecaoPostgres postgres = new ConecaoPostgres();
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("DELETE FROM Aluno WHERE matricula=?");
            stmt.setInt(1, matricula);

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(null, stmt, conexao);
        }
    }
    
    public void updateCadastro(Aluno aluno) {
        ConecaoPostgres postgres = new ConecaoPostgres();
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("UPDATE Aluno SET nomeCompleto=?, endereco=?, sexo=?, idade=?, rg=?, data_nascimento=?, classe=? WHERE matricula=?");
            stmt.setString(1, aluno.getNomeCompleto());
            stmt.setString(2, aluno.getEndereco());
            stmt.setString(3, aluno.getSexo());
            stmt.setInt(4, aluno.getIdade());
            stmt.setInt(5, aluno.getRg());
            stmt.setInt(6, aluno.getData_nascimento());           
            stmt.setString(7, aluno.getClasse());
            stmt.setInt(8, aluno.getMatricula());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(null, stmt, conexao);
        }
    }
    
     public List<Aluno> listarCadastros() {
        List<Aluno> listaRetorno = new LinkedList<>();

        ConecaoPostgres postgres = new ConecaoPostgres();
        ResultSet rs = null;
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("SELECT * FROM Aluno ORDER BY matricula");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Aluno aluno = new Aluno(rs.getString("Nomecompleto"),
                        rs.getString("Endereco"), rs.getString("Sexo"), rs.getInt("Idade"), rs.getInt("Rg"), rs.getInt("Data_Nascimento"), rs.getInt("Matricula"), rs.getString("Classe"));
                listaRetorno.add(aluno);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(rs, stmt, conexao);
        }

        return listaRetorno;
    }
    
}