package RESTAURANTE.DAO.IMPL;

import RESTAURANTE.DAO.FornecedorDAO;
import RESTAURANTE.DAO.ProdutoDAO;
import RESTAURANTE.DAO.SubGrupoItemDAO;
import RESTAURANTE.DAO.UTIL.Conexao;
import RESTAURANTE.DAO.UnidadeMedidaDAO;
import RESTAURANTE.MODEL.Fornecedor;
import RESTAURANTE.MODEL.GrupoItem;
import RESTAURANTE.MODEL.Produto;
import RESTAURANTE.MODEL.SubGrupoItem;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAOIMPL implements ProdutoDAO {

    @Override
    public void inserir(Produto produto) {
        Connection con = new Conexao().criarConexao();
        //String sql = "insert into produto value(?, ?, ?, ?, ?, ?, ?, ?, ?)";
        /*
        String sql = "insert into produto (codigo, codigoFabrica, descricao,"
                + "precoVenda, unidadeMedida_codigo, subGrupoItens_codigo, "
                + "fornecedor_codigo value(?, ?, ?, ?, ?, ?, ?) ";
        */
        String sql = "INSERT INTO `2rsitem`.`produto` (`codigo`, `codigoFabrica`,"
                + " `descricao`, `precoVenda`, `unidadeMedida_codigo`,"
                + " `subGrupoItens_codigo`, `fornecedor_codigo`)"
                + " VALUES (?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            /*
            stmt.setInt(1, produto.getCodigo());
            stmt.setString(2, produto.getCodigoFabrica());
            stmt.setString(3, produto.getDescricao());
            stmt.setFloat(4, produto.getPrecoVenda());
            stmt.setFloat(5, produto.getPrecoCompra());
            stmt.setFloat(6, produto.getSaldoEstoque());
            stmt.setInt(7, produto.getUnidadeMedida().getCodigo());
            stmt.setInt(8, produto.getSubGrupoItens().getCodigo());
            stmt.setInt(9, produto.getFornecedor().getCodigo());
            */
            
            stmt.setInt(1, produto.getCodigo());
            stmt.setString(2, produto.getCodigoFabrica());
            stmt.setString(3, produto.getDescricao());
            stmt.setFloat(4, produto.getPrecoVenda());
            stmt.setInt(5, produto.getUnidadeMedida().getCodigo());
            stmt.setInt(6, produto.getSubGrupoItens().getCodigo());
            stmt.setInt(7, produto.getFornecedor().getCodigo());
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
        UnidadeMedidaDAO unidadeMedidaDao = new UnidadeMedidaDAOIMPL();
        SubGrupoItemDAO subGrupoItemDao = new SubGrupoItensDAOIMPL();
        FornecedorDAO fornecedorDao = new FornecedorDAOIMPL();
        Connection con = new Conexao().criarConexao();
        String sql = "select * from produto where codigo = ?";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, produto.getCodigoFabrica());

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                produto = new Produto();
                produto.setCodigo(rs.getInt("codigoFabrica"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setPrecoVenda(rs.getFloat("precoVenda"));
                produto.setPrecoCompra(rs.getFloat("precoCompra"));
                produto.setSaldoEstoque(rs.getFloat("saldoEstoque"));
                produto.setUnidadeMedida(unidadeMedidaDao.buscarPorCodigo(rs.getInt("unidadeMedida_codigo")));
                produto.setSubGrupoItens(subGrupoItemDao.buscarPorCodigo(rs.getInt("subGrupoItens_codigo")));
                produto.setFornecedor(fornecedorDao.buscaPorId(rs.getInt("fornecedor_codigo")));
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return produto;
    }

    @Override
    public List<Produto> buscarPorDescricao(String descricao) {
        List<Produto> produtos = new ArrayList<Produto>();
        UnidadeMedidaDAO unidadeMedidaDao = new UnidadeMedidaDAOIMPL();
        SubGrupoItemDAO subGrupoItemDao = new SubGrupoItensDAOIMPL();
        FornecedorDAO fornecedorDao = new FornecedorDAOIMPL();
        Connection con = new Conexao().criarConexao();

        String sql = "select * from produto where descricao like ?";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, "%" + descricao + "%");

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Produto produto = new Produto();
                produto.setCodigo(rs.getInt("codigoFabrica"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setPrecoVenda(rs.getFloat("precoVenda"));
                produto.setPrecoCompra(rs.getFloat("precoCompra"));
                produto.setSaldoEstoque(rs.getFloat("saldoEstoque"));
                produto.setUnidadeMedida(unidadeMedidaDao.buscarPorCodigo(rs.getInt("unidadeMedida_codigo")));
                produto.setSubGrupoItens(subGrupoItemDao.buscarPorCodigo(rs.getInt("subGrupoItens_codigo")));
                produto.setFornecedor(fornecedorDao.buscaPorId(rs.getInt("fornecedor_codigo")));
                produtos.add(produto);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return produtos;
    }

    @Override
    public List<Produto> buscarTodos() {
        List<Produto> produtos = new ArrayList<Produto>();
        UnidadeMedidaDAO unidadeMedidaDao = new UnidadeMedidaDAOIMPL();
        SubGrupoItemDAO subGrupoItemDao = new SubGrupoItensDAOIMPL();
        FornecedorDAO fornecedorDao = new FornecedorDAOIMPL();
        Connection con = new Conexao().criarConexao();

        String sql = "select * from produto";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Produto produto = new Produto();

                produto.setCodigo(rs.getInt("codigo"));
                produto.setCodigoFabrica(rs.getString("codigoFabrica"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setPrecoVenda(rs.getFloat("precoVenda"));
                produto.setPrecoCompra(rs.getFloat("precoCompra"));
                produto.setSaldoEstoque(rs.getFloat("saldoEstoque"));
                produto.setUnidadeMedida(unidadeMedidaDao.buscarPorCodigo(rs.getInt("unidadeMedida_codigo")));
                produto.setSubGrupoItens(subGrupoItemDao.buscarPorCodigo(rs.getInt("subGrupoItens_codigo")));
                produto.setFornecedor(fornecedorDao.buscaPorId(rs.getInt("fornecedor_codigo")));
                produtos.add(produto);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return produtos;
    }

    @Override
    public List<Produto> buscarParametrosRelatorio(Integer fornecedor, Integer subgrupoitem) {
        Produto produto = null;
        List<Produto> produtos = new ArrayList<Produto>();
        UnidadeMedidaDAO unidadeMedidaDao = new UnidadeMedidaDAOIMPL();
        SubGrupoItemDAO subGrupoItemDao = new SubGrupoItensDAOIMPL();
        FornecedorDAO fornecedorDao = new FornecedorDAOIMPL();
        Connection con = new Conexao().criarConexao();
        String sql = "select * from produto where fornecedor_codigo = ? and subGrupoItens_codigo = ?;";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, fornecedor);
            stmt.setInt(2, subgrupoitem);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                produto = new Produto();
                produto.setCodigo(rs.getInt("codigoFabrica"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setPrecoVenda(rs.getFloat("precoVenda"));
                produto.setPrecoCompra(rs.getFloat("precoCompra"));
                produto.setSaldoEstoque(rs.getFloat("saldoEstoque"));
                produto.setUnidadeMedida(unidadeMedidaDao.buscarPorCodigo(rs.getInt("unidadeMedida_codigo")));
                produto.setSubGrupoItens(subGrupoItemDao.buscarPorCodigo(rs.getInt("subGrupoItens_codigo")));
                produto.setFornecedor(fornecedorDao.buscaPorId(rs.getInt("fornecedor_codigo")));
                produtos.add(produto);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return produtos;
    
    }
}
