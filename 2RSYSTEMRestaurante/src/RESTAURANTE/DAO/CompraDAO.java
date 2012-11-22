
package RESTAURANTE.DAO;

import RESTAURANTE.MODEL.Compra;
import java.util.Date;
import java.util.List;

public interface CompraDAO {
    void inserir(Compra compra);
    void alterar(Compra compra);
    void remover(Compra compra);
    Compra buscarPorCodigo(Integer codigo);
    List<Compra> buscarTodos();
    List<Compra> buscarCampoPesquisa(String parametro); 
    List<Compra> buscarParametrosRelatorio(Integer fornecedor, Integer colaborador);
    List<Compra> buscarPorPeriodo(Date compraI, Date compraF);

}
