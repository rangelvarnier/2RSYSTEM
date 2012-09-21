package RESTAURANTE.DAO;

import RESTAURANTE.MODEL.GrupoItens;
import java.util.List;

public interface GrupoItensDAO {

    void inserir(GrupoItens grupoItens);

    void alterar(GrupoItens grupoItens);

    void remover(GrupoItens grupoItens);

    GrupoItens buscarPorDescricao(String descricao);

    GrupoItens buscarPorCodigo(Integer codigo);

    List<GrupoItens> buscarTodos();
    
}
