/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package clase_04122024;

import javax.swing.SwingUtilities;

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

        btn_iniciar = new javax.swing.JButton();
        btn_pausar = new javax.swing.JButton();
        btn_detener = new javax.swing.JButton();
        btn_aumentar = new javax.swing.JButton();
        btn_disminuir = new javax.swing.JButton();
        btn_continuar = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        lbl_porcentaje = new javax.swing.JLabel();
        jpb_progreso = new javax.swing.JProgressBar();
        lbl_etiqueta = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txt_prueba = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_iniciar.setText("iniciar");
        btn_iniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_iniciarMouseClicked(evt);
            }
        });

        btn_pausar.setText("Pausar");
        btn_pausar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_pausarMouseClicked(evt);
            }
        });

        btn_detener.setText("Detener");
        btn_detener.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_detenerMouseClicked(evt);
            }
        });

        btn_aumentar.setText("aumentar");
        btn_aumentar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_aumentarMouseClicked(evt);
            }
        });

        btn_disminuir.setText("disminuir");
        btn_disminuir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_disminuirMouseClicked(evt);
            }
        });

        btn_continuar.setText("continuar");
        btn_continuar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_continuarMouseClicked(evt);
            }
        });

        lbl_porcentaje.setText("jLabel1");

        lbl_etiqueta.setText("jLabel1");

        jButton1.setText("actualizar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        txt_prueba.setText("jTextField2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(lbl_porcentaje))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jpb_progreso, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(lbl_etiqueta)
                        .addGap(60, 60, 60)
                        .addComponent(jButton1)
                        .addGap(60, 60, 60)
                        .addComponent(txt_prueba, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lbl_porcentaje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpb_progreso, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_etiqueta)
                    .addComponent(jButton1)
                    .addComponent(txt_prueba, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab1", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 566, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 192, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab2", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(btn_iniciar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_pausar)
                                .addGap(39, 39, 39)
                                .addComponent(btn_detener)
                                .addGap(18, 18, 18)
                                .addComponent(btn_continuar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_aumentar)
                                .addGap(70, 70, 70)
                                .addComponent(btn_disminuir))))
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_iniciar)
                    .addComponent(btn_pausar)
                    .addComponent(btn_detener)
                    .addComponent(btn_continuar))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_aumentar)
                    .addComponent(btn_disminuir))
                .addGap(81, 81, 81))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_aumentarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_aumentarMouseClicked
        int valorActual = jpb_progreso.getValue();
        valorActual+=5;
        jpb_progreso.setValue(valorActual);
    }//GEN-LAST:event_btn_aumentarMouseClicked

    private void btn_disminuirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_disminuirMouseClicked
        
        int valorActual = jpb_progreso.getValue();
        valorActual-=5;
        jpb_progreso.setValue(valorActual);
    }//GEN-LAST:event_btn_disminuirMouseClicked

    private void btn_iniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_iniciarMouseClicked
        
        Thread hiloActualizar = new Thread(() -> {
            // Aqui debemos poner el codigo que deseamos ejecutar en paralelo.
            int progreso =0;
            while(progreso<=100 && !detener){

               if(pausa){
                   System.out.println("El hilo esta en pausa");
               }else{
                   int temporal = progreso;
                
                   // se utiliza para que las actualizaciones de elementos visuales en java se ejecuten sin errores
                   SwingUtilities.invokeLater(() ->{
                        jpb_progreso.setValue(temporal);
                        lbl_porcentaje.setText(temporal+"%");
                   });
                   

                try {   
                    Thread.sleep(300); // pone una pequena pausa, en mili segundos
                    progreso++;
                } catch (Exception e) {
                    System.out.println(e);
                }
               }
               
            }//
            System.out.println("El valor del progreso = "+progreso);
            if( detener || progreso >=100){
                lbl_porcentaje.setText("0%");
                jpb_progreso.setValue(0);
                detener = false;
                progreso =0;
            }
        });
     hiloActualizar.start(); // iniciando el hilo, hasta no llamar esta instrucción no se ejecutara nada . del hilo
     
    
        for (int i = 0; i < 1000; i++) {
            System.out.println("este for esta imprimiendo este valor "+i);
            
        }
    }//GEN-LAST:event_btn_iniciarMouseClicked

    private void btn_pausarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pausarMouseClicked
        // TODO add your handling code here:
        pausa = true;
    }//GEN-LAST:event_btn_pausarMouseClicked

    private void btn_detenerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_detenerMouseClicked
        detener= true;
    }//GEN-LAST:event_btn_detenerMouseClicked

    private void btn_continuarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_continuarMouseClicked
        pausa =false;
        detener = false;
    }//GEN-LAST:event_btn_continuarMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        
        
        lbl_etiqueta.setText(txt_prueba.getText());
    }//GEN-LAST:event_jButton1MouseClicked

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
    
    private boolean pausa = false;
    private boolean detener = false;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_aumentar;
    private javax.swing.JButton btn_continuar;
    private javax.swing.JButton btn_detener;
    private javax.swing.JButton btn_disminuir;
    private javax.swing.JButton btn_iniciar;
    private javax.swing.JButton btn_pausar;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JProgressBar jpb_progreso;
    private javax.swing.JLabel lbl_etiqueta;
    private javax.swing.JLabel lbl_porcentaje;
    private javax.swing.JTextField txt_prueba;
    // End of variables declaration//GEN-END:variables
}
