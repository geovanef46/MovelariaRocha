/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao.funcionario;

//import visao.produto.FormEntradaProduto;
//import visao.produto.PesquisaProduto;
//import visao.produto.FormVender;
import controle.GerenciadorDeFuncionario;
import controle.GerenciadorDeLogin;
import modeloBeans.funcionario.BeansFuncionario;
import modeloConection.ConexaoBD;
import modeloDAO.DaoLogin;
import visao.TelaLogin;
import visao.cliente.FormEntradaEmpresa;
import visao.producao.FormEntradaMP;
import visao.producao.FormEntradaMovel;
import visao.producao.PesquisaMP;
import visao.producao.PesquisaMovel;

/**
 * View principal do Funcionario do tipo operador de producao
 * @author geovanef46
 */
public class TelaPrincipalOpProd extends javax.swing.JFrame {

    private ConexaoBD conecta = new ConexaoBD();
    private DaoLogin newLogin = new DaoLogin();

    private PesquisaMovel PesquisaMovel;
    private FormEntradaMovel novoMovel;
    private PesquisaMP PesquisaMP;
    private FormEntradaMP novoMP;
    private BeansFuncionario funcionarioAtivo;
    private FormEntradaEmpresa novaEmpresa;

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipalOpProd() {
        initComponents();
  
    }

