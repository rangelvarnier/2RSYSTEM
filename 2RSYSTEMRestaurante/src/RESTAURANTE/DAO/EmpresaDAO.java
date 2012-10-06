
package RESTAURANTE.DAO;

import RESTAURANTE.MODEL.Empresa;
import java.util.List;

public interface EmpresaDAO {
    void inserir(Empresa empresa);
    void alterar(Empresa empresa);
    void remover(Empresa empresa);
    Empresa buscarPorCodigo(Integer codigo);  
    Integer buscarIdMaior();
    List<Empresa> buscarTodos();
}
