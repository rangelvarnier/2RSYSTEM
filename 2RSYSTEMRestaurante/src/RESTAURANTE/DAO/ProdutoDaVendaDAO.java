
package RESTAURANTE.DAO;

import RESTAURANTE.MODEL.ProdutosDaVenda;
import RESTAURANTE.MODEL.Venda;
import java.util.List;

public interface ProdutoDaVendaDAO {
        void inserir(ProdutosDaVenda produtosDaVenda);

        void alterar(ProdutosDaVenda produtosDaVenda);

        void remover(ProdutosDaVenda produtosDaVenda);

        void removerAllProdutosDaCompra(ProdutosDaVenda produtosDaVenda);

        ProdutosDaVenda buscarPorCodigo(Integer codigo);

        List<ProdutosDaVenda> buscarTodos();

        List<ProdutosDaVenda> buscarPorCompra(Venda venda);
}
