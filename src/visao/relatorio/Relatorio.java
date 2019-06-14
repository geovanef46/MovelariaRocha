/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao.relatorio;

import controle.GerenciadorDeRelatorio;

import java.util.ArrayList;

import javax.swing.ListSelectionModel;
import modeloBeans.ModeloTabela;


/**
 *
 * @author geovanef46
 */
public class Relatorio extends javax.swing.JFrame {
    private ModeloTabela modeloTable;
    GerenciadorDeRelatorio DaoRelatorio = new GerenciadorDeRelatorio();
    

    
//    Produtos Em Desconto
//    Compras Por Loja
//    Clientes Que Mais Compram
//    Controle de Quantidade
//    Moveis Mais Caros
//    Mais Vendido
//    Promoção R$500,00
//    Listar Funcionarios Por Cidade
//    Média de Preço Moveis  
    
//    select nome, preco, preco*0.9 as Preco_Descontado from produto p 
//    where p.tipoProduto = 'movel' 
//    order by Preco_Descontado DESC
//    Creates new form Relatorio
//    
  // "Fluxo de Entada de Moveis", "Fluxo de Saida de Moveis", "Compras por Cliente", "Compras por Periodo", "Mais Vendido", "Menos Vendido", "Fluxo de Caixa"
    
    /**
     */
    public Relatorio() {
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableRelatorio = new javax.swing.JTable();
        jLabelRelatorio = new javax.swing.JLabel();
        jLabelTipoDeRelatorio = new javax.swing.JLabel();
        jLabelTipoDeRelatorio1 = new javax.swing.JLabel();
        jLabelqtdEstoque = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Relatorio");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTableRelatorio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableRelatorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableRelatorioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableRelatorio);

        jLabelRelatorio.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabelRelatorio.setText("Relatório");

        jLabelTipoDeRelatorio.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabelTipoDeRelatorio.setText("Quantidade Em Estoque:");

        jLabelTipoDeRelatorio1.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N

        jLabelqtdEstoque.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelTipoDeRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabelqtdEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)))
                .addContainerGap(341, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 916, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(271, 271, 271)
                    .addComponent(jLabelTipoDeRelatorio1, javax.swing.GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE)
                    .addGap(22, 22, 22)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabelRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 354, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTipoDeRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelqtdEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(99, 99, 99)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(106, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(31, 31, 31)
                    .addComponent(jLabelTipoDeRelatorio1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(401, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
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

        setSize(new java.awt.Dimension(954, 540));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTableRelatorioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableRelatorioMouseClicked
        
    }//GEN-LAST:event_jTableRelatorioMouseClicked
    
    public void SelecionaTipo(String tipo){
        
       
        if (tipo.equalsIgnoreCase("Fluxo de Entrada de Moveis")) {
            PreencherTabelaEntrada("select *from movel order by codigo");
            jLabelTipoDeRelatorio.setText("Fluxo de Entrada");
            
        }if (tipo.equalsIgnoreCase("Compras por Cliente")) {
            PreencherTabelaCompras("SELECT * FROM compra order by cliente_CNPJ");
            
        }if (tipo.equalsIgnoreCase("Fluxo de Saida de Moveis")) {
            
        }if (tipo.equalsIgnoreCase("Compras por Periodo")) {
            
        }if (tipo.equalsIgnoreCase("Mais Vendido")) {
            
        }
    }
    
    public void PreencherTabelaCompras(String sql){
        
          ArrayList dados = DaoRelatorio.PreencherRelatorioCompras(sql);
          String[] colunas = new String[]{"CNPJ do Cliente", "Data da Compra","Código", "Valor Total","CPF do Vendedor"};//colunas
           modeloTable = new ModeloTabela(dados, colunas);  
        jTableRelatorio.setModel(modeloTable);
        jTableRelatorio.getColumnModel().getColumn(0).setPreferredWidth(183);
        jTableRelatorio.getColumnModel().getColumn(0).setResizable(false);
        jTableRelatorio.getColumnModel().getColumn(1).setPreferredWidth(183);
        jTableRelatorio.getColumnModel().getColumn(1).setResizable(false);
        jTableRelatorio.getColumnModel().getColumn(2).setPreferredWidth(183);
        jTableRelatorio.getColumnModel().getColumn(2).setResizable(false);
        jTableRelatorio.getColumnModel().getColumn(3).setPreferredWidth(183);
        jTableRelatorio.getColumnModel().getColumn(3).setResizable(false);
        jTableRelatorio.getColumnModel().getColumn(4).setPreferredWidth(183);
        jTableRelatorio.getColumnModel().getColumn(4).setResizable(false);
        jTableRelatorio.getTableHeader().setReorderingAllowed(false);
        jTableRelatorio.setAutoResizeMode(jTableRelatorio.AUTO_RESIZE_OFF);
        jTableRelatorio.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
    public void PreencherTabelaEntrada(String sql){
              ArrayList dados = DaoRelatorio.PreencherRelatorioEntrada(sql);
          String[] colunas = new String[]{"Código", "Nome", "Cor","Quantidade em Estoque","Marca","Preço"};//colunas
           modeloTable = new ModeloTabela(dados, colunas);  
        jTableRelatorio.setModel(modeloTable);
        jTableRelatorio.getColumnModel().getColumn(0).setPreferredWidth(100);
        jTableRelatorio.getColumnModel().getColumn(0).setResizable(false);
        jTableRelatorio.getColumnModel().getColumn(1).setPreferredWidth(170);
        jTableRelatorio.getColumnModel().getColumn(1).setResizable(false);
        jTableRelatorio.getColumnModel().getColumn(2).setPreferredWidth(152);
        jTableRelatorio.getColumnModel().getColumn(2).setResizable(false);
        jTableRelatorio.getColumnModel().getColumn(3).setPreferredWidth(170);
        jTableRelatorio.getColumnModel().getColumn(3).setResizable(false);
        jTableRelatorio.getColumnModel().getColumn(4).setPreferredWidth(152);
        jTableRelatorio.getColumnModel().getColumn(4).setResizable(false);
        jTableRelatorio.getColumnModel().getColumn(5).setPreferredWidth(164);
        jTableRelatorio.getColumnModel().getColumn(5).setResizable(false);
        jTableRelatorio.getTableHeader().setReorderingAllowed(false);
        jTableRelatorio.setAutoResizeMode(jTableRelatorio.AUTO_RESIZE_OFF);
        jTableRelatorio.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
//        jLabelqtdEstoque.setText(DaoRelatorio.retornaQTDRelatorio(dados));

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
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Relatorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelRelatorio;
    private javax.swing.JLabel jLabelTipoDeRelatorio;
    private javax.swing.JLabel jLabelTipoDeRelatorio1;
    private javax.swing.JLabel jLabelqtdEstoque;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableRelatorio;
    // End of variables declaration//GEN-END:variables
}
