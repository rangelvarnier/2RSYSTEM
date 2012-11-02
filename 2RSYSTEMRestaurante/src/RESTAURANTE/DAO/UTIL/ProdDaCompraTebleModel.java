package RESTAURANTE.DAO.UTIL;

import RESTAURANTE.MODEL.Produto;
import RESTAURANTE.MODEL.ProdutosDaCompra;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ProdDaCompraTebleModel extends AbstractTableModel {

    //constantes que vão representar as cada coluna
    //(só para facilitar o entendimento do código)
    private final int COL_COD = 0;
    private final int COL_NOME = 1;
    private final int COL_QUANT = 2;
    private final int COL_VALUNIT = 3;
    private final int COL_VALTOTAL = 4;
    //lista dos produtos que serão exibidos
    private List<ProdutosDaCompra> produtosDaCompra;
    private ProdutosDaCompra prodDaCompra;

    public ProdDaCompraTebleModel() {
        produtosDaCompra = new ArrayList();
    }

    public ProdDaCompraTebleModel(List<ProdutosDaCompra> lista) {
        this();
        produtosDaCompra.addAll(lista);
    }
    
    @Override
    public int getRowCount() {
        //cada produto da lista sera uma linha
        return produtosDaCompra.size();
    }

    @Override
    public int getColumnCount() {
        //vamos exibir Codigo, Nome produto, Quantidade, Valor Unitario e 
        //Total do produto então são 5 colunas
        return 5;
    }

    @Override
    public String getColumnName(int column) {
        // nome da coluna
        if (column == COL_COD) {
            return "Código";
        } else if (column == COL_NOME) {
            return "Produto";
        } else if (column == COL_QUANT) {
            return "Quantidade";
        } else if (column == COL_VALUNIT) {
            return "Preço UN";
        } else if (column == COL_VALTOTAL) {
            return "Total UN";
        }
        return "";

    }

    @Override
    public Class getColumnClass(int columnIndex) {
        //retorna a classe que representa a coluna
        if (columnIndex == COL_COD) {
            return Integer.class;
        } else if (columnIndex == COL_NOME) {
            return String.class;
        } else if (columnIndex == COL_QUANT) {
            return Float.class;
        } else if (columnIndex == COL_VALUNIT) {
            return Float.class;
        } else if (columnIndex == COL_VALTOTAL) {
            return Float.class;
        }
        return String.class;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        //pega o produto da linha
        ProdutosDaCompra prodCompra = produtosDaCompra.get(rowIndex);

        //verifica qual valor deve ser retornado
        if (columnIndex == COL_COD) {
            return prodCompra.getProduto().getCodigo();
        } else if (columnIndex == COL_NOME) {
            return prodCompra.getProduto().getDescricao();
        } else if (columnIndex == COL_QUANT) {
            return prodCompra.getQuantidade();
        } else if (columnIndex == COL_VALUNIT) {
            return prodCompra.getValorUnitario();
        } else if (columnIndex == COL_VALTOTAL) {
            return prodCompra.getValorTotal();
        }
        return "";
    }
    
    @Override
    public void setValueAt(Object value, int row, int col) {      
        Produto produto = null;
        //pega o produto da linha
        ProdutosDaCompra prodCompra = produtosDaCompra.get(row);
 
        //verifica qual valor vai ser alterado
       if (col == COL_QUANT) {
            prodCompra.setQuantidade(Float.parseFloat(value.toString()));
        } else if (col == COL_VALUNIT) {
            prodCompra.setValorUnitario(Float.parseFloat(value.toString()));
        } else if (col == COL_VALTOTAL) {
            prodCompra.setValorTotal(Float.parseFloat(value.toString()));
        }
         
        //avisa que os dados mudaram
        fireTableDataChanged();
    }
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        boolean status = false;
        if (columnIndex == COL_COD) {
            status = false;
        } else if (columnIndex == COL_NOME) {
            status = false;
        } else if (columnIndex == COL_QUANT) {
            status = true;
        } else if (columnIndex == COL_VALUNIT) {
            status = true;
        } else if (columnIndex == COL_VALTOTAL) {
            status =  false;
        }
        return status;
    }
    
    
    
    
    public void inserir (ProdutosDaCompra prodDaCompra){
        produtosDaCompra.add(prodDaCompra);
        fireTableDataChanged();
    }
    
    public void excluir(int pos) {
        produtosDaCompra.remove(pos);
        fireTableDataChanged();
    }
    
    public void excluir(ProdutosDaCompra prodDaCompra) {
        produtosDaCompra.remove(prodDaCompra);
        fireTableDataChanged();
    }
    
    
}
