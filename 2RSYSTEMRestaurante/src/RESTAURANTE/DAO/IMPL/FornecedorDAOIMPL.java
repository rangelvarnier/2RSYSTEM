package RESTAURANTE.DAO.IMPL;

import RESTAURANTE.DAO.FornecedorDAO;
import RESTAURANTE.DAO.PessoaDAO;
import RESTAURANTE.DAO.UTIL.Conexao;
import RESTAURANTE.MODEL.Fornecedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class FornecedorDAOIMPL implements FornecedorDAO {

    @Override
    public void inserir(Fornecedor fornecedor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void alterar(Fornecedor fornecedor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void remover(Fornecedor fornecedor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Fornecedor buscarPorCodigo(Integer codigo) {
        Fornecedor fornecedor = null;
        PessoaDAO pessoaDao = new PessoaDAOIMPL();
        Connection con = new Conexao().criarConexao();
        String sql = "select * from fornecedor where codigo = ?";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, codigo);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                fornecedor = new Fornecedor();
                fornecedor.setCodigo(rs.getInt("codigo"));
                fornecedor.setNomeFantasia(rs.getString("nomeFantasia"));
                fornecedor.setRazaoSocial(rs.getString("razaoSocial"));
                fornecedor.setCnpj(rs.getString("cnpj"));
                fornecedor.setInscEstadual(rs.getString("inscEstadual"));
                fornecedor.setDataFuncacao(rs.getDate("dataFundacao"));
                fornecedor.setDataCadastro(rs.getDate("dataCadastro"));
                fornecedor.setPessoa(pessoaDao.buscarPorCodigo(rs.getInt("pessoa_codigo")));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return fornecedor;
    }

    @Override
    public List<Fornecedor> buscarPorDescricao(String descricao) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Fornecedor> buscarTodos() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
