
package RESTAURANTE.DAO.IMPL;

import CONEXAO.Conexao;
import RESTAURANTE.DAO.ColaboradorDAO;
import RESTAURANTE.MODEL.Colaborador;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
            stmt.setString(4, colaborador.getRg());
           // stmt.setDate(5, colaborador.getDataNascimento());
           // stmt.setDate(6, colaborador.getDataContradacao());
           // stmt.setDate(7, colaborador.getDataDemissao());
           // stmt.setString(8, colaborador.getGrupoColaboradores());
            stmt.setFloat(9, colaborador.getSalario());
           // stmt.setInt(10, colaborador.getPessoa());

            stmt.executeUpdate();
        } catch (SQLException ex){
            ex.printStackTrace();
        }
        
    }

    @Override
    public void alterar(Colaborador colaborador) {
        
    }

    @Override
    public void remover(Colaborador colaborador) {
        
    }

    @Override
    public Colaborador buscaPorId(Integer codigo) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Colaborador> buscarTodos() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
