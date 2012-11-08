package RESTAURANTE.DAO.IMPL;

import RESTAURANTE.DAO.CompraDAO;
import RESTAURANTE.DAO.ProdutoDAO;
import RESTAURANTE.DAO.ProdutoDaCompraDAO;
import RESTAURANTE.DAO.UTIL.Conexao;
import RESTAURANTE.MODEL.Compra;
import RESTAURANTE.MODEL.ProdutosDaCompra;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
        ProdutosDaCompra produtoDaCompra = null;
        CompraDAO compraDao = new CompraDAOIMPL();
        ProdutoDAO produtoDao = new ProdutoDAOIMPL();
        Connection con = new Conexao().criarConexao();
        String sql = "select * from produtosdacompra where compra_codigo = ?";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, codigo);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                produtoDaCompra = new ProdutosDaCompra();
                produtoDaCompra.setCompra(compraDao.buscarPorCodigo(rs.getInt("compra_codigo")));
                produtoDaCompra.setProduto(produtoDao.buscarPorCodigo(rs.getInt("produto_codigo")));
                produtoDaCompra.setQuantidade(rs.getFloat("quantidade"));
                produtoDaCompra.setValorUnitario(rs.getFloat("valorUnitario"));
                produtoDaCompra.setValorTotal(rs.getFloat("valorTotal"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return produtoDaCompra;
    }

    @Override
    public List<ProdutosDaCompra> buscarTodos() {
        List<ProdutosDaCompra> produtosDaCompra = new ArrayList<ProdutosDaCompra>();
        CompraDAO compraDao = new CompraDAOIMPL();
        ProdutoDAO produtoDao = new ProdutoDAOIMPL();
        Connection con = new Conexao().criarConexao();
        String sql = "select * from produtosdacompra";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                ProdutosDaCompra produtoDaCompra = new ProdutosDaCompra();
                produtoDaCompra.setCompra(compraDao.buscarPorCodigo(rs.getInt("compra_codigo")));
                produtoDaCompra.setProduto(produtoDao.buscarPorCodigo(rs.getInt("produto_codigo")));
                produtoDaCompra.setQuantidade(rs.getFloat("quantidade"));
                produtoDaCompra.setValorUnitario(rs.getFloat("valorUnitario"));
                produtoDaCompra.setValorTotal(rs.getFloat("valorTotal"));
                produtosDaCompra.add(produtoDaCompra);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return produtosDaCompra;
    }

    @Override
    public void removerAllProdutosDaCompra(ProdutosDaCompra produtosDaCompra) {
        Connection con = new Conexao().criarConexao();
        String sql = "delete from produtosdacompra where compra_codigo =?";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, produtosDaCompra.getCompra().getCodigo());

            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public List<ProdutosDaCompra> buscarPorCompra(Compra compra) {
        List<ProdutosDaCompra> produtosDaCompra = new ArrayList<ProdutosDaCompra>();
        CompraDAO compraDao = new CompraDAOIMPL();
        ProdutoDAO produtoDao = new ProdutoDAOIMPL();
        Connection con = new Conexao().criarConexao();
        String sql = "select * from produtosdacompra where compra_codigo =?";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            System.out.println(compra.getCodigo());
            stmt.setInt(1, compra.getCodigo());
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                ProdutosDaCompra produtoDaCompra = new ProdutosDaCompra();
                produtoDaCompra.setCompra(compraDao.buscarPorCodigo(rs.getInt("compra_codigo")));
                produtoDaCompra.setProduto(produtoDao.buscarPorCodigo(rs.getInt("produto_codigo")));
                produtoDaCompra.setQuantidade(rs.getFloat("quantidade"));
                produtoDaCompra.setValorUnitario(rs.getFloat("valorUnitario"));
                produtoDaCompra.setValorTotal(rs.getFloat("valorTotal"));
                produtosDaCompra.add(produtoDaCompra);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return produtosDaCompra;
    }
}
