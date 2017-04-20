
import java.sql.*;
import javax.swing.table.*;
import java.util.*;
import javax.swing.JOptionPane;

public class Employee_table extends javax.swing.JFrame 
{

    ArrayList<Employee> al = new ArrayList<>();
    EmployeeTableModel stm;
    int index;
    String username;
    Connection conn;
    Statement stmt;
    ResultSet rs;

    public Employee_table() {
        stm = new EmployeeTableModel();
        initComponents();
        setSize(410, 400);
        setVisible(true);
        setResizable(false);
        username_textfield.setEditable(false);
      
        updatepanel.setVisible(false);
        // for viewing the list of employees
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "root");
            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rs = stmt.executeQuery("select * from employee");
            while (rs.next()) {
                al.add(new Employee(rs.getString("emp_name"), rs.getString("name"), rs.getString("password"), rs.getString("email"), rs.getString("phone_no")));
                stm.fireTableDataChanged();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jt1 = new javax.swing.JTable();
        delete_record_button = new javax.swing.JButton();
        updatepanel = new javax.swing.JPanel();
        username_label = new javax.swing.JLabel();
        name_label = new javax.swing.JLabel();
        email_label = new javax.swing.JLabel();
        password_label = new javax.swing.JLabel();
        username_textfield = new javax.swing.JTextField();
        name_textfield = new javax.swing.JTextField();
        email_textfield = new javax.swing.JTextField();
        password_passwordfield = new javax.swing.JTextField();
        update_record_button = new javax.swing.JButton();
        edit_record_button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jt1.setModel(stm);
        jScrollPane1.setViewportView(jt1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 20, 357, 253);

        delete_record_button.setText("DELETE");
        delete_record_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_record_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(delete_record_button);
        delete_record_button.setBounds(61, 291, 103, 40);

        updatepanel.setLayout(null);

        username_label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        username_label.setText("Username");
        updatepanel.add(username_label);
        username_label.setBounds(20, 20, 61, 20);

        name_label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        name_label.setText("Name");
        updatepanel.add(name_label);
        name_label.setBounds(20, 60, 35, 20);

        email_label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        email_label.setText("Email");
        updatepanel.add(email_label);
        email_label.setBounds(20, 100, 31, 20);

        password_label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        password_label.setText("Password");
        updatepanel.add(password_label);
        password_label.setBounds(20, 140, 58, 17);

        username_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username_textfieldActionPerformed(evt);
            }
        });
        updatepanel.add(username_textfield);
        username_textfield.setBounds(100, 20, 140, 30);
        updatepanel.add(name_textfield);
        name_textfield.setBounds(100, 60, 140, 30);

        email_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_textfieldActionPerformed(evt);
            }
        });
        updatepanel.add(email_textfield);
        email_textfield.setBounds(100, 100, 140, 30);
        updatepanel.add(password_passwordfield);
        password_passwordfield.setBounds(100, 140, 140, 30);

        update_record_button.setText("UPDATE");
        update_record_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_record_buttonActionPerformed(evt);
            }
        });
        updatepanel.add(update_record_button);
        update_record_button.setBounds(90, 200, 90, 36);

        getContentPane().add(updatepanel);
        updatepanel.setBounds(390, 20, 250, 250);

        edit_record_button.setText("EDIT");
        edit_record_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_record_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(edit_record_button);
        edit_record_button.setBounds(213, 291, 94, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/windows_7_blue_login_screen_by_eerik34536.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 670, 380);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void delete_record_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_record_buttonActionPerformed
        // TODO add your handling code here:

        // for deletion of multiple selected rows
        int[] selectedRows = jt1.getSelectedRows();
        try {

            for (int i = 0; i < selectedRows.length; i++) {
                String username = al.get(selectedRows[i]).emp_name;
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "root");
                Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                ResultSet rs = stmt.executeQuery("select * from employee where emp_name ='" + username + "'");
                rs.next();
                rs.deleteRow();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        al.clear();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "root");
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery("select * from employee");
            while (rs.next()) {
                al.add(new Employee(rs.getString("emp_name"), rs.getString("name"), rs.getString("email"), rs.getString("password"), rs.getString("phone_no")));
                stm.fireTableDataChanged();
            }

        } catch (Exception e) {
        }


    }//GEN-LAST:event_delete_record_buttonActionPerformed

    private void username_textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_username_textfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_username_textfieldActionPerformed

    private void email_textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_textfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email_textfieldActionPerformed

    private void edit_record_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_record_buttonActionPerformed

        // for selecting the index of the row to edit and storing the corresponding values in the panel
        index = jt1.getSelectedRow();
        if (jt1.isRowSelected(index)) {

            setSize(680, 400);
            username = al.get(index).emp_name;
            updatepanel.setVisible(true);
            username_textfield.setText(al.get(index).emp_name);
            name_textfield.setText(al.get(index).name);
            email_textfield.setText(al.get(index).email);
            password_passwordfield.setText(al.get(index).password);

        } else {
            JOptionPane.showMessageDialog(this, "No row Selected");
        }


    }//GEN-LAST:event_edit_record_buttonActionPerformed

    private void update_record_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_record_buttonActionPerformed

        // to update(edit) the selected row
        try {

            if (username_textfield.getText().equals("") || name_textfield.getText().equals("") || email_textfield.getText().equals("") || password_passwordfield.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please fill all the enteries to edit the selected row");
            } 
             else {
                    al.get(index).emp_name = username_textfield.getText();
                    al.get(index).name = name_textfield.getText();
                    al.get(index).email = email_textfield.getText();
                    al.get(index).password = password_passwordfield.getText();
                    stm.fireTableDataChanged();

                    Statement stmt2 = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                    ResultSet rs2 = stmt2.executeQuery("select * from employee where emp_name ='" + username + "'");
                    rs2.next();
                    rs2.updateString("emp_name", username_textfield.getText());
                    rs2.updateString("name", name_textfield.getText());
                    rs2.updateString("email", email_textfield.getText());
                    rs2.updateString("password", password_passwordfield.getText());
                    rs2.updateRow();
                    username_textfield.setText("");
                    name_textfield.setText("");
                    email_textfield.setText("");
                    password_passwordfield.setText("");
                    setSize(410,400);
                }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_update_record_buttonActionPerformed

    class EmployeeTableModel extends AbstractTableModel {

        String columnNames[] = {"emp_name", "name", "password", "email", "phone_no"};

        public String getColumnName(int i) {
            return columnNames[i];
        }

        public int getRowCount() {
            return al.size();
        }

        public int getColumnCount() {
            return columnNames.length;
        }

        public Object getValueAt(int row, int col) {
            if (col == 0) {
                return al.get(row).emp_name;
            } else if (col == 1) {
                return al.get(row).name;
            } else if (col == 2) {
                return al.get(row).password;
            } else if (col == 3) {
                return al.get(row).email;
            } else {
                return al.get(row).phone_no;
            }

        }
    }

    class Employee {

        String emp_name;
        String name;
        String password;
        String email;
        String phone_no;

        Employee(String emp_nm, String nm, String pass, String emal, String phone) {
            this.emp_name = emp_nm;
            this.name = nm;
            this.password = pass;
            this.email = emal;
            this.phone_no = phone;

        }
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
            java.util.logging.Logger.getLogger(Employee_table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employee_table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employee_table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employee_table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employee_table().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delete_record_button;
    private javax.swing.JButton edit_record_button;
    private javax.swing.JLabel email_label;
    private javax.swing.JTextField email_textfield;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jt1;
    private javax.swing.JLabel name_label;
    private javax.swing.JTextField name_textfield;
    private javax.swing.JLabel password_label;
    private javax.swing.JTextField password_passwordfield;
    private javax.swing.JButton update_record_button;
    private javax.swing.JPanel updatepanel;
    private javax.swing.JLabel username_label;
    private javax.swing.JTextField username_textfield;
    // End of variables declaration//GEN-END:variables
}
