/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.FlowLayout;
import java.sql.DriverManager;
import javax.swing.*;
import javax.sql.*;
import java.util.Date;
import java.util.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Suhas
 */
public class buyer_order extends javax.swing.JFrame {
Date d;
ResultSet rs;
Statement stat;
Connection cn;
String s;
PreparedStatement pst=null;
int tcount=1,z=0;
/**
     * Creates new form buyer_order
     */
    public buyer_order() {
                this.setResizable(false);
                this.setTitle("Wholesale Management");        
        initComponents(); 
                jLabel17=new JLabel(new ImageIcon("img8.jpg"));
        jLabel17.setLayout(new FlowLayout());        
        this.add(jLabel17);
     
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        try{            
            s=new String(JOptionPane.showInputDialog(null,"ENTER CUSTOMER ID TO DISPLAY"));
                Class.forName("com.mysql.jdbc.Driver");
                cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/wholesale_management","root","root");
                stat=cn.createStatement();
                stat = cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY); 
                rs=stat.executeQuery("select * from buyer where b_id="+s.trim()+"");

                if(rs.first())
                {
                    this.setVisible(true); 
                    
                    {
                        jTextField10.setText(""+rs.getInt("b_id"));
                        jTextField12.setText(rs.getString("b_name"));
                    }
                
                stat=cn.createStatement();
                rs=stat.executeQuery("select * from contact where b_id="+s.trim()+"");
                while(rs.next())
                {
                    jTextField11.setText(""+rs.getString("contact"));
                }
                }
                else
                {
                    this.dispose();
                    new Main_menu().setVisible(true);
                    JOptionPane.showMessageDialog(null, "CUSTOMER NOT FOUND.....");
                }
            d=new java.util.Date();
            jLabel3.setText(new SimpleDateFormat("yyyy-MM-dd").format(d));
            stat=cn.createStatement();
            rs=stat.executeQuery("select p_name from product order by p_id");
            while(rs.next())
            {
                jComboBox1.addItem(""+rs.getString(1));
            }
            
            stat=cn.createStatement();
            rs=stat.executeQuery("select pa_id from payment order by pa_id");
            int v=0;
            if(rs.first())
            {
            rs.last();
            v=rs.getInt(1);
            v++;
            jTextField9.setText(""+v);
            }
            else
            {
                jTextField9.setText("1");
            }

            }catch(NullPointerException e){
        new Main_menu().setVisible(true);}
        catch(SQLSyntaxErrorException e){JOptionPane.showMessageDialog(null, "ENTER VALID INPUT");
        this.dispose();
        new Main_menu().setVisible(true);
        }

