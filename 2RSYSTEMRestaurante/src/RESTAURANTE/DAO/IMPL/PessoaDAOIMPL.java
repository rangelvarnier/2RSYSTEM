
package RESTAURANTE.DAO.IMPL;

import RESTAURANTE.DAO.EnderecoDAO;
import RESTAURANTE.DAO.PessoaDAO;
import RESTAURANTE.DAO.UTIL.Conexao;
import RESTAURANTE.MODEL.Pessoa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PessoaDAOIMPL implements PessoaDAO{

    @Override
    public void inserir(Pessoa pessoa) {
          Connection con = new Conexao().criarConexao();
        String sql = "insert into pessoa value(?, ?, ?, ?)";
        try{
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setInt(1, pessoa.getCodigo());
            stmt.setString(2, pessoa.getNome());
            stmt.setString(3, pessoa.getSexo());
            stmt.setInt(4, pessoa.getEndereco_codigo().getCodigo());

            stmt.executeUpdate();
        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    @Override
    public void alterar(Pessoa pessoa) {
        Connection con = new Conexao().criarConexao();
        String sql = "update pessoa set nome = ?, sexo = ?, endereco_codigo = ?"
                + " where codigo = ?";
        try{
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, pessoa.getNome());
            stmt.setString(2, pessoa.getSexo());  
            stmt.setInt(3, pessoa.getEndereco_codigo().getCodigo());
            stmt.setInt(4, pessoa.getCodigo());
            
            stmt.executeUpdate();
        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    @Override
    public void remover(Pessoa pessoa) {
        Connection con = new Conexao().criarConexao();
        String sql = "delete from pessoa"
                + " where codigo = ?";
        try{
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, pessoa.getCodigo());
            
            stmt.executeUpdate();
        } catch (SQLException ex){
            
        }
    }

    @Override
    public Pessoa buscarPorCodigo(Integer codigo) {
        Pessoa pessoa = null;
        EnderecoDAO enderecoDao = new EnderecoDAOIMPL();
        Connection con = new Conexao().criarConexao();
        String sql = "select * from pessoa"
                + " where codigo = ?";
        try{
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setInt(1, codigo);
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                pessoa = new Pessoa();
                pessoa.setCodigo(rs.getInt("codico"));
                pessoa.setNome(rs.getString("nome"));
                pessoa.setSexo(rs.getString("sexo"));
                pessoa.setEndereco_codigo(enderecoDao.buscarPorCodigo(rs.getInt("codigo")));

            }
            
        } catch (SQLException ex){
            
        }
        return pessoa;
    }

    @Override
    public List<Pessoa> buscarTodos() {
         List<Pessoa> pessoas = new ArrayList<Pessoa>();
        EnderecoDAO enderecoDao = new EnderecoDAOIMPL();                
        Connection con = new Conexao().criarConexao();
        String sql = "select * from pessoa";
        
        try{
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                Pessoa pessoa = new Pessoa();
                pessoa.setCodigo(rs.getInt("codigo"));
                pessoa.setNome(rs.getString("nome"));
                pessoa.setSexo(rs.getString("sexo"));
                pessoa.setEndereco_codigo(enderecoDao.buscarPorCodigo
                        (rs.getInt("codigo")));
                pessoas.add(pessoa);
            }
            
        } catch (SQLException ex){
            
        }
        return pessoas;
    
    }
    
}
