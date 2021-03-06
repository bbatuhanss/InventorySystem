/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proje2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListModel;
import jdk.nashorn.internal.parser.TokenType;
import static proje2.Anasayfa.dvdler;


public class JFrameBilgiGoster extends javax.swing.JFrame {

    /**
     * Creates new form JFrameRehber
     */
    public JFrameBilgiGoster() {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ENVANTER");
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBoxSıralamaTürü = new javax.swing.JComboBox<>();
        jButtonSırala = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        yazıalanı = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("REHBER");

        jComboBoxSıralamaTürü.setBackground(new java.awt.Color(204, 206, 243));
        jComboBoxSıralamaTürü.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A'dan Z'ye", "Z'den A'ya", "2000 yılından önce piyasaya çıkmış tüm DVD bilgileri" }));
        jComboBoxSıralamaTürü.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSıralamaTürüActionPerformed(evt);
            }
        });

        jButtonSırala.setBackground(new java.awt.Color(204, 206, 243));
        jButtonSırala.setText("Sırala");
        jButtonSırala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSıralaActionPerformed(evt);
            }
        });

        yazıalanı.setColumns(20);
        yazıalanı.setForeground(new java.awt.Color(51, 51, 0));
        yazıalanı.setRows(5);
        yazıalanı.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                yazıalanıAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane2.setViewportView(yazıalanı);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jButtonSırala, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jComboBoxSıralamaTürü, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxSıralamaTürü, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonSırala, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addGap(9, 9, 9))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxSıralamaTürüActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSıralamaTürüActionPerformed

    }//GEN-LAST:event_jComboBoxSıralamaTürüActionPerformed

    private void jButtonSıralaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSıralaActionPerformed
       Anasayfa jframe=new Anasayfa();
       DVD dvd =new DVD();
        Node head;
       
        if(jComboBoxSıralamaTürü.getSelectedItem().toString().equals("Z'den A'ya")) {
             jframe.dvdler.reverse();
            yazıalanı.setText(jframe.dvdler.yazdırma2());
        }
        else if(jComboBoxSıralamaTürü.getSelectedItem().toString().equals("A'dan Z'ye")) { 
           
              yazıalanı.setText(jframe.dvdler.yazdırma2());
        }
        
        else{
               yazıalanı.setText(jframe.dvdler.yazdırma4());
        
        }
         
    }//GEN-LAST:event_jButtonSıralaActionPerformed

    private void yazıalanıAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_yazıalanıAncestorAdded
        // TODO add your handling code here:asds
    }//GEN-LAST:event_yazıalanıAncestorAdded
    
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
            java.util.logging.Logger.getLogger(JFrameBilgiGoster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameBilgiGoster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameBilgiGoster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameBilgiGoster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new JFrameBilgiGoster().setVisible(true);
            }
        });
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSırala;
    private javax.swing.JComboBox<String> jComboBoxSıralamaTürü;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea yazıalanı;
    // End of variables declaration//GEN-END:variables
}
