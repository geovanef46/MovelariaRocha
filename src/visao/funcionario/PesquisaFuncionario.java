/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao.funcionario;

import visao.producao.*;
import controle.GerenciadorDeBD;
import java.util.ArrayList;
import javax.swing.ListSelectionModel;
import modeloBeans.produto.BeansProduto;
import modeloBeans.ModeloTabela;
import modeloBeans.funcionario.BeansFuncionario;
import modeloBeans.produto.BeansMovel;
import visao.vendas.FormVender;

/**
 ** Form para Pesquisa de funcionario
 */
public class PesquisaFuncionario extends javax.swing.JFrame {

    
    BeansFuncionario modelo = new BeansFuncionario();
    GerenciadorDeBD DaoControl = new GerenciadorDeBD();
    
    /**
     * Creates new form PesquisaFunc
     */
    public PesquisaFuncionario() {
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

        jPanelPesquisaProduto = new javax.swing.JPanel();
        jTextFieldPesquisaProduto = new javax.swing.JTextField();
        jButtonPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePesquisar = new javax.swing.JTable();
        jButtonModificarFuncionario = new javax.swing.JButton();
        jButtonDetalhes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pesquisar Funcionario");
        getContentPane().setLayout(null);

        jTextFieldPesquisaProduto.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextFieldPesquisaProduto.setToolTipText("Digite o produto que deseja procurar...");

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

        jButtonModificarFuncionario.setText("Modificar");
        jButtonModificarFuncionario.setEnabled(false);
        jButtonModificarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarFuncionarioActionPerformed(evt);
            }
        });

        jButtonDetalhes.setText("Detalhes");
        jButtonDetalhes.setEnabled(false);
        jButtonDetalhes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDetalhesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPesquisaProdutoLayout = new javax.swing.GroupLayout(jPanelPesquisaProduto);
        jPanelPesquisaProduto.setLayout(jPanelPesquisaProdutoLayout);
        jPanelPesquisaProdutoLayout.setHorizontalGroup(
            jPanelPesquisaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesquisaProdutoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelPesquisaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 822, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelPesquisaProdutoLayout.createSequentialGroup()
                        .addComponent(jTextFieldPesquisaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonPesquisar)))
                .addGap(0, 18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPesquisaProdutoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonDetalhes, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonModificarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );
        jPanelPesquisaProdutoLayout.setVerticalGroup(
            jPanelPesquisaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesquisaProdutoLayout.createSequentialGroup()
                .addGroup(jPanelPesquisaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPesquisaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanelPesquisaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDetalhes, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonModificarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
        );

        getContentPane().add(jPanelPesquisaProduto);
        jPanelPesquisaProduto.setBounds(20, 50, 860, 427);

        setSize(new java.awt.Dimension(915, 522));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTablePesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePesquisarMouseClicked

        jButtonDetalhes.setEnabled(true);

        jButtonModificarFuncionario.setEnabled(true);
        String nome_Func = ""+jTablePesquisar.getValueAt(jTablePesquisar.getSelectedRow(), 1);
        modelo = (BeansFuncionario) DaoControl.selecionaFunc(nome_Func);
    }//GEN-LAST:event_jTablePesquisarMouseClicked

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        bloqueiaBotoes();
        if(!jTextFieldPesquisaProduto.getText().isEmpty()){
            modelo.setPesquisa(jTextFieldPesquisaProduto.getText());
            pesquisa();
        }else{
            PreencherTabela("select *from funcionario order by nome");
        }
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jButtonModificarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarFuncionarioActionPerformed
//            if (novaVenda == null) {
//            novaVenda = new FormVender();
//                novaVenda.iniciaVenda(modelo);
//            novaVenda.setVisible(true);
//            novaVenda.setResizable(false);
//            this.dispose();
//        }else{
//                novaVenda.iniciaVenda(modelo);
//            novaVenda.setVisible(true);
//            novaVenda.setResizable(false);
//                this.dispose();
//        }
    }//GEN-LAST:event_jButtonModificarFuncionarioActionPerformed

    private void jButtonDetalhesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDetalhesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonDetalhesActionPerformed
    
    
    private void pesquisa(){

             BeansFuncionario model = DaoControl.selecionaFunc(modelo);
            if(model.getCPF()!= null){
             PreencherTabela("select *from funcionario where nome like'%"+ modelo.getPesquisa()+"%'");
            }else{
             jTextFieldPesquisaProduto.setText("");
             }       
    }
    
    
    public void PreencherTabela(String sql){
               ArrayList dados = DaoControl.PreencherTabela(sql);//linhas
        String[] colunas = new String[]{"CPF", "Nome", "Funcao","Telefone 01","Telefone 02"};//colunas
        
        ModeloTabela modeloTable = new ModeloTabela(dados, colunas);
        jTablePesquisar.setModel(modeloTable);
        jTablePesquisar.getColumnModel().getColumn(0).setPreferredWidth(130);
        jTablePesquisar.getColumnModel().getColumn(0).setResizable(false);
        jTablePesquisar.getColumnModel().getColumn(1).setPreferredWidth(130);
        jTablePesquisar.getColumnModel().getColumn(1).setResizable(false);
        jTablePesquisar.getColumnModel().getColumn(2).setPreferredWidth(110);
        jTablePesquisar.getColumnModel().getColumn(2).setResizable(false);
        jTablePesquisar.getColumnModel().getColumn(3).setPreferredWidth(120);
        jTablePesquisar.getColumnModel().getColumn(3).setResizable(false);
        jTablePesquisar.getColumnModel().getColumn(4).setPreferredWidth(120);
        jTablePesquisar.getColumnModel().getColumn(4).setResizable(false);
        jTablePesquisar.getTableHeader().setReorderingAllowed(false);
        jTablePesquisar.setAutoResizeMode(jTablePesquisar.AUTO_RESIZE_OFF);
        jTablePesquisar.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }    
    public void bloqueiaBotoes(){

        jButtonDetalhes.setEnabled(false);
 
        jButtonModificarFuncionario.setEnabled(false);
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
            java.util.logging.Logger.getLogger(PesquisaMP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PesquisaMP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PesquisaMP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PesquisaMP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PesquisaMP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDetalhes;
    private javax.swing.JButton jButtonModificarFuncionario;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JPanel jPanelPesquisaProduto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePesquisar;
    private javax.swing.JTextField jTextFieldPesquisaProduto;
    // End of variables declaration//GEN-END:variables
}
