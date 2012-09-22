
package RESTAURANTE.DAO;

import RESTAURANTE.MODEL.GrupoColaborador;
import java.util.List;

public interface GrupoColaboradorDAO {
     void inserir(GrupoColaborador grupoColaboradores);
     void alterar(GrupoColaborador grupoColaboradores);
     void remover(GrupoColaborador grupoColaboradores);
     GrupoColaborador buscaPorId(Integer codigo);
     List<GrupoColaborador> buscarTodos();  
    
}
