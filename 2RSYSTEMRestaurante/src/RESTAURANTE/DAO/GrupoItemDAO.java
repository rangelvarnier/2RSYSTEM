package RESTAURANTE.DAO;

import RESTAURANTE.MODEL.GrupoItem;
import java.util.List;

public interface GrupoItemDAO {

    void inserir(GrupoItem grupoItem);

    void alterar(GrupoItem grupoItem);

    void remover(GrupoItem grupoItem);

    GrupoItem buscarPorCodigo(Integer codigo);

    List<GrupoItem> buscarTodos();
}
