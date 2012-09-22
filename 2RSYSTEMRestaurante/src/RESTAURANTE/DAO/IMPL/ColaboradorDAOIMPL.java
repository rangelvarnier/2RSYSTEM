
package RESTAURANTE.DAO.IMPL;

import RESTAURANTE.DAO.UTIL.Conexao;
import RESTAURANTE.DAO.ColaboradorDAO;
import RESTAURANTE.DAO.GrupoColaboradorDAO;
import RESTAURANTE.MODEL.Colaborador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ColaboradorDAOIMPL implements ColaboradorDAO{

    @Override
    public void inserir(Colaborador colaborador) {
        Connection con = new Conexao().criarConexao();
        String sql = "insert into Colaborador value(?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try{
            PreparedStatement stmt = con.prepareStatement(sql);
           
            stmt.setInt(1, colaborador.getCodigo());
            stmt.setString(2, colaborador.getCpf());
            stmt.setString(3, colaborador.getRg());
            stmt.setDate(4, new java.sql.Date(colaborador.getDataNascimento().getTime())); 
            stmt.setDate(5, new java.sql.Date(colaborador.getDataContradacao().getTime()));          
            stmt.setDate(6, new java.sql.Date(colaborador.getDataDemissao().getTime()));                              
            stmt.setInt(7, colaborador.getGrupoColaboradores().getCodigo());
            stmt.setFloat(8, colaborador.getSalario());
           // stmt.setInt(9, colaborador.getPessoa());

            stmt.executeUpdate();
        } catch (SQLException ex){
            ex.printStackTrace();
        }
        
    }

    @Override
    public void alterar(Colaborador colaborador) {
        Connection con = new Conexao().criarConexao();
        String sql = "update Colaborador set cpf = ?, rg = ?, dataNascimento = ?, dataContradacao = ?, dataDemissao = ?"
                + "grupoColaboradores_codigo = ?, salario = ?, pessoa_codigo = ?"
                + " where codigo = ?";
        try{
            PreparedStatement stmt = con.prepareStatement(sql);
            
           
            stmt.setString(1, colaborador.getCpf());
            stmt.setString(2, colaborador.getRg());
            stmt.setDate(3, new java.sql.Date(colaborador.getDataNascimento().getTime())); 
            stmt.setDate(4, new java.sql.Date(colaborador.getDataContradacao().getTime()));          
            stmt.setDate(5, new java.sql.Date(colaborador.getDataDemissao().getTime()));                              
            stmt.setInt(6, colaborador.getGrupoColaboradores().getCodigo());
            stmt.setFloat(7, colaborador.getSalario());
           // stmt.setInt(8, colaborador.getPessoa());
            stmt.setInt(9, colaborador.getCodigo());
            
            stmt.executeUpdate();
        } catch (SQLException ex){
            ex.printStackTrace();
        }
        
    }

    @Override
    public void remover(Colaborador colaborador) {
                Connection con = new Conexao().criarConexao();
        String sql = "delete from Colaborador"
                + " where codigo = ?";
        try{
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setInt(1, colaborador.getCodigo());            
            stmt.executeUpdate();
        } catch (SQLException ex){
            
        }
        
    }

    @Override
    public Colaborador buscaPorId(Integer codigo) {
        Colaborador colaborador = null;
        GrupoColaboradorDAO grupoColaboradoresDao = (GrupoColaboradorDAO) new GrupoColaboradorDAOIMPL();
        Connection con = new Conexao().criarConexao();
        String sql = "select * from Colaborador"
                + " where codigo = ?";
        try{
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setLong(1, codigo);
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                colaborador = new Colaborador();
                colaborador.setCodigo(rs.getInt("codigo"));
                colaborador.setCpf(rs.getString("cpf"));
                colaborador.setRg(rs.getString("rg"));
                colaborador.setDataNascimento(rs.getDate("dataNascimento"));
                colaborador.setDataContradacao(rs.getDate("dataContradacao"));
                colaborador.setDataDemissao(rs.getDate("dataDemissao"));
              //  colaborador.setGrupoColaboradores(colaboradorDao.buscaPorId(rs.getInt("")));               
                colaborador.setSalario(rs.getFloat("salario"));
               // colaborador.setPessoa(colaboradorDao.buscaPorId(""));
            }
            
        } catch (SQLException ex){
            
        }
        return colaborador;
    }

    @Override
    public List<Colaborador> buscarTodos() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
