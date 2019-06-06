/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

//import visao.relatorio.GerarRelatorio;
import modeloBeans.funcionario.BeansFuncionario;
import visao.producao.FormEntradaMovel;
//import visao.produto.PesquisaProduto;
//import visao.produto.FormVender;
import visao.producao.FormEntradaMP;
import visao.funcionario.FormEntradaFuncionario;
import visao.producao.PesquisaMovel;

/**
 *  View Principal do Administrador
 * @author geovanef46
 */
public class TelaPrincipal extends javax.swing.JFrame {

    private FormEntradaMovel entradaMovel;
    private FormEntradaFuncionario novoFuncionario;
    private PesquisaMovel novaPesquisa;
//    private FormVender novaVenda;
//    private GerarRelatorio gerar;
    private FormEntradaMP entradaMP;
    private BeansFuncionario funcionarioAtivo;
 

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        //conecta.conexao();
    }

    public TelaPrincipal(BeansFuncionario funcionario) {
          initComponents();
          funcionarioAtivo = funcionario;
          //conecta.conexao();
        
        jLabelUsuario.setText("Bem-Vindo   "+funcionario.GERENTE);
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.imageIco
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrameBemVindo = new javax.swing.JInternalFrame();
        jLabelTituloInterno = new javax.swing.JLabel();
        jPanelInterno = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButtonAdicionar = new javax.swing.JButton();
        jButtonPesquisar = new javax.swing.JButton();
        jButtonVender = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButtonPesquisarFuncionario = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonNovoFuncionario = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButtonGerarRelatorio = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButtonAdicionarLoja = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabelFundoTelaPrincipal = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuIniciar = new javax.swing.JMenu();
        jMenuItemNovoProduto = new javax.swing.JMenuItem();
        jMenuItemPesquisar = new javax.swing.JMenuItem();
        jMenuRelatorios = new javax.swing.JMenu();
        jMenuFerramentas = new javax.swing.JMenu();
        jMenuItemBemVindo = new javax.swing.JMenuItem();
        jMenuSobre = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ADMINISTRADOR");
        setBackground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                FechouJanelaPrincipal(evt);
            }
        });
        getContentPane().setLayout(null);

        jInternalFrameBemVindo.setBackground(new java.awt.Color(220, 222, 228));
        jInternalFrameBemVindo.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(240, 240, 240), null));
        jInternalFrameBemVindo.setClosable(true);
        jInternalFrameBemVindo.setTitle("Bem - Vindo");
        jInternalFrameBemVindo.setFocusTraversalPolicyProvider(true);
        jInternalFrameBemVindo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jInternalFrameBemVindo.setFrameIcon(null);
        try {
            jInternalFrameBemVindo.setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        jInternalFrameBemVindo.setVisible(true);
        jInternalFrameBemVindo.getContentPane().setLayout(null);

        jLabelTituloInterno.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabelTituloInterno.setText("Movelaria Rocha");
        jInternalFrameBemVindo.getContentPane().add(jLabelTituloInterno);
        jLabelTituloInterno.setBounds(310, 10, 190, 30);

        jPanelInterno.setBackground(new java.awt.Color(229, 225, 240));
        jPanelInterno.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelInterno.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), null));
        jPanel3.setLayout(null);

        jButtonAdicionar.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jButtonAdicionar.setForeground(new java.awt.Color(5, 5, 19));
        jButtonAdicionar.setText("Novo");
        jButtonAdicionar.setToolTipText("Adicionar um Produto ao Estoque");
        jButtonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonAdicionar);
        jButtonAdicionar.setBounds(40, 60, 100, 50);

        jButtonPesquisar.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jButtonPesquisar.setForeground(new java.awt.Color(5, 5, 19));
        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.setToolTipText("Pesquisar um produto");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonPesquisar);
        jButtonPesquisar.setBounds(40, 140, 110, 50);

        jButtonVender.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jButtonVender.setForeground(new java.awt.Color(5, 5, 19));
        jButtonVender.setText("Vender");
        jButtonVender.setToolTipText("Vender um produto");
        jButtonVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVenderActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonVender);
        jButtonVender.setBounds(40, 220, 100, 50);

        jLabel4.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(5, 5, 19));
        jLabel4.setText("Produtos:");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(60, 10, 80, 30);

        jPanelInterno.add(jPanel3);
        jPanel3.setBounds(10, 10, 170, 320);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), null));
        jPanel1.setLayout(null);

        jButtonPesquisarFuncionario.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jButtonPesquisarFuncionario.setForeground(new java.awt.Color(5, 5, 19));
        jButtonPesquisarFuncionario.setText("Pesquisar");
        jButtonPesquisarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarFuncionarioActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonPesquisarFuncionario);
        jButtonPesquisarFuncionario.setBounds(50, 220, 110, 50);

        jLabel1.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(5, 5, 19));
        jLabel1.setText("Funcionários:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(50, 10, 110, 30);

        jButtonNovoFuncionario.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jButtonNovoFuncionario.setForeground(new java.awt.Color(5, 5, 19));
        jButtonNovoFuncionario.setText("Novo");
        jButtonNovoFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoFuncionarioActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonNovoFuncionario);
        jButtonNovoFuncionario.setBounds(50, 60, 110, 50);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(5, 5, 19));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Crystal_Clear_app_Login_Manager.png"))); // NOI18N
        jLabel3.setText("  ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 70, 150, 190);

        jPanelInterno.add(jPanel1);
        jPanel1.setBounds(360, 10, 190, 320);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), null));
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(5, 5, 19));
        jLabel2.setText("Relatórios:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(50, 10, 100, 30);

        jButtonGerarRelatorio.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jButtonGerarRelatorio.setForeground(new java.awt.Color(5, 5, 19));
        jButtonGerarRelatorio.setText("Gerar");
        jButtonGerarRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGerarRelatorioActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonGerarRelatorio);
        jButtonGerarRelatorio.setBounds(30, 220, 120, 50);

        jLabel5.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(5, 5, 19));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/relatorio.png"))); // NOI18N
        jPanel2.add(jLabel5);
        jLabel5.setBounds(20, 50, 150, 160);

        jPanelInterno.add(jPanel2);
        jPanel2.setBounds(550, 10, 190, 320);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), null));
        jPanel4.setLayout(null);

        jButtonAdicionarLoja.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jButtonAdicionarLoja.setForeground(new java.awt.Color(5, 5, 19));
        jButtonAdicionarLoja.setText("Novo");
        jButtonAdicionarLoja.setToolTipText("Adicionar um novo Cliente");
        jButtonAdicionarLoja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarLojaActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonAdicionarLoja);
        jButtonAdicionarLoja.setBounds(40, 60, 100, 50);

        jLabel6.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(5, 5, 19));
        jLabel6.setText("Lojas:");
        jPanel4.add(jLabel6);
        jLabel6.setBounds(70, 10, 80, 30);

        jPanelInterno.add(jPanel4);
        jPanel4.setBounds(180, 10, 180, 320);

        jInternalFrameBemVindo.getContentPane().add(jPanelInterno);
        jPanelInterno.setBounds(10, 40, 750, 340);

        getContentPane().add(jInternalFrameBemVindo);
        jInternalFrameBemVindo.setBounds(30, 50, 780, 420);
        try {
            jInternalFrameBemVindo.setIcon(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }

        jLabelFundoTelaPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        jLabelFundoTelaPrincipal.setEnabled(false);
        getContentPane().add(jLabelFundoTelaPrincipal);
        jLabelFundoTelaPrincipal.setBounds(0, 0, 840, 500);

        jLabelUsuario.setText("Bem - Vindo");
        jLabelUsuario.setToolTipText("Usuário Ativo");
        jLabelUsuario.setEnabled(false);
        getContentPane().add(jLabelUsuario);
        jLabelUsuario.setBounds(620, 490, 200, 20);

        jMenuIniciar.setText("Iniciar");

        jMenuItemNovoProduto.setText("Novo Produto");
        jMenuItemNovoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNovoProdutoActionPerformed(evt);
            }
        });
        jMenuIniciar.add(jMenuItemNovoProduto);

        jMenuItemPesquisar.setText("Pesquisar");
        jMenuItemPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPesquisarActionPerformed(evt);
            }
        });
        jMenuIniciar.add(jMenuItemPesquisar);

        jMenuBar1.add(jMenuIniciar);

        jMenuRelatorios.setText("Relatórios");
        jMenuBar1.add(jMenuRelatorios);

        jMenuFerramentas.setText("Ferramentas");

        jMenuItemBemVindo.setText("Tela Bem-Vindo");
        jMenuItemBemVindo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemBemVindoActionPerformed(evt);
            }
        });
        jMenuFerramentas.add(jMenuItemBemVindo);

        jMenuBar1.add(jMenuFerramentas);

        jMenuSobre.setText("Sobre");
        jMenuSobre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSobreMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuSobre);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(858, 573));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuSobreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSobreMouseClicked
        //conecta.desconecta();//caso exista alguma conexão aberta
      
    }//GEN-LAST:event_jMenuSobreMouseClicked

    private void jMenuItemBemVindoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemBemVindoActionPerformed
        jInternalFrameBemVindo.setFocusable(true);
        jInternalFrameBemVindo.setVisible(true);
    }//GEN-LAST:event_jMenuItemBemVindoActionPerformed

    private void jMenuItemNovoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNovoProdutoActionPerformed
//         if (novaEntrada == null) {
//            novaEntrada = new FormEntradaMovel();
//            novaEntrada.setVisible(true);
//            novaEntrada.setResizable(false);
//        }else{
//            novaEntrada.setVisible(true);
//            novaEntrada.setResizable(false);  
//        }
    }//GEN-LAST:event_jMenuItemNovoProdutoActionPerformed

    private void jMenuItemPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPesquisarActionPerformed
//        if (novaPesquisa == null) {
//            novaPesquisa = new PesquisaProduto();
//            novaPesquisa.setVisible(true);
//            novaPesquisa.setResizable(false);
//        }else{
//            novaPesquisa.setVisible(true);
//            novaPesquisa.setResizable(false);
//        }
    }//GEN-LAST:event_jMenuItemPesquisarActionPerformed

    private void jButtonPesquisarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonPesquisarFuncionarioActionPerformed

    private void jButtonNovoFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoFuncionarioActionPerformed
        if (novoFuncionario == null) {
            novoFuncionario = new FormEntradaFuncionario();
            novoFuncionario.setVisible(true);
            novoFuncionario.setResizable(false);
        }else{
            novoFuncionario.setVisible(true);
            novoFuncionario.setResizable(false);  
        }

    }//GEN-LAST:event_jButtonNovoFuncionarioActionPerformed

    private void jButtonVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVenderActionPerformed
