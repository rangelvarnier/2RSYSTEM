package RESTAURANTE.MODEL;

public class SubGrupoItens {
    
    private Integer codigo;
    private String descricao;
    private GrupoItem grupoItens;

    public SubGrupoItens(Integer codigo, String descricao, GrupoItem grupoItens) {
        setCodigo(codigo);
        setDescricao(descricao);
        setGrupoItens(grupoItens);
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

    public GrupoItem getGrupoItens() {
        return grupoItens;
    }

    public void setGrupoItens(GrupoItem grupoItens) {
        this.grupoItens = grupoItens;
    }

    
    
}
