
package RESTAURANTE.DAO;

import RESTAURANTE.MODEL.Usuario;
import java.util.List;

public interface UsuarioDAO {
    
    void inserir(Usuario usuario);

    void alterar(Usuario usuario);

    void remover(Usuario usuario);

    Usuario buscarPorCodigo(Integer codigo);

    List<Usuario> buscarTodos();
    
}
