package gui;

import dao.CaixasDAO;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Caixas;

public class CaixasGUI extends javax.swing.JFrame {
    
    double valorT = 0;
    
    public CaixasGUI() {
        initComponents();
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
        jbCancel = new javax.swing.JButton();
        confirmarCompra = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        cbFormaPagamento = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txfValorTotal = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        somar1 = new javax.swing.JButton();
        apagar = new javax.swing.JButton();
        txfNomeCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txfValorU = new javax.swing.JTextField();
        txfQuantidade = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txfIdProduto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txfNomeProduto = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txfData = new javax.swing.JFormattedTextField();
        jButton2 = new javax.swing.JButton();
        txfIdCliente = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        pesquisarCliente = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtVendas = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        jMenu5.setText("File");
        jMenuBar2.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar2.add(jMenu6);

        jMenu7.setText("jMenu7");

        jMenu8.setText("jMenu8");

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Caixa", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 36))); // NOI18N

        boderUsuario1.setBackground(new java.awt.Color(248, 248, 255));

        jbCancel.setBackground(new java.awt.Color(255, 51, 51));
        jbCancel.setForeground(new java.awt.Color(0, 0, 0));
        jbCancel.setText("Cancelar");
        jbCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelActionPerformed(evt);
            }
        });
        boderUsuario1.add(jbCancel);
        jbCancel.setBounds(10, 680, 159, 30);

        confirmarCompra.setBackground(new java.awt.Color(0, 204, 204));
        confirmarCompra.setForeground(new java.awt.Color(0, 0, 0));
        confirmarCompra.setText("Confirmar");
        confirmarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarCompraActionPerformed(evt);
            }
        });
        boderUsuario1.add(confirmarCompra);
        confirmarCompra.setBounds(420, 680, 170, 30);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        cbFormaPagamento.setBackground(new java.awt.Color(255, 255, 255));
        cbFormaPagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cartão de crédito", "Cartão de débito", "Dinheiro vivo", "Cheque a vista", "Cheque a prazo", "A prazo no carnê" }));
        cbFormaPagamento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Forma de pagamento:");

        txfValorTotal.setBackground(new java.awt.Color(255, 255, 255));
        txfValorTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfValorTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txfValorTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfValorTotalActionPerformed(evt);
            }
        });

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        somar1.setBackground(new java.awt.Color(102, 255, 102));
        somar1.setForeground(new java.awt.Color(0, 0, 0));
        somar1.setText("Somar");
        somar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                somar1ActionPerformed(evt);
            }
        });

        apagar.setBackground(new java.awt.Color(255, 255, 51));
        apagar.setForeground(new java.awt.Color(0, 0, 0));
        apagar.setText("Apagar");
        apagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apagarActionPerformed(evt);
            }
        });

        txfNomeCliente.setBackground(new java.awt.Color(255, 255, 255));
        txfNomeCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfNomeCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel3.setText("Cliente:");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        txfValorU.setBackground(new java.awt.Color(255, 255, 255));
        txfValorU.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfValorU.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txfValorU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfValorUActionPerformed(evt);
            }
        });

        txfQuantidade.setBackground(new java.awt.Color(255, 255, 255));
        txfQuantidade.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfQuantidade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txfQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfQuantidadeActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Valor Unitario:");

        txfIdProduto.setBackground(new java.awt.Color(255, 255, 255));
        txfIdProduto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfIdProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txfIdProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfIdProdutoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Data Venda:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Produto:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Quantidade:");

        txfNomeProduto.setBackground(new java.awt.Color(255, 255, 255));
        txfNomeProduto.setForeground(new java.awt.Color(0, 0, 0));
        txfNomeProduto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfNomeProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txfNomeProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfNomeProdutoActionPerformed(evt);
            }
        });

        jLabel10.setText("CodP");

        txfData.setBackground(new java.awt.Color(255, 255, 255));
        try {
            txfData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txfData.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButton2.setText("Pesquisar");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txfIdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txfNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfData, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txfQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txfValorU, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfIdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txfValorU)
                    .addComponent(txfData, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        txfIdCliente.setBackground(new java.awt.Color(255, 255, 255));
        txfIdCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfIdCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel11.setText("CodC");

        pesquisarCliente.setBackground(new java.awt.Color(153, 153, 153));
        pesquisarCliente.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        pesquisarCliente.setText("Pesquisar");
        pesquisarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel11))
                            .addComponent(txfIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addComponent(txfNomeCliente)
                                .addGap(0, 0, 0)
                                .addComponent(pesquisarCliente))))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(apagar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                        .addComponent(somar1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txfNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txfIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pesquisarCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(somar1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apagar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Valor total");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(cbFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(txfValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(cbFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(146, 146, 146)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txfValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        boderUsuario1.add(jPanel5);
        jPanel5.setBounds(10, 10, 600, 280);

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

        boderUsuario1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 340, 620, 310);

        jLabel12.setBackground(new java.awt.Color(102, 102, 102));
        jLabel12.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Vendas");
        jLabel12.setToolTipText("");
        jLabel12.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray));
        boderUsuario1.add(jLabel12);
        jLabel12.setBounds(-10, 310, 640, 30);

        jLabel5.setFont(new java.awt.Font("Vladimir Script", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Farmácia 12");
        boderUsuario1.add(jLabel5);
        jLabel5.setBounds(170, 670, 250, 40);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(boderUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(boderUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMenu1.setText("Cadastrar Vendas");

        jMenu4.setText("Cadastrar");
        jMenu1.add(jMenu4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Consultar Vendas");

        jMenu3.setText("Consultar");
        jMenu2.add(jMenu3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txfIdProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfIdProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfIdProdutoActionPerformed

    private void txfValorUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfValorUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfValorUActionPerformed

    private void apagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apagarActionPerformed
        
        txfValorU.setText("");
        txfQuantidade.setText("");
        txfData.setText("");
        txfIdProduto.setText("");
        txfIdCliente.setText("");
        txfNomeCliente.setText("");
        txfValorTotal.setText("");

    }//GEN-LAST:event_apagarActionPerformed

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
        Object[] dados = {txfIdProduto.getText(), txfNomeProduto.getText(), txfQuantidade.getText(), txfValorU.getText()};
        modelo.addRow(dados);

        //Apagando texto ruim
        txfNomeProduto.setText("");
        txfValorU.setText("");
        txfQuantidade.setText("");
        txfIdProduto.setText("");

    }//GEN-LAST:event_somar1ActionPerformed

    private void txfValorTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfValorTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfValorTotalActionPerformed

    private void txfQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfQuantidadeActionPerformed

    private void txfNomeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfNomeProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfNomeProdutoActionPerformed

    private void confirmarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarCompraActionPerformed
        
        Caixas caixas = new Caixas();
        caixas.setIdCliente(Integer.parseInt(txfIdCliente.getText()));
        caixas.setDataVenda(txfData.getText());
        caixas.setValorTotal(Double.parseDouble(txfValorTotal.getText()));
        caixas.setNomeCliente(txfNomeCliente.getText());
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
        txfNomeCliente.setText("");
        txfValorTotal.setText("");

    }//GEN-LAST:event_jbCancelActionPerformed

    private void pesquisarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarClienteActionPerformed
       	Caixas caixa = new Caixas();
                    // METODO DE PESQUISA CHAMA OS ATRIBUTOS INSTANCIADOS NA CLASSE BEANSCLIENTE()MOD SETANDO O BOTAO PESQUISA
	caixa.setIdCliente(Integer.parseInt(txfIdCliente.getText()));//SETA O BOTAO PESQUISAR PARA RECEBER TEXTO
	//BeansUsuario model = control.busUsuario(mod);//INSTANCIA A CLASSE BEANSCLIENTE AO MESMO TERMPO CHAMANDO A CLASSE BUSCLIENTE NA CLASSE BEANSUSUARIO
	//preencherTabela("select *from login where nome like'%" + mod.getPesquisar() + "%'");

    }//GEN-LAST:event_pesquisarClienteActionPerformed

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
    private javax.swing.JButton confirmarCompra;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton jbCancel;
    private javax.swing.JTable jtVendas;
    private javax.swing.JButton pesquisarCliente;
    private javax.swing.JButton somar1;
    private javax.swing.JFormattedTextField txfData;
    private javax.swing.JTextField txfIdCliente;
    private javax.swing.JTextField txfIdProduto;
    private javax.swing.JTextField txfNomeCliente;
    private javax.swing.JTextField txfNomeProduto;
    private javax.swing.JTextField txfQuantidade;
    private javax.swing.JTextField txfValorTotal;
    private javax.swing.JTextField txfValorU;
    // End of variables declaration//GEN-END:variables
}
