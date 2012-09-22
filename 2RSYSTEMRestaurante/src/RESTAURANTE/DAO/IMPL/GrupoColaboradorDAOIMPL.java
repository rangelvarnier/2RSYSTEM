package RESTAURANTE.DAO.IMPL;

import RESTAURANTE.DAO.UTIL.Conexao;
import RESTAURANTE.DAO.GrupoColaboradorDAO;
import RESTAURANTE.MODEL.GrupoColaborador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GrupoColaboradorDAOIMPL implements GrupoColaboradorDAO {

    @Override
    public void inserir(GrupoColaborador grupoColaboradores) {
        Connection con = new Conexao().criarConexao();
        String sql = "insert into GrupoColaboradores value(?, ?)";
        try {

            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setLong(1, grupoColaboradores.getCodigo());
            stmt.setString(2, grupoColaboradores.getDescricao());
            stmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void alterar(GrupoColaborador grupoColaboradores) {
       Connection con = new Conexao().criarConexao();
        String sql = "update GrupoColaboradores set codigo = ?, descricao = ? where codigo = ?";
        try{
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setString(1, grupoColaboradores.getDescricao());
            stmt.setLong(4, grupoColaboradores.getCodigo());
            
            stmt.executeUpdate();
        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    @Override
    public void remover(GrupoColaborador grupoColaboradores) {
        Connection con = new Conexao().criarConexao();
        String sql = "delete from GrupoColaboradores"
                + " where codigo = ?";
        try{
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setLong(1, grupoColaboradores.getCodigo());
            
            stmt.executeUpdate();
        } catch (SQLException ex){
            
        }
    }

    @Override
    public GrupoColaborador buscaPorId(Integer codigo) {
        GrupoColaborador grupoColaborador = null;
        Connection con = new Conexao().criarConexao();
        String sql = "select * from GrupoColaboradores"
                + " where codigo = ?";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setLong(1, codigo);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                grupoColaborador = new GrupoColaborador();
                grupoColaborador.setCodigo(rs.getInt("codigo"));
                grupoColaborador.setDescricao(rs.getString("descricao"));
            }
        } catch (SQLException ex) {
        }
        return grupoColaborador;
    }

    @Override
    public List<GrupoColaborador> buscarTodos() {
           List<GrupoColaborador> grupoColaboradores = new ArrayList<GrupoColaborador>();
        Connection con = new Conexao().criarConexao();
        String sql = "select * from GrupoColaboradores";
        
        try{
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                GrupoColaborador grupoColaborador = new GrupoColaborador();
                grupoColaborador.setCodigo(rs.getInt("codigo"));
                grupoColaborador.setDescricao(rs.getString("descricao"));
                

                grupoColaboradores.add(grupoColaborador);
            }
            
        } catch (SQLException ex){
            
        }
        return grupoColaboradores;
    }
}
 
