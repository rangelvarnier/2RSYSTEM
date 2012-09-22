
package RESTAURANTE.DAO;

import RESTAURANTE.MODEL.Cidade;
import java.util.List;

public interface CidadeDAO {
    
    void inserir(Cidade cidade);
    void alterar(Cidade cidade);
    void remover(Cidade cidade);
    Cidade buscaPorId(Integer codigo);
    List<Cidade> buscarTodos();
    
}
