
package RESTAURANTE.MODEL;

import java.util.Date;

public class Venda {
    private Integer codigo;
    private Date dataVenda;
    private Float valorVenda;
    private Parceiro cliente_codigo;
    private Colaborador colaborador_codigo;

    public Venda() {
    }

    public Venda(Integer codigo, Date dataVenda, Float valorVenda, Parceiro cliente_codigo, Colaborador colaborador_codigo) {
        this.codigo = codigo;
        this.dataVenda = dataVenda;
        this.valorVenda = valorVenda;
        this.cliente_codigo = cliente_codigo;
        this.colaborador_codigo = colaborador_codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public Float getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(Float valorVenda) {
        this.valorVenda = valorVenda;
    }

    public Parceiro getCliente_codigo() {
        return cliente_codigo;
    }

    public void setCliente_codigo(Parceiro cliente_codigo) {
        this.cliente_codigo = cliente_codigo;
    }

    public Colaborador getColaborador_codigo() {
        return colaborador_codigo;
    }

    public void setColaborador_codigo(Colaborador colaborador_codigo) {
        this.colaborador_codigo = colaborador_codigo;
    }
    
    
}
