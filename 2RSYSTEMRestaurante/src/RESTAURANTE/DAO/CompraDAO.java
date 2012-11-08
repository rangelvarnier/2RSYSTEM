/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package RESTAURANTE.DAO;

import RESTAURANTE.MODEL.Compra;
import java.util.List;

/**
 *
 * @author Rangel
 */
public interface CompraDAO {

    void inserir(Compra compra);

    void alterar(Compra compra);

    void remover(Compra compra);

    Compra buscarPorCodigo(Integer codigo);

    List<Compra> buscarTodos();
    
    List<Compra> buscarCampoPesquisa(String parametro);
}
