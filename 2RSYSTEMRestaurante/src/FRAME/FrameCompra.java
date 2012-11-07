package FRAME;

import RESTAURANTE.DAO.CompraDAO;
import RESTAURANTE.DAO.IMPL.CompraDAOIMPL;
import RESTAURANTE.DAO.IMPL.ProdutoDaCompraDAOIMPL;
import RESTAURANTE.DAO.ProdutoDAO;
import RESTAURANTE.DAO.ProdutoDaCompraDAO;
import RESTAURANTE.MODEL.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.table.DefaultTableModel;

public class FrameCompra extends javax.swing.JFrame {

    public FrameCompra() {
        initComponents();
        novaCompra();
        tableModel = new DefaultTableModel();
        compraDao = new CompraDAOIMPL();
        produtoDaCompraDao = new ProdutoDaCompraDAOIMPL();
        produtosDaCompra = new ArrayList<ProdutosDaCompra>();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbtNovo = new javax.swing.JButton();
        jbtSalvar = new javax.swing.JButton();
        jbtAlterar = new javax.swing.JButton();
        jbtExcluir = new javax.swing.JButton();
        jbtSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbProdutosCompra = new javax.swing.JTable();
        jtfValorCompra = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jtfColaborador = new javax.swing.JTextField();
        jbtColaborador = new javax.swing.JButton();
        jtfFornecedor = new javax.swing.JTextField();
        jbtPesquisaFornecedor = new javax.swing.JButton();
        jdcDataCompra = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jtfCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Compra de Mercadoria");
        setResizable(false);

        jbtNovo.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jbtNovo.setText("Novo");
        jbtNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtNovoActionPerformed(evt);
            }
        });

        jbtSalvar.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jbtSalvar.setText("Salvar");
        jbtSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSalvarActionPerformed(evt);
            }
        });

        jbtAlterar.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jbtAlterar.setText("Alterar");

        jbtExcluir.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jbtExcluir.setText("Excluir");
        jbtExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtExcluirActionPerformed(evt);
            }
        });

        jbtSair.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jbtSair.setText("Sair");
        jbtSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSairActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Hiragino Sans GB", 0, 24)); // NOI18N
        jLabel1.setText("Compra de Mercadoria");

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jtbProdutosCompra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Produto", "Quantidade", "Valor UN", "Valor Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtbProdutosCompra.setColumnSelectionAllowed(true);
        jtbProdutosCompra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtbProdutosCompraKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jtbProdutosCompra);
        jtbProdutosCompra.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jtbProdutosCompra.getColumnModel().getColumn(0).setResizable(false);
        jtbProdutosCompra.getColumnModel().getColumn(1).setResizable(false);
        jtbProdutosCompra.getColumnModel().getColumn(2).setResizable(false);
        jtbProdutosCompra.getColumnModel().getColumn(3).setResizable(false);
        jtbProdutosCompra.getColumnModel().getColumn(4).setResizable(false);

        jtfValorCompra.setEditable(false);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Valor da Compra");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("F3 busca produtos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(753, 753, 753)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfValorCompra))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 940, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfValorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jtfColaborador.setEditable(false);
        jtfColaborador.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N

        jbtColaborador.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jbtColaborador.setText("Colaborador");
        jbtColaborador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtColaboradorActionPerformed(evt);
            }
        });

        jtfFornecedor.setEditable(false);
        jtfFornecedor.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N

        jbtPesquisaFornecedor.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jbtPesquisaFornecedor.setText("Fornecedor");
        jbtPesquisaFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtPesquisaFornecedorActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel3.setText("Data Compra");

        jtfCodigo.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel2.setText("Código");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jdcDataCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(59, 59, 59)
                        .addComponent(jLabel3)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtPesquisaFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfColaborador, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtColaborador, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2))
                            .addComponent(jbtPesquisaFornecedor, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jdcDataCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jbtColaborador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jtfColaborador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtfFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtSair, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtSalvar)
                    .addComponent(jbtNovo)
                    .addComponent(jbtAlterar)
                    .addComponent(jbtExcluir)
                    .addComponent(jbtSair)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtPesquisaFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtPesquisaFornecedorActionPerformed
        buscaFornecedor();
    }//GEN-LAST:event_jbtPesquisaFornecedorActionPerformed

    private void jbtColaboradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtColaboradorActionPerformed
        buscaColaborador();
    }//GEN-LAST:event_jbtColaboradorActionPerformed

    private void jbtSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSairActionPerformed
        dispose();
    }//GEN-LAST:event_jbtSairActionPerformed

    private void jbtNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtNovoActionPerformed
        novaCompra();
        limpaCampos();

    }//GEN-LAST:event_jbtNovoActionPerformed

    private void jbtSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSalvarActionPerformed
        //insere compra
        try {
            compra.setCodigo(Integer.valueOf(jtfCodigo.getText()));
            compra.setDataCompra(jdcDataCompra.getDate());

            compraDao.inserir(compra);
            for (ProdutosDaCompra prod : this.produtosDaCompra) {
                prod.setCompra(compra);
                produtoDaCompraDao.inserir(prod);
            }
            
            JOptionPane.showMessageDialog(null, "Documento Salvo com Sucesso");
            novaCompra();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Campo não preenchido \n" + e.getMessage());
        }



    }//GEN-LAST:event_jbtSalvarActionPerformed

    private void jtbProdutosCompraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtbProdutosCompraKeyPressed

        //pega tecla enter mas aplica função da tecla tab
        InputMap imap = jtbProdutosCompra.getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
        imap.put(KeyStroke.getKeyStroke("pressed ENTER"), "selectNextColumnCell");

        int linha = jtbProdutosCompra.getSelectedRow();
        int coluna = jtbProdutosCompra.getSelectedColumn();
        //seta o foco na celula que esta sendo editada
        jtbProdutosCompra.setSurrendersFocusOnKeystroke(true);
        //se for precionado F3 abre tela de pesquisa de produto
        if (evt.getKeyCode() == 114) {
            buscaProduto();
        } //se houver um enter na coluna 2 seta a quantidade no produto
        else if (evt.getKeyCode() == KeyEvent.VK_ENTER && jtbProdutosCompra.getSelectedColumn() == 2) {
            Object qtd = jtbProdutosCompra.getValueAt(linha, coluna);
            produtoDaCompra.setQuantidade(Float.parseFloat(String.valueOf(qtd)));
        } //se houver um enter na coluna 3 seta o valor UN do produto e calcula o total para a coluna 4
        else if (evt.getKeyCode() == KeyEvent.VK_ENTER && jtbProdutosCompra.getSelectedColumn() == 3) {
            Object unit = jtbProdutosCompra.getValueAt(linha, coluna);
            produtoDaCompra.setValorUnitario(Float.parseFloat(String.valueOf(unit)));
            jtbProdutosCompra.setValueAt(calculaTotalDoProduto(), linha, 4);
        } //se houver um enter na coluna 4 adiciona o item da linha na lista, cria nova linha e calcula o total da venda
        else if (evt.getKeyCode() == 10 && jtbProdutosCompra.getSelectedColumn() == 4) {
            produtosDaCompra.add(produtoDaCompra);
            inserirLinha();

            jtfValorCompra.setText(String.valueOf(calculaTotalCompra()));
        }

    }//GEN-LAST:event_jtbProdutosCompraKeyPressed

    private void jbtExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtExcluirActionPerformed
    }//GEN-LAST:event_jbtExcluirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameCompra().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtAlterar;
    private javax.swing.JButton jbtColaborador;
    private javax.swing.JButton jbtExcluir;
    private javax.swing.JButton jbtNovo;
    private javax.swing.JButton jbtPesquisaFornecedor;
    private javax.swing.JButton jbtSair;
    private javax.swing.JButton jbtSalvar;
    private com.toedter.calendar.JDateChooser jdcDataCompra;
    private javax.swing.JTable jtbProdutosCompra;
    private javax.swing.JTextField jtfCodigo;
    private javax.swing.JTextField jtfColaborador;
    private javax.swing.JTextField jtfFornecedor;
    private javax.swing.JTextField jtfValorCompra;
    // End of variables declaration//GEN-END:variables
    DefaultTableModel tableModel;
    private Compra compra;
    private CompraDAO compraDao;
    private Produto produto;
    private ProdutoDAO produtoDao;
    private List<ProdutosDaCompra> produtosDaCompra;
    private ProdutosDaCompra produtoDaCompra;
    private ProdutoDaCompraDAO produtoDaCompraDao;

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    private void novaCompra() {
        setCompra(new Compra(new Fornecedor(), new Colaborador(), new ArrayList<ProdutosDaCompra>()));
        limpaCampos();
        inserirLinha();
        compra.setValorCompra(0f);
    }

    private void limpaCampos() {
        jtfCodigo.setText("");
        jdcDataCompra.setDate(new Date());
        jtfFornecedor.setText("");
        jtfColaborador.setText("");
        jtfValorCompra.setText("");
    }

    public void buscaFornecedor() {
        //cria a tela de busca como modal
        FramePesquisaFornecedor tela_busca = new FramePesquisaFornecedor();
        tela_busca.setModal(true);
        //exibe
        tela_busca.setVisible(true);
        //recupera os dados
        Fornecedor f = new Fornecedor();
        f = tela_busca.retornaFornecedor();
        this.compra.setFornecedor(f);
        //seta na tela
        if (compra.getFornecedor() != null) {
            jtfFornecedor.setText(compra.getFornecedor().getRazaoSocial());
        }
    }

    public void buscaColaborador() {
        //cria a tela de busca como modal
        FramePesquisaColaborador tela_busca = new FramePesquisaColaborador();
        tela_busca.setModal(true);
        //exibe
        tela_busca.setVisible(true);
        //recupera os dados
        Colaborador c = new Colaborador();
        c = tela_busca.retornaColaborador();
        this.compra.setColaborador(c);
        //seta na tela
        if (compra.getColaborador() != null) {
            jtfColaborador.setText(compra.getColaborador().getPessoa().getNome());
        }
    }

    public void buscaProduto() {
        //instancia produto
        Produto p = new Produto();
        //instancia produto da compra
        produtoDaCompra = new ProdutosDaCompra();
        //cria a tela de busca como modal
        FramePesquisaProduto tela_busca = new FramePesquisaProduto();
        tela_busca.setModal(true);
        //exibe a tela de pesquisa do produto
        tela_busca.setVisible(true);
        //recupera os dados
        p = tela_busca.retornaProduto();
        //seta o produto para o produto da compra
        produtoDaCompra.setProduto(p);
        //seta na tela o produto da compra
        if (produtoDaCompra.getProduto() != null) {
            Integer linhaSelecionada = jtbProdutosCompra.getSelectedRow();
            jtbProdutosCompra.setValueAt(p.getCodigo(), linhaSelecionada, 0);
            jtbProdutosCompra.setValueAt(p.getDescricao(), linhaSelecionada, 1);
            jtbProdutosCompra.setValueAt(p.getPrecoVenda(), linhaSelecionada, 3);
        }
    }

    private Float calculaTotalDoProduto() {
        Float preco;
        Float quant;
        Float total = null;
        preco = produtoDaCompra.getValorUnitario();
        quant = produtoDaCompra.getQuantidade();
        total = quant * preco;
        produtoDaCompra.setValorTotal(total);
        return produtoDaCompra.getValorTotal();
    }

    private Float calculaTotalCompra() {
        compra.setValorCompra(produtoDaCompra.getValorTotal() + compra.getValorCompra());
        return compra.getValorCompra();
    }

    private void inserirLinha() {
        int linha = jtbProdutosCompra.getSelectedRow();
        ((DefaultTableModel) jtbProdutosCompra.getModel()).addRow(new Vector());
        int coluna = -1;
        jtbProdutosCompra.changeSelection(linha, coluna, false, false);
    }

    private void defineSaldoEstoque() {
        produtoDaCompra.getProduto().setSaldoEstoque(produtoDaCompra.getQuantidade());
    }
}
