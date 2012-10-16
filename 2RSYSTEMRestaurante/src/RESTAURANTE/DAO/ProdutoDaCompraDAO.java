package RESTAURANTE.DAO;

import RESTAURANTE.MODEL.ProdutosDaCompra;

public interface ProdutoDaCompraDAO {

    void inserir(ProdutosDaCompra produtosDaCompra);

    void alterar(ProdutosDaCompra produtosDaCompra);

    void remover(ProdutosDaCompra produtosDaCompra);

    ProdutosDaCompra buscarPorCodigo(Integer codigo);

    ProdutosDaCompra buscarTodos();
}
