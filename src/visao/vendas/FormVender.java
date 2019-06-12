/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao.vendas;

import visao.cliente.AdicionaCliente;
import controle.GerenciadorDeBD;
import controle.GerenciadorDeLogin;
import controle.GerenciadorDeVendas;
import java.sql.Date;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modeloBeans.BeansCompra;
import modeloBeans.produto.BeansItem;
import modeloBeans.ModeloTabela;
import modeloBeans.empresa.BeansCliente;
import modeloBeans.produto.BeansMovel;
import modeloDAO.DaoEmpresa;
import visao.producao.AdicionaQtd;
import visao.producao.AdicionarProduto;

/**
 *
 * @author GEOVANEF46
 */
public class FormVender extends javax.swing.JFrame {

    private BeansMovel produtoAtivo = new BeansMovel();
    private GerenciadorDeBD DaoControl = new GerenciadorDeBD();
    private GerenciadorDeLogin DaoLogin = GerenciadorDeLogin.getInstance();
    private GerenciadorDeVendas DaoVendas = new GerenciadorDeVendas();
    private DaoEmpresa lojaDao = new DaoEmpresa();

    private AdicionarProduto addProduto;
    private AdicionaCliente adicionaLoja;
    private AdicionaQtd adicionaQtd;
//    private DetalhesProduto newRelatorio = new DetalhesProduto();
    int idProduto = 0;
    Map<Integer, Integer> listaDeProdutos = new HashMap();// Map(codigo_produto,qtd_produto) quantidade em estoque
    List<BeansItem> listaDeItens = new ArrayList();// cada item tem uma qtd itens da compra

    private BeansCliente modeloLoja;
    private BeansCompra novacompra;
    private BeansItem modeloItem = new BeansItem();

    private Date dataHoje;
    private String qtd = "1";
    private int index = 0;
    private ArrayList dados = new ArrayList(); //linhas da tabela

    /**
     * Creates new form FormVender Ao instanciar chame o metodo
     * iniciaVenda(produto)
     */
    public FormVender() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelVendas = new javax.swing.JPanel();
        jButtonIncluirProduto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableVendas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButtonVender = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jLabelCliente = new javax.swing.JLabel();
        jTextFieldNomeCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButtonParcelar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jFormattedTextFieldPrecoTotal = new javax.swing.JFormattedTextField();
        jFormattedTextFieldValorParcelado = new javax.swing.JFormattedTextField();
        jButtonnovoCliente = new javax.swing.JButton();
        jButtonDesconto = new javax.swing.JButton();
        jFormattedTextFieldDesconto = new javax.swing.JFormattedTextField();
        jLabelDesconto = new javax.swing.JLabel();
        jTextFieldNomeProduto = new javax.swing.JTextField();
        jLabelCliente1 = new javax.swing.JLabel();
        jButtonDetalhes = new javax.swing.JButton();
        jFormattedTextFieldQtd = new javax.swing.JFormattedTextField();
        jLabelDesconto1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabelVender = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Formulário de Vendas");
        setResizable(false);

