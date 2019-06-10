/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao.producao;

import controle.GerenciadorDeBD;
import controle.GerenciadorDeLogin;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modeloBeans.produto.BeansProduto;
import modeloBeans.ModeloTabela;
import modeloBeans.empresa.BeansFornecedor;
import modeloBeans.produto.BeansMateria_prima;

/**
 * form principal de entrada de materia-prima
 * @author geovanef46
 */
public class FormEntradaMP extends javax.swing.JFrame {

    private BeansMateria_prima modelo = new BeansMateria_prima();
    private BeansFornecedor modeloFornecedor = new BeansFornecedor();
    private GerenciadorDeBD DaoControl = new GerenciadorDeBD();
    private GerenciadorDeLogin gerLogin = GerenciadorDeLogin.getInstance();

    /**
     * Creates new form Form entrada de materia prima
     */
    public FormEntradaMP() {
        initComponents();
        PreencherTabela("select *from materia_prima order by nome");
    }
    
    public FormEntradaMP(BeansMateria_prima novaMP) {
        initComponents();
        preencheCampos(novaMP);
        PreencherTabela("select *from materia_prima order by nome");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelNomeMedico2 = new javax.swing.JLabel();
        jPanelCadastroMedicos = new javax.swing.JPanel();
        jLabelNomeMedico = new javax.swing.JLabel();
        jTextFieldNomeProduto = new javax.swing.JTextField();
        jButtonSalvar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonAdicionar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePesquisarBD = new javax.swing.JTable();
        jButtonPesquisarProduto = new javax.swing.JButton();
        jTextFieldPesquisaProduto = new javax.swing.JTextField();
        jLabelIdMedico = new javax.swing.JLabel();
        jTextFieldCodProduto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldDescricaoProduto = new javax.swing.JTextField();
        jFormattedTextFieldPrecoProduto = new javax.swing.JFormattedTextField();
        jFormattedTextFieldQtdEstoque = new javax.swing.JFormattedTextField();
        jButtonNovo = new javax.swing.JButton();
        jSpinnerAddqtd = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jLabelNomeDoFornecedor = new javax.swing.JLabel();
        jLabelEstoque = new javax.swing.JLabel();

        jLabelNomeMedico2.setText("Fornecedor:");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Adicionar ao Estoque");
        setBackground(new java.awt.Color(148, 245, 73));
        getContentPane().setLayout(null);

        jPanelCadastroMedicos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelNomeMedico.setText("Nome:");

        jTextFieldNomeProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeProdutoActionPerformed(evt);
            }
        });

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setToolTipText("Salvar dados");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setToolTipText("Fechar e Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonAdicionar.setText("Alterar");
        jButtonAdicionar.setToolTipText("Alterar informações da Materia-prima");
        jButtonAdicionar.setEnabled(false);
        jButtonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarActionPerformed(evt);
            }
        });

        jTablePesquisarBD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTablePesquisarBD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePesquisarBDMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePesquisarBD);

        jButtonPesquisarProduto.setText("Pesquisar");
        jButtonPesquisarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarProdutoActionPerformed(evt);
            }
        });

        jTextFieldPesquisaProduto.setToolTipText("Busque pelo nome do produto desejado");
        jTextFieldPesquisaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPesquisaProdutoActionPerformed(evt);
            }
        });

        jLabelIdMedico.setText("Código:");

        jTextFieldCodProduto.setEnabled(false);
        jTextFieldCodProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodProdutoActionPerformed(evt);
            }
        });

        jLabel1.setText("Qtd em Estoque:");

        jLabel3.setText("Preço(R$) Unitário:");

        jLabel4.setText("Descrição:");

        jTextFieldDescricaoProduto.setToolTipText("Digite algumas características do produto");
        jTextFieldDescricaoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDescricaoProdutoActionPerformed(evt);
            }
        });

        jFormattedTextFieldPrecoProduto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));

        jFormattedTextFieldQtdEstoque.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jFormattedTextFieldQtdEstoque.setEnabled(false);

        jButtonNovo.setText("Novo");
        jButtonNovo.setEnabled(false);
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jLabel2.setText("Adicionar:");

        javax.swing.GroupLayout jPanelCadastroMedicosLayout = new javax.swing.GroupLayout(jPanelCadastroMedicos);
        jPanelCadastroMedicos.setLayout(jPanelCadastroMedicosLayout);
        jPanelCadastroMedicosLayout.setHorizontalGroup(
            jPanelCadastroMedicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroMedicosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCadastroMedicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCadastroMedicosLayout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jButtonAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelCadastroMedicosLayout.createSequentialGroup()
                        .addGroup(jPanelCadastroMedicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanelCadastroMedicosLayout.createSequentialGroup()
                                .addGroup(jPanelCadastroMedicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelCadastroMedicosLayout.createSequentialGroup()
                                        .addGroup(jPanelCadastroMedicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelNomeMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelIdMedico))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanelCadastroMedicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanelCadastroMedicosLayout.createSequentialGroup()
                                                .addGroup(jPanelCadastroMedicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel2)
                                                    .addGroup(jPanelCadastroMedicosLayout.createSequentialGroup()
                                                        .addComponent(jTextFieldCodProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jLabel1)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanelCadastroMedicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jSpinnerAddqtd, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                                                    .addComponent(jFormattedTextFieldQtdEstoque)))
                                            .addComponent(jTextFieldNomeProduto)))
                                    .addGroup(jPanelCadastroMedicosLayout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1)
                                        .addComponent(jFormattedTextFieldPrecoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelCadastroMedicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldDescricaoProduto)
                                    .addGroup(jPanelCadastroMedicosLayout.createSequentialGroup()
                                        .addGroup(jPanelCadastroMedicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addGroup(jPanelCadastroMedicosLayout.createSequentialGroup()
                                                .addGap(104, 104, 104)
                                                .addComponent(jLabelNomeDoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addContainerGap())
                    .addGroup(jPanelCadastroMedicosLayout.createSequentialGroup()
                        .addComponent(jTextFieldPesquisaProduto)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonPesquisarProduto)
                        .addGap(20, 20, 20))))
        );
        jPanelCadastroMedicosLayout.setVerticalGroup(
            jPanelCadastroMedicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroMedicosLayout.createSequentialGroup()
                .addGroup(jPanelCadastroMedicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCadastroMedicosLayout.createSequentialGroup()
                        .addGroup(jPanelCadastroMedicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSpinnerAddqtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelCadastroMedicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFormattedTextFieldQtdEstoque, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelCadastroMedicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelIdMedico)
                                .addComponent(jTextFieldCodProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1)))
                        .addGap(2, 2, 2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCadastroMedicosLayout.createSequentialGroup()
                        .addComponent(jLabelNomeDoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCadastroMedicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCadastroMedicosLayout.createSequentialGroup()
                        .addGroup(jPanelCadastroMedicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNomeMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelCadastroMedicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFormattedTextFieldPrecoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jTextFieldDescricaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCadastroMedicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPesquisaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelCadastroMedicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
        );

        getContentPane().add(jPanelCadastroMedicos);
        jPanelCadastroMedicos.setBounds(10, 40, 790, 480);

        jLabelEstoque.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelEstoque.setText("Adicionar Materia-Prima");
        getContentPane().add(jLabelEstoque);
        jLabelEstoque.setBounds(280, 10, 270, 20);

        setSize(new java.awt.Dimension(815, 565));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNomeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeProdutoActionPerformed

    
    public void preencheCampos(BeansMateria_prima model){
        jButtonSalvar.setEnabled(false);
        jButtonAdicionar.setEnabled(true);
        jButtonNovo.setEnabled(false);
        jTextFieldDescricaoProduto.setEnabled(true);
        jTextFieldNomeProduto.setEnabled(true);
        jFormattedTextFieldPrecoProduto.setEnabled(true);
        jFormattedTextFieldQtdEstoque.setEnabled(false);
        jSpinnerAddqtd.setEnabled(true);

        jTextFieldCodProduto.setText(String.valueOf(model.getCodigo()));
        jTextFieldNomeProduto.setText(model.getNome());
        jFormattedTextFieldQtdEstoque.setText(String.valueOf(model.getQtd()));
        jTextFieldDescricaoProduto.setText(model.getDescricao());
        jFormattedTextFieldPrecoProduto.setText(model.getPreco());
        
    }
    
    
    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        if (validarCampos() == true) {
            modelo.setNome(jTextFieldNomeProduto.getText());
            modelo.setDescricao(jTextFieldDescricaoProduto.getText());
            modelo.setPreco(jFormattedTextFieldPrecoProduto.getText());
            int qtd = (DaoControl.converterInt(jFormattedTextFieldQtdEstoque.getText()) + (Integer) jSpinnerAddqtd.getValue());
            modelo.setQtd(qtd);
            modelo.setCpfOpProducao(gerLogin.getFuncionarioAtivo().getCPF());

            if (modelo.isNull() == false) {
                limpaCampos();

                DaoControl.salvaFornecido(modeloFornecedor, modelo, gerLogin.getFuncionarioAtivo());
                PreencherTabela("select *from materia_prima order by nome");
                dispose();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Preencha os Dados da Materia-prima!");
            }
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jTextFieldPesquisaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPesquisaProdutoActionPerformed

    }//GEN-LAST:event_jTextFieldPesquisaProdutoActionPerformed

    private void jButtonPesquisarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarProdutoActionPerformed
        if (!jTextFieldPesquisaProduto.getText().isEmpty()) {
            modelo.setPesquisa(jTextFieldPesquisaProduto.getText());
            BeansProduto model = DaoControl.buscaProdutoPorNome(modelo);
            if (model.getCodigo() != 0) {
                jTextFieldNomeProduto.setText(model.getNome());
                jTextFieldDescricaoProduto.setText(model.getDescricao());
                jFormattedTextFieldPrecoProduto.setText(model.getPreco());
                jTextFieldCodProduto.setText(String.valueOf(model.getCodigo()));
                jFormattedTextFieldQtdEstoque.setText(String.valueOf(model.getQtd()));
                PreencherTabela("select *from materia_prima where nome like'%" + modelo.getPesquisa() + "%'");
            } else {
                jTextFieldPesquisaProduto.setText("");
            }
        } else {
            PreencherTabela("select *from materia_prima order by nome");
        }
    }//GEN-LAST:event_jButtonPesquisarProdutoActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        int resposta = 0;
        resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente Cancelar?", "Aviso", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            limpaCampos();
            dispose();
        }
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarActionPerformed
        if (validarCampos() == true) {
            jTextFieldDescricaoProduto.setEnabled(true);
            jTextFieldNomeProduto.setEnabled(true);
            jFormattedTextFieldPrecoProduto.setEnabled(true);
            jFormattedTextFieldQtdEstoque.setEnabled(true);
            jSpinnerAddqtd.setEnabled(true);

            modelo.setNome(jTextFieldNomeProduto.getText());
            modelo.setDescricao(jTextFieldDescricaoProduto.getText());
            modelo.setPreco(jFormattedTextFieldPrecoProduto.getText());
            int qtd = (DaoControl.converterInt(jFormattedTextFieldQtdEstoque.getText()) + (Integer) jSpinnerAddqtd.getValue());
            modelo.setQtd(qtd);
            modelo.setCodigo(DaoControl.converterInt(jTextFieldCodProduto.getText()));
            if (modelo.isNull() == false) {
                DaoControl.editar(modelo);
                limpaCampos();
                PreencherTabela("select *from materia_prima order by nome");
                jButtonAdicionar.setEnabled(false);
                jTextFieldCodProduto.setText("");
                jTextFieldDescricaoProduto.setText("");
                jTextFieldNomeProduto.setText("");
                jFormattedTextFieldPrecoProduto.setText("");
                jFormattedTextFieldQtdEstoque.setText("");
                jTextFieldDescricaoProduto.setEnabled(false);
                jTextFieldNomeProduto.setEnabled(false);
                jFormattedTextFieldPrecoProduto.setEnabled(false);
                jFormattedTextFieldQtdEstoque.setEnabled(false);
                jSpinnerAddqtd.setEnabled(false);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Preencha os Dados da Materia-Prima!");
            }
        }
    }//GEN-LAST:event_jButtonAdicionarActionPerformed

    private void jTextFieldCodProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodProdutoActionPerformed

    private void jTablePesquisarBDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePesquisarBDMouseClicked
        jButtonSalvar.setEnabled(false);
        jButtonAdicionar.setEnabled(true);
        jButtonNovo.setEnabled(true);
        jTextFieldDescricaoProduto.setEnabled(true);
        jTextFieldNomeProduto.setEnabled(true);
        jFormattedTextFieldPrecoProduto.setEnabled(true);
        jFormattedTextFieldQtdEstoque.setEnabled(true);
        jSpinnerAddqtd.setEnabled(true);
        String nome = "" + jTablePesquisarBD.getValueAt(jTablePesquisarBD.getSelectedRow(), 1);
        modelo = (BeansMateria_prima) DaoControl.selecionaMPrima(nome);

        jTextFieldCodProduto.setText(String.valueOf(modelo.getCodigo()));
        jTextFieldNomeProduto.setText(modelo.getNome());
        jFormattedTextFieldQtdEstoque.setText(String.valueOf(modelo.getQtd()));
        jTextFieldDescricaoProduto.setText(modelo.getDescricao());
        jFormattedTextFieldPrecoProduto.setText(modelo.getPreco());

    }//GEN-LAST:event_jTablePesquisarBDMouseClicked

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        limpaCampos();
        jButtonSalvar.setEnabled(true);
        jButtonAdicionar.setEnabled(false);
        jButtonNovo.setEnabled(false);
        jTextFieldDescricaoProduto.setEnabled(true);
        jTextFieldNomeProduto.setEnabled(true);
        jFormattedTextFieldPrecoProduto.setEnabled(true);
        jFormattedTextFieldQtdEstoque.setEnabled(true);
        jSpinnerAddqtd.setEnabled(false);
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jTextFieldDescricaoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDescricaoProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDescricaoProdutoActionPerformed

    public void adicionaLoja(BeansFornecedor loja) {
        if(loja != null){
        modeloFornecedor = loja;
        jLabelNomeDoFornecedor.setText(modeloFornecedor.getNome());
        }
    }

    public void PreencherTabela(String sql) {
        ArrayList dados = DaoControl.PreencherTabelaMP(sql);//linhas
        String[] colunas = new String[]{"Código", "Nome", "Quantidade", "Preço"};//colunas

        ModeloTabela modeloTable = new ModeloTabela(dados, colunas);
        jTablePesquisarBD.setModel(modeloTable);
        jTablePesquisarBD.getColumnModel().getColumn(0).setPreferredWidth(70);
        jTablePesquisarBD.getColumnModel().getColumn(0).setResizable(false);
        jTablePesquisarBD.getColumnModel().getColumn(1).setPreferredWidth(130);
        jTablePesquisarBD.getColumnModel().getColumn(1).setResizable(false);
        jTablePesquisarBD.getColumnModel().getColumn(2).setPreferredWidth(80);
        jTablePesquisarBD.getColumnModel().getColumn(2).setResizable(false);
        jTablePesquisarBD.getColumnModel().getColumn(3).setPreferredWidth(100);
        jTablePesquisarBD.getColumnModel().getColumn(3).setResizable(false);
        jTablePesquisarBD.getTableHeader().setReorderingAllowed(false);
        jTablePesquisarBD.setAutoResizeMode(jTablePesquisarBD.AUTO_RESIZE_OFF);
        jTablePesquisarBD.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

    }

    private boolean validarCampos() {

        if (!jTextFieldDescricaoProduto.getText().equals("") || !jTextFieldNomeProduto.getText().equals("")
                || !jFormattedTextFieldPrecoProduto.getText().equals("") || !jFormattedTextFieldQtdEstoque.getText().equals("")
                || !jTextFieldDescricaoProduto.getText().isEmpty()
                || !jTextFieldNomeProduto.getText().isEmpty() || !jFormattedTextFieldPrecoProduto.getText().isEmpty()
                || !jFormattedTextFieldQtdEstoque.getText().isEmpty()) {
            return true;
        } else {
            JOptionPane.showMessageDialog(rootPane, "Preencha os Dados da Materia-Prima!");
            return false;
        }
    }

    private void limpaCampos() {
        jTextFieldCodProduto.setText("");
        jTextFieldDescricaoProduto.setText("");
        jTextFieldNomeProduto.setText("");
        jFormattedTextFieldPrecoProduto.setText("");
        jFormattedTextFieldQtdEstoque.setText("");
        jTextFieldPesquisaProduto.setText("");
    }

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
            java.util.logging.Logger.getLogger(FormEntradaMovel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormEntradaMovel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormEntradaMovel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormEntradaMovel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormEntradaMovel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdicionar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonPesquisarProduto;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JFormattedTextField jFormattedTextFieldPrecoProduto;
    private javax.swing.JFormattedTextField jFormattedTextFieldQtdEstoque;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelEstoque;
    private javax.swing.JLabel jLabelIdMedico;
    private javax.swing.JLabel jLabelNomeDoFornecedor;
    private javax.swing.JLabel jLabelNomeMedico;
    private javax.swing.JLabel jLabelNomeMedico2;
    private javax.swing.JPanel jPanelCadastroMedicos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinnerAddqtd;
    private javax.swing.JTable jTablePesquisarBD;
    private javax.swing.JTextField jTextFieldCodProduto;
    private javax.swing.JTextField jTextFieldDescricaoProduto;
    private javax.swing.JTextField jTextFieldNomeProduto;
    private javax.swing.JTextField jTextFieldPesquisaProduto;
    // End of variables declaration//GEN-END:variables
}
