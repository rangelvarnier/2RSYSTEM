
package RESTAURANTE.MODEL;

public class GrupoColaborador {
    private Long codigo;
    private String descricao;

    public GrupoColaborador() {
    }

    public GrupoColaborador(Long codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    

}