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
                cliente.getNomeClit(),
                cliente.getCpf(),
                cliente.getCep(),
                cliente.getEdereco(),
                cliente.getTelefone()
                
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        boderUsuario1 = new gui.boderUsuario();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        txtNomeClient = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        txtCep = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        btSair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtCliente = new javax.swing.JTable();
        btAtualizar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btCadastro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Clientes", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 48))); // NOI18N

        boderUsuario1.setBackground(new java.awt.Color(255, 255, 255));
        boderUsuario1.add(jLabel1);
        jLabel1.setBounds(40, 130, 0, 0);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\898557\\Desktop\\Icones\\Farmacia.png")); // NOI18N
        boderUsuario1.add(jLabel2);
        jLabel2.setBounds(120, 0, 120, 120);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Nome:");
        boderUsuario1.add(jLabel3);
        jLabel3.setBounds(30, 150, 60, 22);

        txtTelefone.setText("digite seu telefone...");
        txtTelefone.setBorder(null);
        txtTelefone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtTelefoneMousePressed(evt);
            }
        });
        boderUsuario1.add(txtTelefone);
        txtTelefone.setBounds(30, 550, 280, 40);
        boderUsuario1.add(jSeparator1);
        jSeparator1.setBounds(30, 220, 280, 2);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("CPF:");
        boderUsuario1.add(jLabel4);
        jLabel4.setBounds(30, 250, 50, 22);

        txtNomeClient.setText("digite seu nome...");
        txtNomeClient.setBorder(null);
        txtNomeClient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNomeClientMousePressed(evt);
            }
        });
        boderUsuario1.add(txtNomeClient);
        txtNomeClient.setBounds(30, 180, 280, 40);
        boderUsuario1.add(jSeparator2);
        jSeparator2.setBounds(30, 320, 280, 2);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("CEP:");
        boderUsuario1.add(jLabel5);
        jLabel5.setBounds(30, 350, 70, 22);

        txtCpf.setText("digite seu cpf...");
        txtCpf.setBorder(null);
        txtCpf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCpfMousePressed(evt);
            }
        });
        txtCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpfActionPerformed(evt);
            }
        });
        boderUsuario1.add(txtCpf);
        txtCpf.setBounds(30, 280, 280, 40);
        boderUsuario1.add(jSeparator3);
        jSeparator3.setBounds(30, 420, 280, 2);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Endereço:");
        boderUsuario1.add(jLabel6);
        jLabel6.setBounds(30, 440, 80, 22);

        txtCep.setText("digite seu cep...");
        txtCep.setBorder(null);
        txtCep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCepMousePressed(evt);
            }
        });
        boderUsuario1.add(txtCep);
        txtCep.setBounds(30, 380, 280, 40);
        boderUsuario1.add(jSeparator4);
        jSeparator4.setBounds(30, 510, 280, 2);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Telefone:");
        boderUsuario1.add(jLabel7);
        jLabel7.setBounds(30, 530, 90, 22);

        txtEndereco.setText("digite seu endereço...");
        txtEndereco.setBorder(null);
        txtEndereco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtEnderecoMousePressed(evt);
            }
        });
        boderUsuario1.add(txtEndereco);
        txtEndereco.setBounds(30, 470, 280, 40);
        boderUsuario1.add(jSeparator5);
        jSeparator5.setBounds(30, 590, 280, 2);

        btSair.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btSair.setText("x");
        btSair.setBorder(null);
        btSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btSairMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btSairMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btSairMouseExited(evt);
            }
        });
        boderUsuario1.add(btSair);
        btSair.setBounds(10, 10, 40, 40);

        jtCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "CPF", "CEP", "Endereço", "Telefone"
            }
        ));
        jtCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jtCliente.setGridColor(new java.awt.Color(255, 255, 255));
        jtCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtCliente);

        boderUsuario1.add(jScrollPane1);
        jScrollPane1.setBounds(370, 100, 452, 490);

        btAtualizar.setBackground(new java.awt.Color(255, 255, 255));
        btAtualizar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
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
        boderUsuario1.add(btAtualizar);
        btAtualizar.setBounds(450, 620, 130, 40);

        btExcluir.setBackground(new java.awt.Color(255, 255, 255));
        btExcluir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
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
        boderUsuario1.add(btExcluir);
        btExcluir.setBounds(650, 620, 130, 40);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Limpa");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boderUsuario1.add(jButton1);
        jButton1.setBounds(210, 620, 120, 40);

        btCadastro.setBackground(new java.awt.Color(255, 255, 255));
        btCadastro.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btCadastro.setText("Cadastro");
        btCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastroActionPerformed(evt);
            }
        });
        boderUsuario1.add(btCadastro);
        btCadastro.setBounds(20, 620, 130, 40);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(150, Short.MAX_VALUE)
                .addComponent(boderUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 848, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(150, Short.MAX_VALUE)
                .addComponent(boderUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(150, Short.MAX_VALUE))
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

    private void btSairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSairMouseEntered
        btSair.setBackground(Color.white);
        btSair.setBackground(Color.red);
    }//GEN-LAST:event_btSairMouseEntered

    private void btSairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSairMouseExited
        btSair.setBackground(Color.red);
        btSair.setBackground(Color.white);
    }//GEN-LAST:event_btSairMouseExited

    private void btSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btSairMouseClicked

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

    private void jtClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtClienteMouseClicked
        if (jtCliente.getSelectedRow() != -1) {
            txtNomeClient.setText(jtCliente.getValueAt(jtCliente.getSelectedRow(), 1).toString());
            txtCpf.setText(jtCliente.getValueAt(jtCliente.getSelectedRow(), 2).toString());
            txtCep.setText(jtCliente.getValueAt(jtCliente.getSelectedRow(), 3).toString());
            txtEndereco.setText(jtCliente.getValueAt(jtCliente.getSelectedRow(), 4).toString());
            txtTelefone.setText(jtCliente.getValueAt(jtCliente.getSelectedRow(), 5).toString());
        }
    }//GEN-LAST:event_jtClienteMouseClicked

    private void txtCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpfActionPerformed

    private void txtNomeClientMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNomeClientMousePressed
        txtNomeClient.setText("");
    }//GEN-LAST:event_txtNomeClientMousePressed

    private void txtCpfMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCpfMousePressed
        txtCpf.setText("");
    }//GEN-LAST:event_txtCpfMousePressed

    private void txtCepMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCepMousePressed
        txtCep.setText("");
    }//GEN-LAST:event_txtCepMousePressed

    private void txtEnderecoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEnderecoMousePressed
        txtEndereco.setText("");
    }//GEN-LAST:event_txtEnderecoMousePressed

    private void txtTelefoneMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTelefoneMousePressed
        txtTelefone.setText("");
    }//GEN-LAST:event_txtTelefoneMousePressed

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
        if (jtCliente.getSelectedRow() != -1) {

            Cliente cliente = new Cliente();
            cliente.setNomeClit(txtNomeClient.getText());
            cliente.setCpf(txtCpf.getText());
            cliente.setCep(txtCep.getText());
            cliente.setEdereco(txtEndereco.getText());
            cliente.setTelefone(txtTelefone.getText());

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

    private void btCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastroActionPerformed
        Cliente cliente = new Cliente();
        cliente.setNomeClit(txtNomeClient.getText());
        cliente.setCpf(txtCpf.getText());
        cliente.setCep(txtCep.getText());
        cliente.setEdereco(txtEndereco.getText());
        cliente.setTelefone(txtTelefone.getText());

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
            cliente.setNomeClit(txtNomeClient.getText());
            cliente.setCpf(txtCpf.getText());
            cliente.setCep(txtCep.getText());
            cliente.setEdereco(txtEndereco.getText());
            cliente.setTelefone(txtTelefone.getText());

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
    private javax.swing.JButton btSair;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTable jtCliente;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNomeClient;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
