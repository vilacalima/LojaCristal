/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.cristal.projetoloja.view;

import com.cirstal.projetoloja.dao.ProdutoDAO;
import com.cristal.projetoloja.model.Produto;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Leona
 */
public class TelaProduto extends javax.swing.JFrame {

    Produto objProduto = null;
    /**
     * Creates new form TelaProduto
     */
    public TelaProduto() {
        initComponents();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTamanho = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtFornecedor = new javax.swing.JTextField();
        btnIncluir = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtPesquisar = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblEstoque = new javax.swing.JTable();
        btnCancelar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        txtValor = new javax.swing.JFormattedTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CRISTAL Produtos");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastrar produto"));

        jLabel1.setText("Codigo:");

        txtCodigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtCodigoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtCodigoMouseExited(evt);
            }
        });
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoKeyTyped(evt);
            }
        });

        jLabel2.setText("Descrição:");

        txtDescricao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtDescricaoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtDescricaoMouseExited(evt);
            }
        });
        txtDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescricaoActionPerformed(evt);
            }
        });
        txtDescricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDescricaoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescricaoKeyTyped(evt);
            }
        });

        jLabel3.setText("Cor:");

        txtCor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtCorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtCorMouseExited(evt);
            }
        });
        txtCor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCorKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCorKeyTyped(evt);
            }
        });

        jLabel4.setText("Tamanho:");

        txtTamanho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtTamanhoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtTamanhoMouseExited(evt);
            }
        });
        txtTamanho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTamanhoActionPerformed(evt);
            }
        });
        txtTamanho.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTamanhoKeyTyped(evt);
            }
        });

        jLabel5.setText("Valor:");

        jLabel6.setText("Quantidade:");

        txtQuantidade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtQuantidadeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtQuantidadeMouseExited(evt);
            }
        });
        txtQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantidadeActionPerformed(evt);
            }
        });
        txtQuantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtQuantidadeKeyTyped(evt);
            }
        });

        jLabel7.setText("Fornecedor:");

        txtFornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtFornecedorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtFornecedorMouseExited(evt);
            }
        });
        txtFornecedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFornecedorKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFornecedorKeyTyped(evt);
            }
        });

        btnIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Salvar.png"))); // NOI18N
        btnIncluir.setText("Salvar");
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });

        jLabel8.setText("Pesquisar:");

        txtPesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtPesquisarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtPesquisarMouseExited(evt);
            }
        });

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Procurar.png"))); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        tblEstoque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Descrição", "Cor", "Tamanho", "Valor", "Qtd.Estoque", "Fornecedor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblEstoque);
        if (tblEstoque.getColumnModel().getColumnCount() > 0) {
            tblEstoque.getColumnModel().getColumn(1).setPreferredWidth(300);
        }

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/X.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Lixeira.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Editar.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home.png"))); // NOI18N
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        txtValor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtValorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtValorMouseExited(evt);
            }
        });
        txtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorActionPerformed(evt);
            }
        });
        txtValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValorKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTamanho, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                                    .addComponent(txtCodigo))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtDescricao))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(34, 34, 34)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCor, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtCor, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar))
                .addGap(47, 47, 47)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyTyped
       //Permitir somente caracteres numéricos
        Validador validador = new Validador();
        validador.validaMonetarioTxtBox(evt, "Código");
    }//GEN-LAST:event_txtCodigoKeyTyped

    private void txtDescricaoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescricaoKeyReleased
        txtDescricao.setText(this.txtDescricao.getText().toUpperCase());
        
    }//GEN-LAST:event_txtDescricaoKeyReleased

    private void txtCorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorKeyTyped
      Validador validador = new Validador();
      validador.validaPalavra(evt, txtCor, 10);
    }//GEN-LAST:event_txtCorKeyTyped

    private void txtTamanhoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTamanhoKeyTyped
        Validador validador = new Validador();
        validador.validaMonetarioTxtBox(evt, "Tamanho");
    }//GEN-LAST:event_txtTamanhoKeyTyped

    private void txtQuantidadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuantidadeKeyTyped
        Validador validador = new Validador();
        validador.validaMonetarioTxtBox(evt, "Quantidade");
    }//GEN-LAST:event_txtQuantidadeKeyTyped

    private void txtFornecedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFornecedorKeyTyped
        Validador validador = new Validador();
        validador.validaPalavra(evt, txtFornecedor, 10);
    }//GEN-LAST:event_txtFornecedorKeyTyped

    private void txtFornecedorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFornecedorKeyReleased
        txtFornecedor.setText(this.txtFornecedor.getText().toUpperCase());
    }//GEN-LAST:event_txtFornecedorKeyReleased

    private void txtDescricaoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescricaoKeyTyped
        Validador validador = new Validador();
        validador.validaPalavra(evt, txtDescricao, 20);
    }//GEN-LAST:event_txtDescricaoKeyTyped

    private void txtCorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorKeyReleased
      txtCor.setText(this.txtCor.getText().toUpperCase());
    }//GEN-LAST:event_txtCorKeyReleased

    private void txtCodigoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCodigoMouseEntered
       this.txtCodigo.setBackground(Color.yellow);
    }//GEN-LAST:event_txtCodigoMouseEntered

    private void txtCodigoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCodigoMouseExited
       this.txtCodigo.setBackground(Color.white);
    }//GEN-LAST:event_txtCodigoMouseExited

    private void txtDescricaoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDescricaoMouseEntered
        this.txtDescricao.setBackground(Color.yellow);
    }//GEN-LAST:event_txtDescricaoMouseEntered

    private void txtDescricaoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDescricaoMouseExited
      this.txtDescricao.setBackground(Color.white);
    }//GEN-LAST:event_txtDescricaoMouseExited

    private void txtCorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCorMouseEntered
       this.txtCor.setBackground(Color.yellow);
    }//GEN-LAST:event_txtCorMouseEntered

    private void txtCorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCorMouseExited
        this.txtCor.setBackground(Color.white);
    }//GEN-LAST:event_txtCorMouseExited

    private void txtTamanhoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTamanhoMouseEntered
        this.txtTamanho.setBackground(Color.yellow);
    }//GEN-LAST:event_txtTamanhoMouseEntered

    private void txtTamanhoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTamanhoMouseExited
        this.txtTamanho.setBackground(Color.white);
    }//GEN-LAST:event_txtTamanhoMouseExited

    private void txtQuantidadeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtQuantidadeMouseEntered
        this.txtQuantidade.setBackground(Color.yellow);
    }//GEN-LAST:event_txtQuantidadeMouseEntered

    private void txtQuantidadeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtQuantidadeMouseExited
       this.txtQuantidade.setBackground(Color.white);
    }//GEN-LAST:event_txtQuantidadeMouseExited

    private void txtFornecedorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFornecedorMouseExited
       this.txtFornecedor.setBackground(Color.white);
    }//GEN-LAST:event_txtFornecedorMouseExited

    private void txtFornecedorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFornecedorMouseEntered
        this.txtFornecedor.setBackground(Color.yellow);
    }//GEN-LAST:event_txtFornecedorMouseEntered

    private void txtPesquisarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPesquisarMouseEntered
        this.txtPesquisar.setBackground(Color.yellow);
    }//GEN-LAST:event_txtPesquisarMouseEntered

    private void txtPesquisarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPesquisarMouseExited
        this.txtPesquisar.setBackground(Color.white);
    }//GEN-LAST:event_txtPesquisarMouseExited

    private void txtValorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorKeyTyped
       Validador validador = new Validador();
       validador.validaMonetarioTxtBox(evt, "Valor");
    }//GEN-LAST:event_txtValorKeyTyped

    private void txtValorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtValorMouseEntered
     this.txtValor.setBackground(Color.yellow);
    }//GEN-LAST:event_txtValorMouseEntered

    private void txtValorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtValorMouseExited
     this.txtValor.setBackground(Color.white);
    }//GEN-LAST:event_txtValorMouseExited

    private void txtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        TelaInicial telaInicial = new TelaInicial();
        telaInicial.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        int linhaSelecionada = tblEstoque.getSelectedRow();
        
        if(linhaSelecionada > 0){
            int codigo = Integer.parseInt(txtCodigo.getText());
            String descricao = txtDescricao.getText();
            String cor = txtCor.getText();
            int tamanho = Integer.parseInt(txtTamanho.getText());
            double valor = Double.parseDouble(txtValor.getText());
            int quantidade = Integer.parseInt(txtQuantidade.getText());
            String fornecedor = txtFornecedor.getText();
            
            objProduto.setCodigo(codigo);
            objProduto.setDescricao(descricao);
            objProduto.setCor(cor);
            objProduto.setTamanho(tamanho);
            objProduto.setValor(valor);
            objProduto.setQuantidade(quantidade);
            objProduto.setFornecedor(fornecedor);
            
            boolean retorno = ProdutoDAO.atualizar(objProduto);
            if(retorno){
                JOptionPane.showMessageDialog(this,"Produto alterado com sucesso!");
            }else{
                JOptionPane.showMessageDialog(this,"Falha na gravação!");
            }
            
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void txtTamanhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTamanhoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTamanhoActionPerformed

    private void txtQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantidadeActionPerformed

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        Validador validador =  new Validador();
        //validador.validaEntradaPalavra(evt, txtCodigo, "o código do produto");
        validador.validaEntradaPalavra(evt, txtDescricao, "a descrição do produto");
        validador.validaEntradaPalavra(evt, txtCor, "a cor do produto");
        validador.validaEntradaPalavra(evt, txtTamanho, "o tamanho do produto");
        validador.validaEntradaPalavra(evt, txtValor, "o valor do produto");
        validador.validaEntradaPalavra(evt, txtQuantidade, "a quantidade");
        validador.validaEntradaPalavra(evt, txtFornecedor, "o fornecedor");
        try{
            if(this.objProduto == null){
            String descricao = txtDescricao.getText();
            String cor = txtCor.getText();
            int tamanho = Integer.parseInt(txtTamanho.getText());
            double valor = Double.parseDouble(txtValor.getText());
            int quantidade = Integer.parseInt(txtQuantidade.getText());
            String fornecedor = txtFornecedor.getText();

            objProduto = new Produto(descricao, cor, tamanho, valor, quantidade, fornecedor);
            boolean retorno = ProdutoDAO.salvar(objProduto);

            if(retorno){
                JOptionPane.showMessageDialog(this,"Produto gravado com sucesso!");
            }else{
                JOptionPane.showMessageDialog(this,"Falha na gravação!");
            }

            } else{
                String descricao = txtDescricao.getText();
                String cor = txtCor.getText();
                int tamanho = Integer.parseInt(txtTamanho.getText());
                double valor = Double.parseDouble(txtValor.getText());
                int quantidade = Integer.parseInt(txtQuantidade.getText());
                String fornecedor = txtFornecedor.getText();

                objProduto.setDescricao(descricao);
                objProduto.setCor(cor);
                objProduto.setTamanho(tamanho);
                objProduto.setValor(valor);
                objProduto.setQuantidade(quantidade);
                objProduto.setFornecedor(fornecedor);

                boolean retorno = ProdutoDAO.atualizar(objProduto);
                if(retorno){
                    JOptionPane.showMessageDialog(this,"Produto alterado com sucesso!");
                }else{
                    JOptionPane.showMessageDialog(this,"Falha na gravação!");
                }
            }
        } catch(SQLException ex) {
            Logger.getLogger(TelaProduto.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        Validador validador = new Validador();
        validador.validaEntradaPalavra(evt, txtPesquisar, "o código do produto");
        
        try{
            String procurarDescricao = txtPesquisar.getText();
            objProduto = new Produto(procurarDescricao);
            
             ArrayList<Produto> lista = ProdutoDAO.listar(objProduto);
             DefaultTableModel modelo = (DefaultTableModel) tblEstoque.getModel();
             
             modelo.setRowCount(0);
             for(Produto item:lista){
                 modelo.addRow(new String[]{String.valueOf(item.getCodigo()),
                                            String.valueOf(item.getDescricao()),
                                            String.valueOf(item.getCor()),
                                            String.valueOf(item.getTamanho()),
                                            String.valueOf(item.getValor()),
                                            String.valueOf(item.getQuantidade()),
                                            String.valueOf(item.getFornecedor())
                                            });
//                 Pode ser que tenha que colocar o id para possibilitar a exclusão
             }
             
        }catch (SQLException ex) {
            Logger.getLogger(TelaProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        txtCodigo.setText("");
        txtCor.setText("");
        txtDescricao.setText("");
        txtFornecedor.setText("");
        txtPesquisar.setText("");
        txtQuantidade.setText("");
        txtTamanho.setText("");
        txtValor.setText("");
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescricaoActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int linhaSelecionada = tblEstoque.getSelectedRow();
        int id = Integer.parseInt(tblEstoque.getValueAt(linhaSelecionada, 0).toString());
        
        boolean retorno = ProdutoDAO.excluir(id);
        if(retorno){
            JOptionPane.showMessageDialog(this, "Produto excluído com sucesso!");
        }else{
            JOptionPane.showMessageDialog(this, "Falha na exclusão!");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(TelaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblEstoque;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCor;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtFornecedor;
    private javax.swing.JTextField txtPesquisar;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtTamanho;
    private javax.swing.JFormattedTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
