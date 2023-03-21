package gui;

import dao.ClienteDAO;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;

public class ClienteGUI extends javax.swing.JFrame {

    public ClienteGUI() {
        initComponents();
        setSize(Toolkit.getDefaultToolkit().getScreenSize());
        leiaJTable();
    }

    public void leiaJTable() {
        DefaultTableModel modelo = (DefaultTableModel) jtCliente.getModel();
        modelo.setNumRows(0);//evida duplicar os resultadas ao cadastrar um item
        ClienteDAO dao = new ClienteDAO();
        for (Cliente cliente : dao.leitura()) {
            modelo.addRow(new Object[]{
                cliente.getIdCliente(),
                cliente.getNomeCliente(),
                cliente.getCpfCliente(),
                cliente.getCepCliente(),
                cliente.getEderecoCliente(),
                cliente.getTelefoneCliente()
                
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        boderUsuario1 = new gui.boderUsuario();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtNomeClient = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCpf = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCep = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        btCadastro = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtCliente = new javax.swing.JTable();
        btAtualizar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Clientes", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 48))); // NOI18N

        boderUsuario1.setBackground(new java.awt.Color(248, 248, 255));
        boderUsuario1.add(jLabel1);
        jLabel1.setBounds(40, 130, 0, 0);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nome:");

        txtNomeClient.setBackground(new java.awt.Color(255, 255, 255));
        txtNomeClient.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtNomeClient.setForeground(new java.awt.Color(0, 0, 0));
        txtNomeClient.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNomeClient.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNomeClient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNomeClientMousePressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("CPF:");

        txtCpf.setBackground(new java.awt.Color(255, 255, 255));
        txtCpf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtCpf.setForeground(new java.awt.Color(0, 0, 0));
        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###_##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCpf.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("CEP:");

        txtCep.setBackground(new java.awt.Color(255, 255, 255));
        txtCep.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtCep.setForeground(new java.awt.Color(0, 0, 0));
        txtCep.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCep.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtCep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCepMousePressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Endereço:");

        txtEndereco.setBackground(new java.awt.Color(255, 255, 255));
        txtEndereco.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtEndereco.setForeground(new java.awt.Color(0, 0, 0));
        txtEndereco.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEndereco.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtEndereco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtEnderecoMousePressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Telefone:");

        txtTelefone.setBackground(new java.awt.Color(255, 255, 255));
        txtTelefone.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtTelefone.setForeground(new java.awt.Color(0, 0, 0));
        txtTelefone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTelefone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtTelefone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtTelefoneMousePressed(evt);
            }
        });

        btCadastro.setBackground(new java.awt.Color(51, 204, 0));
        btCadastro.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btCadastro.setForeground(new java.awt.Color(0, 0, 0));
        btCadastro.setText("Cadastro");
        btCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastroActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 0));
        jButton1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Limpa");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCpf, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNomeClient)
                    .addComponent(txtCep)
                    .addComponent(txtEndereco)
                    .addComponent(txtTelefone)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addComponent(btCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeClient, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        boderUsuario1.add(jPanel2);
        jPanel2.setBounds(10, 10, 320, 670);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jtCliente.setBackground(new java.awt.Color(255, 255, 255));
        jtCliente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jtCliente.setForeground(new java.awt.Color(0, 0, 0));
        jtCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "CPF", "CEP", "Endereço", "Telefone"
            }
        ));
        jtCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jtCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtCliente);

        btAtualizar.setBackground(new java.awt.Color(0, 255, 255));
        btAtualizar.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btAtualizar.setForeground(new java.awt.Color(0, 0, 0));
        btAtualizar.setText("Atualizar");
        btAtualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btAtualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btAtualizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btAtualizarMouseExited(evt);
            }
        });
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });

        btExcluir.setBackground(new java.awt.Color(255, 0, 0));
        btExcluir.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btExcluir.setForeground(new java.awt.Color(0, 0, 0));
        btExcluir.setText("Excluir");
        btExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btExcluirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btExcluirMouseExited(evt);
            }
        });
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Clientes cadastrados");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        boderUsuario1.add(jPanel3);
        jPanel3.setBounds(360, 10, 630, 670);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(boderUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 997, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(150, Short.MAX_VALUE)
                .addComponent(boderUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(155, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTelefoneMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTelefoneMousePressed
        txtTelefone.setText("");
    }//GEN-LAST:event_txtTelefoneMousePressed

    private void txtEnderecoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEnderecoMousePressed
        txtEndereco.setText("");
    }//GEN-LAST:event_txtEnderecoMousePressed

    private void txtCepMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCepMousePressed
        txtCep.setText("");
    }//GEN-LAST:event_txtCepMousePressed

    private void txtNomeClientMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNomeClientMousePressed
        txtNomeClient.setText("");
    }//GEN-LAST:event_txtNomeClientMousePressed

    private void btCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastroActionPerformed
        Cliente cliente = new Cliente();
        cliente.setNomeCliente(txtNomeClient.getText());
        cliente.setCpfCliente(txtCpf.getText());
        cliente.setCepCliente(txtCep.getText());
        cliente.setEderecoCliente(txtEndereco.getText());
        cliente.setTelefoneCliente(txtTelefone.getText());

        if ((txtNomeClient.getText().isEmpty()) || (txtCpf.getText().isEmpty()) || (txtCep.getText().isEmpty()) || (txtEndereco.getText().isEmpty()) || (txtTelefone.getText().isEmpty())) {
            JOptionPane.showMessageDialog(null, " Os campos não podem retornar vazios ");
        } else {

            ClienteDAO dao = new ClienteDAO();
            dao.adiciona(cliente);
            JOptionPane.showMessageDialog(null, " Cliente " + txtNomeClient.getText() + " inserido com sucesso! ");
        }

        txtNomeClient.setText("");
        txtCpf.setText("");
        txtCep.setText("");
        txtEndereco.setText("");
        txtTelefone.setText("");
        leiaJTable();
    }//GEN-LAST:event_btCadastroActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        if (jtCliente.getSelectedRow() != -1) {

            Cliente cliente = new Cliente();
            cliente.setNomeCliente(txtNomeClient.getText());
            cliente.setCpfCliente(txtCpf.getText());
            cliente.setCepCliente(txtCep.getText());
            cliente.setEderecoCliente(txtEndereco.getText());
            cliente.setTelefoneCliente(txtTelefone.getText());

            cliente.setIdCliente((int) jtCliente.getValueAt(jtCliente.getSelectedRow(), 0));
            if ((txtNomeClient.getText().isEmpty()) || (txtCpf.getText().isEmpty()) || (txtCep.getText().isEmpty()) || (txtEndereco.getText().isEmpty()) || (txtTelefone.getText().isEmpty())) {
                JOptionPane.showMessageDialog(null, "O campo não pode retornar vazio");
            } else {
                ClienteDAO dao = new ClienteDAO();
                dao.delete(cliente);
                JOptionPane.showMessageDialog(null, " Cliente " + txtNomeClient.getText() + " atualizado com sucesso! ");
            }
        }
        txtNomeClient.setText("");
        txtCpf.setText("");
        txtCep.setText("");
        txtEndereco.setText("");
        txtTelefone.setText("");
        leiaJTable();
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btExcluirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btExcluirMouseExited
        btExcluir.setBackground(Color.red);
        btExcluir.setBackground(Color.white);
    }//GEN-LAST:event_btExcluirMouseExited

    private void btExcluirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btExcluirMouseEntered
        btExcluir.setBackground(Color.white);
        btExcluir.setBackground(Color.red);
    }//GEN-LAST:event_btExcluirMouseEntered

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
        if (jtCliente.getSelectedRow() != -1) {

            Cliente cliente = new Cliente();
            cliente.setNomeCliente(txtNomeClient.getText());
            cliente.setCpfCliente(txtCpf.getText());
            cliente.setCepCliente(txtCep.getText());
            cliente.setEderecoCliente(txtEndereco.getText());
            cliente.setTelefoneCliente(txtTelefone.getText());

            cliente.setIdCliente((int) jtCliente.getValueAt(jtCliente.getSelectedRow(), 0));
            if ((txtNomeClient.getText().isEmpty()) || (txtCpf.getText().isEmpty()) || (txtCep.getText().isEmpty()) || (txtEndereco.getText().isEmpty()) || (txtTelefone.getText().isEmpty())) {
                JOptionPane.showMessageDialog(null, "O campo não pode retornar vazio");
            } else {
                ClienteDAO dao = new ClienteDAO();
                dao.update(cliente);
                JOptionPane.showMessageDialog(null, " Cliente " + txtNomeClient.getText() + " atualizado com sucesso! ");
            }
        }
        txtNomeClient.setText("");
        txtCpf.setText("");
        txtCep.setText("");
        txtEndereco.setText("");
        txtTelefone.setText("");
        leiaJTable();
    }//GEN-LAST:event_btAtualizarActionPerformed

    private void btAtualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAtualizarMouseExited
        btAtualizar.setBackground(Color.green);
        btAtualizar.setBackground(Color.white);
    }//GEN-LAST:event_btAtualizarMouseExited

    private void btAtualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAtualizarMouseEntered
        btAtualizar.setBackground(Color.white);
        btAtualizar.setBackground(Color.green);
    }//GEN-LAST:event_btAtualizarMouseEntered

    private void jtClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtClienteMouseClicked
        if (jtCliente.getSelectedRow() != -1) {
            txtNomeClient.setText(jtCliente.getValueAt(jtCliente.getSelectedRow(), 1).toString());
            txtCpf.setText(jtCliente.getValueAt(jtCliente.getSelectedRow(), 2).toString());
            txtCep.setText(jtCliente.getValueAt(jtCliente.getSelectedRow(), 3).toString());
            txtEndereco.setText(jtCliente.getValueAt(jtCliente.getSelectedRow(), 4).toString());
            txtTelefone.setText(jtCliente.getValueAt(jtCliente.getSelectedRow(), 5).toString());
        }
    }//GEN-LAST:event_jtClienteMouseClicked

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
            java.util.logging.Logger.getLogger(ClienteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private gui.boderUsuario boderUsuario1;
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btCadastro;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtCliente;
    private javax.swing.JTextField txtCep;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNomeClient;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