        catch(Exception e){JOptionPane.showMessageDialog(null,e);}
           
    }
    
    private void Fillcombo()
    {
        try{
            
            String sql="select *from product ORDER by p_id";
            pst=cn.prepareStatement(sql);
            rs=pst.executeQuery();
            
            while(rs.next())
            {
                String name=rs.getString("p_name");
                jComboBox1.addItem(name);
            }       
            
            
        }catch(Exception e){JOptionPane.showMessageDialog(null ,e);}
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ORDER");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(358, 12, 467, 59);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("DATE");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(1060, 10, 88, 38);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(1160, 10, 173, 38);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setText("CANCEL");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(782, 642, 179, 39);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("CUSTOMER ID");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(46, 171, 169, 39);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setText("PRODUCT ID");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(46, 319, 246, 45);

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(jTextField1);
        jTextField1.setBounds(310, 319, 966, 45);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setText("PRODUCT NAME");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(46, 239, 246, 45);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setText("PRODUCT RATE");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(46, 399, 246, 45);

        jTextField3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField3FocusLost(evt);
            }
        });
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
        jTextField3.setBounds(762, 402, 169, 45);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setText("QUANTITY");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(559, 400, 163, 45);

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4);
        jTextField4.setBounds(310, 399, 200, 45);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel10.setText("DISCOUNT");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(559, 479, 163, 45);

        jTextField5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField5KeyReleased(evt);
            }
        });
        getContentPane().add(jTextField5);
        jTextField5.setBounds(762, 481, 169, 45);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel11.setText("NET AMOUNT");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(46, 479, 246, 45);

        jTextField6.setEditable(false);
        jTextField6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextField6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField6MouseEntered(evt);
            }
        });
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField6);
        jTextField6.setBounds(310, 481, 200, 45);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel12.setText("DISCOUNT AMOUNT");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(46, 561, 246, 45);

        jTextField7.setEditable(false);
        jTextField7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextField7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField7MouseEntered(evt);
            }
        });
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField7);
        jTextField7.setBounds(310, 561, 200, 45);

        jTextField8.setEditable(false);
        jTextField8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextField8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField8MouseEntered(evt);
            }
        });
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField8);
        jTextField8.setBounds(310, 641, 200, 45);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel13.setText("TOTAL AMOUNT");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(46, 641, 246, 45);

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NONE" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox1PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(310, 241, 966, 45);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel15.setText("AVAILABLE STOCK");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(949, 397, 238, 50);

        jTextField2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(1205, 398, 71, 48);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel14.setText("PAYMENT ID");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(46, 99, 152, 40);

        jTextField9.setEditable(false);
        jTextField9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(jTextField9);
        jTextField9.setBounds(233, 99, 108, 40);

        jTextField10.setEditable(false);
        jTextField10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(jTextField10);
        jTextField10.setBounds(233, 172, 108, 40);

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel16.setText("CUSTOMER NAME");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(422, 91, 216, 48);

        jTextField11.setEditable(false);
        jTextField11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(jTextField11);
        jTextField11.setBounds(703, 173, 367, 39);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setText("PHONE NUMBER");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(422, 171, 244, 39);

        jTextField12.setEditable(false);
        jTextField12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(jTextField12);
        jTextField12.setBounds(703, 91, 367, 48);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton2.setText("PLACE ORDER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(559, 559, 205, 45);

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton3.setText("PAYMENTS");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(782, 559, 179, 45);

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton4.setText("NEW ORDER");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(559, 644, 205, 42);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/order.jpeg"))); // NOI18N
        jLabel17.setText("jLabel17");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(0, 0, 1400, 750);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    this.dispose();
    new Main_menu().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
 
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jComboBox1PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox1PopupMenuWillBecomeInvisible
        String tmp=(String)jComboBox1.getSelectedItem();
        String sql="select *from product where p_name=?";
        try
        {
            pst=cn.prepareStatement(sql);
            pst.setString(1, tmp);
            rs=pst.executeQuery();
            if(rs.next())
            {
                String add1=rs.getString("p_id");
                jTextField1.setText(add1);
                String add2=rs.getString("p_rate");
                jTextField4.setText(add2);
                String add3=rs.getString("p_av_quantity");
                jTextField2.setText(add3);
            }
            
            jTextField3.setText("");
            jTextField5.setText("");
            jTextField6.setText("");
            jTextField7.setText("");
            jTextField8.setText("");
            
            
        }catch(Exception e){JOptionPane.showMessageDialog(null, e);}
    }//GEN-LAST:event_jComboBox1PopupMenuWillBecomeInvisible

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusLost

        
        int x=Integer.valueOf(jTextField2.getText().trim());
        int y=Integer.valueOf(jTextField3.getText().trim());

        if(y>x)
        {
            JOptionPane.showMessageDialog(null,"NOT ENOUGH QUANTITY","Error in Quantity",JOptionPane.ERROR_MESSAGE);
            jTextField3.setText("");
            jTextField6.setText("");
        }
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3FocusLost

    private void jTextField6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField6MouseEntered

        double x=Double.valueOf(jTextField4.getText().trim());
        double y=Double.valueOf(jTextField3.getText().trim());
        
        jTextField6.setText(""+(x*y));
                // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6MouseEntered

    private void jTextField7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField7MouseEntered

        double y=Double.valueOf(jTextField5.getText().trim());
        double x=Double.valueOf(jTextField6.getText().trim());
        
        double p=y/100;
                
            jTextField7.setText(""+(p*x));

        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7MouseEntered

    private void jTextField8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField8MouseEntered

        double x=Double.valueOf(jTextField6.getText().trim());
        double y=Double.valueOf(jTextField7.getText().trim());    

        jTextField8.setText(""+(x-y));

        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8MouseEntered

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    
    try
    {
            String smt,cu_id, pay_id, pro_id,date,dis,pay_bill,quan;
            cu_id=jTextField10.getText().trim();
            pay_id=jTextField9.getText().trim();
            pro_id=jTextField1.getText().trim();
            date=jLabel3.getText().trim();
            dis=jTextField7.getText().trim();
            pay_bill=jTextField8.getText().trim();
            quan=jTextField3.getText().trim();
                           
            if(cu_id.length()==0||pay_id.length()==0||pro_id.length()==0||date.length()==0||dis.length()==0||pay_bill.length()==0)
            {                
                JOptionPane.showMessageDialog(null,"Enter all information","Login Error",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                stat=cn.createStatement();
                smt="insert into payment values('"+pay_id.trim()+"','"+date+"','"+dis+"','"+pay_bill+"','"+cu_id+"','"+pro_id+"')";
                stat.executeUpdate(smt);
                stat=cn.createStatement();
                smt="update product set p_av_quantity=p_av_quantity-"+quan+" where p_id="+pro_id+"";
                stat.executeUpdate(smt);
                
                JOptionPane.showMessageDialog(null, "ORDER SUCCESFULLY COMPLETED");
                
                jTextField1.setText("");
                jTextField2.setText("");
                jTextField3.setText("");
                jTextField4.setText("");
                jTextField5.setText("");
                jTextField6.setText("");
                jTextField7.setText("");
                jTextField8.setText("");
                jTextField9.setText("");
                jTextField10.setText("");
                jTextField11.setText("");
                jTextField12.setText("");
                jComboBox1.setSelectedItem("");
            }
    }catch(Exception e){JOptionPane.showMessageDialog(null,e);} 
    

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    this.dispose();
    payment pa=new payment();
    pa.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    this.dispose();
    new buyer_order();// TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyReleased
        char z=evt.getKeyChar();
        String x;
        if(evt.getKeyCode()==10||evt.getKeyCode()==8)
        {
        }
        else if(z>='0'&&z<='9')
        {
            x=jTextField3.getText();
            int zx=Integer.valueOf(x);
            if(zx==0)
                JOptionPane.showMessageDialog(null, "Enter valid quantity.", "Quantity Error", JOptionPane.ERROR_MESSAGE);
            jTextField3.setText(x);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"ONLY NUMBER INPUT");
            jTextField3.setText("");         
        }
    }//GEN-LAST:event_jTextField3KeyReleased

    private void jTextField5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyReleased
        char z=evt.getKeyChar();
        String x;
        if(evt.getKeyCode()==10||evt.getKeyCode()==8)
        {
        }
        else if(z>='0'&&z<='9')
        {
            x=jTextField5.getText();
            jTextField5.setText(x);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"ONLY NUMBER INPUT");
            jTextField5.setText("");         
        }
    }//GEN-LAST:event_jTextField5KeyReleased

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
            java.util.logging.Logger.getLogger(buyer_order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(buyer_order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(buyer_order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(buyer_order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
new buyer_order();
        /* Create and display the form 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
