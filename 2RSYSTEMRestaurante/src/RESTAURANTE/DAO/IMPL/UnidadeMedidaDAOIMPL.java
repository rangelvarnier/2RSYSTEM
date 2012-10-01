/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package RESTAURANTE.DAO.IMPL;

import RESTAURANTE.DAO.UTIL.Conexao;
import RESTAURANTE.DAO.UnidadeMedidaDAO;
import RESTAURANTE.MODEL.UnidadeMedida;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Rangel
 */
public class UnidadeMedidaDAOIMPL implements UnidadeMedidaDAO{

    @Override
    public void inserir(UnidadeMedida unidadeMedida) {
        Connection con = new Conexao().criarConexao();
        String sql = "insert into unidademedida value(?, ?, ?)";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, unidadeMedida.getCodigo());
            stmt.setString(2, unidadeMedida.getDescricao());
            stmt.setString(3, unidadeMedida.getSigla());

            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void alterar(UnidadeMedida unidadeMedida) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void remover(UnidadeMedida unidadeMedida) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public UnidadeMedida buscarPorCodigo(Integer codigo) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<UnidadeMedida> buscaPorDescricao(String descricao) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<UnidadeMedida> buscarTodos() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
