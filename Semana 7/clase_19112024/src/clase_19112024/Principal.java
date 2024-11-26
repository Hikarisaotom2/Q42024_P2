/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package clase_19112024;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author claudiacortes
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        // no tenemos elementos visuales creados aun
        initComponents();
        // ya tenemos los elementos visuales creados, pero aun no se muestra la pantalla
        //limpiar el arbol. 
        DefaultTreeModel modeloArbol = (DefaultTreeModel)jt_usuarios.getModel();
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode)modeloArbol.getRoot();
        raiz.removeAllChildren();
        modeloArbol.reload();
        // agregando al arbol las cartegorias de docentes y alumnos
        agregarCategoriasUsuarios();
        
        // vaciar la tabla de la informacion vieja 
        DefaultTableModel modelo = new DefaultTableModel();
        jt_tablaUsuarios.setModel(modelo);
     
        // agregar a la tabla los titulos correctos. 
        
        modelo.addColumn("Nombre");
        modelo.addColumn("Tipo usuario");
        
         DefaultListModel modeloLista = new DefaultListModel();
        jl_usuarios.setModel(modeloLista);
    }
    
    /*
    Este método crea las categorias/ secciones de usuarios (docente y alumno) dentro del arbol. 
    */
    private void agregarCategoriasUsuarios(){
      DefaultTreeModel modeloArbol = (DefaultTreeModel)jt_usuarios.getModel();
      DefaultMutableTreeNode raiz = (DefaultMutableTreeNode)modeloArbol.getRoot();   
      
      // Creando nodos para cada categoria 
      // Nota: el parametro del constructor es del tipo Object
      
      /*
      Observaciones:
        1. en este caso, los nodos que acabaos de crear son hojas.
        2. creamos los nodos, pero estos aun no son parte del arbol. 
        3. cuaquier modificaciôn al arbol, requiere un reload. 
      */
      DefaultMutableTreeNode nodoDocentes = new DefaultMutableTreeNode("Doocentes");
      DefaultMutableTreeNode nodoAlumnos = new DefaultMutableTreeNode("Alumnos");
      
      //Agregar los nodos/ hojas a la raiz 
      raiz.add(nodoDocentes);
      raiz.add(nodoAlumnos);
      
      // Recargar el modelo para que actualice la vista. 
      modeloArbol.reload();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txt_nombre = new javax.swing.JTextField();
        jcb_tipoUsuario = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbl_usuarioSeleccionado = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jt_usuarios = new javax.swing.JTree();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_tablaUsuarios = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbl_filaSeleccionada = new javax.swing.JLabel();
        lbl_columnaSeleccionada = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbl_valorSeleccionado = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jl_usuarios = new javax.swing.JList<>();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre");

        jButton1.setText("Agregar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jcb_tipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Docente", "Alumno" }));

        jLabel2.setText("Tipo de usuario");

        jLabel3.setText("Usuario seleccionado: ");

        lbl_usuarioSeleccionado.setText("jLabel4");

        jt_usuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_usuariosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jt_usuarios);

        jt_tablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
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
        jt_tablaUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_tablaUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jt_tablaUsuarios);

        jLabel4.setText("Fila seleccionada:");

        jLabel5.setText("Columna seleccionada");

        lbl_filaSeleccionada.setText("jLabel6");

        lbl_columnaSeleccionada.setText("jLabel7");

        jLabel6.setText("Valor seleccionado");

        lbl_valorSeleccionado.setText("jLabel7");

        jButton2.setText("Eliminar de la tabla");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jScrollPane3.setViewportView(jl_usuarios);

        jButton3.setText("Eliminar de lista");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jcb_tipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_usuarioSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(98, 98, 98)
                                .addComponent(jLabel6)
                                .addGap(39, 39, 39)
                                .addComponent(lbl_valorSeleccionado))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel4)
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbl_filaSeleccionada)
                                        .addGap(111, 111, 111)
                                        .addComponent(jLabel5)
                                        .addGap(73, 73, 73)
                                        .addComponent(lbl_columnaSeleccionada)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(269, 269, 269)
                .addComponent(jButton3)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcb_tipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(jButton1)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lbl_usuarioSeleccionado))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel3)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(lbl_filaSeleccionada)
                    .addComponent(lbl_columnaSeleccionada))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lbl_valorSeleccionado)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
      
        
        String nombre = txt_nombre.getText();
       DefaultTreeModel modeloArbol = (DefaultTreeModel)jt_usuarios.getModel();
       DefaultMutableTreeNode raiz = (DefaultMutableTreeNode)modeloArbol.getRoot();   
   
        DefaultListModel modeloLista = (DefaultListModel)jl_usuarios.getModel();
        
      
        System.out.println("La raiz tiene "+ raiz.getChildCount() +"Hijos");
        if(jcb_tipoUsuario.getSelectedIndex() == 0){ //docente
            Docente docente = new Docente(nombre);
            
            DefaultMutableTreeNode nodoDocentes  = (DefaultMutableTreeNode)raiz.getChildAt(0);
            // agregar el hio al nodo
            DefaultMutableTreeNode nuevoDocente = new DefaultMutableTreeNode(docente);
            nodoDocentes.add(nuevoDocente);
            modeloArbol.reload();
                
           DefaultTableModel modeloTabla = (DefaultTableModel)jt_tablaUsuarios.getModel();
           modeloTabla.addRow(docente.getFila());
           modeloLista.addElement(docente);
          
        }else{ //alumno
            Alumno alumno = new Alumno(nombre);
            DefaultMutableTreeNode nodoAlumnos = (DefaultMutableTreeNode)raiz.getChildAt(1);
            DefaultMutableTreeNode nuevoAlumno = new DefaultMutableTreeNode(alumno);
            nodoAlumnos.add(nuevoAlumno);
            modeloArbol.reload();
            
            DefaultTableModel modeloTable =(DefaultTableModel) jt_tablaUsuarios.getModel();
            modeloTable.addRow(new Object[]{alumno.getNombre(), "Alumno"});
            modeloLista.addElement(alumno);
        }
        
        JOptionPane.showMessageDialog(null, "Usuario agregado exitosamente'");
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void jt_usuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_usuariosMouseClicked
        // TODO add your handling code here:
        
        // selecction path -> 
        System.out.println("Selecction path ");
        System.out.println(jt_usuarios.getSelectionPath());
        
        Object seleccionado = jt_usuarios.getSelectionPath().getLastPathComponent();
        DefaultMutableTreeNode nodoSeleccionado = (DefaultMutableTreeNode) seleccionado;
        
        Object objetoSeleccionado = nodoSeleccionado.getUserObject();
        
        if(objetoSeleccionado instanceof Docente){
            Docente doc = (Docente)objetoSeleccionado;
            lbl_usuarioSeleccionado.setText(doc.getNombre());
        }else if (objetoSeleccionado instanceof Alumno){
            Alumno alumno = (Alumno)objetoSeleccionado;
            lbl_usuarioSeleccionado.setText(alumno.getNombre());
        }else{
           lbl_usuarioSeleccionado.setText("Dato seleccionado no es un usuario.");
        }
        
    }//GEN-LAST:event_jt_usuariosMouseClicked

    private void jt_tablaUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_tablaUsuariosMouseClicked
       int fila = jt_tablaUsuarios.getSelectedRow();
       int columna = jt_tablaUsuarios.getSelectedColumn();
       lbl_filaSeleccionada.setText(fila+"");
       lbl_columnaSeleccionada.setText(columna+"");
       
       if(fila>=0 && columna>=0){
           DefaultTableModel modelo = (DefaultTableModel) jt_tablaUsuarios.getModel();
           Object objetoSeleccionado = modelo.getValueAt(fila, columna);
           lbl_valorSeleccionado.setText(objetoSeleccionado.toString());
       }
    }//GEN-LAST:event_jt_tablaUsuariosMouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        
        int fila = jt_tablaUsuarios.getSelectedRow();
        DefaultTableModel modelo = (DefaultTableModel) jt_tablaUsuarios.getModel();
        modelo.removeRow(fila);
        
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        int seleccionado = jl_usuarios.getSelectedIndex();        
        DefaultListModel modeloLista = (DefaultListModel)jl_usuarios.getModel();
        Object objeto = modeloLista.getElementAt(seleccionado);
        if(objeto instanceof Docente){
            System.out.println("Se selecciono un docente de la lista");
        }else if( objeto instanceof Alumno){
            System.out.println("Se selecciono un alumno");
        }
        modeloLista.remove(seleccionado);
        
    }//GEN-LAST:event_jButton3MouseClicked

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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JComboBox<String> jcb_tipoUsuario;
    private javax.swing.JList<String> jl_usuarios;
    private javax.swing.JTable jt_tablaUsuarios;
    private javax.swing.JTree jt_usuarios;
    private javax.swing.JLabel lbl_columnaSeleccionada;
    private javax.swing.JLabel lbl_filaSeleccionada;
    private javax.swing.JLabel lbl_usuarioSeleccionado;
    private javax.swing.JLabel lbl_valorSeleccionado;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
