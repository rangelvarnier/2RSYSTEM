
package RESTAURANTE.DAO;

import RESTAURANTE.MODEL.GrupoColaborador;
import java.util.List;

public interface GrupoColaboradorDAO {
     void inserir(GrupoColaborador grupoColaborador);
     void alterar(GrupoColaborador grupoColaborador);
     void remover(GrupoColaborador grupoColaborador);
     GrupoColaborador buscaPorId(Long codigo);
     List<GrupoColaborador> buscarTodos();  
    
}
