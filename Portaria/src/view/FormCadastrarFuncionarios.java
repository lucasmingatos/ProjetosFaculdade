/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.FuncionariosDAO;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Funcionarios;

/**
 *
 * @author Alexandre
 */
public class FormCadastrarFuncionarios extends javax.swing.JInternalFrame {

    /**
     * Creates new form FormCadastrarFuncionarios
     */
    public FormCadastrarFuncionarios() {
        initComponents();
        configurarFormulario();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblId = new javax.swing.JLabel();
        scpDados = new javax.swing.JScrollPane();
        tabDados = new javax.swing.JTable();
        rdbNome = new javax.swing.JRadioButton();
        btnNovo = new javax.swing.JButton();
        lclCodigo = new javax.swing.JLabel();
        txtTotalRegistros = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lblPesquisar = new javax.swing.JLabel();
        txtFuncao = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        txtCodigo1 = new javax.swing.JTextField();
        txtPesquisar = new javax.swing.JTextField();
        txtStatus = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        lblTotalRegistros = new javax.swing.JLabel();
        rdbId = new javax.swing.JRadioButton();

        lblId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblId.setText("Id");

        tabDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabDados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabDadosMouseClicked(evt);
            }
        });
        scpDados.setViewportView(tabDados);

        rdbNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rdbNome.setText("Nome");
        rdbNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbNomeActionPerformed(evt);
            }
        });

        btnNovo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnNovo.setText("novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        lclCodigo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lclCodigo.setText("Código");

        txtTotalRegistros.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Status");

        txtId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Função");

        lblPesquisar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPesquisar.setText("Pesquisar");

        txtFuncao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblNome.setText("Nome");

        txtCodigo1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtPesquisar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisarKeyReleased(evt);
            }
        });

        txtStatus.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnSalvar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSalvar.setText("salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnRemover.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnRemover.setText("remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        lblTotalRegistros.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTotalRegistros.setText("Total de registros:");

        rdbId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rdbId.setText("Id");
        rdbId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scpDados)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblTotalRegistros)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTotalRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPesquisar)
                        .addGap(6, 6, 6)
                        .addComponent(rdbId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rdbNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesquisar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNome)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(111, 111, 111)
                                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblId)
                                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(62, 62, 62)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lclCodigo)
                                                .addComponent(txtCodigo1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(90, 90, 90)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(txtFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId)
                    .addComponent(lclCodigo)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigo1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnSalvar)
                    .addComponent(btnRemover))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbId)
                    .addComponent(rdbNome)
                    .addComponent(lblPesquisar)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scpDados, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotalRegistros)
                    .addComponent(txtTotalRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabDadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabDadosMouseClicked
        int linha = tabDados.getSelectedRow();
        if (linha >= 0){
            txtId.setText(tabDados.getValueAt(linha, 0).toString());
            txtCodigo1.setText(tabDados.getValueAt(linha, 1).toString());
            txtNome.setText(tabDados.getValueAt(linha, 2).toString());
            txtFuncao.setText(tabDados.getValueAt(linha, 3).toString());
            txtStatus.setText(tabDados.getValueAt(linha, 4).toString());
        }
    }//GEN-LAST:event_tabDadosMouseClicked

    private void rdbNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbNomeActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        txtId.setText("");
        txtNome.setText("");
        txtCodigo1.setText("");
        txtFuncao.setText("");
        txtStatus.setText("");
    }//GEN-LAST:event_btnNovoActionPerformed

    private void txtPesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarKeyReleased
        try {
            List<Funcionarios> resultado = null;
            if (rdbId.isSelected()) {
                resultado = new FuncionariosDAO().pesquisarPorId(Integer.parseInt(txtId.getText()));
            } else if (rdbNome.isSelected()) {
                resultado = new FuncionariosDAO().pesquisarPorNome(txtNome.getText());
            }
            listar(resultado);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível realizar a operação");
        }
    }//GEN-LAST:event_txtPesquisarKeyReleased

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (txtNome.getText().isEmpty() || txtFuncao.getText().isEmpty() || txtFuncao.getText().isEmpty() || txtStatus.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O campo nome não foi informado.");
        } else {
            Funcionarios cat = new Funcionarios();
            if (!txtId.getText().isEmpty()) {
                cat.setId(Long.parseLong(txtId.getText()));
            }
            cat.setCodigo(Integer.parseInt(txtCodigo1.getText()));
            cat.setNome(txtNome.getText());
            cat.setFuncao(txtFuncao.getText());
            cat.setEntre(txtStatus.getText());

            long res = new FuncionariosDAO().salvar(cat);
            if (res > 0) {
                txtId.setText(Long.toString(res));

                JOptionPane.showMessageDialog(null, "Operação realizada com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Não foi possível realizar a operação");
            }
            listar(new FuncionariosDAO().listar());
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        if (txtId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O campo nome não foi informado.");
        } else {
            int resp = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja remover o registro?", "Controle de Produtos", JOptionPane.YES_NO_OPTION);
            if (resp == JOptionPane.YES_OPTION) {
                new FuncionariosDAO().remover(Long.parseLong(txtId.getText()));
                listar(new FuncionariosDAO().listar());
            }
        }
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void rdbIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbIdActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPesquisar;
    private javax.swing.JLabel lblTotalRegistros;
    private javax.swing.JLabel lclCodigo;
    private javax.swing.JRadioButton rdbId;
    private javax.swing.JRadioButton rdbNome;
    private javax.swing.JScrollPane scpDados;
    private javax.swing.JTable tabDados;
    private javax.swing.JTextField txtCodigo1;
    private javax.swing.JTextField txtFuncao;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPesquisar;
    private javax.swing.JTextField txtStatus;
    private javax.swing.JTextField txtTotalRegistros;
    // End of variables declaration//GEN-END:variables

    private void configurarFormulario() {
        
        
        this.setTitle("Cadastro de Pessoas");
        this.setResizable(false);
        this.setMaximizable(false);
        this.setIconifiable(false);
        this.setClosable(true);
        
        txtId.setEditable(false);
        txtTotalRegistros.setEditable(false);

        ButtonGroup bg = new ButtonGroup();
        bg.add(rdbId);
        bg.add(rdbNome);
        rdbNome.setSelected(true);
        configurarTabela();

        listar(new FuncionariosDAO().listar());
    }
    
    
    
    private void configurarTabela() {
        DefaultTableModel m = new DefaultTableModel(new Object[]{"Id","Nome", "Código", "Função", "Dentro/Fora"}, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tabDados.setModel(m);
    }
    
    
    
    private void listar(List<Funcionarios> lista) {
        if (lista != null) {
            configurarTabela();
            DefaultTableModel m = (DefaultTableModel) tabDados.getModel();
            for (Funcionarios cat : lista) {
                m.addRow(new Object[]{cat.getId(), cat.getNome(), cat.getCodigo(), cat.getFuncao(), cat.getEntre()});
            }
            tabDados.setModel(m);
        }
        long cont = new FuncionariosDAO().contar();
        txtTotalRegistros.setText(Long.toString(cont));
    }



}