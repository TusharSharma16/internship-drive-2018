/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author HP
 */
public class admin extends javax.swing.JFrame {
private JPanel contentPane;
    /**
     * Creates new form admin
     */
    public admin() {
        initComponents();
        
        CustomCursor();
        setDefaultCloseOperation(Members_Login.DISPOSE_ON_CLOSE);
    setBounds(269, 100, 810, 500);
    contentPane = new JPanel();
    contentPane.setBackground(Color.ORANGE);
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
   
    
   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        b = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        a1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        b.setBackground(new java.awt.Color(211, 211, 211));
        b.setFont(new java.awt.Font("Lato Light", 1, 24)); // NOI18N
        b.setBorder(null);
        b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActionPerformed(evt);
            }
        });
        getContentPane().add(b);
        b.setBounds(280, 290, 270, 30);

        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(270, 350, 270, 40);

        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(310, 420, 190, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minimize normal.png"))); // NOI18N
        jLabel7.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel7MouseMoved(evt);
            }
        });
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel7MousePressed(evt);
            }
        });
        getContentPane().add(jLabel7);
        jLabel7.setBounds(60, 0, 26, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minmize hover.png"))); // NOI18N
        jLabel6.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel6MouseDragged(evt);
            }
        });
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel6);
        jLabel6.setBounds(60, 0, 30, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close normal.png"))); // NOI18N
        jLabel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel3MouseMoved(evt);
            }
        });
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 0, 26, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close hover.png"))); // NOI18N
        jLabel5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel5MouseDragged(evt);
            }
        });
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 0, 30, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/title bar.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 810, 30);

        a1.setBackground(new java.awt.Color(211, 211, 211));
        a1.setFont(new java.awt.Font("Lato Light", 1, 24)); // NOI18N
        a1.setBorder(null);
        a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a1ActionPerformed(evt);
            }
        });
        getContentPane().add(a1);
        a1.setBounds(290, 230, 250, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin.png"))); // NOI18N
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel1MouseMoved(evt);
            }
        });
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 810, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
this.dispose();
Members_Login form = new Members_Login();
form.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
String query="Select Username,Password from admin where Username=? and Password=?;";
int a125=b.getDocument().getLength();
int a126=b.getDocument().getLength();
if (a125==0 || a126==0){
JOptionPane.showMessageDialog(null,"Please enter ID or Password.");
}else
try{Class.forName("java.sql.Driver");
Connection con=DriverManager.getConnection
        ("jdbc:mysql://localhost:3306/pix_craft","root","a");
PreparedStatement ps=con.prepareStatement(query);
ps.setString(1,b.getText());
ps.setString(2,b.getText());
ResultSet rs = ps.executeQuery();
if(rs.next()){
int res=JOptionPane.showConfirmDialog(null,"Correct Login-ID and Password"
        + "...Login successful... \n Wanna Continue");
if(res == JOptionPane.YES_OPTION){
   this.dispose();
   admin_login form = new admin_login();
   form.setVisible(true);
}else if(res==JOptionPane.NO_OPTION){
this.dispose();
   admin form = new admin();
   form.setVisible(true);}
else if(res == JOptionPane.CANCEL_OPTION){
System.exit(0);}
}else{
this.dispose();
admin form=new admin();
form.setVisible(true);
}}catch(Exception e){
JOptionPane.showMessageDialog(null,e);}// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel7MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseMoved
        jLabel7.setVisible(false);
        jLabel3.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseMoved

    private void jLabel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MousePressed

    private void jLabel6MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseDragged

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        this.setState(Members_Login.ICONIFIED);       // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseMoved
        jLabel3.setVisible(false);
        jLabel7.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseMoved

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MousePressed

    private void jLabel5MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseDragged

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        System.exit(0);

    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseMoved
jLabel3.setVisible(true);
jLabel7.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseMoved

    private void a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a1ActionPerformed
public void CustomCursor()
    {
      Toolkit toolkit = Toolkit.getDefaultToolkit();
      Image img = toolkit.getImage("cursor.png");
      Point point = new Point(0,0);
      Cursor Cursor = toolkit.createCustomCursor(img, point, "cursor");
      setCursor(Cursor);
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
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField a1;
    private javax.swing.JTextField b;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
