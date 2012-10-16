package RESTAURANTE.DAO.IMPL;

import RESTAURANTE.DAO.CompraDAO;
import RESTAURANTE.DAO.UTIL.Conexao;
import RESTAURANTE.MODEL.Compra;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

public class CompraDAOIMPL implements CompraDAO {

    @Override
    public void inserir(Compra compra) {
        Connection con = new Conexao().criarConexao();
        String sql = "insert into compra value(?, ?, ?, ?, ?)";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, compra.getCodigo());
            if (compra.getDataCompra() != null) {
                stmt.setDate(2, new java.sql.Date(compra.getDataCompra().getTime()));
            } else {
                stmt.setNull(2, Types.DATE);
            }
            stmt.setFloat(3, compra.getValorCompra());
            stmt.setInt(4, compra.getFornecedor().getCodigo());
            stmt.setInt(5, compra.getColaborador().getCodigo());

            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void alterar(Compra compra) {
        Connection con = new Conexao().criarConexao();
        String sql = "update compra set dataCompra = ?, valorCompra = ?,"
                + " fornecedor_codigo = ?, colaborador_codigo = ?,"
                + "where codigo = ?)";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);

            if (compra.getDataCompra() != null) {
                stmt.setDate(1, new java.sql.Date(compra.getDataCompra().getTime()));
            } else {
                stmt.setNull(1, Types.DATE);
            }
            stmt.setFloat(2, compra.getValorCompra());
            stmt.setInt(3, compra.getFornecedor().getCodigo());
            stmt.setInt(4, compra.getColaborador().getCodigo());
            stmt.setInt(5, compra.getCodigo());

            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void remover(Compra compra) {
        Connection con = new Conexao().criarConexao();
        String sql = "delete from compra"
                + " where codigo = ?)";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, compra.getCodigo());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public Compra buscarPorCodigo(Integer codigo) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Compra> buscarTodos() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
