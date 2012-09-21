package RESTAURANTE.DAO;

import RESTAURANTE.MODEL.Produto;
import java.util.List;

public interface ProdutoDAO {
     void inserir(Produto produto);

    void alterar(Produto produto);

    void remover(Produto produto);

    Produto buscarPorDescricao(String descricao);

    Produto buscarPorCodigo(Integer codigo);

    List<Produto> buscarTodos();
}
