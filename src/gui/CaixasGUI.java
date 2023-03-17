package gui;


import dao.CaixasDAO;
import dao.ClienteDAO;
import dao.ProdutoDAO;
import factory.ConnectionFactory;
import java.awt.Toolkit;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Caixas;
import java.sql.ResultSet;

public class CaixasGUI extends javax.swing.JFrame {
    
    double valorT = 0;
    
    public CaixasGUI() {
        initComponents();
        valoresComboxProduto();
        valoresComboxCliente();
        setSize(Toolkit.getDefaultToolkit().getScreenSize());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        boderUsuario1 = new gui.boderUsuario();
        jPanel8 = new javax.swing.JPanel();
        somar1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cbNomeCliente = new javax.swing.JComboBox<>();
        txfIdCliente = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txfIdProduto = new javax.swing.JTextField();
        cbProdutos = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txfQuantidade = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txfValorU = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txfValorTotal = new javax.swing.JTextField();
        apagar = new javax.swing.JButton();
        txfData = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jbCancel = new javax.swing.JButton();
        confirmarCompra = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cbFormaPagamento = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtVendas = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        jMenu5.setText("File");
        jMenuBar2.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar2.add(jMenu6);

        jMenu7.setText("jMenu7");

        jMenu8.setText("jMenu8");

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Caixa", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 48))); // NOI18N

        boderUsuario1.setBackground(new java.awt.Color(248, 248, 255));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        somar1.setBackground(new java.awt.Color(102, 255, 102));
        somar1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        somar1.setForeground(new java.awt.Color(0, 0, 0));
        somar1.setText("Somar");
        somar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                somar1ActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Cliente:");

        cbNomeCliente.setBackground(new java.awt.Color(255, 255, 255));
        cbNomeCliente.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        cbNomeCliente.setForeground(new java.awt.Color(0, 0, 0));
        cbNomeCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o cliente" }));
        cbNomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNomeClienteActionPerformed(evt);
            }
        });

        txfIdCliente.setBackground(new java.awt.Color(255, 255, 255));
        txfIdCliente.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txfIdCliente.setForeground(new java.awt.Color(0, 0, 0));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Produto:");

        txfIdProduto.setBackground(new java.awt.Color(255, 255, 255));
        txfIdProduto.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txfIdProduto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfIdProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txfIdProduto.setPreferredSize(new java.awt.Dimension(64, 64));
        txfIdProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfIdProdutoActionPerformed(evt);
            }
        });

        cbProdutos.setBackground(new java.awt.Color(255, 255, 255));
        cbProdutos.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        cbProdutos.setForeground(new java.awt.Color(0, 0, 0));
        cbProdutos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o produto" }));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Quantidade de produtos:");

        txfQuantidade.setBackground(new java.awt.Color(255, 255, 255));
        txfQuantidade.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txfQuantidade.setForeground(new java.awt.Color(0, 0, 0));
        txfQuantidade.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfQuantidade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txfQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfQuantidadeActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Valor Unitario:");

        txfValorU.setBackground(new java.awt.Color(255, 255, 255));
        txfValorU.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txfValorU.setForeground(new java.awt.Color(0, 0, 0));
        txfValorU.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfValorU.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txfValorU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfValorUActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Valor total");

        txfValorTotal.setBackground(new java.awt.Color(255, 255, 255));
        txfValorTotal.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txfValorTotal.setForeground(new java.awt.Color(0, 0, 0));
        txfValorTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfValorTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txfValorTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfValorTotalActionPerformed(evt);
            }
        });

        apagar.setBackground(new java.awt.Color(255, 255, 51));
        apagar.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        apagar.setForeground(new java.awt.Color(0, 0, 0));
        apagar.setText("Apagar");
        apagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apagarActionPerformed(evt);
            }
        });

        txfData.setBackground(new java.awt.Color(255, 255, 255));
        txfData.setForeground(new java.awt.Color(0, 0, 0));
        try {
            txfData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txfData.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfData.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Data Venda:");

        jbCancel.setBackground(new java.awt.Color(255, 51, 51));
        jbCancel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jbCancel.setForeground(new java.awt.Color(0, 0, 0));
        jbCancel.setText("Cancelar");
        jbCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelActionPerformed(evt);
            }
        });

        confirmarCompra.setBackground(new java.awt.Color(0, 204, 204));
        confirmarCompra.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        confirmarCompra.setForeground(new java.awt.Color(0, 0, 0));
        confirmarCompra.setText("Confirmar");
        confirmarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarCompraActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Forma de pagamento:");

        cbFormaPagamento.setBackground(new java.awt.Color(255, 255, 255));
        cbFormaPagamento.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        cbFormaPagamento.setForeground(new java.awt.Color(0, 0, 0));
        cbFormaPagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cartão de crédito", "Cartão de débito", "Dinheiro vivo", "Cheque a vista", "Cheque a prazo", "A prazo no carnê" }));
        cbFormaPagamento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(txfQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txfValorU, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txfValorTotal, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(somar1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(txfIdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbProdutos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txfData, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(cbFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                                .addComponent(txfIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbNomeCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbCancel, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(apagar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(confirmarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbNomeCliente)
                    .addComponent(txfIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txfIdProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(cbProdutos))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txfValorU)
                    .addComponent(txfQuantidade, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(somar1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfData, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(88, 88, 88)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apagar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        boderUsuario1.add(jPanel8);
        jPanel8.setBounds(10, 10, 490, 700);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jtVendas.setBackground(new java.awt.Color(255, 255, 255));
        jtVendas.setForeground(new java.awt.Color(0, 0, 0));
        jtVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código  Produto", "Produto", "Quantidade", "Valor unitário"
            }
        ));
        jtVendas.setSelectionForeground(new java.awt.Color(204, 255, 255));
        jScrollPane1.setViewportView(jtVendas);
        if (jtVendas.getColumnModel().getColumnCount() > 0) {
            jtVendas.getColumnModel().getColumn(0).setResizable(false);
            jtVendas.getColumnModel().getColumn(1).setResizable(false);
            jtVendas.getColumnModel().getColumn(2).setResizable(false);
            jtVendas.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Vendas");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        boderUsuario1.add(jPanel2);
        jPanel2.setBounds(540, 10, 640, 700);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(boderUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 1190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(boderUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(170, Short.MAX_VALUE))
        );

        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void txfValorTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfValorTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfValorTotalActionPerformed

    private void confirmarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarCompraActionPerformed
        
        Caixas caixas = new Caixas();
        caixas.setIdCliente(Integer.parseInt(txfIdCliente.getText()));
        caixas.setDataVenda(txfData.getText());
        caixas.setValorTotal(Double.parseDouble(txfValorTotal.getText()));
        caixas.setNomeCliente(cbNomeCliente.getSelectedItem().toString());
        caixas.setFormaPagamento(cbFormaPagamento.getSelectedItem().toString()); 
        CaixasDAO dao = new CaixasDAO();
        dao.adiciona(caixas);
        JOptionPane.showMessageDialog(null, "Compra inserido com sucesso! ");
        

    }//GEN-LAST:event_confirmarCompraActionPerformed

    private void jbCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelActionPerformed
        txfValorU.setText("");
        txfQuantidade.setText("");
        txfData.setText("");
        txfIdProduto.setText("");
        cbNomeCliente.setSelectedItem(0);
        txfValorTotal.setText("");

    }//GEN-LAST:event_jbCancelActionPerformed

    private void txfIdProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfIdProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfIdProdutoActionPerformed

    private void cbNomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNomeClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbNomeClienteActionPerformed

    private void txfQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfQuantidadeActionPerformed

    private void txfValorUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfValorUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfValorUActionPerformed

    private void apagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apagarActionPerformed

        txfValorU.setText("");
        txfQuantidade.setText("");
        txfData.setText("");
        txfIdProduto.setText("");
        txfIdCliente.setText("");
        cbNomeCliente.setSelectedItem(0);
        txfValorTotal.setText("");
    }//GEN-LAST:event_apagarActionPerformed

    
    public void valoresComboxCliente() {
        Vector<Integer> idCliente = new Vector<Integer>();
        try {
            java.sql.Connection connection = new ConnectionFactory().getConnection();
            ClienteDAO clienteDao = new ClienteDAO();
            connection = new ConnectionFactory().getConnection();
            ResultSet rs = clienteDao.listarComboBox();

            while (rs.next()) {
                idCliente.addElement(rs.getInt(1));
                cbNomeCliente.addItem(rs.getString(2));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro no ComboBox");
        }
    }
    
    public void valoresComboxProduto() {
        Vector<Integer> idProduto = new Vector<Integer>();
        try {
            java.sql.Connection connection = new ConnectionFactory().getConnection();
            ProdutoDAO produtoDao = new ProdutoDAO();
            connection = new ConnectionFactory().getConnection();
            ResultSet rs = produtoDao.listarComboBox();

            while (rs.next()) {
                idProduto.addElement(rs.getInt(1));
                cbProdutos.addItem(rs.getString(2));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro no ComboBox");
        }
    }


    private void somar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_somar1ActionPerformed
        //Puxando o valor das caixa
        double valorU = Double.parseDouble(txfValorU.getText());

        double quantidade = Double.parseDouble(txfQuantidade.getText());

        //Somando o valor da Unidade com o Total
        valorU = quantidade * valorU;
        valorT = valorU + valorT;
        //Transferindo o resultado para texto
        double valorTDouble = valorT;
        String ValorTString = String.valueOf(valorTDouble);
        txfValorTotal.setText(ValorTString);

        //Inserindo informações na tabela
        DefaultTableModel modelo = (DefaultTableModel) jtVendas.getModel();
        Object[] dados = {txfIdProduto.getText(), cbProdutos.getSelectedItem().toString(), txfQuantidade.getText(), txfValorU.getText()};
        modelo.addRow(dados);

        //Apagando texto ruim
        cbProdutos.setSelectedItem(0);
        txfValorU.setText("");
        txfQuantidade.setText("");
        txfIdProduto.setText("");
    }//GEN-LAST:event_somar1ActionPerformed

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
            java.util.logging.Logger.getLogger(CaixasGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CaixasGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CaixasGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CaixasGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CaixasGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton apagar;
    private gui.boderUsuario boderUsuario1;
    private javax.swing.JComboBox<String> cbFormaPagamento;
    private javax.swing.JComboBox<String> cbNomeCliente;
    private javax.swing.JComboBox<String> cbProdutos;
    private javax.swing.JButton confirmarCompra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton jbCancel;
    private javax.swing.JTable jtVendas;
    private javax.swing.JButton somar1;
    private javax.swing.JFormattedTextField txfData;
    private javax.swing.JTextField txfIdCliente;
    private javax.swing.JTextField txfIdProduto;
    private javax.swing.JTextField txfQuantidade;
    private javax.swing.JTextField txfValorTotal;
    private javax.swing.JTextField txfValorU;
    // End of variables declaration//GEN-END:variables
}
