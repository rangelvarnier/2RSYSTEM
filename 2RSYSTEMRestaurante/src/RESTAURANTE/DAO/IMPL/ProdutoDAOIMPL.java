package RESTAURANTE.DAO.IMPL;

import RESTAURANTE.DAO.ProdutoDAO;
import RESTAURANTE.DAO.UTIL.Conexao;
import RESTAURANTE.MODEL.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ProdutoDAOIMPL implements ProdutoDAO {

    @Override
    public void inserir(Produto produto) {
        Connection con = new Conexao().criarConexao();
        String sql = "insert into produto value(?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, produto.getCodigo());
            stmt.setString(2, produto.getCodigoFabrica());
            stmt.setString(3, produto.getDescricao());
            stmt.setFloat(4, produto.getPrecoVenda());
            stmt.setFloat(5, produto.getPrecoCompra());
            stmt.setFloat(6, produto.getSaldoEstoque());
            stmt.setInt(7, produto.getUnidadeMedida().getCodigo());
            stmt.setInt(8, produto.getSubGrupoItens().getCodigo());
            stmt.setInt(9, produto.getFornecedor().getCodigo());

            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void alterar(Produto produto) {
        Connection con = new Conexao().criarConexao();
        String sql = "update produto set codigoFabrica = ?, descricao = ?,"
                + "precoVenda = ?, precoCompra = ?, saldoEstoque = ?, "
                + "unidadeMedida_codigo = ?, subGrupoItens_codigo = ?,"
                + "fornecedor_codigo = ? where codigo = ?";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);


            stmt.setString(1, produto.getCodigoFabrica());
            stmt.setString(2, produto.getDescricao());
            stmt.setFloat(3, produto.getPrecoVenda());
            stmt.setFloat(4, produto.getPrecoCompra());
            stmt.setFloat(5, produto.getSaldoEstoque());
            stmt.setInt(6, produto.getUnidadeMedida().getCodigo());
            stmt.setInt(7, produto.getSubGrupoItens().getCodigo());
            stmt.setInt(8, produto.getFornecedor().getCodigo());
            stmt.setInt(9, produto.getCodigo());

            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void remover(Produto produto) {
        Connection con = new Conexao().criarConexao();
        String sql = "delete from produto where codigo = ?";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, produto.getCodigo());

            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public Produto buscarPorCodigo(Integer codigo) {
        Produto produto = null;
        Connection con = new Conexao().criarConexao();
        String sql = "select * from produto where codigo = ?";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);


            stmt.setString(1, produto.getCodigoFabrica());

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
              /*  produto = new Produto();
                produto.setCodigo();
                produto.setDescricao(rs.getString(""));
                produto.setPrecoVenda();
                produto.setPrecoCompra();
                produto.setSaldoEstoque();
                produto.setUnidadeMedida().getCodigo();
                produto.setSubGrupoItens().getCodigo();
                produto.setFornecedor().getCodigo();
                */

                stmt.executeUpdate();
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return produto;
    }

    @Override
    public List<Produto> buscarPorDescricao(String descricao) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Produto> buscarTodos() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
