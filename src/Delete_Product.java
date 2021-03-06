import java.awt.FlowLayout;
import java.sql.DriverManager;
import javax.swing.*;
import javax.sql.*;
import java.util.Date;
import java.util.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class Delete_Product extends javax.swing.JFrame {
   Connection cn;
    Statement stat;
    ResultSet rs;
    String s;
    Date d;
    /**
     * Creates new form Delete_Product
     */
    public Delete_Product() 
    {

        this.setTitle("Wholesale Management");
        initComponents();
        jLabel7=new JLabel(new ImageIcon("main.png"));
        jLabel7.setLayout(new FlowLayout());
        this.add(jLabel7);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            
        
                d=new java.util.Date();
            jLabel9.setText(new SimpleDateFormat("yyyy-MM-dd").format(d));
            
        
        try
        {
            s=new String(JOptionPane.showInputDialog(null,"ENTER PRODUCT ID TO DISPLAY"));
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/wholesale_management","root","root");
            stat=cn.createStatement();
            stat = cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY); 
             rs=stat.executeQuery("select * from product where p_id="+s.trim()+"");
             
             if(rs.first())
             {
                this.setVisible(true);
                jTextField1.setText(""+rs.getInt("p_id"));
                jTextField2.setText(rs.getString("p_name"));
                jTextField3.setText(rs.getString("p_rate"));
                jTextField4.setText(rs.getString("p_quantity"));
                jTextField5.setText(rs.getString("p_bill"));
                
             }
             else
             {
                 JOptionPane.showMessageDialog(null, "PRODUCT NOT FOUND");
                 this.dispose();
                 new add_product().setVisible(true);
             } 
        }catch(NullPointerException e){
        new add_product().setVisible(true);}
        catch(SQLSyntaxErrorException e){JOptionPane.showMessageDialog(null, "ENTER VALID INPUT");
        this.dispose();
        new add_product().setVisible(true);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("PRODUCT RATE ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(143, 303, 255, 46);

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(431, 135, 821, 46);

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(431, 221, 821, 46);

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(jTextField3);
        jTextField3.setBounds(431, 303, 821, 46);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setText("PRODUCT QUANTITY ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(143, 383, 255, 46);

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(jTextField4);
        jTextField4.setBounds(431, 383, 821, 46);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setText("PRODUCT BILL");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(143, 460, 255, 46);

        jTextField5.setEditable(false);
        jTextField5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(jTextField5);
        jTextField5.setBounds(431, 462, 821, 46);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("PRODUCT NAME ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(143, 221, 255, 46);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("PRODUCT ID ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(143, 135, 255, 46);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setText("DELETE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(401, 569, 286, 56);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton2.setText("CANCEL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(750, 569, 229, 56);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DELETING PRODUCT");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(431, 26, 677, 70);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setText("DATE");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(1060, 10, 88, 38);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(1160, 10, 173, 38);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main.png"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, -80, 1390, 850);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                try{
          stat=cn.createStatement();
        stat.executeUpdate("delete from product where p_id="+s.trim()+"");
        JOptionPane.showMessageDialog(null,"Records Deleted Successfully.");
        this.dispose();
        add_product m=new add_product();
        m.setVisible(true);
        }catch(Exception e){JOptionPane.showMessageDialog(null,e);}  
       // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        add_product ap=new add_product();
        ap.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Delete_Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Delete_Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Delete_Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Delete_Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        new Delete_Product();
        /* Create and display the form 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
