package gui;

import dao.ProdutoDAO;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Produto;

public class ProdutoGUI extends javax.swing.JFrame {

    public ProdutoGUI() {
        initComponents();
        setSize(Toolkit.getDefaultToolkit().getScreenSize());
        leiaJTable();
    }

    public void leiaJTable() {
        DefaultTableModel modelo = (DefaultTableModel) jtProduto.getModel();
        modelo.setNumRows(0);//evida duplicar os resultadas ao cadastrar um item
        ProdutoDAO dao = new ProdutoDAO();
        for (Produto cliente : dao.leitura()) {
            modelo.addRow(new Object[]{
                cliente.getIdProduto(),
                cliente.getNomeProduto(),
                cliente.getMarcaProduto(),
                cliente.getValorProduto(),
                cliente.getQuantidadeProduto()
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        boderUsuario1 = new gui.boderUsuario();
        txtNomeProduto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMarcaProduto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPrecoProduto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtQuantidadeProduto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        btCadastrar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtProduto = new javax.swing.JTable();
        btAtualizar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Produtos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 36))); // NOI18N

        boderUsuario1.setBackground(new java.awt.Color(255, 255, 255));

        txtNomeProduto.setBorder(null);
        boderUsuario1.add(txtNomeProduto);
        txtNomeProduto.setBounds(20, 60, 200, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Nome:");
        boderUsuario1.add(jLabel3);
        jLabel3.setBounds(20, 30, 70, 30);

        txtMarcaProduto.setBorder(null);
        boderUsuario1.add(txtMarcaProduto);
        txtMarcaProduto.setBounds(20, 130, 200, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Marca");
        boderUsuario1.add(jLabel4);
        jLabel4.setBounds(20, 100, 70, 30);

        txtPrecoProduto.setBorder(null);
        txtPrecoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecoProdutoActionPerformed(evt);
            }
        });
        boderUsuario1.add(txtPrecoProduto);
        txtPrecoProduto.setBounds(20, 210, 200, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Preço:");
        boderUsuario1.add(jLabel5);
        jLabel5.setBounds(20, 180, 70, 30);

        txtQuantidadeProduto.setBorder(null);
        boderUsuario1.add(txtQuantidadeProduto);
        txtQuantidadeProduto.setBounds(20, 280, 200, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Quantidade:");
        boderUsuario1.add(jLabel6);
        jLabel6.setBounds(20, 250, 100, 30);
        boderUsuario1.add(jSeparator2);
        jSeparator2.setBounds(20, 90, 200, 3);
        boderUsuario1.add(jSeparator3);
        jSeparator3.setBounds(20, 162, 200, 3);
        boderUsuario1.add(jSeparator4);
        jSeparator4.setBounds(20, 240, 200, 10);
        boderUsuario1.add(jSeparator5);
        jSeparator5.setBounds(20, 312, 200, 10);

        btCadastrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btCadastrar.setText("Cadastrar");
        btCadastrar.setBorder(null);
        btCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });
        boderUsuario1.add(btCadastrar);
        btCadastrar.setBounds(10, 440, 100, 30);

        btLimpar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btLimpar.setText("Limpar");
        btLimpar.setBorder(null);
        btLimpar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boderUsuario1.add(btLimpar);
        btLimpar.setBounds(140, 440, 100, 30);

        jtProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Produto", "Nome", "Marca", "Preço", "Quantidade"
            }
        ));
        jtProduto.setGridColor(new java.awt.Color(255, 255, 255));
        jtProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtProdutoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtProduto);

        boderUsuario1.add(jScrollPane1);
        jScrollPane1.setBounds(230, 20, 452, 402);

        btAtualizar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btAtualizar.setText("Atualizar");
        btAtualizar.setBorder(null);
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
        boderUsuario1.add(btAtualizar);
        btAtualizar.setBounds(350, 440, 90, 30);

        btExcluir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btExcluir.setText("Excluir");
        btExcluir.setBorder(null);
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
        boderUsuario1.add(btExcluir);
        btExcluir.setBounds(500, 440, 90, 30);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addComponent(boderUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(116, Short.MAX_VALUE)
                .addComponent(boderUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(116, Short.MAX_VALUE))
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

    private void btAtualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAtualizarMouseEntered
        btAtualizar.setBackground(Color.white);
        btAtualizar.setBackground(Color.green);
    }//GEN-LAST:event_btAtualizarMouseEntered

    private void btAtualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAtualizarMouseExited
        btAtualizar.setBackground(Color.green);
        btAtualizar.setBackground(Color.white);
    }//GEN-LAST:event_btAtualizarMouseExited

    private void btExcluirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btExcluirMouseEntered
        btExcluir.setBackground(Color.white);
        btExcluir.setBackground(Color.red);
    }//GEN-LAST:event_btExcluirMouseEntered

    private void btExcluirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btExcluirMouseExited
        btExcluir.setBackground(Color.red);
        btExcluir.setBackground(Color.white);
    }//GEN-LAST:event_btExcluirMouseExited

    private void jtProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtProdutoMouseClicked
        if (jtProduto.getSelectedRow() != -1) {
            txtNomeProduto.setText(jtProduto.getValueAt(jtProduto.getSelectedRow(), 1).toString());
            txtMarcaProduto.setText(jtProduto.getValueAt(jtProduto.getSelectedRow(), 2).toString());
            txtPrecoProduto.setText(jtProduto.getValueAt(jtProduto.getSelectedRow(), 3).toString());
            txtQuantidadeProduto.setText(jtProduto.getValueAt(jtProduto.getSelectedRow(), 4).toString());
        }
    }//GEN-LAST:event_jtProdutoMouseClicked

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        Produto produto = new Produto();
        produto.setNomeProduto(txtNomeProduto.getText());
        produto.setMarcaProduto(txtMarcaProduto.getText());
        produto.setValorProduto(Integer.parseInt(txtPrecoProduto.getText()));
        produto.setQuantidadeProduto(Integer.parseInt(txtQuantidadeProduto.getText()));

        if ((txtNomeProduto.getText().isEmpty()) || (txtMarcaProduto.getText().isEmpty()) || (txtPrecoProduto.getText().isEmpty()) || (txtQuantidadeProduto.getText().isEmpty())) {
            JOptionPane.showMessageDialog(null, " Os campos não podem retornar vazios ");
        } else {

            ProdutoDAO dao = new ProdutoDAO();
            dao.adiciona(produto);
            JOptionPane.showMessageDialog(null, " Produto " + txtNomeProduto.getText() + " inserido com sucesso! ");
        }

        txtNomeProduto.setText("");
        txtMarcaProduto.setText("");
        txtPrecoProduto.setText("");
        txtQuantidadeProduto.setText("");
        leiaJTable();
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
        if (jtProduto.getSelectedRow() != -1) {

            Produto produto = new Produto();
            produto.setNomeProduto(txtNomeProduto.getText());
            produto.setMarcaProduto(txtMarcaProduto.getText());
            produto.setValorProduto(Double.parseDouble(txtPrecoProduto.getText()));
            produto.setQuantidadeProduto(Integer.parseInt(txtQuantidadeProduto.getText()));

            produto.setIdProduto((int) jtProduto.getValueAt(jtProduto.getSelectedRow(), 0));
            if ((txtNomeProduto.getText().isEmpty()) || (txtMarcaProduto.getText().isEmpty()) || (txtPrecoProduto.getText().isEmpty()) || (txtQuantidadeProduto.getText().isEmpty())) {
                JOptionPane.showMessageDialog(null, "O campo não pode retornar vazio");
            } else {
                ProdutoDAO dao = new ProdutoDAO();
                dao.update(produto);
                JOptionPane.showMessageDialog(null, " Cliente " + txtNomeProduto.getText() + " atualizado com sucesso! ");
            }
        }
        txtNomeProduto.setText("");
        txtMarcaProduto.setText("");
        txtPrecoProduto.setText("");
        txtQuantidadeProduto.setText("");
        leiaJTable();
    }//GEN-LAST:event_btAtualizarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        if (jtProduto.getSelectedRow() != -1) {

            Produto produto = new Produto();
            produto.setNomeProduto(txtNomeProduto.getText());
            produto.setMarcaProduto(txtMarcaProduto.getText());
            produto.setValorProduto(Double.parseDouble(txtPrecoProduto.getText()));
            produto.setQuantidadeProduto(Integer.parseInt(txtQuantidadeProduto.getText()));

            produto.setIdProduto((int) jtProduto.getValueAt(jtProduto.getSelectedRow(), 0));
            if ((txtNomeProduto.getText().isEmpty()) || (txtMarcaProduto.getText().isEmpty()) || (txtPrecoProduto.getText().isEmpty()) || (txtQuantidadeProduto.getText().isEmpty())) {
                JOptionPane.showMessageDialog(null, "O campo não pode retornar vazio");
            } else {
                ProdutoDAO dao = new ProdutoDAO();
                dao.delete(produto);
                JOptionPane.showMessageDialog(null, " Cliente " + txtNomeProduto.getText() + " Excludo com sucesso! ");
            }
        }
        txtNomeProduto.setText("");
        txtMarcaProduto.setText("");
        txtPrecoProduto.setText("");
        txtQuantidadeProduto.setText("");
        leiaJTable();
    }//GEN-LAST:event_btExcluirActionPerformed

    private void txtPrecoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecoProdutoActionPerformed

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
            java.util.logging.Logger.getLogger(ProdutoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProdutoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProdutoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProdutoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProdutoGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private gui.boderUsuario boderUsuario1;
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTable jtProduto;
    private javax.swing.JTextField txtMarcaProduto;
    private javax.swing.JTextField txtNomeProduto;
    private javax.swing.JTextField txtPrecoProduto;
    private javax.swing.JTextField txtQuantidadeProduto;
    // End of variables declaration//GEN-END:variables
}
