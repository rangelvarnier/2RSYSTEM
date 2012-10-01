/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package RESTAURANTE.DAO.IMPL;

import RESTAURANTE.DAO.GrupoItemDAO;
import RESTAURANTE.DAO.SubGrupoItemDAO;
import RESTAURANTE.DAO.UTIL.Conexao;
import RESTAURANTE.MODEL.SubGrupoItem;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ricardosassanovicz
 */
public class SubGrupoItensDAOIMPL implements SubGrupoItemDAO {

    @Override
    public void inserir(SubGrupoItem subGrupoItem) {
        Connection con = new Conexao().criarConexao();
        String sql = "insert into subgrupoitem value(?, ?, ?)";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, subGrupoItem.getCodigo());
            stmt.setString(2, subGrupoItem.getDescricao());
            stmt.setInt(3, subGrupoItem.getGrupoItem().getCodigo());

            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void alterar(SubGrupoItem subGrupoItem) {
        Connection con = new Conexao().criarConexao();
        String sql = "update subgrupoitem set descricao = ?,"
                + " grupoItem_codigo = ? where codigo = ?";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, subGrupoItem.getDescricao());
            stmt.setInt(2, subGrupoItem.getGrupoItem().getCodigo());
            stmt.setInt(3, subGrupoItem.getCodigo());

            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void remover(SubGrupoItem subGrupoItem) {
        Connection con = new Conexao().criarConexao();
        String sql = "delete from subgrupoitem where codigo = ?";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, subGrupoItem.getCodigo());

            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public SubGrupoItem buscarPorCodigo(Integer codigo) {
        SubGrupoItem subGrupoItem = null;
        GrupoItemDAO grupoItemDao = new GrupoItemDAOIMPL();
        Connection con = new Conexao().criarConexao();
        String sql = "select * from subgrupoitem where codigo = ?";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, codigo);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                subGrupoItem = new SubGrupoItem();
                subGrupoItem.setCodigo(rs.getInt("codigo"));
                subGrupoItem.setDescricao(rs.getString("descricao"));
                subGrupoItem.setGrupoItem(grupoItemDao.buscarPorCodigo(rs.getInt("grupoItem_codigo")));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return subGrupoItem;
    }

    @Override
    public List<SubGrupoItem> buscarTodos() {
        List<SubGrupoItem> subGrupoItens = new ArrayList<SubGrupoItem>();
        GrupoItemDAO grupoItemDao = new GrupoItemDAOIMPL();
        Connection con = new Conexao().criarConexao();
        String sql = "select * from subgrupoitem";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                SubGrupoItem subGrupoItem = new SubGrupoItem();
                subGrupoItem.setCodigo(rs.getInt("codigo"));
                subGrupoItem.setDescricao(rs.getString("descricao"));
                subGrupoItem.setGrupoItem(grupoItemDao.buscarPorCodigo(rs.getInt("grupoItem_codigo")));
                subGrupoItens.add(subGrupoItem);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return subGrupoItens;
    }

    @Override
    public List<SubGrupoItem> buscarPorDescricao(String descricao) {
        List<SubGrupoItem> subGrupoItens = new ArrayList<SubGrupoItem>();
        GrupoItemDAO grupoItemDao = new GrupoItemDAOIMPL();
        Connection con = new Conexao().criarConexao();
        String sql = "select * from subgrupoitem where descricao like ? ";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, "%"+descricao+"%");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                SubGrupoItem subGrupoItem = new SubGrupoItem();
                subGrupoItem.setCodigo(rs.getInt("codigo"));
                subGrupoItem.setDescricao(rs.getString("descricao"));
                subGrupoItem.setGrupoItem(grupoItemDao.buscarPorCodigo(rs.getInt("grupoItem_codigo")));
                subGrupoItens.add(subGrupoItem);
            }

        } catch (SQLException ex) {
        }
        return subGrupoItens;
    }
    
}
