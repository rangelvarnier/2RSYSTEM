package RESTAURANTE.MODEL;

public class SubGrupoItens {
    
    private Integer codigo;
    private String descricao;
    private GrupoItens grupoItens;

    public SubGrupoItens(Integer codigo, String descricao, GrupoItens grupoItens) {
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

    public GrupoItens getGrupoItens() {
        return grupoItens;
    }

    public void setGrupoItens(GrupoItens grupoItens) {
        this.grupoItens = grupoItens;
    }

    
    
}
