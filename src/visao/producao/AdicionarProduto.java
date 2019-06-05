/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao.producao;

import controle.GerenciadorDeBD;
import java.util.ArrayList;
import javax.swing.ListSelectionModel;
import modeloBeans.ModeloTabela;
import modeloBeans.produto.BeansMovel;
import visao.vendas.FormVender;

/**
 * View principal dos Produtos
 * @author geovanef46
 */
public class AdicionarProduto extends javax.swing.JFrame {

    
    BeansMovel modelo = new BeansMovel();
    GerenciadorDeBD DaoControl = new GerenciadorDeBD();
    private FormVender formVender;
    
    
    public AdicionarProduto()  {
    }
    /**
     * Creates
     */
    public AdicionarProduto(FormVender vender) {
        initComponents();
        formVender = vender;
    }

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelAdicionaProduto = new javax.swing.JPanel();
        jTextFieldPesquisaProduto = new javax.swing.JTextField();
        jButtonPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePesquisar = new javax.swing.JTable();
        jButtonVender = new javax.swing.JButton();
        jLabelPesquisarProduto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanelAdicionaProduto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextFieldPesquisaProduto.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextFieldPesquisaProduto.setToolTipText("Digite o produto que deseja procurar...");

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

        jButtonVender.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonVender.setText("Adicionar");
        jButtonVender.setEnabled(false);
        jButtonVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVenderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAdicionaProdutoLayout = new javax.swing.GroupLayout(jPanelAdicionaProduto);
        jPanelAdicionaProduto.setLayout(jPanelAdicionaProdutoLayout);
        jPanelAdicionaProdutoLayout.setHorizontalGroup(
            jPanelAdicionaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAdicionaProdutoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelAdicionaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 822, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelAdicionaProdutoLayout.createSequentialGroup()
                        .addComponent(jTextFieldPesquisaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(jButtonPesquisar)))
                .addGap(0, 14, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAdicionaProdutoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonVender, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        jPanelAdicionaProdutoLayout.setVerticalGroup(
            jPanelAdicionaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAdicionaProdutoLayout.createSequentialGroup()
                .addGroup(jPanelAdicionaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldPesquisaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jButtonVender, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        getContentPane().add(jPanelAdicionaProduto);
        jPanelAdicionaProduto.setBounds(20, 50, 860, 403);

        jLabelPesquisarProduto.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabelPesquisarProduto.setText("Adicionar Produto");
        getContentPane().add(jLabelPesquisarProduto);
        jLabelPesquisarProduto.setBounds(370, 10, 200, 30);

        setSize(new java.awt.Dimension(917, 522));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTablePesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePesquisarMouseClicked
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

    private void jButtonVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVenderActionPerformed
            if (formVender == null) {
                
            formVender = new FormVender();
                formVender.adicionaProduto(modelo);
            formVender.setVisible(true);
            formVender.setResizable(false);
            this.dispose();
        }else{
                formVender.adicionaProduto(modelo);
            formVender.setVisible(true);
            formVender.setResizable(false);
            this.dispose();
        }
    }//GEN-LAST:event_jButtonVenderActionPerformed
    
    
    private void pesquisa(){

             BeansMovel model = (BeansMovel) DaoControl.buscaProdutoPorNome(modelo);
            if(model.getCodigo()!= 0){
             PreencherTabela("select *from movel where nome like'%"+ modelo.getPesquisa()+"%'");
            }else{
             jTextFieldPesquisaProduto.setText("");
             }       
        
    }
    
    
    public void PreencherTabela(String sql){
        ArrayList dados = DaoControl.PreencherTabela(sql);
        String[] colunas = new String[]{"Código", "Nome", "Cor","Quantidade","Marca","Preço"};//colunas

        ModeloTabela modeloTable = new ModeloTabela(dados, colunas);
        jTablePesquisar.setModel(modeloTable);
        jTablePesquisar.getColumnModel().getColumn(0).setPreferredWidth(80);
        jTablePesquisar.getColumnModel().getColumn(0).setResizable(false);
        jTablePesquisar.getColumnModel().getColumn(1).setPreferredWidth(150);
        jTablePesquisar.getColumnModel().getColumn(1).setResizable(false);
        jTablePesquisar.getColumnModel().getColumn(2).setPreferredWidth(120);
        jTablePesquisar.getColumnModel().getColumn(2).setResizable(false);
        jTablePesquisar.getColumnModel().getColumn(3).setPreferredWidth(120);
        jTablePesquisar.getColumnModel().getColumn(3).setResizable(false);
        jTablePesquisar.getColumnModel().getColumn(4).setPreferredWidth(120);
        jTablePesquisar.getColumnModel().getColumn(4).setResizable(false);
        jTablePesquisar.getColumnModel().getColumn(5).setPreferredWidth(120);
        jTablePesquisar.getColumnModel().getColumn(5).setResizable(false);
        jTablePesquisar.getTableHeader().setReorderingAllowed(false);
        jTablePesquisar.setAutoResizeMode(jTablePesquisar.AUTO_RESIZE_OFF);
        jTablePesquisar.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

    }
    
    public void bloqueiaBotoes(){
        jButtonVender.setEnabled(false);
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

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdicionarProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonVender;
    private javax.swing.JLabel jLabelPesquisarProduto;
    private javax.swing.JPanel jPanelAdicionaProduto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePesquisar;
    private javax.swing.JTextField jTextFieldPesquisaProduto;
    // End of variables declaration//GEN-END:variables
}
