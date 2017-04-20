import java.sql.*;
import javax.swing.JOptionPane;
public class Admin_login extends javax.swing.JFrame {

    public Admin_login() {
        initComponents();
        setSize(600, 400);
        setVisible(true);
        setResizable(false);
           }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        username_label = new javax.swing.JLabel();
        password_label = new javax.swing.JLabel();
        username_textfield = new javax.swing.JTextField();
        password_passwordfield = new javax.swing.JPasswordField();
        admin_login_button = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        heading_panel = new javax.swing.JPanel();
        heading_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 102));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(null);

        username_label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        username_label.setText("Username");
        getContentPane().add(username_label);
        username_label.setBounds(220, 108, 115, 30);

        password_label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        password_label.setText("Password");
        getContentPane().add(password_label);
        password_label.setBounds(220, 160, 115, 27);
        getContentPane().add(username_textfield);
        username_textfield.setBounds(360, 108, 125, 30);

        password_passwordfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password_passwordfieldActionPerformed(evt);
            }
        });
        getContentPane().add(password_passwordfield);
        password_passwordfield.setBounds(360, 158, 125, 30);

        admin_login_button.setBackground(new java.awt.Color(102, 102, 255));
        admin_login_button.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        admin_login_button.setText("Login");
        admin_login_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admin_login_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(admin_login_button);
        admin_login_button.setBounds(308, 225, 87, 35);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/default-icon.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-20, 90, 250, 240);

        heading_panel.setBackground(new java.awt.Color(102, 102, 255));

        heading_label.setBackground(new java.awt.Color(51, 0, 204));
        heading_label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        heading_label.setText("ADMIN LOGIN");
        heading_label.setToolTipText("");

        javax.swing.GroupLayout heading_panelLayout = new javax.swing.GroupLayout(heading_panel);
        heading_panel.setLayout(heading_panelLayout);
        heading_panelLayout.setHorizontalGroup(
            heading_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(heading_panelLayout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(heading_label)
                .addContainerGap(410, Short.MAX_VALUE))
        );
        heading_panelLayout.setVerticalGroup(
            heading_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, heading_panelLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(heading_label, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(heading_panel);
        heading_panel.setBounds(0, 0, 800, 80);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void password_passwordfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password_passwordfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_password_passwordfieldActionPerformed

    private void admin_login_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admin_login_buttonActionPerformed
        String username;
        String password;
        username = username_textfield.getText();
        password = password_passwordfield.getText();
        if (username.equals("") || password.equals("")) {
            JOptionPane.showMessageDialog(this, "Please fill all the fields");
        } else {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "root");
                Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                ResultSet rs = stmt.executeQuery("select * from admin_table where username = " + "'" + username + "'" + "and password = " + "'" + password + "'");
                if (rs.next()) {
                    JOptionPane.showMessageDialog(this, "You have sucessfully logged in");
                    Admin_Home home = new Admin_Home();
                    this.dispose();
                
                } else {
                    JOptionPane.showMessageDialog(this, "Invalid username or password");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_admin_login_buttonActionPerformed
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
            java.util.logging.Logger.getLogger(Admin_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton admin_login_button;
    private javax.swing.JLabel heading_label;
    private javax.swing.JPanel heading_panel;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel password_label;
    private javax.swing.JPasswordField password_passwordfield;
    private javax.swing.JLabel username_label;
    private javax.swing.JTextField username_textfield;
    // End of variables declaration//GEN-END:variables
    
}
