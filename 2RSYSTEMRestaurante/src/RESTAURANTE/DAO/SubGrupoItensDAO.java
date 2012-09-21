package RESTAURANTE.DAO;

import RESTAURANTE.MODEL.SubGrupoItens;
import java.util.List;


public interface SubGrupoItensDAO {
    
    void inserir(SubGrupoItens subGrupoItens);
    
    void alterar(SubGrupoItens subGrupoItens);
    
    void remover(SubGrupoItens subGrupoItens);
    
    SubGrupoItens buscarPorDescricao(String descricao);
 
    SubGrupoItens buscarPorCodigo(Integer codigo);
    
    List<SubGrupoItens> buscarTodos();
    
}
