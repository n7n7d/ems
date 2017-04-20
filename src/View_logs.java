import ch.randelshofer.media.avi.AVIOutputStream;
import java.awt.Desktop;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.sql.*;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

public class View_logs extends javax.swing.JFrame implements ItemListener {

    ArrayList<String> al = new ArrayList<>();
    ArrayList<String> dl = new ArrayList<>();
    Log_info stm;
    int flag=0;
    

    public View_logs() {
        stm = new Log_info();
        initComponents();
         int flag=1;
        setVisible(true);
        setSize(676, 550);
        setResizable(false);
      
        details_panl.setVisible(false);
        employee_combo.removeAllItems();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "root");
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery("select * from employee");
            while (rs.next()) {
                employee_combo.addItem(rs.getString("emp_name"));

            }
            syear_combo.removeAllItems(); 
            for(int i=5;i<=9;i++)
            {
            syear_combo.addItem("201"+i);    
            }
            syear_combo.addItem("2020");
            for(int i=1;i<=9;i++)
            {
            syear_combo.addItem("202"+i);
            }
            smonth_combo.removeAllItems();
            sday_combo.removeAllItems();
    
            for (int i = 1; i <= 9; i++) {
                smonth_combo.addItem("0" + i);
            }
            smonth_combo.addItem("10");
            smonth_combo.addItem("11");
            smonth_combo.addItem("12");
            for (int i = 1; i <= 9; i++) {
                sday_combo.addItem("0" + i);
            }
            sday_combo.addItem("10");
            for (int i = 1; i <= 9; i++) {
                sday_combo.addItem("1" + i);
            }
            sday_combo.addItem("20");
            for (int i = 1; i <= 9; i++) {
                sday_combo.addItem("2" + i);
            }
            sday_combo.addItem("30");
            sday_combo.addItem("31");
            edate_combo.removeAllItems();
            emonth_combo.removeAllItems();
            eday_combo.removeAllItems();
            edate_combo.addItem("2015");
            edate_combo.addItem("2016");
            edate_combo.addItem("2017");
            edate_combo.addItem("2018");
            edate_combo.addItem("2019");
            edate_combo.addItem("2020");
            edate_combo.addItem("2021");
            edate_combo.addItem("2022");
            for (int i = 1; i <= 9; i++) {
                emonth_combo.addItem("0" + i);
            }
            emonth_combo.addItem("10");
            emonth_combo.addItem("11");
            emonth_combo.addItem("12");
            for (int i = 1; i <= 9; i++) {
                eday_combo.addItem("0" + i);
            }
            eday_combo.addItem("10");
            for (int i = 1; i <= 9; i++) {
                eday_combo.addItem("1" + i);
            }
            eday_combo.addItem("20");
            for (int i = 1; i <= 9; i++) {
                eday_combo.addItem("2" + i);
            }
            eday_combo.addItem("30");
            eday_combo.addItem("31");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        details_panl = new javax.swing.JPanel();
        lb4 = new javax.swing.JLabel();
        lb5 = new javax.swing.JLabel();
        lb6 = new javax.swing.JLabel();
        lb7 = new javax.swing.JLabel();
        lb8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt1 = new javax.swing.JTable();
        view_video_button = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        edate_combo = new javax.swing.JComboBox();
        emonth_combo = new javax.swing.JComboBox();
        eday_combo = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        syear_combo = new javax.swing.JComboBox();
        smonth_combo = new javax.swing.JComboBox();
        sday_combo = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        employee_combo = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton1.setText("Fetch Database");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(490, 290, 110, 50);

