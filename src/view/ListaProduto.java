package view;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import model.DAO;
import java.util.ArrayList;
import view.ModeloTabela;

public class ListaProduto extends javax.swing.JFrame {

    public ResultSet rs;
    
    public ListaProduto() {
        initComponents();
        preencherTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtTabela = new javax.swing.JTable();
        btnCadastro = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        btnDeleto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtTabela);

        btnCadastro.setMnemonic('P');
        btnCadastro.setText("+ Novo Produto");

        lblTitulo.setFont(new java.awt.Font("Tekton Pro Ext", 1, 48)); // NOI18N
        lblTitulo.setText("Produtos");

        btnDeleto.setMnemonic('E');
        btnDeleto.setText("Excluir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addComponent(btnCadastro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 168, Short.MAX_VALUE)
                .addComponent(btnDeleto)
                .addContainerGap())
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo)
                    .addComponent(btnCadastro)
                    .addComponent(btnDeleto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ListaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaProduto().setVisible(true);
            }
        });
    }

    public void preencherTabela() {
        DAO dao = new DAO();
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"Código", "Descrição", "Tipo de Equipamento", "Data de Produção", "Quantidade em Estoque", "Valor Compra", "Valor Venda"};
        rs = dao.localizarProdutos();
        try {
            rs.first();
            do {
                dados.add(new Object[]{rs.getString("codProduto"), rs.getString("descricao"), rs.getString("tipoEquipamento"), 
                    rs.getString("dataProducao"), rs.getString("quantidadeProduto"),rs.getString("valorCompra"), 
                    rs.getString("valorVenda")});
            } while (rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro:\n" + ex.toString());
        }

        ModeloTabela modelo = new ModeloTabela(dados, colunas);
        jtTabela.setModel(modelo); // recebe o modelo criado
        jtTabela.getColumnModel().getColumn(0).setPreferredWidth(60);
        jtTabela.getColumnModel().getColumn(0).setResizable(false);
        jtTabela.getColumnModel().getColumn(1).setPreferredWidth(150);  // define o tamanho das colunas e se serÃ¡ redimensionado ou nÃ£o
        jtTabela.getColumnModel().getColumn(1).setResizable(true);  // nÃ£o permite alterar o tamanho da coluna
        jtTabela.getColumnModel().getColumn(2).setPreferredWidth(150);  // define o tamanho das colunas e se serÃ¡ redimensionado ou nÃ£o
        jtTabela.getColumnModel().getColumn(2).setResizable(true);
        jtTabela.getColumnModel().getColumn(3).setPreferredWidth(100);  // define o tamanho das colunas e se serÃ¡ redimensionado ou nÃ£o
        jtTabela.getColumnModel().getColumn(3).setResizable(false);
        jtTabela.getColumnModel().getColumn(4).setPreferredWidth(200);  // define o tamanho das colunas e se serÃ¡ redimensionado ou nÃ£o
        jtTabela.getColumnModel().getColumn(4).setResizable(true);
        jtTabela.getColumnModel().getColumn(5).setPreferredWidth(60);
        jtTabela.getColumnModel().getColumn(5).setResizable(false);
        jtTabela.getColumnModel().getColumn(6).setPreferredWidth(150);  // define o tamanho das colunas e se serÃ¡ redimensionado ou nÃ£o
        jtTabela.getColumnModel().getColumn(6).setResizable(true);
        jtTabela.getTableHeader().setReorderingAllowed(false);  // NÃ£o permite reordenar as colunas
        jtTabela.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); // NÃ£o permite redimensionar a tabela
        jtTabela.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // permite selecionar apenas 1 elemento da tabela
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastro;
    private javax.swing.JButton btnDeleto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtTabela;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
