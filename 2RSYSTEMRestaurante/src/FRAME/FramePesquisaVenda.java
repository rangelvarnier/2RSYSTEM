
package FRAME;

import RESTAURANTE.DAO.IMPL.VendaDAOIMPL;
import RESTAURANTE.DAO.VendaDAO;
import RESTAURANTE.MODEL.Venda;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class FramePesquisaVenda extends javax.swing.JDialog {

    public FramePesquisaVenda() {
        initComponents();
        setLocation(290, 190);
        vendaDao = new VendaDAOIMPL();
        atualizaTabela();
        jtbVendas.setAutoResizeMode(jtbVendas.AUTO_RESIZE_OFF);  
        jtbVendas.getColumnModel().getColumn(0).setPreferredWidth(78);  
        jtbVendas.getColumnModel().getColumn(1).setPreferredWidth(99);
        jtbVendas.getColumnModel().getColumn(2).setPreferredWidth(186);
        jtbVendas.getColumnModel().getColumn(3).setPreferredWidth(186);
        jtbVendas.getColumnModel().getColumn(4).setPreferredWidth(98);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbVendas = new javax.swing.JTable();
        jbtPesquisar = new javax.swing.JButton();
        jtfPesquisar = new javax.swing.JTextField();
        jbtConfirmar = new javax.swing.JButton();
        jbtCancelar = new javax.swing.JButton();
        jdtDataFinal = new com.toedter.calendar.JDateChooser();
        jdtDataInicial = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();
        jrbData = new javax.swing.JRadioButton();
        jrbDocumento = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setTitle("Pesquisa de Vendas");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Pesquisa De Vendas");

        jtbVendas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        org.jdesktop.beansbinding.ELProperty eLProperty = org.jdesktop.beansbinding.ELProperty.create("${vendas}");
        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, eLProperty, jtbVendas);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codigo}"));
        columnBinding.setColumnName("Código");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${dataVenda}"));
        columnBinding.setColumnName("Data Compra");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cliente_codigo.pessoa.nome}"));
        columnBinding.setColumnName("Fornecedor");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${colaborador_codigo.pessoa.nome}"));
        columnBinding.setColumnName("Colaborador");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${valorVenda}"));
        columnBinding.setColumnName("Valor");
        columnBinding.setColumnClass(Float.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jtbVendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbVendasMouseClicked(evt);
            }
        });
        jtbVendas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtbVendasKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jtbVendas);

        jbtPesquisar.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jbtPesquisar.setText("Pesquisar");
        jbtPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtPesquisarActionPerformed(evt);
            }
        });

        jtfPesquisar.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jtfPesquisar.setToolTipText("Busca por: Fornecedor, data, colaborador, documento");
        jtfPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfPesquisarActionPerformed(evt);
            }
        });

        jbtConfirmar.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jbtConfirmar.setText("Confirmar");
        jbtConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtConfirmarActionPerformed(evt);
            }
        });

        jbtCancelar.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jbtCancelar.setText("Cancelar");
        jbtCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtCancelarActionPerformed(evt);
            }
        });

        jdtDataFinal.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N

        jdtDataInicial.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jrbData.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jrbData.setText("Pesquisar por data");
        jrbData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbDataActionPerformed(evt);
            }
        });

        jrbDocumento.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jrbDocumento.setText("Pesquisar por documento");
        jrbDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbDocumentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrbData)
                    .addComponent(jrbDocumento))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jrbData)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrbDocumento)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel2.setText("Data Inicial");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel3.setText("Data final");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jdtDataInicial, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                                        .addGap(167, 167, 167)))
                                .addComponent(jbtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jdtDataFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtConfirmar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtCancelar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jdtDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3))
                            .addComponent(jbtPesquisar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jdtDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtConfirmar)
                    .addComponent(jbtCancelar)))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtConfirmarActionPerformed
        if (jtbVendas.getSelectedRow() != -1) {
            venda = vendas.get(jtbVendas.getSelectedRow());
            dispose();
        }
    }//GEN-LAST:event_jbtConfirmarActionPerformed

    private void jbtCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jbtCancelarActionPerformed

    private void jbtPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtPesquisarActionPerformed
        executaPesquisa();
    }//GEN-LAST:event_jbtPesquisarActionPerformed

    private void jtbVendasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbVendasMouseClicked
        if (evt.getClickCount() == 2) {
            venda = vendas.get(jtbVendas.getSelectedRow());
            dispose();
        }
    }//GEN-LAST:event_jtbVendasMouseClicked

    private void jtfPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPesquisarActionPerformed
        executaPesquisa();
    }//GEN-LAST:event_jtfPesquisarActionPerformed

    private void jtbVendasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtbVendasKeyPressed
        if(evt.getKeyCode() == 10){
            venda = vendas.get(jtbVendas.getSelectedRow());
            dispose();
        }
    }//GEN-LAST:event_jtbVendasKeyPressed

    private void jrbDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbDataActionPerformed
        verificaRadioButton();
    }//GEN-LAST:event_jrbDataActionPerformed

    private void jrbDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbDocumentoActionPerformed
        verificaRadioButton();
    }//GEN-LAST:event_jrbDocumentoActionPerformed

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
            java.util.logging.Logger.getLogger(FramePesquisaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePesquisaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePesquisaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePesquisaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new FramePesquisaVenda().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtCancelar;
    private javax.swing.JButton jbtConfirmar;
    private javax.swing.JButton jbtPesquisar;
    private com.toedter.calendar.JDateChooser jdtDataFinal;
    private com.toedter.calendar.JDateChooser jdtDataInicial;
    private javax.swing.JRadioButton jrbData;
    private javax.swing.JRadioButton jrbDocumento;
    private javax.swing.JTable jtbVendas;
    private javax.swing.JTextField jtfPesquisar;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
    private Venda venda;
    private List<Venda> vendas;
    private VendaDAO vendaDao;
    private List<String> pesquisa;

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public List<Venda> getVendas() {
        return vendas;
    }

    public void setVendas(List<Venda> vendas) {
        List<Venda> vendasOld = this.vendas;
        this.vendas = vendas;
        firePropertyChange("vendas", vendasOld, this.vendas);
    }

    public void atualizaTabela() {
        setVendas(vendaDao.buscarTodos());
        if (vendaDao.buscarTodos().isEmpty()) {
        } else {
            jtbVendas.addRowSelectionInterval(0, 0);
        }
    }

    public Venda retornaVenda() {
        return this.venda;
    }

    private void executaPesquisa() {
        Venda vendaI = new Venda();
        Venda vendaF = new Venda();

        if (jrbDocumento.isSelected()) {
            /*
             * setCompras(compraDao.buscarCampoPesquisa(jtfPesquisar.getText()));
             * if
             * (compraDao.buscarCampoPesquisa(jtfPesquisar.getText()).isEmpty())
             * { } else { jtbCompras.addRowSelectionInterval(0, 0);
            }
             */
            pesquisaParametro(jtfPesquisar.getText());
        } else if (jrbData.isSelected()) {
            vendaI.setDataVenda(jdtDataInicial.getDate());
            vendaF.setDataVenda(jdtDataFinal.getDate());
            setVendas(vendaDao.buscarPorPeriodo(vendaI.getDataVenda(), vendaF.getDataVenda()));
            if (vendaDao.buscarPorPeriodo(vendaI.getDataVenda(), vendaF.getDataVenda()).isEmpty()) {
            } else {
                jtbVendas.addRowSelectionInterval(0, 0);
            }
        }
    }
    private void verificaRadioButton() {
        if (jrbDocumento.isSelected()) {
            jdtDataInicial.setEnabled(false);
            jdtDataFinal.setEnabled(false);
            jtfPesquisar.setEnabled(true);
        } else if (jrbData.isSelected()) {
            jdtDataInicial.setEnabled(true);
            jdtDataFinal.setEnabled(true);
            jtfPesquisar.setEnabled(false);
        }
    }

    private void defineParametrosPesquisa() {
        jrbData.setSelected(true);
        jdtDataInicial.setDate(new Date());
        jdtDataFinal.setDate(new Date());
        verificaRadioButton();
    }

    private void retornaPrimeiroDiaMes() {
        Calendar calendar = Calendar.getInstance();

        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMinimum(Calendar.DAY_OF_MONTH));
        final Date primeiroDia = new Date(calendar.getTimeInMillis());
        jdtDataInicial.setDate(primeiroDia);

        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
        final Date ultimoDia = new Date(calendar.getTimeInMillis());
        jdtDataFinal.setDate(ultimoDia);
    }

    private void concatenaDadosCompra() {
        pesquisa = new ArrayList<String>();

        for (Venda vend : vendas) {
            pesquisa.add(vend.getCodigo()
                    + " - " + vend.getCliente_codigo().getPessoa().getNome()
                    + " - " + vend.getColaborador_codigo().getPessoa().getNome());
        }
        int i = 0;
        while (i < pesquisa.size()) {
            System.out.println(pesquisa.get(i));
            i++;
        }
    }

    private void pesquisaParametro(String parametro) {
        int i = 0;
         String co = null;
        while (i < pesquisa.size()) {
            if(pesquisa.equals(parametro));
             co = pesquisa.get(i);
            i++;
        }
        System.out.println(co);
    }
}
