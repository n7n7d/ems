
import java.io.*;
import java.sql.*;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Add_employee extends javax.swing.JFrame {

    String path;
    FileInputStream fis;
    FileOutputStream fos;

    public Add_employee() {
        initComponents();
        setSize(600, 500);
        setVisible(true);
       setResizable(false);
      

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        username_textfield = new javax.swing.JTextField();
        name_textfield = new javax.swing.JTextField();
        email_textfield = new javax.swing.JTextField();
        phone_number_textfield = new javax.swing.JTextField();
        add_button = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        photo_address_textfield = new javax.swing.JTextField();
        browse_button = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 255));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Username");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(140, 83, 97, 28);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(140, 137, 97, 27);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Email");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(140, 192, 97, 27);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Phone_number");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(140, 246, 97, 29);
        getContentPane().add(username_textfield);
        username_textfield.setBounds(282, 83, 150, 28);
        getContentPane().add(name_textfield);
        name_textfield.setBounds(282, 139, 150, 27);

        email_textfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                email_textfieldFocusLost(evt);
            }
        });
        getContentPane().add(email_textfield);
        email_textfield.setBounds(282, 194, 150, 27);

        phone_number_textfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                phone_number_textfieldFocusLost(evt);
            }
        });
        getContentPane().add(phone_number_textfield);
        phone_number_textfield.setBounds(282, 246, 150, 29);

        add_button.setBackground(new java.awt.Color(51, 102, 255));
        add_button.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add_button.setText("ADD");
        add_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(add_button);
        add_button.setBounds(290, 350, 110, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Photo");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(140, 293, 97, 29);
        getContentPane().add(photo_address_textfield);
        photo_address_textfield.setBounds(282, 295, 150, 29);

        browse_button.setBackground(new java.awt.Color(51, 102, 255));
        browse_button.setText("Browse");
        browse_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browse_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(browse_button);
        browse_button.setBounds(450, 290, 80, 33);

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("   ADD EMPLOYEE");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(200, 20, 240, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 640, 70);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void add_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_buttonActionPerformed
        // TODO add your handling code here:
        String username = username_textfield.getText();
        String name = name_textfield.getText();
        int pass = (int) (10000 + (90000 - 10000) * (Math.random()));
        String password = pass + "";
        String email = email_textfield.getText();
        String phone = phone_number_textfield.getText();
        if (username.equals("") || name.equals("") || email.equals("") || phone.equals("")) {
            JOptionPane.showMessageDialog(this, "Please fill all the fields");
        }
        else
        {
            

        try {

            Long phone_num = Long.parseLong(phone_number_textfield.getText());
            if (!email.contains(".") || !email.contains("@") || email.lastIndexOf(".") < email.lastIndexOf("@")) 
            {
            JOptionPane.showMessageDialog(rootPane, "Plese enter a valid email");
            email_textfield.setText("");
        }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Please fill a valid phone number");
            phone_number_textfield.setText("");
        }
       

            try {

                File f = new File(photo_address_textfield.getText());
                fis = new FileInputStream(f);
                String username1 = username_textfield.getText();
                File f1 = new File(System.getProperty("user.home") + "\\Images\\");
                if (!f1.exists()) {
                    f1.mkdirs();
                    System.out.println("created");
                }
                fos = new FileOutputStream(f1 + "\\" + username1 + ".jpg");
                byte b[] = new byte[100];
                int total = (int) f.length();

                while (true) {
                    int r = fis.read();
                    if (r == -1) {
                        break;
                    }
                    fos.write(r);
                }
                fos.close();
                fis.close();

                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "root");
                Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                ResultSet rs = stmt.executeQuery("select * from employee where emp_name =" + "'" + username + "'");
                if (rs.next()) {
                    JOptionPane.showMessageDialog(this, "Employee with this username already exists");
                } else {
                    rs.moveToInsertRow();
                    rs.updateString("emp_name", username);
                    rs.updateString("name", name);
                    rs.updateString("password", password);
                    rs.updateString("email", email);
                    rs.updateString("phone_no", phone);
                    rs.insertRow();
                    JOptionPane.showMessageDialog(this, "Record Added Sucessfully");
                    username_textfield.setText("");
                    name_textfield.setText("");
                    email_textfield.setText("");
                    phone_number_textfield.setText("");
                    photo_address_textfield.setText("");

                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        


    }//GEN-LAST:event_add_buttonActionPerformed

    private void browse_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browse_buttonActionPerformed
        // TODO add your handling code here:
        JFileChooser fc = new JFileChooser();
        int r = fc.showOpenDialog(this);
        if (r == JFileChooser.APPROVE_OPTION) {
            path = fc.getSelectedFile().getPath();
            photo_address_textfield.setText(path);
        }
    }//GEN-LAST:event_browse_buttonActionPerformed

    private void email_textfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_email_textfieldFocusLost
        // TODO add your handling code here:

        


    }//GEN-LAST:event_email_textfieldFocusLost

    private void phone_number_textfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phone_number_textfieldFocusLost
        // TODO add your handling code here:
        if (!phone_number_textfield.getText().equals("")) {

        }
    }//GEN-LAST:event_phone_number_textfieldFocusLost

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
            java.util.logging.Logger.getLogger(Add_employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_employee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_button;
    private javax.swing.JButton browse_button;
    private javax.swing.JTextField email_textfield;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField name_textfield;
    private javax.swing.JTextField phone_number_textfield;
    private javax.swing.JTextField photo_address_textfield;
    private javax.swing.JTextField username_textfield;
    // End of variables declaration//GEN-END:variables
}
