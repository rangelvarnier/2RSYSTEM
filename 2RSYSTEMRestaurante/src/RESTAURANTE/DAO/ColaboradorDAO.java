
package RESTAURANTE.DAO;

import RESTAURANTE.MODEL.Colaborador;
import java.util.List;

public interface ColaboradorDAO {
        
    void inserir(Colaborador colaborador);
    void alterar(Colaborador colaborador);
    void remover(Colaborador colaborador);
    Colaborador buscaPorId(Integer codigo);
    List<Colaborador> buscarTodos();
    
}
