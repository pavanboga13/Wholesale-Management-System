
import java.awt.FlowLayout;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Suhas
 */
public class customer_Info extends javax.swing.JFrame {
    Connection cn;
       Statement stat;
       ResultSet rs; 
       int count=0;
       int save=0;
       

    /**
     * Creates new form customer_Info
     */
    public customer_Info() {
        
        
        try{
        
        this.setTitle("Wholesale Management");
        initComponents();
        jLabel4=new JLabel(new ImageIcon("img8.jpg"));
        jLabel4.setLayout(new FlowLayout());        
        this.add(jLabel4);
     
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/wholesale_management","root","root");
            
            stat=cn.createStatement();
            rs=stat.executeQuery("select b_id from buyer order by b_id");
            int v=0;
            rs.last();
            v=rs.getInt(1);
            v++;
            jTextField1.setText(""+v);
            
            
            
        }catch(Exception e){}
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
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CUSTOMER INFORMATION");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(399, 11, 487, 76);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("CUSTOMER ID");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(116, 113, 259, 53);

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(393, 115, 720, 53);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("CUSTOMER NAME");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(116, 205, 259, 55);

        jTextField3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField3KeyReleased(evt);
            }
        });
        getContentPane().add(jTextField3);
        jTextField3.setBounds(393, 207, 720, 55);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setText("ADDRESS");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(116, 304, 259, 114);

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jScrollPane1.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(393, 304, 720, 114);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setText("PHONE NUMBER");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(116, 462, 259, 55);

        jTextField2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(393, 464, 457, 55);

        jButton8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton8.setText("SAVE");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(902, 462, 211, 55);

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton4.setText("ADD");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(270, 600, 118, 60);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setText("UPDATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(430, 600, 129, 60);

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton5.setText("DELETE");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(600, 600, 147, 60);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton2.setText("DISPLAY");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(780, 600, 146, 60);

        jButton7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton7.setText("BACK");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(955, 600, 158, 58);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customer.jpeg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 1400, 710);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
         try{
            save=1;
            
            String smt,b_id,b_name,b_address;
            String mob=new String(jTextField2.getText());
             b_id=new String(jTextField1.getText());
                b_name=new String(jTextField3.getText());
                b_address=new String(jTextArea2.getText());
               String gg=jTextField1.getText().trim();
                
            if(b_id.trim().length()==0||b_name.trim().length()==0||b_address.trim().length()==0)
            {                
                JOptionPane.showMessageDialog(null,"Enter all information","Login Error",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                if(count==0)
                    {
                        if(mob.trim().length()==10)
                            {
                                stat=cn.createStatement();
                                smt="insert into buyer values('"+b_id.trim()+"','"+b_name.trim()+"','"+b_address.trim()+"')";
                                stat.executeUpdate(smt);
                                smt="insert into contact values((select b_id from buyer where b_id="+b_id+"),'"+mob+"')";
                                stat.executeUpdate(smt);
                                count=1;
                                jTextField2.setText("");
                            }

                        else
                        JOptionPane.showMessageDialog(null,"ENTER ALL INFORMATION","Invalid Number",JOptionPane.ERROR_MESSAGE);
                    }   
                        else
                        {
                            if(mob.trim().length()==10)
                            {
                                stat=cn.createStatement();
                                mob=new String(jTextField2.getText());
                                smt="insert into contact values((select b_id from buyer where b_id="+b_id+"),'"+mob+"')";
                                stat.executeUpdate(smt);
                                jTextField2.setText("");
                            }

                            else
                                JOptionPane.showMessageDialog(null,"ENTER VALID MOBILE NUMBER","Login Error",JOptionPane.ERROR_MESSAGE);
                        }
                }
            
                
        }
        catch(com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException x)
        {
            JOptionPane.showMessageDialog(null,"CUSTOMER ID IS ALREDY EXISTED");
            jTextField1.setText("");
        }
        catch(Exception e){JOptionPane.showMessageDialog(null,e);}             // TODO add your handling code here:    
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    try{
        if(save==0)
        {
            JOptionPane.showMessageDialog(null,"PRESS THE SAVE BUTTON","Login Error",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
        String s="CUSTOMER ADDED SUCCESSFULLY";
       jTextField1.setText("");
       jTextField2.setText("");
       jTextField3.setText("");
       jTextArea2.setText("");
        count=0;save=0;
        
                    stat=cn.createStatement();
            rs=stat.executeQuery("select b_id from buyer order by b_id");
            int v=0;
            rs.last();
            v=rs.getInt(1);
            v++;
            jTextField1.setText(""+v);

        
        JOptionPane.showMessageDialog(this, s);
        }
    }catch(Exception e){JOptionPane.showMessageDialog(null,e); }
                                           
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.dispose();
        new deleteCustomer();
 
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        showCustomerList sc=new showCustomerList();
        sc.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        this.dispose();
        Main_menu mm=new Main_menu();
        mm.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTextField3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyReleased
        char z=evt.getKeyChar();
        String x;
        if(evt.getKeyCode()==10||evt.getKeyCode()==8||evt.getKeyCode()==16||evt.getKeyCode()==32)
        {

        }
        else if(z>='a'&&z<='z'||z>='A'&&z<='Z')
        {
            x=jTextField3.getText();
            jTextField3.setText(x);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"ONLY CHARACTER INPUT");
            jTextField3.setText("");        // TODO add your handling code here:
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3KeyReleased

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        new UpdateCustomer();
         // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost

            
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1FocusLost

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
        
        char z=evt.getKeyChar();
        String x;
        if(evt.getKeyCode()==10||evt.getKeyCode()==8)
        {
        }
        else if(z>='0'&&z<='9')
        {
            x=jTextField2.getText();
            jTextField2.setText(x);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"ONLY NUMBER INPUT");
            jTextField2.setText("");         
        }        
        
    }//GEN-LAST:event_jTextField2KeyReleased

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
            java.util.logging.Logger.getLogger(customer_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(customer_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(customer_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(customer_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
                        new customer_Info().setVisible(true);
        
        /* Create and display the form 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
