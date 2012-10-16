package RESTAURANTE.DAO.IMPL;

import RESTAURANTE.DAO.ProdutoDaCompraDAO;
import RESTAURANTE.DAO.UTIL.Conexao;
import RESTAURANTE.MODEL.ProdutosDaCompra;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProdutoDaCompraDAOIMPL implements ProdutoDaCompraDAO {

    @Override
    public void inserir(ProdutosDaCompra produtosDaCompra) {
        Connection con = new Conexao().criarConexao();
        String sql = "insert into produtosdacompra value(?, ?, ?, ?, ?)";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, produtosDaCompra.getCompra().getCodigo());
            stmt.setInt(2, produtosDaCompra.getProduto().getCodigo());
            stmt.setFloat(3, produtosDaCompra.getQuantidade());
            stmt.setFloat(4, produtosDaCompra.getValorUnitario());
            stmt.setFloat(5, produtosDaCompra.getValorTotal());

            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void alterar(ProdutosDaCompra produtosDaCompra) {
        Connection con = new Conexao().criarConexao();
        String sql = "update produtosdacompra set quantidade = ?,"
                + " valorUnitario = ?, valorTotal = ?"
                + " where produto_codigo = ? and codigo_compra = ?";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setFloat(1, produtosDaCompra.getQuantidade());
            stmt.setFloat(2, produtosDaCompra.getValorUnitario());
            stmt.setFloat(3, produtosDaCompra.getValorTotal());
            stmt.setInt(4, produtosDaCompra.getProduto().getCodigo());
            stmt.setInt(5, produtosDaCompra.getCompra().getCodigo());

            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void remover(ProdutosDaCompra produtosDaCompra) {
     Connection con = new Conexao().criarConexao();
        String sql = "delete from produtosdacompra "
                + "where produto_codigo = ? and codigo_compra = ?";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, produtosDaCompra.getProduto().getCodigo());
            stmt.setInt(2, produtosDaCompra.getCompra().getCodigo());

            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public ProdutosDaCompra buscarPorCodigo(Integer codigo) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ProdutosDaCompra buscarTodos() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
