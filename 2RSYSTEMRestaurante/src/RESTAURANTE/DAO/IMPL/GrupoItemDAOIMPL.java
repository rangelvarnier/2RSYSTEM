package RESTAURANTE.DAO.IMPL;

import RESTAURANTE.DAO.GrupoItemDAO;
import RESTAURANTE.DAO.UTIL.Conexao;
import RESTAURANTE.MODEL.GrupoItem;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GrupoItemDAOIMPL implements GrupoItemDAO {

    @Override
    public void inserir(GrupoItem grupoItem) {
        Connection con = new Conexao().criarConexao();
        String sql = "insert into grupoitem value(?, ?)";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, grupoItem.getCodigo());
            stmt.setString(2, grupoItem.getDescricao());

            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void alterar(GrupoItem grupoItem) {
        Connection con = new Conexao().criarConexao();
        String sql = "update grupoitem set descricao = ? where codigo = ?";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, grupoItem.getDescricao());
            stmt.setLong(2, grupoItem.getCodigo());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void remover(GrupoItem grupoItem) {
        Connection con = new Conexao().criarConexao();
        String sql = "delete from grupoitem where codigo = ?";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setLong(1, grupoItem.getCodigo());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public GrupoItem buscarPorCodigo(Integer codigo) {
        GrupoItem grupoItem = null;
        Connection con = new Conexao().criarConexao();
        String sql = "select * from grupoitem where codigo = ? ";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, codigo);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                grupoItem = new GrupoItem();
                grupoItem.setCodigo(rs.getInt("codigo"));
                grupoItem.setDescricao(rs.getString("descricao"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return grupoItem;
    }

    @Override
    public List<GrupoItem> buscarTodos() {
        List<GrupoItem> grupoItens = new ArrayList<GrupoItem>();
        Connection con = new Conexao().criarConexao();
        String sql = "select * from grupoitem";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                GrupoItem grupoItem = new GrupoItem();
                grupoItem.setCodigo(rs.getInt("codigo"));
                grupoItem.setDescricao(rs.getString("descricao"));
                grupoItens.add(grupoItem);
            }

        } catch (SQLException ex) {
        }
        return grupoItens;
    }

    @Override
    public List<GrupoItem> buscarPorDescricao(String descricao) {
        List<GrupoItem> grupoItens = new ArrayList<GrupoItem>();
        Connection con = new Conexao().criarConexao();
        String sql = "select * from grupoitem where descricao like ? ";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, "%"+descricao+"%");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                GrupoItem grupoItem = new GrupoItem();
                grupoItem.setCodigo(rs.getInt("codigo"));
                grupoItem.setDescricao(rs.getString("descricao"));
                grupoItens.add(grupoItem);
            }

        } catch (SQLException ex) {
        }
        return grupoItens;
    }
          
}
