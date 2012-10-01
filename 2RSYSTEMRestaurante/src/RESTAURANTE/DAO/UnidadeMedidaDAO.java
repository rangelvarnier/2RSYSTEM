/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package RESTAURANTE.DAO;

import RESTAURANTE.MODEL.UnidadeMedida;
import java.util.List;

/**
 *
 * @author Rangel
 */
public interface UnidadeMedidaDAO {

    void inserir(UnidadeMedida unidadeMedida);

    void alterar(UnidadeMedida unidadeMedida);

    void remover(UnidadeMedida unidadeMedida);

    UnidadeMedida buscarPorCodigo(Integer codigo);

    List<UnidadeMedida> buscaPorDescricao(String descricao);
    
    List<UnidadeMedida> buscarTodos();
}
