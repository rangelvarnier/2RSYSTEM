
package RESTAURANTE.DAO.IMPL;

import RESTAURANTE.DAO.ColaboradorDAO;
import RESTAURANTE.DAO.ParceiroDAO;
import RESTAURANTE.DAO.UTIL.Conexao;
import RESTAURANTE.DAO.VendaDAO;
import RESTAURANTE.MODEL.Venda;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class VendaDAOIMPL implements VendaDAO{

    @Override
    public void inserir(Venda venda) {
       Connection con = new Conexao().criarConexao();
        String sql = "insert into venda value(?, ?, ?, ?, ?)";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, venda.getCodigo());           
            stmt.setDate(2, new java.sql.Date(venda.getDataVenda().getTime()));
            stmt.setFloat(3, venda.getValorVenda());
            stmt.setInt(4, venda.getCliente_codigo().getCodigo());
            stmt.setInt(5, venda.getColaborador_codigo().getCodigo());

            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void alterar(Venda venda) {
        Connection con = new Conexao().criarConexao();
        String sql = "update venda set dataVenda = ?, valorVenda = ?, cliente_codigo = ?, colaborador_codigo = ?"
                + " where codigo = ?";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setDate(1, new java.sql.Date(venda.getDataVenda().getTime()));
            stmt.setFloat(2, venda.getValorVenda());
            stmt.setInt(3, venda.getCliente_codigo().getCodigo());
            stmt.setInt(4, venda.getColaborador_codigo().getCodigo());
            stmt.setInt(5, venda.getCodigo());

            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }

    @Override
    public void remover(Venda venda) {
        Connection con = new Conexao().criarConexao();
        String sql = "delete from venda"
                + " where codigo = ?";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, venda.getCodigo());
            stmt.executeUpdate();
        } catch (SQLException ex) {
        }
    }

    @Override
    public Venda buscaPorId(Integer codigo) {
        Venda venda = null;
        ColaboradorDAO colaboradorDao = new ColaboradorDAOIMPL();
        ParceiroDAO parceiroDao = new ParceiroDAOIMPL();
        Connection con = new Conexao().criarConexao();
        String sql = "select * from venda"
                + " where codigo = ?";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setLong(1, codigo);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                venda = new Venda();
                venda.setCodigo(rs.getInt("codigo"));
                venda.setDataVenda(rs.getDate("dataVenda"));
                venda.setValorVenda(rs.getFloat("valorVenda"));
                venda.setCliente_codigo(parceiroDao.buscaPorId(rs.getInt("cliente_codigo")));
                venda.setColaborador_codigo(colaboradorDao.buscaPorId(rs.getInt("colaborador_codigo")));
            }

        } catch (SQLException ex) {
        }
        return venda;
    }

    @Override
    public Integer buscaIdMaio() {
        Integer idmaior = null;
        Connection con = new Conexao().criarConexao();
        String sql = "select max(codigo) as codigo from venda";
        PreparedStatement stmt;
        try {
            stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            rs.next();
            idmaior = rs.getInt("codigo");

            rs.close();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(ColaboradorDAOIMPL.class.getName()).log(Level.SEVERE, null, ex);
        }

        return idmaior;
    }

    @Override
    public List<Venda> buscarTodos() {
        List<Venda> vendas = new ArrayList<Venda>();
        ColaboradorDAO colaboradorDao = new ColaboradorDAOIMPL();
        ParceiroDAO parceiroDao = new ParceiroDAOIMPL();

        Connection con = new Conexao().criarConexao();
        String sql = "select * from venda";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Venda venda = new Venda();
                venda.setCodigo(rs.getInt("codigo"));
                venda.setDataVenda(rs.getDate("dataVenda"));
                venda.setValorVenda(rs.getFloat("valorVenda"));
                venda.setCliente_codigo(parceiroDao.buscaPorId(rs.getInt("cliente_codigo")));
                venda.setColaborador_codigo(colaboradorDao.buscaPorId(rs.getInt("colaborador_codigo")));

                vendas.add(venda);
            }

        } catch (SQLException ex) {
        }
        return vendas;
    }

    
    
}
