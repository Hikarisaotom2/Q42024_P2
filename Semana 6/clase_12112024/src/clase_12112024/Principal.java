/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package clase_12112024;

/**
 *
 * @author claudiacortes
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jpanel_comboBox = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jpanel_textAreas = new javax.swing.JPanel();
        jpanel_radioButtons = new javax.swing.JPanel();
        jpanel_tables = new javax.swing.JPanel();
        lbl_nombre = new javax.swing.JLabel();
        lbl_mensaje = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 51));

        jTabbedPane1.setBackground(new java.awt.Color(204, 255, 204));
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTabbedPane1.setOpaque(true);

        jpanel_comboBox.setBackground(new java.awt.Color(204, 204, 255));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Create", "Read", "Update", "Delete", " " }));

        jLabel1.setText("MVC");

        javax.swing.GroupLayout jpanel_comboBoxLayout = new javax.swing.GroupLayout(jpanel_comboBox);
        jpanel_comboBox.setLayout(jpanel_comboBoxLayout);
        jpanel_comboBoxLayout.setHorizontalGroup(
            jpanel_comboBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_comboBoxLayout.createSequentialGroup()
                .addGroup(jpanel_comboBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanel_comboBoxLayout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpanel_comboBoxLayout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(jLabel1)))
                .addContainerGap(277, Short.MAX_VALUE))
        );
        jpanel_comboBoxLayout.setVerticalGroup(
            jpanel_comboBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_comboBoxLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106)
                .addComponent(jLabel1)
                .addContainerGap(407, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Combo box", jpanel_comboBox);

        jpanel_textAreas.setBackground(new java.awt.Color(255, 204, 255));

        javax.swing.GroupLayout jpanel_textAreasLayout = new javax.swing.GroupLayout(jpanel_textAreas);
        jpanel_textAreas.setLayout(jpanel_textAreasLayout);
        jpanel_textAreasLayout.setHorizontalGroup(
            jpanel_textAreasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 817, Short.MAX_VALUE)
        );
        jpanel_textAreasLayout.setVerticalGroup(
            jpanel_textAreasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Text areas", jpanel_textAreas);

        jpanel_radioButtons.setBackground(new java.awt.Color(255, 255, 204));

        javax.swing.GroupLayout jpanel_radioButtonsLayout = new javax.swing.GroupLayout(jpanel_radioButtons);
        jpanel_radioButtons.setLayout(jpanel_radioButtonsLayout);
        jpanel_radioButtonsLayout.setHorizontalGroup(
            jpanel_radioButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 817, Short.MAX_VALUE)
        );
        jpanel_radioButtonsLayout.setVerticalGroup(
            jpanel_radioButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Radio buttons", jpanel_radioButtons);

        jpanel_tables.setBackground(new java.awt.Color(255, 204, 102));

        lbl_nombre.setText("Hola mundo");

        lbl_mensaje.setText("Hola mundo etiqueta perdida");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 768, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 294, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("tab1", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 768, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 259, Short.MAX_VALUE)
        );

        jTabbedPane3.addTab("tab1", jPanel2);

        jTabbedPane2.addTab("tab2", jTabbedPane3);

        javax.swing.GroupLayout jpanel_tablesLayout = new javax.swing.GroupLayout(jpanel_tables);
        jpanel_tables.setLayout(jpanel_tablesLayout);
        jpanel_tablesLayout.setHorizontalGroup(
            jpanel_tablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanel_tablesLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lbl_nombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(lbl_mensaje)
                .addGap(523, 523, 523))
            .addGroup(jpanel_tablesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpanel_tablesLayout.setVerticalGroup(
            jpanel_tablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_tablesLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jpanel_tablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nombre)
                    .addComponent(lbl_mensaje))
                .addGap(43, 43, 43)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(157, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Tablas", jpanel_tables);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JPanel jpanel_comboBox;
    private javax.swing.JPanel jpanel_radioButtons;
    private javax.swing.JPanel jpanel_tables;
    private javax.swing.JPanel jpanel_textAreas;
    private javax.swing.JLabel lbl_mensaje;
    private javax.swing.JLabel lbl_nombre;
    // End of variables declaration//GEN-END:variables
}