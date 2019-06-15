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
import modeloBeans.ModeloTabela;
import modeloBeans.produto.BeansMovel;

/**
 *  Form de Entrada de Movel
 * @author geovanef46
 */
public class FormEntradaMovel extends javax.swing.JFrame {
    
    private BeansMovel modelo = new BeansMovel();
    private GerenciadorDeBD DaoControl = new GerenciadorDeBD();
    GerenciadorDeLogin gerLogin = GerenciadorDeLogin.getInstance();
    
    
    /**
     * Creates new form Movel
     */
    public FormEntradaMovel() {
        initComponents();
        PreencherTabela("select *from movel order by nome");
    }

        public FormEntradaMovel(BeansMovel model) {
        initComponents();
        preencheCampos(model);
        PreencherTabela("select *from movel order by nome");
    }
        
        /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelCadastroMoveis = new javax.swing.JPanel();
        jLabelNomeMedico = new javax.swing.JLabel();
        jLabelCRM = new javax.swing.JLabel();
        jLabelEspecialidade = new javax.swing.JLabel();
        jTextFieldNomeProduto = new javax.swing.JTextField();
        jTextFieldMarcaProduto = new javax.swing.JTextField();
        jComboBoxCorProduto = new javax.swing.JComboBox();
        jLabelIdMedico = new javax.swing.JLabel();
        jTextFieldCodProduto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldDescricaoProduto = new javax.swing.JTextField();
        jFormattedTextFieldPrecoProduto = new javax.swing.JFormattedTextField();
        jFormattedTextFieldQtdEstoque = new javax.swing.JFormattedTextField();
        jSpinnerAddqtd = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jLabelEstoque = new javax.swing.JLabel();
        jPanelPesquisa = new javax.swing.JPanel();
        jButtonNovo = new javax.swing.JButton();
        jButtonAdicionar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePesquisarBD = new javax.swing.JTable();
        jButtonPesquisarProduto = new javax.swing.JButton();
        jTextFieldPesquisaProduto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Adicionar ao Estoque");
        setBackground(new java.awt.Color(148, 245, 73));
        getContentPane().setLayout(null);

        jPanelCadastroMoveis.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelNomeMedico.setText("Nome:");

        jLabelCRM.setText("Marca:");

        jLabelEspecialidade.setText("Cor:");

        jTextFieldNomeProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeProdutoActionPerformed(evt);
            }
        });

        jComboBoxCorProduto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "Preto", "Branco", "Tabaco/Branco", "Preto/Branco", "Creme" }));

        jLabelIdMedico.setText("Código:");

        jTextFieldCodProduto.setEnabled(false);
        jTextFieldCodProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodProdutoActionPerformed(evt);
            }
        });

        jLabel1.setText("Qtd em Estoque:");

        jLabel3.setText("Preço(R$):");

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

        jLabel2.setText("Adicionar:");

        javax.swing.GroupLayout jPanelCadastroMoveisLayout = new javax.swing.GroupLayout(jPanelCadastroMoveis);
        jPanelCadastroMoveis.setLayout(jPanelCadastroMoveisLayout);
        jPanelCadastroMoveisLayout.setHorizontalGroup(
            jPanelCadastroMoveisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroMoveisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCadastroMoveisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCadastroMoveisLayout.createSequentialGroup()
                        .addComponent(jLabelIdMedico)
                        .addGap(7, 7, 7)
                        .addGroup(jPanelCadastroMoveisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelCadastroMoveisLayout.createSequentialGroup()
                                .addComponent(jTextFieldCodProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelCadastroMoveisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelCadastroMoveisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSpinnerAddqtd, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jFormattedTextFieldQtdEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelCadastroMoveisLayout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedTextFieldPrecoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(63, 63, 63))
                    .addGroup(jPanelCadastroMoveisLayout.createSequentialGroup()
                        .addGroup(jPanelCadastroMoveisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelCadastroMoveisLayout.createSequentialGroup()
                                .addComponent(jLabelNomeMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldNomeProduto))
                            .addGroup(jPanelCadastroMoveisLayout.createSequentialGroup()
                                .addComponent(jLabelCRM)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldMarcaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(jLabelEspecialidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBoxCorProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanelCadastroMoveisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCadastroMoveisLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 319, Short.MAX_VALUE))
                    .addGroup(jPanelCadastroMoveisLayout.createSequentialGroup()
                        .addComponent(jTextFieldDescricaoProduto)
                        .addContainerGap())))
        );
        jPanelCadastroMoveisLayout.setVerticalGroup(
            jPanelCadastroMoveisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroMoveisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCadastroMoveisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinnerAddqtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(5, 5, 5)
                .addGroup(jPanelCadastroMoveisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIdMedico)
                    .addComponent(jTextFieldCodProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jFormattedTextFieldQtdEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCadastroMoveisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelCadastroMoveisLayout.createSequentialGroup()
                        .addGroup(jPanelCadastroMoveisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNomeMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelCadastroMoveisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelCadastroMoveisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelCRM, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldMarcaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCadastroMoveisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jComboBoxCorProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelEspecialidade)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelCadastroMoveisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFormattedTextFieldPrecoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addComponent(jTextFieldDescricaoProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelCadastroMoveis);
        jPanelCadastroMoveis.setBounds(10, 50, 790, 200);

        jLabelEstoque.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelEstoque.setText("Adicionar Móvel");
        getContentPane().add(jLabelEstoque);
        jLabelEstoque.setBounds(320, 10, 200, 30);

        jPanelPesquisa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButtonNovo.setText("Novo");
        jButtonNovo.setEnabled(false);
        jButtonNovo.setPreferredSize(new java.awt.Dimension(110, 55));
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jButtonAdicionar.setText("Alterar");
        jButtonAdicionar.setEnabled(false);
        jButtonAdicionar.setPreferredSize(new java.awt.Dimension(110, 55));
        jButtonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setPreferredSize(new java.awt.Dimension(110, 55));
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
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

        javax.swing.GroupLayout jPanelPesquisaLayout = new javax.swing.GroupLayout(jPanelPesquisa);
        jPanelPesquisa.setLayout(jPanelPesquisaLayout);
        jPanelPesquisaLayout.setHorizontalGroup(
            jPanelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPesquisaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelPesquisaLayout.createSequentialGroup()
                        .addComponent(jTextFieldPesquisaProduto)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonPesquisarProduto))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 754, Short.MAX_VALUE)
                    .addGroup(jPanelPesquisaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        jPanelPesquisaLayout.setVerticalGroup(
            jPanelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPesquisaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonPesquisarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPesquisaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelPesquisa);
        jPanelPesquisa.setBounds(10, 260, 790, 270);

        setSize(new java.awt.Dimension(815, 565));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNomeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeProdutoActionPerformed
    
    
    public void preencheCampos(BeansMovel model){
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
        jComboBoxCorProduto.setSelectedItem(model.getCor());
        jTextFieldMarcaProduto.setText(model.getMarca());
    }
    
    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        if(validarCampos() == true){ 
            String cpf = gerLogin.getFuncionarioAtivo().getCPF();
         modelo.setNome(jTextFieldNomeProduto.getText());
         modelo.setDescricao(jTextFieldDescricaoProduto.getText());
         modelo.setMarca(jTextFieldMarcaProduto.getText());
         modelo.setPreco(jFormattedTextFieldPrecoProduto.getText());
          int qtd = (DaoControl.converterInt(jFormattedTextFieldQtdEstoque.getText())+(Integer)jSpinnerAddqtd.getValue());
         modelo.setQtd(qtd);
         modelo.setCor((String) jComboBoxCorProduto.getSelectedItem());
         modelo.setCpfOpProducao(cpf);
         if(modelo.isNull() == false){
             limpaCampos();
             
         DaoControl.salvarMovel(modelo);
         
         PreencherTabela("select *from movel order by nome");
         dispose();
        }else{
         JOptionPane.showMessageDialog(rootPane, "Preencha os Dados do Produto!");
         }
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jTextFieldPesquisaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPesquisaProdutoActionPerformed

    }//GEN-LAST:event_jTextFieldPesquisaProdutoActionPerformed

    private void jButtonPesquisarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarProdutoActionPerformed
        if(!jTextFieldPesquisaProduto.getText().isEmpty()){
        modelo.setPesquisa(jTextFieldPesquisaProduto.getText());
         BeansMovel model = (BeansMovel) DaoControl.buscaProdutoPorNome((BeansMovel)modelo);
         if(model.getCodigo()!=0){
        jTextFieldNomeProduto.setText(model.getNome());
        jTextFieldDescricaoProduto.setText(model.getDescricao());
        jTextFieldMarcaProduto.setText(model.getMarca());
        jFormattedTextFieldPrecoProduto.setText(model.getPreco());
        jTextFieldCodProduto.setText(String.valueOf(model.getCodigo()));
        jFormattedTextFieldQtdEstoque.setText(String.valueOf(model.getQtd()));
        jComboBoxCorProduto.setSelectedItem(model.getCor());
             PreencherTabela("select *from movel where nome like'%"+ modelo.getPesquisa()+"%'");
         }else{
             jTextFieldPesquisaProduto.setText("");
         }
        }else{
            PreencherTabela("select *from movel order by nome");
        }
    }//GEN-LAST:event_jButtonPesquisarProdutoActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        int resposta = 0;
        resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente Cancelar?","Aviso",JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
        limpaCampos();
        dispose();
        }
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarActionPerformed
        if(validarCampos()==true){
        jTextFieldDescricaoProduto.setEnabled(true);
        jTextFieldMarcaProduto.setEnabled(true);
        jTextFieldNomeProduto.setEnabled(true);
        jFormattedTextFieldPrecoProduto.setEnabled(true);
        jComboBoxCorProduto.setEnabled(true);
        jSpinnerAddqtd.setEnabled(true);
        
         modelo.setNome(jTextFieldNomeProduto.getText());
         modelo.setDescricao(jTextFieldDescricaoProduto.getText());
         modelo.setMarca(jTextFieldMarcaProduto.getText());
         modelo.setPreco(jFormattedTextFieldPrecoProduto.getText());
         int qtd = (DaoControl.converterInt(jFormattedTextFieldQtdEstoque.getText())+(Integer)jSpinnerAddqtd.getValue());
         modelo.setQtd(qtd);
         modelo.setCor((String) jComboBoxCorProduto.getSelectedItem());
         modelo.setCodigo(DaoControl.converterInt(jTextFieldCodProduto.getText()));
         if(modelo.isNull()== false){
         DaoControl.editar((BeansMovel)modelo);
         limpaCampos();
          PreencherTabela("select *from movel order by nome");
          jButtonAdicionar.setEnabled(false);
        jTextFieldCodProduto.setText("");
        jTextFieldDescricaoProduto.setText("");
        jTextFieldMarcaProduto.setText("");
        jTextFieldNomeProduto.setText("");
        jFormattedTextFieldPrecoProduto.setText("");
        jFormattedTextFieldQtdEstoque.setText("");
  
        jComboBoxCorProduto.setSelectedItem("Selecione");
        jTextFieldDescricaoProduto.setEnabled(false);
        jTextFieldMarcaProduto.setEnabled(false);
        jTextFieldNomeProduto.setEnabled(false);
        jFormattedTextFieldPrecoProduto.setEnabled(false);
        jFormattedTextFieldQtdEstoque.setEnabled(false);
        jComboBoxCorProduto.setEnabled(false);
        jSpinnerAddqtd.setEnabled(false);
        }else{
            JOptionPane.showMessageDialog(rootPane, "Preencha os Dados do Produto!");
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
        jTextFieldMarcaProduto.setEnabled(true);
        jTextFieldNomeProduto.setEnabled(true);
        jFormattedTextFieldPrecoProduto.setEnabled(true);
        jComboBoxCorProduto.setEnabled(true);
        jSpinnerAddqtd.setEnabled(true);
        String nome = ""+jTablePesquisarBD.getValueAt(jTablePesquisarBD.getSelectedRow(), 1);
        modelo = (BeansMovel) DaoControl.selecionaMovel(nome);

            jTextFieldCodProduto.setText(String.valueOf(modelo.getCodigo()));
            jTextFieldNomeProduto.setText(modelo.getNome());
            jFormattedTextFieldQtdEstoque.setText(String.valueOf(modelo.getQtd()));
            jComboBoxCorProduto.setSelectedItem(modelo.getCor());
            jTextFieldDescricaoProduto.setText(modelo.getDescricao());
            jTextFieldMarcaProduto.setText(modelo.getMarca());
            jFormattedTextFieldPrecoProduto.setText(modelo.getPreco());

    }//GEN-LAST:event_jTablePesquisarBDMouseClicked

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        limpaCampos();
        jButtonSalvar.setEnabled(true);
        jButtonAdicionar.setEnabled(false);
        jButtonNovo.setEnabled(false);
        jTextFieldDescricaoProduto.setEnabled(true);
        jTextFieldMarcaProduto.setEnabled(true);
        jTextFieldNomeProduto.setEnabled(true);
        jFormattedTextFieldPrecoProduto.setEnabled(true);
        jComboBoxCorProduto.setEnabled(true);
        jSpinnerAddqtd.setEnabled(false);
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jTextFieldDescricaoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDescricaoProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDescricaoProdutoActionPerformed

    
    public void PreencherTabela(String sql){
        ArrayList dados = DaoControl.PreencherTabela(sql);//linhas
        String[] colunas = new String[]{"Código", "Nome", "Cor","Quantidade","Marca","Preço"};//colunas
        
        ModeloTabela modeloTable = new ModeloTabela(dados, colunas);
        jTablePesquisarBD.setModel(modeloTable);
        jTablePesquisarBD.getColumnModel().getColumn(0).setPreferredWidth(70);
        jTablePesquisarBD.getColumnModel().getColumn(0).setResizable(false);
        jTablePesquisarBD.getColumnModel().getColumn(1).setPreferredWidth(130);
        jTablePesquisarBD.getColumnModel().getColumn(1).setResizable(false);
        jTablePesquisarBD.getColumnModel().getColumn(2).setPreferredWidth(110);
        jTablePesquisarBD.getColumnModel().getColumn(2).setResizable(false);
        jTablePesquisarBD.getColumnModel().getColumn(3).setPreferredWidth(80);
        jTablePesquisarBD.getColumnModel().getColumn(3).setResizable(false);
        jTablePesquisarBD.getColumnModel().getColumn(4).setPreferredWidth(120);
        jTablePesquisarBD.getColumnModel().getColumn(4).setResizable(false);
        jTablePesquisarBD.getColumnModel().getColumn(5).setPreferredWidth(100);
        jTablePesquisarBD.getColumnModel().getColumn(5).setResizable(false);
        jTablePesquisarBD.getTableHeader().setReorderingAllowed(false);
        jTablePesquisarBD.setAutoResizeMode(jTablePesquisarBD.AUTO_RESIZE_OFF);
        jTablePesquisarBD.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

    }
    
    /**
     * Valida os Campos se foram preenchidos
     * @return 
     */
     private boolean validarCampos(){
         
        if(!jTextFieldDescricaoProduto.getText().equals("")||!jTextFieldMarcaProduto.getText().equals("")||!jTextFieldNomeProduto.getText().equals("")||
        !jFormattedTextFieldPrecoProduto.getText().equals("")||!jFormattedTextFieldQtdEstoque.getText().equals("")||
        !jComboBoxCorProduto.getSelectedItem().equals("Selecione")||!jTextFieldDescricaoProduto.getText().isEmpty()||!jTextFieldMarcaProduto.getText().isEmpty()||
        !jTextFieldNomeProduto.getText().isEmpty()||!jFormattedTextFieldPrecoProduto.getText().isEmpty()||
        !jFormattedTextFieldQtdEstoque.getText().isEmpty()){
          return true;  
        }else{
        JOptionPane.showMessageDialog(rootPane, "Preencha os Dados do Produto!");
        return false;
        }
        }
     
     
     private void limpaCampos(){
         jTextFieldCodProduto.setText("");
        jTextFieldDescricaoProduto.setText("");
        jTextFieldMarcaProduto.setText("");
        jTextFieldNomeProduto.setText("");

        jFormattedTextFieldPrecoProduto.setText("");
        jFormattedTextFieldQtdEstoque.setText("");
        jComboBoxCorProduto.setSelectedItem("Selecione");
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
    private javax.swing.JComboBox jComboBoxCorProduto;
    private javax.swing.JFormattedTextField jFormattedTextFieldPrecoProduto;
    private javax.swing.JFormattedTextField jFormattedTextFieldQtdEstoque;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelCRM;
    private javax.swing.JLabel jLabelEspecialidade;
    private javax.swing.JLabel jLabelEstoque;
    private javax.swing.JLabel jLabelIdMedico;
    private javax.swing.JLabel jLabelNomeMedico;
    private javax.swing.JPanel jPanelCadastroMoveis;
    private javax.swing.JPanel jPanelPesquisa;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinnerAddqtd;
    private javax.swing.JTable jTablePesquisarBD;
    private javax.swing.JTextField jTextFieldCodProduto;
    private javax.swing.JTextField jTextFieldDescricaoProduto;
    private javax.swing.JTextField jTextFieldMarcaProduto;
    private javax.swing.JTextField jTextFieldNomeProduto;
    private javax.swing.JTextField jTextFieldPesquisaProduto;
    // End of variables declaration//GEN-END:variables
}
