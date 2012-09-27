
package RESTAURANTE.DAO;

import RESTAURANTE.MODEL.Endereco;
import java.util.List;

public interface EnderecoDAO {
    void inserir(Endereco endereco);

    void alterar(Endereco endereco);

    void remover(Endereco endereco);

    Endereco buscarPorCodigo(Integer codigo);

    List<Endereco> buscarTodos();
    
}