        details_panl.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout details_panlLayout = new javax.swing.GroupLayout(details_panl);
        details_panl.setLayout(details_panlLayout);
        details_panlLayout.setHorizontalGroup(
            details_panlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(details_panlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(details_panlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb7, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb6, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(details_panlLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(lb5, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        details_panlLayout.setVerticalGroup(
            details_panlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(details_panlLayout.createSequentialGroup()
                .addGroup(details_panlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(details_panlLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lb4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(lb7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(lb6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(details_panlLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        getContentPane().add(details_panl);
        details_panl.setBounds(330, 40, 320, 210);

        jt1.setModel(stm);
        jScrollPane1.setViewportView(jt1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 260, 440, 230);

        view_video_button.setText("View Video");
        view_video_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_video_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(view_video_button);
        view_video_button.setBounds(490, 380, 110, 50);

        jPanel1.setBackground(new java.awt.Color(0, 102, 154));
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("End Date");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 140, 83, 24);

        edate_combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        edate_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edate_comboActionPerformed(evt);
            }
        });
        jPanel1.add(edate_combo);
        edate_combo.setBounds(100, 140, 56, 20);

        emonth_combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(emonth_combo);
        emonth_combo.setBounds(170, 140, 56, 20);

        eday_combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(eday_combo);
        eday_combo.setBounds(240, 140, 56, 20);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Start Date");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 80, 83, 25);

        syear_combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        syear_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                syear_comboActionPerformed(evt);
            }
        });
        jPanel1.add(syear_combo);
        syear_combo.setBounds(100, 80, 56, 20);

        smonth_combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(smonth_combo);
        smonth_combo.setBounds(170, 80, 56, 20);

        sday_combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        sday_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sday_comboActionPerformed(evt);
            }
        });
        jPanel1.add(sday_combo);
        sday_combo.setBounds(240, 80, 56, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 102));
        jLabel6.setText("YEAR");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(110, 50, 40, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 102));
        jLabel7.setText("MONTH");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(170, 50, 60, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 102));
        jLabel8.setText("DAY");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(250, 50, 26, 20);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Select Employee");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(40, 10, 120, 26);

        employee_combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        employee_combo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                employee_comboItemStateChanged(evt);
            }
        });
        employee_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employee_comboActionPerformed(evt);
            }
        });
        jPanel1.add(employee_combo);
        employee_combo.setBounds(170, 10, 100, 20);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 40, 320, 210);

        jLabel5.setBackground(new java.awt.Color(51, 51, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/adminback.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 680, 490);

        pack();
    }// </editor-fold>//GEN-END:initComponents
   public void itemStateChanged(ItemEvent e) {
       
    }

    private void employee_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employee_comboActionPerformed


    }//GEN-LAST:event_employee_comboActionPerformed

    private void sday_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sday_comboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sday_comboActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        al.clear();
        dl.clear();

        String user = (String) employee_combo.getSelectedItem();
        int y1 = Integer.parseInt((String) syear_combo.getSelectedItem());
        int y2 = Integer.parseInt((String) edate_combo.getSelectedItem());
        int m1 = Integer.parseInt((String) smonth_combo.getSelectedItem());
        int m2 = Integer.parseInt((String) emonth_combo.getSelectedItem());
        int d1 = Integer.parseInt((String) sday_combo.getSelectedItem());
        int d2 = Integer.parseInt((String) eday_combo.getSelectedItem());
        java.sql.Date st = new java.sql.Date(y1 - 1900, m1 - 1, d1);
        java.sql.Date st2 = new java.sql.Date(y2 - 1900, m2 - 1, d2);

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "root");
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery("select distinct(start_date) from log_table where start_date >= " + "'" + st + "' and start_date <=" + "'" + st2 + "' and username =" + "'" + user + "'");
            while (rs.next()) {
                String start_date = rs.getString("start_date");
                Statement stmt2 = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                ResultSet rs2 = stmt2.executeQuery("select * from log_table where start_date = " + "'" + start_date + "' and username =" + "'" + user + "'");
                int seconds = 0;
                while (rs2.next()) {
                    int log_id = rs2.getInt("login_id");
                    Statement stmt3 = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                    ResultSet rs3 = stmt3.executeQuery("select TIME_TO_SEC(end_time) - TIME_TO_SEC(start_time) as sec  from log_table where login_id =" + "'" + log_id + "'");

                    while (rs3.next()) {
                        seconds += rs3.getInt("sec");
                    }

                }
                int hours = seconds / 3600;
                seconds %= 3600;
                int minutes = seconds / 60;
                seconds %= 60;
                String time = hours + ":" + minutes + ":" + seconds;
                System.out.println(start_date + " start_date " + hours + " hours " + minutes + " minutes " + seconds + " seconds");
                dl.add((start_date));
                al.add((time));
                stm.fireTableDataChanged();

            }

        } catch (Exception ef) {
            ef.printStackTrace();
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void syear_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_syear_comboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_syear_comboActionPerformed

    private void view_video_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_video_buttonActionPerformed
        // TODO add your handling code here:
        String username;
        int r = jt1.getSelectedRow();
        if (r == -1) {
            JOptionPane.showMessageDialog(this, "Please Select one row ");
        } else {
            username = (String) employee_combo.getSelectedItem();
            String date = dl.get(r);
            System.out.println(username + date);
            File f = new File(System.getProperty("user.home") + "\\Videos\\" + username);
            if (!f.exists()) {
                f.mkdirs();
            }
            File f2 = new File(f + "\\" + date + ".avi");
            if (f2.exists()) 
            {
                try {
                     Desktop.getDesktop().open(f2);
            
                } catch (Exception e) 
                {
                    e.printStackTrace();
                }
             } else 
            {

                try {
                      
                    File f5 = new File(f + "\\" + date + ".avi");
                    System.out.println(f5.getPath());
                    AVIOutputStream av = new AVIOutputStream(f5, AVIOutputStream.VideoFormat.JPG);

                    File f6 = new File(System.getProperty("user.home") + "\\Screenshots\\" + username + "\\" + date);
                     System.out.println(f6.getPath());
                    int len = f6.listFiles().length;
                     System.out.println(len);
                    av.setFrameRate(3);
                    av.setVideoDimension(500, 500);

                    for (int i = 1; i <= len; i++) {
                        File f1 = new File(f6 + "\\" + i + ".jpg");
                        if (f1.length() == 0) {
                            System.out.println("0");
                        } else {
                            FileInputStream fis = new FileInputStream(f1);
                            av.writeFrame(fis);
                            System.out.println("Image fetched : " + i);
                        }
                    }

                             av.close();
                             Desktop.getDesktop().open(f2);
            

                } catch (Exception e) {
                    e.printStackTrace();
                }

            }

        }
    }//GEN-LAST:event_view_video_buttonActionPerformed

    
    private void employee_comboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_employee_comboItemStateChanged
        details_panl.setVisible(true);
        String user = (String) employee_combo.getSelectedItem();
          System.out.println(user);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "root");
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery("select * from employee where emp_name =" + "'" + user + "'");
            if (rs.next()) {
               
                lb4.setText(rs.getString("name"));
                lb5.setText("Email   " + rs.getString("email")); 
                lb6.setText("Phone   " + rs.getString("phone_no"));

                lb7.setText("Password  " + rs.getString("password"));
                
                BufferedImage   orgimage = ImageIO.read(new File(System.getProperty("user.home") + "\\Images\\" + user + ".jpg"));
                BufferedImage resizedImage = resize(orgimage,jLabel4.getWidth(),jLabel4.getHeight());
                
                
                jLabel4.setIcon(new ImageIcon(resizedImage));
            }

        } catch (Exception ef) {
            ef.printStackTrace();
        }

    }//GEN-LAST:event_employee_comboItemStateChanged

    private void edate_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edate_comboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edate_comboActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_logs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel details_panl;
    private javax.swing.JComboBox edate_combo;
    private javax.swing.JComboBox eday_combo;
    private javax.swing.JComboBox emonth_combo;
    private javax.swing.JComboBox employee_combo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTable jt1;
    private javax.swing.JLabel lb4;
    private javax.swing.JLabel lb5;
    private javax.swing.JLabel lb6;
    private javax.swing.JLabel lb7;
    private javax.swing.JLabel lb8;
    private javax.swing.JComboBox sday_combo;
    private javax.swing.JComboBox smonth_combo;
    private javax.swing.JComboBox syear_combo;
    private javax.swing.JButton view_video_button;
    // End of variables declaration//GEN-END:variables
class Log_info extends AbstractTableModel {

        String columnNames[] = {"start_date", "date-time"};

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
                return dl.get(row);
            } else {
                return al.get(row);
            }
        }
    }
public static BufferedImage resize(BufferedImage image, int width, int height) 
    {
        BufferedImage bi = new BufferedImage(width, height, BufferedImage.TRANSLUCENT);
        Graphics2D g2d = (Graphics2D) bi.createGraphics();
        g2d.addRenderingHints(new RenderingHints(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY));
        g2d.drawImage(image, 0, 0, width, height, null);
        g2d.dispose();
        return bi;
    }
}
