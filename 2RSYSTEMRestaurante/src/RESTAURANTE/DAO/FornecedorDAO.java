package RESTAURANTE.DAO;

import RESTAURANTE.MODEL.Fornecedor;
import java.util.List;

public interface FornecedorDAO {

    void inserir(Fornecedor fornecedor);

    void alterar(Fornecedor fornecedor);

    void remover(Fornecedor fornecedor);

    Fornecedor buscarPorCodigo(Integer codigo);

    List<Fornecedor> buscarPorDescricao(String descricao);

    List<Fornecedor> buscarTodos();
}
