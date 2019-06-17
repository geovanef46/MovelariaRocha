/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao.vendas;

import visao.producao.*;
import controle.GerenciadorDeBD;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modeloBeans.produto.BeansProduto;
import modeloBeans.ModeloTabela;
import modeloBeans.produto.BeansMovel;


/**
 ** Form para Pesquisa de movel
 */
public class PesquisaMovel extends javax.swing.JFrame {

    
    BeansMovel modelo = new BeansMovel();
    GerenciadorDeBD DaoControl = new GerenciadorDeBD();
    private FormEntradaMovel editarMovel;
    private FormVender novaVenda;
    /**
     * Creates new form PesquisaMP
     */
    public PesquisaMovel() {
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
        jButtonEditar = new javax.swing.JButton();
        jButtonApagar = new javax.swing.JButton();
        jButtonDetalhes1 = new javax.swing.JButton();
        jButtonVender = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pesquisar Movel");
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

        jButtonEditar.setText("Editar");
        jButtonEditar.setEnabled(false);
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonApagar.setText("Apagar");
        jButtonApagar.setEnabled(false);
        jButtonApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonApagarActionPerformed(evt);
            }
        });

        jButtonDetalhes1.setText("Detalhes");
        jButtonDetalhes1.setEnabled(false);
        jButtonDetalhes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDetalhes1ActionPerformed(evt);
            }
        });

        jButtonVender.setText("Vender");
        jButtonVender.setEnabled(false);
        jButtonVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVenderActionPerformed(evt);
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
                .addComponent(jButtonApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonDetalhes1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonVender, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanelPesquisaProdutoLayout.setVerticalGroup(
            jPanelPesquisaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesquisaProdutoLayout.createSequentialGroup()
                .addGroup(jPanelPesquisaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPesquisaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                .addGap(28, 28, 28)
                .addGroup(jPanelPesquisaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDetalhes1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonVender, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        getContentPane().add(jPanelPesquisaProduto);
        jPanelPesquisaProduto.setBounds(20, 50, 860, 427);

        setSize(new java.awt.Dimension(915, 522));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTablePesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePesquisarMouseClicked

        jButtonApagar.setEnabled(true);
        jButtonDetalhes1.setEnabled(true);
        jButtonEditar.setEnabled(true);
        jButtonVender.setEnabled(true);
        String nome_movel = ""+jTablePesquisar.getValueAt(jTablePesquisar.getSelectedRow(), 1);
        modelo = (BeansMovel) DaoControl.selecionaMovel(nome_movel);
    }//GEN-LAST:event_jTablePesquisarMouseClicked

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        bloqueiaBotoes();
        if(!jTextFieldPesquisaProduto.getText().isEmpty()){
            modelo.setPesquisa(jTextFieldPesquisaProduto.getText());
            pesquisa();
        }else{
            PreencherTabela("select *from movel order by nome");
        }
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
         if (editarMovel == null) {
            editarMovel = new FormEntradaMovel(this.modelo);
            editarMovel.setVisible(true);
            editarMovel.setResizable(false);
        }else{
             
            editarMovel.setVisible(true);
            editarMovel.setResizable(false);
            editarMovel.preencheCampos(this.modelo);
        }
    }//GEN-LAST:event_jButtonEditarActionPerformed


    private void jButtonApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonApagarActionPerformed
       int resposta = 0;
        String nome= modelo.getNome();
        if(modelo!= null && !nome.isEmpty()){
        resposta = JOptionPane.showConfirmDialog(this.rootPane, "Deseja realmente apagar o Movel "+nome+" ?", "Cuidado!", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            DaoControl.excluir(modelo);
            JOptionPane.showMessageDialog(this.rootPane,nome+ " foi excluido com sucesso!");
        }
            
        }else{    
        JOptionPane.showMessageDialog(this.rootPane, "Erro ao apagar!\nSelecione um Movel");
        }    }//GEN-LAST:event_jButtonApagarActionPerformed

    private void jButtonDetalhes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDetalhes1ActionPerformed

    }//GEN-LAST:event_jButtonDetalhes1ActionPerformed

    private void jButtonVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVenderActionPerformed
               if (novaVenda == null) {
            novaVenda = new FormVender();
                novaVenda.iniciaVenda(modelo);
            novaVenda.setVisible(true);
            novaVenda.setResizable(false);
            this.dispose();
        }else{
                novaVenda.iniciaVenda(modelo);
            novaVenda.setVisible(true);
            novaVenda.setResizable(false);
                this.dispose();
        }
    
    
    }//GEN-LAST:event_jButtonVenderActionPerformed
    
    
    private void pesquisa(){

             BeansProduto model = this.DaoControl.buscaProdutoPorNome(this.modelo);
            if(model.getCodigo()!=0){
             PreencherTabela("select *from movel where nome like'%"+ this.modelo.getPesquisa()+"%'");
            }else{
             jTextFieldPesquisaProduto.setText("");
             }       
    }
    
    
    public void PreencherTabela(String sql){
               ArrayList dados = this.DaoControl.PreencherTabela(sql);//linhas
        String[] colunas = new String[]{"Código", "Nome", "Cor","Quantidade","Marca","Preço"};//colunas
        
        ModeloTabela modeloTable = new ModeloTabela(dados, colunas);
        jTablePesquisar.setModel(modeloTable);
        jTablePesquisar.getColumnModel().getColumn(0).setPreferredWidth(70);
        jTablePesquisar.getColumnModel().getColumn(0).setResizable(false);
        jTablePesquisar.getColumnModel().getColumn(1).setPreferredWidth(130);
        jTablePesquisar.getColumnModel().getColumn(1).setResizable(false);
        jTablePesquisar.getColumnModel().getColumn(2).setPreferredWidth(110);
        jTablePesquisar.getColumnModel().getColumn(2).setResizable(false);
        jTablePesquisar.getColumnModel().getColumn(3).setPreferredWidth(80);
        jTablePesquisar.getColumnModel().getColumn(3).setResizable(false);
        jTablePesquisar.getColumnModel().getColumn(4).setPreferredWidth(120);
        jTablePesquisar.getColumnModel().getColumn(4).setResizable(false);
        jTablePesquisar.getColumnModel().getColumn(5).setPreferredWidth(100);
        jTablePesquisar.getColumnModel().getColumn(5).setResizable(false);
        jTablePesquisar.getTableHeader().setReorderingAllowed(false);
        jTablePesquisar.setAutoResizeMode(jTablePesquisar.AUTO_RESIZE_OFF);
        jTablePesquisar.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }    
    public void bloqueiaBotoes(){

        jButtonApagar.setEnabled(false);
        jButtonDetalhes1.setEnabled(false);
        jButtonEditar.setEnabled(false);
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
    private javax.swing.JButton jButtonApagar;
    private javax.swing.JButton jButtonDetalhes1;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonVender;
    private javax.swing.JPanel jPanelPesquisaProduto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePesquisar;
    private javax.swing.JTextField jTextFieldPesquisaProduto;
    // End of variables declaration//GEN-END:variables
}
