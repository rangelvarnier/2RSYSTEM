package RESTAURANTE.DAO;

import RESTAURANTE.MODEL.ProdutosDaCompra;
import java.util.List;

public interface ProdutoDaCompraDAO {

    void inserir(ProdutosDaCompra produtosDaCompra);

    void alterar(ProdutosDaCompra produtosDaCompra);

    void remover(ProdutosDaCompra produtosDaCompra);

    ProdutosDaCompra buscarPorCodigo(Integer codigo);

    List<ProdutosDaCompra> buscarTodos();
}