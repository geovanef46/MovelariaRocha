/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao.cliente;

import controle.GerenciadorDeBD;
import java.util.ArrayList;
import javax.swing.ListSelectionModel;
import modeloBeans.empresa.BeansCliente;
import modeloBeans.ModeloTabela;
import visao.vendas.FormVender;



/**
 * View de pesquisa de cliente,permite realizar a busca de 
 * Empresas para vincular em uma venda ou em um fornecimento 
 * @author geovanef46
 */
public class AdicionaCliente extends javax.swing.JFrame {

    
    private BeansCliente modelo = new BeansCliente();
    private GerenciadorDeBD DaoControl = new GerenciadorDeBD();
    
    private FormEntradaEmpresa novaEmpresa;
    private FormVender formVender;

    public AdicionaCliente(){
    }
    
    
    /**
     * Creates
     */
    public AdicionaCliente(FormVender vender) {
        initComponents();
        this.formVender = vender;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelAdicionaLoja = new javax.swing.JPanel();
        jTextFieldPesquisaLoja = new javax.swing.JTextField();
        jButtonPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePesquisar = new javax.swing.JTable();
        jCheckBoxCNPJ = new javax.swing.JCheckBox();
        jCheckBoxNome = new javax.swing.JCheckBox();
        jButtonAdicionarCliente = new javax.swing.JButton();
        jButtonNovoCliente = new javax.swing.JButton();
        jLabelPesquisarProduto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanelAdicionaLoja.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextFieldPesquisaLoja.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextFieldPesquisaLoja.setToolTipText("Digite a Loja que deseja procurar...");

        jButtonPesquisar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        jTablePesquisar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTablePesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePesquisarMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePesquisar);

