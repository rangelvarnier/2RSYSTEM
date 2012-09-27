package RESTAURANTE.DAO;

import RESTAURANTE.MODEL.SubGrupoItem;
import java.util.List;

public interface SubGrupoItemDAO {

    void inserir(SubGrupoItem subGrupoItem);

    void alterar(SubGrupoItem subGrupoItem);

    void remover(SubGrupoItem subGrupoItem);

    SubGrupoItem buscarPorCodigo(Integer codigo);

    List<SubGrupoItem> buscarTodos();
}
