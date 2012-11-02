
package FRAME;

import RESTAURANTE.DAO.IMPL.ProdutoDAOIMPL;
import RESTAURANTE.DAO.IMPL.produtosDaVendaDAOIMPL;
import RESTAURANTE.DAO.ProdutoDAO;
import RESTAURANTE.DAO.VendaDAO;
import RESTAURANTE.DAO.produtosDaVendaDAO;
import RESTAURANTE.MODEL.Colaborador;
import RESTAURANTE.MODEL.Parceiro;
import RESTAURANTE.MODEL.Produto;
import RESTAURANTE.MODEL.ProdutosDaVenda;
import RESTAURANTE.MODEL.Venda;
import java.util.Date;
import java.util.List;
import org.jdesktop.observablecollections.ObservableCollections;

public class FrameVenda extends javax.swing.JFrame {

    public FrameVenda() {
        initComponents();
        venda = new Venda();
        produtodavenda = new ProdutosDaVenda();
        produtoDao = new ProdutoDAOIMPL();
        produtosDaVendaDao = new produtosDaVendaDAOIMPL();
        jftData.setDate(new Date());
        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jbtCancelar = new javax.swing.JButton();
        jbtNovo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jpn1 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jtfVendedor = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jtfCliente = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jtfCodigo = new javax.swing.JTextField();
        jftData = new com.toedter.calendar.JDateChooser();
        jbtPesquisaVendedor = new javax.swing.JButton();
        jbtPesquisaCliente = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtbVenda = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jbtExcluir1 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jbtCancelar1 = new javax.swing.JButton();
        jbtAdicionar = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        jtfVendedor1 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jtfProduto = new javax.swing.JTextField();
        jbtPesquisaProduto = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jtfQuantidade = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jtfValorUnitário = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jtfValorTotalItem = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Venda de Mercadoria");
        setLocation(new java.awt.Point(200, 100));
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setResizable(false);

        jbtCancelar.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jbtCancelar.setText("Sair");
        jbtCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtCancelarActionPerformed(evt);
            }
        });

        jbtNovo.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jbtNovo.setText("Novo");
        jbtNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtNovoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Hiragino Sans GB", 0, 24)); // NOI18N
        jLabel1.setText("Venda de Mercadoria");

        jpn1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.TRAILING, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Lucida Grande", 0, 12))); // NOI18N
        jpn1.setToolTipText("Cadastro");

        jLabel31.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel31.setText("Código");

        jtfVendedor.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${venda.colaborador_codigo.pessoa.nome}"), jtfVendedor, org.jdesktop.beansbinding.BeanProperty.create("text"), "");
        bindingGroup.addBinding(binding);

        jtfVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfVendedorActionPerformed(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel33.setText("Vendedor");

        jLabel35.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel35.setText("Cliente");

        jtfCliente.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${venda.cliente_codigo.pessoa.nome}"), jtfCliente, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jtfCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfClienteActionPerformed(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel37.setText("Data Venda");

        jtfCodigo.setEditable(false);
        jtfCodigo.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N

        jbtPesquisaVendedor.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jbtPesquisaVendedor.setText("Buscar");
        jbtPesquisaVendedor.setToolTipText("Pesquisa Vendedor");
        jbtPesquisaVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtPesquisaVendedorActionPerformed(evt);
            }
        });

        jbtPesquisaCliente.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jbtPesquisaCliente.setText("Buscar");
        jbtPesquisaCliente.setToolTipText("Pesquisa Vendedor");
        jbtPesquisaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtPesquisaClienteActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jpn1Layout = new org.jdesktop.layout.GroupLayout(jpn1);
        jpn1.setLayout(jpn1Layout);
        jpn1Layout.setHorizontalGroup(
            jpn1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jpn1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jpn1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel31)
                    .add(jtfCodigo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 106, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jpn1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jLabel37, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 128, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jftData, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                .add(18, 18, 18)
                .add(jpn1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel33)
                    .add(jpn1Layout.createSequentialGroup()
                        .add(jtfVendedor, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 195, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jbtPesquisaVendedor)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jpn1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jpn1Layout.createSequentialGroup()
                        .add(jtfCliente, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 201, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jbtPesquisaCliente))
                    .add(jLabel35))
                .addContainerGap())
        );
        jpn1Layout.setVerticalGroup(
            jpn1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jpn1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jpn1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel31)
                    .add(jLabel37)
                    .add(jLabel33)
                    .add(jLabel35))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jpn1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jpn1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(jtfCodigo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(jtfVendedor, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(jtfCliente, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(jbtPesquisaVendedor)
                        .add(jbtPesquisaCliente))
                    .add(jftData, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        org.jdesktop.beansbinding.ELProperty eLProperty = org.jdesktop.beansbinding.ELProperty.create("${produtosDasVendas}");
        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, eLProperty, jtbVenda);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${produto_codigo.descricao}"));
        columnBinding.setColumnName("Produto");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${quantidade}"));
        columnBinding.setColumnName("Quantidade");
        columnBinding.setColumnClass(Float.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${valorTotal}"));
        columnBinding.setColumnName("Valor Total");
        columnBinding.setColumnClass(Float.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${valorUnitario}"));
        columnBinding.setColumnName("Valor Unitario");
        columnBinding.setColumnClass(Float.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane2.setViewportView(jtbVenda);

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel9.setText("SubTotal:");

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N

        jbtExcluir1.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jbtExcluir1.setText("Excluir");

        jLabel16.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N

        jbtCancelar1.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jbtCancelar1.setText("Finalizar Venda");
        jbtCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtCancelar1ActionPerformed(evt);
            }
        });

        jbtAdicionar.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jbtAdicionar.setText("Adicionar");
        jbtAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtAdicionarActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel32.setText("Código");

        jtfVendedor1.setEditable(false);
        jtfVendedor1.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N

        jLabel34.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel34.setText("Produto");

        jtfProduto.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${produtodavenda.produto_codigo.descricao}"), jtfProduto, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jbtPesquisaProduto.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jbtPesquisaProduto.setText("Buscar");
        jbtPesquisaProduto.setToolTipText("Pesquisa Vendedor");
        jbtPesquisaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtPesquisaProdutoActionPerformed(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel36.setText("Quantidade");

        jtfQuantidade.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${produtodavenda.quantidade}"), jtfQuantidade, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel38.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel38.setText("Valor Unitário");

        jtfValorUnitário.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${produtodavenda.valorUnitario}"), jtfValorUnitário, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel39.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel39.setText("Total");

        jtfValorTotalItem.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${produtodavenda.valorTotal}"), jtfValorTotalItem, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jbtCancelar1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 179, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jbtExcluir1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 183, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 288, Short.MAX_VALUE)
                        .add(jLabel9)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jLabel16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 119, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jScrollPane2)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel1Layout.createSequentialGroup()
                                        .add(jLabel32)
                                        .add(58, 58, 58)
                                        .add(jLabel34))
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, jbtAdicionar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 179, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(119, 119, 119))
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(jtfVendedor1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 92, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jtfProduto)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jbtPesquisaProduto, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 71, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)))
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jtfQuantidade, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 129, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel36))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jtfValorUnitário, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 163, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel38))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(jLabel39)
                                .add(133, 133, 133))
                            .add(jtfValorTotalItem))))
                .addContainerGap())
            .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(jPanel1Layout.createSequentialGroup()
                    .add(0, 428, Short.MAX_VALUE)
                    .add(jLabel10)
                    .add(0, 429, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel32)
                    .add(jLabel34)
                    .add(jLabel36)
                    .add(jLabel38)
                    .add(jLabel39))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jtfVendedor1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jtfProduto, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jbtPesquisaProduto)
                    .add(jtfQuantidade, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jtfValorUnitário, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jtfValorTotalItem, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jbtAdicionar)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 283, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(jLabel9)
                        .add(jLabel16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 22, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(jbtCancelar1)
                        .add(jbtExcluir1)))
                .addContainerGap(41, Short.MAX_VALUE))
            .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(jPanel1Layout.createSequentialGroup()
                    .add(0, 219, Short.MAX_VALUE)
                    .add(jLabel10)
                    .add(0, 218, Short.MAX_VALUE)))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(0, 0, Short.MAX_VALUE)
                        .add(jLabel1))
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                                .add(jbtNovo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 103, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jbtCancelar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 103, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(0, 0, Short.MAX_VALUE))))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jpn1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(9, 9, 9)
                .add(jLabel1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jpn1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(20, 20, 20)
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jbtNovo)
                    .add(jbtCancelar)))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCancelarActionPerformed

        dispose();
        
    }//GEN-LAST:event_jbtCancelarActionPerformed

    private void jtfClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfClienteActionPerformed

    private void jbtPesquisaVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtPesquisaVendedorActionPerformed
        buscaVendedor();
    }//GEN-LAST:event_jbtPesquisaVendedorActionPerformed

    private void jbtPesquisaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtPesquisaClienteActionPerformed
        buscaCliente();
    }//GEN-LAST:event_jbtPesquisaClienteActionPerformed

    private void jbtNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtNovoActionPerformed
  
        
    }//GEN-LAST:event_jbtNovoActionPerformed

    private void jbtCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCancelar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtCancelar1ActionPerformed

    private void jtfVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfVendedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfVendedorActionPerformed

    private void jbtAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAdicionarActionPerformed
             
        produtodavenda.setVenda_codigo(venda);
        produtosDaVendaDao.inserir(produtodavenda);
        venda.setCodigo(1);
        venda.setDataVenda(jftData.getDate());
        vendaDao.inserir(venda); 
        atualizaTabela();
       
    }//GEN-LAST:event_jbtAdicionarActionPerformed

    private void jbtPesquisaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtPesquisaProdutoActionPerformed
        buscaProduto();
    }//GEN-LAST:event_jbtPesquisaProdutoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FrameVenda().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jbtAdicionar;
    private javax.swing.JButton jbtCancelar;
    private javax.swing.JButton jbtCancelar1;
    private javax.swing.JButton jbtExcluir1;
    private javax.swing.JButton jbtNovo;
    private javax.swing.JButton jbtPesquisaCliente;
    private javax.swing.JButton jbtPesquisaProduto;
    private javax.swing.JButton jbtPesquisaVendedor;
    private com.toedter.calendar.JDateChooser jftData;
    private javax.swing.JPanel jpn1;
    private javax.swing.JTable jtbVenda;
    private javax.swing.JTextField jtfCliente;
    private javax.swing.JTextField jtfCodigo;
    private javax.swing.JTextField jtfProduto;
    private javax.swing.JTextField jtfQuantidade;
    private javax.swing.JTextField jtfValorTotalItem;
    private javax.swing.JTextField jtfValorUnitário;
    private javax.swing.JTextField jtfVendedor;
    private javax.swing.JTextField jtfVendedor1;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
    private Venda venda;
    private List<Venda> vendas;
    private VendaDAO vendaDao;
    
   
    private ProdutosDaVenda produtodavenda;
    private List<ProdutosDaVenda> produtosDasVendas;
    private produtosDaVendaDAO produtosDaVendaDao;
    
    private Produto produto;
    private List<Produto> produtos;
    private ProdutoDAO produtoDao;

    public ProdutosDaVenda getProdutodavenda() {
        return produtodavenda;
    }

    public void setProdutodavenda(ProdutosDaVenda produtodavenda) {
        ProdutosDaVenda produtodavendaVelho = this.produtodavenda;
        this.produtodavenda = produtodavenda;
        firePropertyChange("produtodavenda", produtodavendaVelho, this.produtodavenda);
    }

    public List<ProdutosDaVenda> getProdutosDasVendas() {
        return produtosDasVendas;
    }

    public void setProdutosDasVendas(List<ProdutosDaVenda> produtosDasVendas) {
        List<ProdutosDaVenda> produtosDasVendasVelhos = this.produtosDasVendas;
        this.produtosDasVendas = ObservableCollections.observableList(produtosDasVendas);
        firePropertyChange("produtosDasVendas", produtosDasVendasVelhos, this.produtosDasVendas);
    }
    
    

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        Venda vendaVelho = this.venda;
        this.venda = venda;
        firePropertyChange("venda", vendaVelho, this.venda);
    }

    public List<Venda> getVendas() {
        return vendas;
    }

    public void setVendas(List<Venda> vendas) {
        List<Venda> vendasVelhos = this.vendas;
        this.vendas = ObservableCollections.observableList(vendas);
        firePropertyChange("vendas", vendasVelhos, this.vendas);
    }
    
    
    
    public void buscaVendedor() {
        //cria a tela de busca como modal
        FramePesquisaColaborador tela_busca = new FramePesquisaColaborador();
        tela_busca.setModal(true);
        //exibe
        tela_busca.setVisible(true);
        //recupera os dados
        Colaborador c = new Colaborador();
        c = tela_busca.retornaColaborador();
        this.venda.setColaborador_codigo(c);

        if (venda.getColaborador_codigo() != null) {
            jtfVendedor.setText(venda.getColaborador_codigo().getPessoa().getNome());
        }
    }
     public void buscaCliente() {
        //cria a tela de busca como modal
        FramePesquisaCliente tela_busca = new FramePesquisaCliente();
        tela_busca.setModal(true);
        //exibe
        tela_busca.setVisible(true);
        //recupera os dados
        Parceiro p = new Parceiro();
        p = tela_busca.retornaParceiro();
        this.venda.setCliente_codigo(p);

        if (venda.getCliente_codigo() != null) {
            jtfCliente.setText(venda.getCliente_codigo().getPessoa().getNome());
        }
    }
     public void buscaProduto() {
        //cria a tela de busca como modal
        FramePesquisaProduto tela_busca = new FramePesquisaProduto();
        tela_busca.setModal(true);
        //exibe
        tela_busca.setVisible(true);
        //recupera os dados
        Produto p = new Produto();
        p = tela_busca.getProduto();
        this.produtodavenda.setProduto_codigo(p);

        if (produtodavenda.getProduto_codigo() != null) {
            jtfProduto.setText(produtodavenda.getProduto_codigo().getDescricao());
        }
    }
     public void atualizaTabela() {
        setProdutosDasVendas(produtosDaVendaDao.buscarTodos());
        setProdutosDasVendas(getProdutosDasVendas());
        if (produtosDaVendaDao.buscarTodos().isEmpty()) {
        } else {
            jtbVenda.addRowSelectionInterval(0, 0);
        }
    }
  

}
