package RESTAURANTE.DAO.IMPL;

import RESTAURANTE.DAO.ProdutoDAO;
import RESTAURANTE.MODEL.Produto;
import java.util.List;


public class ProdutoDAOIMPL implements ProdutoDAO {

    @Override
    public void inserir(Produto produto) {
        
    }

    @Override
    public void alterar(Produto produto) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void remover(Produto produto) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Produto buscarPorCodigo(Integer codigo) {
        throw new UnsupportedOperationException("Not supported yet.");
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
