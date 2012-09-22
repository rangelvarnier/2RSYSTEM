
package RESTAURANTE.DAO;

import RESTAURANTE.MODEL.Pessoa;
import java.util.List;

public interface PessoaDAO {
    
     void inserir(Pessoa pessoa);

    void alterar(Pessoa pessoa);

    void remover(Pessoa pessoa);

    Pessoa buscarPorCodigo(Integer codigo);

    List<Pessoa> buscarTodos();
    
}