        jPanelVendas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButtonIncluirProduto.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jButtonIncluirProduto.setForeground(new java.awt.Color(0, 153, 51));
        jButtonIncluirProduto.setText("Incluir");
        jButtonIncluirProduto.setToolTipText("Clique para adicionar mais um produto ");
        jButtonIncluirProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIncluirProdutoActionPerformed(evt);
            }
        });

        jTableVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableVendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableVendasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableVendas);

        jLabel1.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 0));
        jLabel1.setText("Total R$:");

        jButtonVender.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jButtonVender.setForeground(new java.awt.Color(0, 153, 0));
        jButtonVender.setText("Vender");
        jButtonVender.setToolTipText("");
        jButtonVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVenderActionPerformed(evt);
            }
        });

        jButtonExcluir.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setToolTipText("Clique para Excluir um produto ");

        jLabelCliente.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabelCliente.setText("Cliente:");

        jTextFieldNomeCliente.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel2.setText("Valor Parcelado R$:");

        jButtonParcelar.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jButtonParcelar.setText("Parcelar");
        jButtonParcelar.setToolTipText("Clique para Parcelar o valor total");

        jButtonCancelar.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setToolTipText("Clique para Cancelar a Venda");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jFormattedTextFieldPrecoTotal.setEditable(false);
        jFormattedTextFieldPrecoTotal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        jFormattedTextFieldPrecoTotal.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N

        jFormattedTextFieldValorParcelado.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        jFormattedTextFieldValorParcelado.setEnabled(false);
        jFormattedTextFieldValorParcelado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jButtonnovoCliente.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jButtonnovoCliente.setText("Adicionar");
        jButtonnovoCliente.setToolTipText("Clique para adicionar um Cliente");
        jButtonnovoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonnovoClienteActionPerformed(evt);
            }
        });

        jButtonDesconto.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jButtonDesconto.setText("Desconto");
        jButtonDesconto.setToolTipText("Clique para dar um desconto");
        jButtonDesconto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDescontoActionPerformed(evt);
            }
        });

        jFormattedTextFieldDesconto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        jFormattedTextFieldDesconto.setEnabled(false);
        jFormattedTextFieldDesconto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabelDesconto.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabelDesconto.setText("Desconto R$:");

        jTextFieldNomeProduto.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jTextFieldNomeProduto.setEnabled(false);

        jLabelCliente1.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabelCliente1.setText("Produto:");

        jButtonDetalhes.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jButtonDetalhes.setText("Detalhes");
        jButtonDetalhes.setEnabled(false);
        jButtonDetalhes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDetalhesActionPerformed(evt);
            }
        });

        jFormattedTextFieldQtd.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#"))));
        jFormattedTextFieldQtd.setEnabled(false);
        jFormattedTextFieldQtd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabelDesconto1.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabelDesconto1.setText("Qtd:");

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelVendasLayout = new javax.swing.GroupLayout(jPanelVendas);
        jPanelVendas.setLayout(jPanelVendasLayout);
        jPanelVendasLayout.setHorizontalGroup(
            jPanelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVendasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelVendasLayout.createSequentialGroup()
                        .addGroup(jPanelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelCliente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonDetalhes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonnovoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabelDesconto1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextFieldQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(39, 39, 39)
                        .addGroup(jPanelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelVendasLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedTextFieldValorParcelado, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelVendasLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedTextFieldPrecoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelVendasLayout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jLabelDesconto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedTextFieldDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(91, 91, 91))
                    .addGroup(jPanelVendasLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonVender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonIncluirProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonParcelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(72, 72, 72))))
        );
        jPanelVendasLayout.setVerticalGroup(
            jPanelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVendasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelVendasLayout.createSequentialGroup()
                        .addGroup(jPanelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(jPanelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonDetalhes, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButtonnovoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelVendasLayout.createSequentialGroup()
                        .addGroup(jPanelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFormattedTextFieldValorParcelado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFormattedTextFieldPrecoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFormattedTextFieldDesconto)
                            .addComponent(jLabelDesconto)
                            .addComponent(jFormattedTextFieldQtd)
                            .addComponent(jLabelDesconto1)
                            .addComponent(jButton1))))
                .addGap(18, 18, 18)
                .addGroup(jPanelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelVendasLayout.createSequentialGroup()
                        .addComponent(jButtonVender, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonIncluirProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonParcelar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCancelar)))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jLabelVender.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelVender.setText("Vender Produto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelVender, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(377, 377, 377))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelVendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabelVender, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelVendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1014, 597));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDescontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDescontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonDescontoActionPerformed

    private void jTableVendasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableVendasMouseClicked
        jButtonDetalhes.setEnabled(true);
        //try{
        int id_movel = (int) jTableVendas.getValueAt(jTableVendas.getSelectedRow(), 0);
        produtoAtivo = (BeansMovel) DaoControl.selecionaMovel(id_movel);
        jFormattedTextFieldQtd.setText(String.valueOf(DaoVendas.pesquisarQtd(id_movel,listaDeItens)));
//        }catch(NumberFormatException numEx){
//            JOptionPane.showMessageDialog(this.rootPane, "Erro ao buscar o Movel\n Entre em contato com o suporte.");
//        }catch(NullPointerException ne){
//            JOptionPane.showMessageDialog(this.rootPane, "Erro ao buscar o Movel\n Entre em contato com o suporte.");
//
//        }
        
    }//GEN-LAST:event_jTableVendasMouseClicked

    private void limpaList() {
        listaDeItens.removeAll(listaDeItens);
        listaDeProdutos.clear();

    }
    private void jButtonDetalhesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDetalhesActionPerformed
