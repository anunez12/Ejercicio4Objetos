/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */ 

package interfaz;

import clases.PasswordInTheSicuc;
import javax.swing.JOptionPane;

/**
 *
 * @author SP
 */
public class Ejercicio4 extends javax.swing.JFrame {

    /**
     * Creates new form Ejercicio4
     */ 
     int longitud;String contraseña;
     
    public Ejercicio4() {
        initComponents(); 
        cmdBorrar.setEnabled(false); 
        cmdContraseña.setEnabled(false); 
        cmdGuardar.setEnabled(true); 
        cmdSeguridad.setEnabled(false); 
        cmdSolicitud.setEnabled(false);
                
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cmdGuardar = new javax.swing.JButton();
        cmdBorrar = new javax.swing.JButton();
        cmdContraseña = new javax.swing.JButton();
        cmdSeguridad = new javax.swing.JButton();
        cmdSolicitud = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtSicuc = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel1.setText("Ejercicio4");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(153, 0, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 2, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("Galeria De Botones");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 150, -1));

        cmdGuardar.setBackground(new java.awt.Color(255, 255, 255));
        cmdGuardar.setFont(new java.awt.Font("Tw Cen MT", 2, 18)); // NOI18N
        cmdGuardar.setForeground(new java.awt.Color(153, 51, 255));
        cmdGuardar.setText("Guardar");
        cmdGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdGuardarActionPerformed(evt);
            }
        });
        jPanel2.add(cmdGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        cmdBorrar.setFont(new java.awt.Font("Tw Cen MT", 2, 18)); // NOI18N
        cmdBorrar.setForeground(new java.awt.Color(255, 0, 0));
        cmdBorrar.setText("Borrar");
        cmdBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBorrarActionPerformed(evt);
            }
        });
        jPanel2.add(cmdBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));

        cmdContraseña.setFont(new java.awt.Font("Tw Cen MT", 2, 18)); // NOI18N
        cmdContraseña.setForeground(new java.awt.Color(51, 0, 51));
        cmdContraseña.setText("Contraseña");
        cmdContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdContraseñaActionPerformed(evt);
            }
        });
        jPanel2.add(cmdContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, -1));

        cmdSeguridad.setFont(new java.awt.Font("Tw Cen MT", 2, 18)); // NOI18N
        cmdSeguridad.setForeground(new java.awt.Color(153, 153, 255));
        cmdSeguridad.setText("Seguridad");
        cmdSeguridad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSeguridadActionPerformed(evt);
            }
        });
        jPanel2.add(cmdSeguridad, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, -1, -1));

        cmdSolicitud.setFont(new java.awt.Font("Tw Cen MT", 2, 18)); // NOI18N
        cmdSolicitud.setForeground(new java.awt.Color(0, 102, 102));
        cmdSolicitud.setText("SolicitudCambio");
        cmdSolicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSolicitudActionPerformed(evt);
            }
        });
        cmdSolicitud.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cmdSolicitudKeyTyped(evt);
            }
        });
        jPanel2.add(cmdSolicitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 610, 70));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel3.setText("Contraseña");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, -1));

        txtSicuc.setEditable(false);
        txtSicuc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSicucKeyTyped(evt);
            }
        });
        jPanel1.add(txtSicuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 410, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(654, 203));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdGuardarActionPerformed
         String contraseaña;
        int longitud;
        PasswordInTheSicuc p;
        
        if(txtSicuc.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Ingrese contraseña en el sistema", "Error", JOptionPane.ERROR_MESSAGE);
            txtSicuc.requestFocusInWindow();
        }else{
            
            contraseña=txtSicuc.getText();
            longitud=contraseña.length();
            
            p=new PasswordInTheSicuc(longitud,contraseña);
            
            JOptionPane.showMessageDialog(this, "Contraseña Guardada en el sicuc");
            
            cmdGuardar.setEnabled(false);
            cmdSolicitud.setEnabled(true);
            cmdSeguridad.setEnabled(true);
            cmdContraseña.setEnabled(true);
            cmdBorrar.setEnabled(true); 
            
            
            
        
            
            
        }
    }//GEN-LAST:event_cmdGuardarActionPerformed

    private void cmdSeguridadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSeguridadActionPerformed
    PasswordInTheSicuc p,f; 
    contraseña=txtSicuc.getText(); 
    longitud=contraseña.length(); 
    p=new PasswordInTheSicuc(longitud, contraseña); 
    f=p.SeguridadContraseña(); 
    if(longitud<=2){ 
      JOptionPane.showMessageDialog(this,"La contraseña es debil");
    }else if(longitud<=4){ 
      JOptionPane.showMessageDialog(this,"La contraseña no es tan fuerte");
    }else if(longitud==5){ 
      JOptionPane.showMessageDialog(this,"La contraseña esta pasable");
    }else if(longitud>=6){ 
      JOptionPane.showMessageDialog(this,"La contraseña es fuerte");
    }else{ 
       
    }
    }//GEN-LAST:event_cmdSeguridadActionPerformed

    private void cmdBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBorrarActionPerformed
        txtSicuc.setText(""); 
        txtSicuc.requestFocusInWindow(); 
        cmdGuardar.setEnabled(true);
        cmdSolicitud.setEnabled(false);
        cmdSeguridad.setEnabled(false);
        cmdContraseña.setEnabled(false);
        cmdBorrar.setEnabled(false);
    }//GEN-LAST:event_cmdBorrarActionPerformed

    private void cmdContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdContraseñaActionPerformed
         PasswordInTheSicuc p,f;
        String aux;
       
        
        aux = txtSicuc.getText();
        
        p=new PasswordInTheSicuc(longitud,contraseña);
        
        f=p.MostrarContraseña();
        JOptionPane.showMessageDialog(this,"La contraseña ingresada al sicuc es: " +aux);
        
    }//GEN-LAST:event_cmdContraseñaActionPerformed

    private void cmdSolicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSolicitudActionPerformed
      String Contraseña = null ,aux,n ;
        int operacion,longitud,sw,res;
        PasswordInTheSicuc p = null;
        
         operacion = JOptionPane.showConfirmDialog(this, "¿usted solicito un cambio de contraseña en el sicuc?", "Pregunta", JOptionPane.YES_NO_OPTION);
         if(operacion == JOptionPane.YES_OPTION){ 
           aux = Contraseña;
           txtSicuc.setText("");
           
           
           do{
               sw=1;
           try{
           n=JOptionPane.showInputDialog(this, "Digite la nueva contraseña:");
           longitud = n.length();
           p = new PasswordInTheSicuc(longitud, n);
           txtSicuc.setText(n);
           
           JOptionPane.showMessageDialog(this, "Contraseña cambiada satisfactoriamente");
           }catch(NullPointerException e){
                res=JOptionPane.showConfirmDialog(this, "¿Seguro desea salir del sicuc?","Salir",JOptionPane.YES_NO_OPTION);
                if(res==0){
                    sw=1;
                    
                }else{
                    sw=0;
                }
            }
            }while(sw==0);
            
            }else{
         } 
    }//GEN-LAST:event_cmdSolicitudActionPerformed

    private void txtSicucKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSicucKeyTyped
        char c=evt.getKeyChar(); 
        if(Character.isSpace(c)){ 
          getToolkit(); 
          evt.consume();
        }
    }//GEN-LAST:event_txtSicucKeyTyped

    private void cmdSolicitudKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmdSolicitudKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdSolicitudKeyTyped

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
            java.util.logging.Logger.getLogger(Ejercicio4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdBorrar;
    private javax.swing.JButton cmdContraseña;
    private javax.swing.JButton cmdGuardar;
    private javax.swing.JButton cmdSeguridad;
    private javax.swing.JButton cmdSolicitud;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField txtSicuc;
    // End of variables declaration//GEN-END:variables
}
