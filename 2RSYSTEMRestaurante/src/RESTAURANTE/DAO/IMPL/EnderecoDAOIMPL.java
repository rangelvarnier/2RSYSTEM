
package RESTAURANTE.DAO.IMPL;

import RESTAURANTE.DAO.CidadeDAO;
import RESTAURANTE.DAO.EnderecoDAO;
import RESTAURANTE.DAO.UTIL.Conexao;
import RESTAURANTE.MODEL.Endereco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class EnderecoDAOIMPL implements EnderecoDAO{

    @Override
    public void inserir(Endereco endereco) {
        
        Connection con = new Conexao().criarConexao();
        String sql = "insert into endereco value(?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try{
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setInt(1, endereco.getCodigo());
            stmt.setString(2, endereco.getRua());
            stmt.setString(3, endereco.getNumero());
            stmt.setString(4, endereco.getCep());
            stmt.setString(5, endereco.getBairro());
            stmt.setInt(6, endereco.getCidade_codigo().getCodigo());
            stmt.setString(7, endereco.getTelefone());
            stmt.setString(8, endereco.getCelular());
            stmt.setString(9, endereco.getEmail());
           
            

            stmt.executeUpdate();
        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    @Override
    public void alterar(Endereco endereco) {
        Connection con = new Conexao().criarConexao();
        String sql = "update endereco set rua = ?, numero = ?, cep = ?, bairro = ?, cidade_codigo = ?"
                + ", telefone = ?, celular = ?, email = ?  where codigo = ?";
        try{
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setString(1, endereco.getRua());
            stmt.setString(2, endereco.getNumero());
            stmt.setString(3, endereco.getCep());
            stmt.setString(4, endereco.getBairro());
            stmt.setInt(5, endereco.getCidade_codigo().getCodigo());
            stmt.setString(6, endereco.getTelefone());
            stmt.setString(7, endereco.getCelular());
            stmt.setString(8, endereco.getEmail());
            stmt.setInt(9, endereco.getCodigo());
            
            stmt.executeUpdate();
        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    @Override
    public void remover(Endereco endereco) {
        Connection con = new Conexao().criarConexao();
        String sql = "delete from endereco"
                + " where codigo = ?";
        try{
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, endereco.getCodigo());
            
            stmt.executeUpdate();
        } catch (SQLException ex){
            
        }
    }

    @Override
    public Endereco buscarPorCodigo(Integer codigo) {
        Endereco endereco = null;
        CidadeDAO cidadeDao = new CidadeDAOIMPL();
        Connection con = new Conexao().criarConexao();
        String sql = "select * from endereco"
                + " where codigo = ?";
        try{
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setInt(1, codigo);
            
            ResultSet rs = stmt.executeQuery();
            
       /*     while(rs.next()){
                endereco = new Endereco();
                endereco.setCodigo(rs.getInt("codico"));
                endereco.setNome(rs.getString("nome"));
                endereco.setUnidadeFederativa_codigo(unidadeFederativaDao.buscarPorCodigo(rs.getInt("codigo")));

            }*/
            
        } catch (SQLException ex){
            
        }
        return endereco;
    }

    @Override
    public List<Endereco> buscarTodos() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
    
}