//        detalharProduto(idProduto);
//        newRelatorio.setVisible(true);
//        newRelatorio.setResizable(false);
    }//GEN-LAST:event_jButtonDetalhesActionPerformed

    private void jButtonIncluirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIncluirProdutoActionPerformed
        jButtonDetalhes.setEnabled(false);
        if (addProduto == null) {
            addProduto = new AdicionarProduto(this);
            addProduto.setVisible(true);
            addProduto.setResizable(false);
        } else {
            addProduto.setVisible(true);
            addProduto.setResizable(false);
        }
    }//GEN-LAST:event_jButtonIncluirProdutoActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        int resposta = 0;
        resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente Cancelar?", "Aviso", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            limpaList();
            limpaCampos();
            dispose();
        }
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonnovoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonnovoClienteActionPerformed
        if (adicionaLoja == null) {
            adicionaLoja = new AdicionaCliente(this);
            adicionaLoja.setVisible(true);
            adicionaLoja.setResizable(false);
        } else {
            adicionaLoja.setVisible(true);
            adicionaLoja.setResizable(false);
        }
    }//GEN-LAST:event_jButtonnovoClienteActionPerformed

    private void jButtonVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVenderActionPerformed
        gerarCompra();

    }//GEN-LAST:event_jButtonVenderActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String adiciona = jFormattedTextFieldQtd.getText();
        int qtd = 1;
        if(adiciona.equals("")){
           jFormattedTextFieldQtd.setText("1");
        }else{
           qtd = DaoVendas.pesquisarQtd(produtoAtivo.getCodigo(), listaDeItens);
           adiciona = String.valueOf(DaoControl.converterInt(adiciona) + qtd);
           if(produtoAtivo.getQtd() <= (DaoControl.converterInt(adiciona))){
           
           modeloItem.setQtd(DaoControl.converterInt(adiciona));
           jFormattedTextFieldQtd.setText(adiciona);
           }else{
             JOptionPane.showMessageDialog(rootPane, "Existem apenas "+produtoAtivo.getQtd()+" em estoque!");
           }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private boolean gerarCompra() {
        dataHoje = new Date(System.currentTimeMillis());
        if (receberCompra(modeloLoja, dataHoje, listaDeItens)) {
            JOptionPane.showMessageDialog(null, "Venda realizada com Sucesso!");
            limpaCampos();
            limpaList();
            index = 0;
            dispose();
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Não foi Possivel realizar a Venda!\n Selecione um Cliente!");
            return false;
        }
    }

    private void gerarItem(int codigo) {

            produtoAtivo = (BeansMovel) DaoControl.recuperaProduto(codigo, produtoAtivo);
            modeloItem.setQtd(DaoControl.converterInt(iniciaQtd()));
            modeloItem.setCodProduto(produtoAtivo.getCodigo());
            int preco =(DaoControl.converterInt(produtoAtivo.getPreco())*modeloItem.getQtd());
            atualizaPreco(String.valueOf(preco));
        
            listaDeItens.add(modeloItem);

    }

    private boolean receberCompra(BeansCliente modeloLoja, Date dataHoje, List listItens) {
        if (listItens != null && modeloLoja != null && listItens.size() > 0) {

            novacompra = new BeansCompra(dataHoje, listItens, modeloLoja);
            novacompra.setVendedor_CPF(DaoLogin.getFuncionarioAtivo().getCPF());
            if (DaoVendas.concluirCompra()) {
                lojaDao.guardarCompra(novacompra, DaoControl.converterValores(jFormattedTextFieldPrecoTotal.getText()));
            }
            return true;
        } else {
            return false;
        }

    }


    public void PreencherTabela(String sql) {
        ArrayList dados = DaoControl.PreencherTabela(sql);
        dados = DaoVendas.sincronizaListas(dados, this.dados);
        String[] colunas = new String[]{"Código", "Nome", "Cor", "Quantidade em Estoque", "Marca", "Preço Unitário"};//colunas

        ModeloTabela modeloTable = new ModeloTabela(dados, colunas);
        jTableVendas.setModel(modeloTable);
        jTableVendas.getColumnModel().getColumn(0).setPreferredWidth(80);
        jTableVendas.getColumnModel().getColumn(0).setResizable(false);
        jTableVendas.getColumnModel().getColumn(1).setPreferredWidth(150);
        jTableVendas.getColumnModel().getColumn(1).setResizable(false);
        jTableVendas.getColumnModel().getColumn(2).setPreferredWidth(120);
        jTableVendas.getColumnModel().getColumn(2).setResizable(false);
        jTableVendas.getColumnModel().getColumn(3).setPreferredWidth(120);
        jTableVendas.getColumnModel().getColumn(3).setResizable(false);
        jTableVendas.getColumnModel().getColumn(4).setPreferredWidth(140);
        jTableVendas.getColumnModel().getColumn(4).setResizable(false);
        jTableVendas.getColumnModel().getColumn(5).setPreferredWidth(120);
        jTableVendas.getColumnModel().getColumn(5).setResizable(false);
        jTableVendas.getTableHeader().setReorderingAllowed(false);
        jTableVendas.setAutoResizeMode(jTableVendas.AUTO_RESIZE_OFF);
        jTableVendas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        this.dados = DaoVendas.sincronizaListas(this.dados, dados);
    }

    public void detalharProduto(int idProduto) {
        //newRelatorio.exibirRelatorio(idProduto);    
    }

    public void iniciaVenda(BeansMovel modelo) {
        PreencherTabela("select *from movel where codigo ='" + modelo.getCodigo() + "'");
        jFormattedTextFieldPrecoTotal.setText(modelo.getPreco());
        produtoAtivo = modelo;
        listaDeProdutos.put(modelo.getCodigo(),produtoAtivo.getQtd());
        gerarItem(modelo.getCodigo());

    }

    private String iniciaQtd() {
        if (adicionaQtd == null) {
            adicionaQtd = new AdicionaQtd();
            adicionaQtd.setVisible(true);
            adicionaQtd.setResizable(false);
             adicionaQtd.add(produtoAtivo);
             return adicionaQtd.getQtd();
        } else {
            
            adicionaQtd.setVisible(true);
            adicionaQtd.setResizable(false);
             adicionaQtd.add(produtoAtivo);
             return adicionaQtd.getQtd();
        }
    }

    public void adicionaProduto(BeansMovel modelo) {
        PreencherTabela("select *from movel where codigo ='" + modelo.getCodigo() + "'");
        produtoAtivo = modelo;        
        listaDeProdutos.put(modelo.getCodigo(),produtoAtivo.getQtd());
        gerarItem(modelo.getCodigo());
    }

    public void adicionaLoja(BeansCliente loja) {
        modeloLoja = loja;
        jTextFieldNomeCliente.setText(modeloLoja.getNome());
    }

    private void atualizaPreco(String preco) {
        if (!jFormattedTextFieldPrecoTotal.getText().equals("")) {
            double precoAtual = DaoControl.converterValores(jFormattedTextFieldPrecoTotal.getText());
            double precoAtualizado = (precoAtual + DaoControl.converterValores(preco));
            jFormattedTextFieldPrecoTotal.setText(DaoControl.converterValores(precoAtualizado));
        } else {
            double precoAtualizado = (DaoControl.converterValores(preco));
            jFormattedTextFieldPrecoTotal.setText(DaoControl.converterValores(precoAtualizado));
        }
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
            java.util.logging.Logger.getLogger(FormVender.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormVender.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormVender.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormVender.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormVender().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonDesconto;
    private javax.swing.JButton jButtonDetalhes;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonIncluirProduto;
    private javax.swing.JButton jButtonParcelar;
    private javax.swing.JButton jButtonVender;
    private javax.swing.JButton jButtonnovoCliente;
    private javax.swing.JFormattedTextField jFormattedTextFieldDesconto;
    private javax.swing.JFormattedTextField jFormattedTextFieldPrecoTotal;
    private javax.swing.JFormattedTextField jFormattedTextFieldQtd;
    private javax.swing.JFormattedTextField jFormattedTextFieldValorParcelado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelCliente;
    private javax.swing.JLabel jLabelCliente1;
    private javax.swing.JLabel jLabelDesconto;
    private javax.swing.JLabel jLabelDesconto1;
    private javax.swing.JLabel jLabelVender;
    private javax.swing.JPanel jPanelVendas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableVendas;
    private javax.swing.JTextField jTextFieldNomeCliente;
    private javax.swing.JTextField jTextFieldNomeProduto;
    // End of variables declaration//GEN-END:variables

    private void limpaCampos() {
        jTextFieldNomeCliente.setText("");
        jTextFieldNomeProduto.setText("");
        jFormattedTextFieldDesconto.setText("");
        jFormattedTextFieldPrecoTotal.setText("");
        jFormattedTextFieldValorParcelado.setText("");
        dados.removeAll(dados);

    }
}
