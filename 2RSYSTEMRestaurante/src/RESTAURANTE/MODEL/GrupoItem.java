package RESTAURANTE.MODEL;

public class GrupoItem {

    private Integer codigo;
    private String descricao;

    public GrupoItem(Integer codigo, String descricao) {
        setCodigo(codigo);
        setDescricao(descricao);
    }

    public GrupoItem() {
    }
    

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {

        this.codigo = codigo;

    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {

        this.descricao = descricao;

    }
}