        jCheckBoxCNPJ.setText("Por CNPJ");
        jCheckBoxCNPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxCNPJActionPerformed(evt);
            }
        });

        jCheckBoxNome.setSelected(true);
        jCheckBoxNome.setText("Por Nome");
        jCheckBoxNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxNomeActionPerformed(evt);
            }
        });

        jButtonAdicionarCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonAdicionarCliente.setText("Adicionar");
        jButtonAdicionarCliente.setEnabled(false);
        jButtonAdicionarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarClienteActionPerformed(evt);
            }
        });

        jButtonNovoCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonNovoCliente.setText("Novo");
        jButtonNovoCliente.setEnabled(false);
        jButtonNovoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAdicionaLojaLayout = new javax.swing.GroupLayout(jPanelAdicionaLoja);
        jPanelAdicionaLoja.setLayout(jPanelAdicionaLojaLayout);
        jPanelAdicionaLojaLayout.setHorizontalGroup(
            jPanelAdicionaLojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAdicionaLojaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelAdicionaLojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 822, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelAdicionaLojaLayout.createSequentialGroup()
                        .addComponent(jTextFieldPesquisaLoja, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(jButtonPesquisar)
                        .addGap(44, 44, 44)
                        .addComponent(jCheckBoxNome)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBoxCNPJ)))
                .addGap(0, 4, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAdicionaLojaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonNovoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jButtonAdicionarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        jPanelAdicionaLojaLayout.setVerticalGroup(
            jPanelAdicionaLojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAdicionaLojaLayout.createSequentialGroup()
                .addGroup(jPanelAdicionaLojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAdicionaLojaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelAdicionaLojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBoxCNPJ)
                            .addComponent(jCheckBoxNome)))
                    .addComponent(jTextFieldPesquisaLoja, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanelAdicionaLojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAdicionarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNovoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
        );

        getContentPane().add(jPanelAdicionaLoja);
        jPanelAdicionaLoja.setBounds(20, 50, 860, 403);

        jLabelPesquisarProduto.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabelPesquisarProduto.setText("Adicionar Cliente");
        getContentPane().add(jLabelPesquisarProduto);
        jLabelPesquisarProduto.setBounds(370, 10, 200, 30);

        setSize(new java.awt.Dimension(917, 522));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBoxNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxNomeActionPerformed
        if (jCheckBoxNome.isSelected()) {
            jCheckBoxCNPJ.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBoxNomeActionPerformed

    private void jCheckBoxCNPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxCNPJActionPerformed
        if (jCheckBoxCNPJ.isSelected()) {
            jCheckBoxNome.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBoxCNPJActionPerformed

    private void jTablePesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePesquisarMouseClicked
        jButtonAdicionarCliente.setEnabled(true);
        String loja = ""+jTablePesquisar.getValueAt(jTablePesquisar.getSelectedRow(),1);
        modelo = DaoControl.buscaLojaPorCNPJ(loja);
    }//GEN-LAST:event_jTablePesquisarMouseClicked

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        bloqueiaBotoes();
        if(!jTextFieldPesquisaLoja.getText().isEmpty()){
            modelo.setPesquisa(jTextFieldPesquisaLoja.getText());
            pesquisa();
        }else{
            PreencherTabela("select *from Empresa order by nome");
        }//select *from Empresa where tipo='CLIENTE' order by nome
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jButtonAdicionarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarClienteActionPerformed
            if (formVender == null) {
            formVender = new FormVender();
            formVender.adicionaLoja((BeansCliente)modelo);
            formVender.setVisible(true);
            formVender.setResizable(false);
            this.dispose();
        }else{
                formVender.adicionaLoja((BeansCliente)modelo);
            formVender.setVisible(true);
            formVender.setResizable(false);
            this.dispose();
        }
    }//GEN-LAST:event_jButtonAdicionarClienteActionPerformed

    private void jButtonNovoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoClienteActionPerformed
            if (novaEmpresa == null) {
            novaEmpresa = new FormEntradaEmpresa();
            novaEmpresa.setVisible(true);
            novaEmpresa.setResizable(false);
        }else{
            novaEmpresa.setVisible(true);
            novaEmpresa.setResizable(false);
        }
    }//GEN-LAST:event_jButtonNovoClienteActionPerformed
    
    /**
     * Realiza Pesquisa de acordo com a seleção dos CheckBox
     */
    private void pesquisa(){
        if(jCheckBoxNome.isSelected()){
             BeansCliente model = (BeansCliente) DaoControl.buscaLojaPorNome((BeansCliente) modelo);
            if(model.getCNPJ() != null){
             PreencherTabela("select *from Empresa where nome like'%"+ modelo.getPesquisa()+"%'");
            }else{
             jTextFieldPesquisaLoja.setText("");
             }       
        }else{
         BeansCliente model = (BeansCliente) DaoControl.buscaLojaPorTipo((BeansCliente) modelo);
         if(model.getCNPJ()!= null){
            PreencherTabela("select *from Empresa where CNPJ like'%"+ modelo.getPesquisa()+"%'");
         }else{
            jTextFieldPesquisaLoja.setText("");
         }        
        }
    }
    
    /**
     * Preenche a tabela com linhas (dados) e colunas (referencias)
     * @param sql 
     */
    public void PreencherTabela(String sql){ //
        ArrayList dados = DaoControl.PreencherTabelaLoja(sql);
        String[] colunas = new String[]{"CNPJ", "Nome", "Rua","Bairro","Cidade","Tipo de Empresa"};//colunas

        
        ModeloTabela modeloTable = new ModeloTabela(dados, colunas);
        jTablePesquisar.setModel(modeloTable);
        jTablePesquisar.getColumnModel().getColumn(0).setPreferredWidth(120);
        jTablePesquisar.getColumnModel().getColumn(0).setResizable(false);
        jTablePesquisar.getColumnModel().getColumn(1).setPreferredWidth(160);
        jTablePesquisar.getColumnModel().getColumn(1).setResizable(false);
        jTablePesquisar.getColumnModel().getColumn(2).setPreferredWidth(120);
        jTablePesquisar.getColumnModel().getColumn(2).setResizable(false);
        jTablePesquisar.getColumnModel().getColumn(3).setPreferredWidth(100);
        jTablePesquisar.getColumnModel().getColumn(3).setResizable(false);
        jTablePesquisar.getColumnModel().getColumn(4).setPreferredWidth(105);
        jTablePesquisar.getColumnModel().getColumn(4).setResizable(false);
        jTablePesquisar.getColumnModel().getColumn(5).setPreferredWidth(105);
        jTablePesquisar.getColumnModel().getColumn(5).setResizable(false);
        jTablePesquisar.getTableHeader().setReorderingAllowed(false);
        jTablePesquisar.setAutoResizeMode(jTablePesquisar.AUTO_RESIZE_OFF);
        jTablePesquisar.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

    }
    
    public void bloqueiaBotoes(){
        jButtonAdicionarCliente.setEnabled(false);
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
            java.util.logging.Logger.getLogger(AdicionaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdicionaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdicionaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdicionaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdicionaCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdicionarCliente;
    private javax.swing.JButton jButtonNovoCliente;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JCheckBox jCheckBoxCNPJ;
    private javax.swing.JCheckBox jCheckBoxNome;
    private javax.swing.JLabel jLabelPesquisarProduto;
    private javax.swing.JPanel jPanelAdicionaLoja;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePesquisar;
    private javax.swing.JTextField jTextFieldPesquisaLoja;
    // End of variables declaration//GEN-END:variables
}