    public TelaPrincipalOpProd(BeansFuncionario funcionario ) {
          initComponents();

        this.funcionarioAtivo = funcionario;
        
        jLabelUsuario.setText("Bem-Vindo   "+funcionario.getNome());
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrameBemVindo = new javax.swing.JInternalFrame();
        jPanelInterno = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButtonPesquisarMP = new javax.swing.JButton();
        jButtonReceberMP = new javax.swing.JButton();
        jButtonCadastroFornecedor = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButtonPesquisarMovel = new javax.swing.JButton();
        jButtonNovoMovel = new javax.swing.JButton();
        jLabelTituloInterno = new javax.swing.JLabel();
        jLabelFundoTelaPrincipal = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuIniciar = new javax.swing.JMenu();
        jMenuItemPesquisar = new javax.swing.JMenuItem();
        jMenuRelatorios = new javax.swing.JMenu();
        jMenuFerramentas = new javax.swing.JMenu();
        jMenuItemBemVindo = new javax.swing.JMenuItem();
        jMenuSobre = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                FechouJanelaPrincipal(evt);
            }
        });
        getContentPane().setLayout(null);

        jInternalFrameBemVindo.setBackground(new java.awt.Color(220, 222, 228));
        jInternalFrameBemVindo.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(240, 240, 240), null));
        jInternalFrameBemVindo.setClosable(true);
        jInternalFrameBemVindo.setTitle("Bem - Vindo     Operador de Producao");
        jInternalFrameBemVindo.setFocusTraversalPolicyProvider(true);
        jInternalFrameBemVindo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        try {
            jInternalFrameBemVindo.setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        jInternalFrameBemVindo.setVisible(true);
        jInternalFrameBemVindo.getContentPane().setLayout(null);

        jPanelInterno.setBackground(new java.awt.Color(229, 225, 240));
        jPanelInterno.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelInterno.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), null));
        jPanel3.setLayout(null);

        jButtonPesquisarMP.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jButtonPesquisarMP.setForeground(new java.awt.Color(5, 5, 19));
        jButtonPesquisarMP.setText("Pesquisar M. Prima");
        jButtonPesquisarMP.setToolTipText("Pesquisar uma materia-prima");
        jButtonPesquisarMP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarMPActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonPesquisarMP);
        jButtonPesquisarMP.setBounds(20, 20, 210, 80);

        jButtonReceberMP.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jButtonReceberMP.setForeground(new java.awt.Color(5, 5, 19));
        jButtonReceberMP.setText("Receber M. Prima");
        jButtonReceberMP.setToolTipText("Receber uma material, receber uma encomenda.");
        jButtonReceberMP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReceberMPActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonReceberMP);
        jButtonReceberMP.setBounds(20, 120, 210, 80);

        jButtonCadastroFornecedor.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jButtonCadastroFornecedor.setForeground(new java.awt.Color(5, 5, 19));
        jButtonCadastroFornecedor.setText("Cadastrar Fornecedor");
        jButtonCadastroFornecedor.setToolTipText("Cadastrar um Fornecedor de Materia-prima");
        jButtonCadastroFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastroFornecedorActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonCadastroFornecedor);
        jButtonCadastroFornecedor.setBounds(20, 220, 210, 80);

        jPanelInterno.add(jPanel3);
        jPanel3.setBounds(440, 10, 250, 320);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), null));
        jPanel4.setLayout(null);

        jButtonPesquisarMovel.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jButtonPesquisarMovel.setForeground(new java.awt.Color(5, 5, 19));
        jButtonPesquisarMovel.setText("Pesquisar Movel");
        jButtonPesquisarMovel.setToolTipText("Pesquisar um Movel");
        jButtonPesquisarMovel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarMovelActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonPesquisarMovel);
        jButtonPesquisarMovel.setBounds(20, 20, 210, 80);

        jButtonNovoMovel.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jButtonNovoMovel.setForeground(new java.awt.Color(5, 5, 19));
        jButtonNovoMovel.setText("Novo Movel");
        jButtonNovoMovel.setToolTipText("Adicione um novo movel");
        jButtonNovoMovel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoMovelActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonNovoMovel);
        jButtonNovoMovel.setBounds(20, 220, 210, 80);

        jPanelInterno.add(jPanel4);
        jPanel4.setBounds(60, 10, 250, 320);

        jInternalFrameBemVindo.getContentPane().add(jPanelInterno);
        jPanelInterno.setBounds(10, 40, 750, 340);

        jLabelTituloInterno.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabelTituloInterno.setText("Movelaria Rocha");
        jInternalFrameBemVindo.getContentPane().add(jLabelTituloInterno);
        jLabelTituloInterno.setBounds(310, 10, 190, 30);

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
        jMenuIniciar.setToolTipText("Encontrar um Móvel");

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

    private void jMenuItemBemVindoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemBemVindoActionPerformed
        jInternalFrameBemVindo.setFocusable(true);
        jInternalFrameBemVindo.setVisible(true);
    }//GEN-LAST:event_jMenuItemBemVindoActionPerformed

    private void jMenuItemPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPesquisarActionPerformed
        if (PesquisaMovel == null) {
            PesquisaMovel = new PesquisaMovel();
            PesquisaMovel.setVisible(true);
            PesquisaMovel.setResizable(false);
        }else{
            PesquisaMovel.setVisible(true);
            PesquisaMovel.setResizable(false);
        }
    }//GEN-LAST:event_jMenuItemPesquisarActionPerformed

    private void jButtonReceberMPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReceberMPActionPerformed
           if (novoMP == null) {
            novoMP = new FormEntradaMP();
            novoMP.setVisible(true);
            novoMP.setResizable(false);
        }else{
            novoMP.setVisible(true);
            novoMP.setResizable(false);
        }
    }//GEN-LAST:event_jButtonReceberMPActionPerformed

    private void jButtonPesquisarMPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarMPActionPerformed
        if (PesquisaMP == null) {
            PesquisaMP = new PesquisaMP();
            PesquisaMP.setVisible(true);
            PesquisaMP.setResizable(false);
        }else{
            PesquisaMP.setVisible(true);
            PesquisaMP.setResizable(false);
        }
    }//GEN-LAST:event_jButtonPesquisarMPActionPerformed

    private void jButtonCadastroFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastroFornecedorActionPerformed
        if (novaEmpresa == null) {
            novaEmpresa = new FormEntradaEmpresa();
            novaEmpresa.setVisible(true);
            novaEmpresa.setResizable(false);
        }else{
            novaEmpresa.setVisible(true);
            novaEmpresa.setResizable(false);
        }
    }//GEN-LAST:event_jButtonCadastroFornecedorActionPerformed

    private void jButtonPesquisarMovelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarMovelActionPerformed
             if (PesquisaMovel == null) {
            PesquisaMovel = new PesquisaMovel();
            PesquisaMovel.setVisible(true);
            PesquisaMovel.setResizable(false);
        }else{
            PesquisaMovel.setVisible(true);
            PesquisaMovel.setResizable(false);
        }
    }//GEN-LAST:event_jButtonPesquisarMovelActionPerformed

    private void jButtonNovoMovelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoMovelActionPerformed
           if (novoMovel == null) {
            novoMovel = new FormEntradaMovel();
            novoMovel.setVisible(true);
            novoMovel.setResizable(false);
        }else{
            novoMovel.setVisible(true);
            novoMovel.setResizable(false);
        }
    }//GEN-LAST:event_jButtonNovoMovelActionPerformed

    private void FechouJanelaPrincipal(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_FechouJanelaPrincipal
        TelaLogin.tela.setVisible(true);
    }//GEN-LAST:event_FechouJanelaPrincipal

    private void jMenuSobreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSobreMouseClicked

        
    }//GEN-LAST:event_jMenuSobreMouseClicked

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
            java.util.logging.Logger.getLogger(TelaPrincipalOpProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalOpProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalOpProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalOpProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipalOpProd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastroFornecedor;
    private javax.swing.JButton jButtonNovoMovel;
    private javax.swing.JButton jButtonPesquisarMP;
    private javax.swing.JButton jButtonPesquisarMovel;
    private javax.swing.JButton jButtonReceberMP;
    private javax.swing.JInternalFrame jInternalFrameBemVindo;
    private javax.swing.JLabel jLabelFundoTelaPrincipal;
    private javax.swing.JLabel jLabelTituloInterno;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuFerramentas;
    private javax.swing.JMenu jMenuIniciar;
    private javax.swing.JMenuItem jMenuItemBemVindo;
    private javax.swing.JMenuItem jMenuItemPesquisar;
    private javax.swing.JMenu jMenuRelatorios;
    private javax.swing.JMenu jMenuSobre;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelInterno;
    // End of variables declaration//GEN-END:variables
}