//        if (novaVenda == null) {
//            novaVenda = new FormVender();
//            novaVenda.setVisible(true);
//            novaVenda.setResizable(false);
//        }else{
//            novaVenda.setVisible(true);
//            novaVenda.setResizable(false);
//        }
    }//GEN-LAST:event_jButtonVenderActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        if (novaPesquisa == null) {
            novaPesquisa = new PesquisaMovel();
            novaPesquisa.setVisible(true);
            novaPesquisa.setResizable(false);
        }else{
            novaPesquisa.setVisible(true);
            novaPesquisa.setResizable(false);
        }

    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jButtonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarActionPerformed
        if (entradaMovel == null) {
            entradaMovel = new FormEntradaMovel();
            entradaMovel.setVisible(true);
            entradaMovel.setResizable(false);
        }else{
            entradaMovel.setVisible(true);
            entradaMovel.setResizable(false);
        }

    }//GEN-LAST:event_jButtonAdicionarActionPerformed

    private void jButtonGerarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGerarRelatorioActionPerformed
// 
//        if (gerar == null) {
//            gerar = new GerarRelatorio();
//            gerar.setVisible(true);
//            gerar.setResizable(false);
//        }else{
//            gerar.setVisible(true);
//            gerar.setResizable(false);
//        }
    }//GEN-LAST:event_jButtonGerarRelatorioActionPerformed

    private void jButtonAdicionarLojaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarLojaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAdicionarLojaActionPerformed

    private void FechouJanelaPrincipal(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_FechouJanelaPrincipal
        TelaLogin.tela.setVisible(true);
    }//GEN-LAST:event_FechouJanelaPrincipal

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdicionar;
    private javax.swing.JButton jButtonAdicionarLoja;
    private javax.swing.JButton jButtonGerarRelatorio;
    private javax.swing.JButton jButtonNovoFuncionario;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonPesquisarFuncionario;
    private javax.swing.JButton jButtonVender;
    private javax.swing.JInternalFrame jInternalFrameBemVindo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelFundoTelaPrincipal;
    private javax.swing.JLabel jLabelTituloInterno;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuFerramentas;
    private javax.swing.JMenu jMenuIniciar;
    private javax.swing.JMenuItem jMenuItemBemVindo;
    private javax.swing.JMenuItem jMenuItemNovoProduto;
    private javax.swing.JMenuItem jMenuItemPesquisar;
    private javax.swing.JMenu jMenuRelatorios;
    private javax.swing.JMenu jMenuSobre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelInterno;
    // End of variables declaration//GEN-END:variables
}
