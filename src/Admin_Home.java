import ch.randelshofer.media.avi.AVIOutputStream;
import static java.awt.Frame.NORMAL;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.AbstractTableModel;

public class Admin_Home extends javax.swing.JFrame 
{

    ArrayList<Server.Clienthandler> al = new ArrayList<>();
    ClientHandler stm;
    ArrayList<Admin_Home.Chat> al1 = new ArrayList<>();
    ArrayList<Admin_Home.LiveView> al2 = new ArrayList<>();
    DefaultListModel obj;

    LiveView live;
    View_logs vl;

    public Admin_Home() {
        stm = new ClientHandler();
        obj = new DefaultListModel();

        initComponents();
        setResizable(false);
      
        jl1 = new javax.swing.JList();
        jl1.setVisible(false);
        jl1.setModel(obj);
        
        setSize(600, 600);
        setVisible(true);
        
        Server ser = new Server();
        Thread t1 = new Thread(ser);
        t1.start();
        
        PhotoServer pser = new PhotoServer();
        Thread t2 = new Thread(pser);
        t2.start();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        add_employee_button = new javax.swing.JButton();
        view_employee_button = new javax.swing.JButton();
        view_logs_button = new javax.swing.JButton();
        shutdown_selectedpc_button = new javax.swing.JButton();
        shutdown_all_button = new javax.swing.JButton();
        start_chat_button = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jl1 = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        table1.setModel(stm);
        jScrollPane1.setViewportView(table1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 330, 260, 150);

        add_employee_button.setText("ADD EMPLOYEE");
        add_employee_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_employee_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(add_employee_button);
        add_employee_button.setBounds(440, 20, 132, 30);

        view_employee_button.setText("VIEW EMPLOYE");
        view_employee_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_employee_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(view_employee_button);
        view_employee_button.setBounds(440, 60, 132, 30);

        view_logs_button.setText("VIEW LOGS");
        view_logs_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_logs_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(view_logs_button);
        view_logs_button.setBounds(440, 100, 132, 30);

        shutdown_selectedpc_button.setText("SHUTDOWN PC");
        shutdown_selectedpc_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shutdown_selectedpc_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(shutdown_selectedpc_button);
        shutdown_selectedpc_button.setBounds(290, 490, 130, 30);

        shutdown_all_button.setText("SHUTDOWN ALL");
        shutdown_all_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shutdown_all_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(shutdown_all_button);
        shutdown_all_button.setBounds(440, 140, 130, 30);

        start_chat_button.setText("START CHAT");
        start_chat_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                start_chat_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(start_chat_button);
        start_chat_button.setBounds(160, 490, 120, 30);

        jButton1.setText("LIVE STREAM");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(30, 490, 120, 30);

        jButton2.setText("VIEW ACTIVITIES");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(430, 490, 130, 30);

        jl1.setModel(obj);
        jScrollPane2.setViewportView(jl1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(290, 330, 280, 150);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bossy1.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(110, 20, 90, 60);

        jLabel2.setFont(new java.awt.Font("Shruti", 1, 36)); // NOI18N
        jLabel2.setText(" ADMIN  HOME");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 90, 260, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/adminhomef.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 600, 540);

        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(210, 310, 34, 14);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void add_employee_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_employee_buttonActionPerformed
        Add_employee add = new Add_employee();
    }//GEN-LAST:event_add_employee_buttonActionPerformed

    private void view_employee_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_employee_buttonActionPerformed
        Employee_table et = new Employee_table();
    }//GEN-LAST:event_view_employee_buttonActionPerformed

    private void view_logs_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_logs_buttonActionPerformed
        // TODO add your handling code here:
        vl = new View_logs();

    }//GEN-LAST:event_view_logs_buttonActionPerformed

    private void shutdown_selectedpc_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shutdown_selectedpc_buttonActionPerformed
        // TODO add your handling code here:
        int r = table1.getSelectedRow();
        if (r == -1) {
            JOptionPane.showMessageDialog(this, "Please select a Client to shutdown pc");
        } else {
            try {
                
                al.get(r).dos.writeBytes("Shut down your PC\r\n");
                al.remove(r);
                stm.fireTableDataChanged();
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_shutdown_selectedpc_buttonActionPerformed

    private void shutdown_all_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shutdown_all_buttonActionPerformed
        // TODO add your handling code here:
        try {

            for (int i = 0; i < al.size(); i++) {
                
                al.get(i).dos.writeBytes("Shut down your PC\r\n");
                al.remove(i);
                stm.fireTableDataChanged();

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_shutdown_all_buttonActionPerformed

    private void start_chat_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_start_chat_buttonActionPerformed
        // TODO add your handling code here:
        int i = table1.getSelectedRow();
        int index;
        int flag = 0;
        if (i == -1) {
            JOptionPane.showMessageDialog(rootPane, "Please select a client to start chat");
        }
        else if (al.get(i).name.equals("")) 
        {
            JOptionPane.showMessageDialog(rootPane, "Please login first");
        }
        else {
            String chatuser = al.get(i).name;
            if (al1.isEmpty()) 
            {
               
                Chat chat = new Chat(chatuser);
                chat.jTextArea1.setCaretPosition(chat.jTextArea1.getText().length());

                chat.setVisible(true);
                al1.add(chat);
            } else {
                for (int j = 0; j < al1.size(); j++) {
                    if (chatuser.equals(al1.get(j).name)) {
                        al1.get(j).toFront();
                        al1.get(j).setState(NORMAL);
                        flag = 1;
                        break;
                    }

                }
                if (flag == 0) {
                    Chat chat = new Chat(chatuser);
                    al1.add(chat);

                }
            }
        }

    }//GEN-LAST:event_start_chat_buttonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        int i = table1.getSelectedRow();
        int index;
        int flag = 0;
        if (i == -1) {
            JOptionPane.showMessageDialog(rootPane, "Please select a client to live stream");
        } else if (al.get(i).name.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Please login first");
        } else {
            String liveuser = al.get(i).name;
            if (al2.isEmpty()) {
                live = new LiveView(liveuser);
                live.flag2 = 1;
                live.setVisible(true);
                al2.add(live);
            } else {
                for (int j = 0; j < al2.size(); j++) {
                    if (liveuser.equals(al2.get(j).name)) {
                        al2.get(j).toFront();
                        al2.get(j).setState(NORMAL);
                        flag = 1;
                        break;
                    }

                }
                if (flag == 0) {

                    live = new LiveView(liveuser);
                    live.flag2 = 1;
                    al2.add(live);

                }
            }

        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        int i = table1.getSelectedRow();
        int index = -1;
        int flag = 0;
        if (i == -1) {
            JOptionPane.showMessageDialog(rootPane, "Please select a client to view running activities");
        } else {
            String user = al.get(i).name;
            
            //     jl1.setVisible(true);
            try {
                for (int m = 0; m < al.size(); m++) {
                    if (user.equals(al.get(m).name)) {
                        index = m;
                        flag = 1;
                        break;

                    }
                }
                if (flag == 1) {
            al.get(index).dos.writeBytes("View Services\r\n");
                //    al.get(i).dos.writeBytes(al.get(i).name+"\r\n");

                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_employee_button;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList jl1;
    private javax.swing.JButton shutdown_all_button;
    private javax.swing.JButton shutdown_selectedpc_button;
    private javax.swing.JButton start_chat_button;
    private javax.swing.JTable table1;
    private javax.swing.JButton view_employee_button;
    private javax.swing.JButton view_logs_button;
    // End of variables declaration//GEN-END:variables

    public class Server implements Runnable {

        public void run() {
            try {
                ServerSocket servsock = new ServerSocket(9000);
                while (true) {
                    Socket sock = servsock.accept();
                    Clienthandler cl = new Clienthandler(sock);
                    Thread t1 = new Thread(cl);
                    t1.start();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        class Clienthandler implements Runnable {

            DataInputStream dis;
            DataOutputStream dos;
            Socket sock;
            String name;

            Clienthandler(Socket sock) {
                try {
                    al.add(this);
                    stm.fireTableDataChanged();
                    this.sock = sock;   // always give this memory earlier than file streams

                    dis = new DataInputStream(sock.getInputStream());
                    dos = new DataOutputStream(sock.getOutputStream());

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            public void run() {
                try {

                    dos.writeBytes("Hello Client\r\n");
                    String msg = dis.readLine();
                    System.out.println(msg);

                    while (true) {
                        String s1 = dis.readLine();

                        if (s1.equals("Logout Request")) 
                        {
                            String username2 = dis.readLine();
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "root");
                        
                            Statement stmt5 = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                            ResultSet rs5 = stmt5.executeQuery("select * from log_table where username =" + "'" + username2 + "' ORDER BY login_id desc");

                            if (rs5.next()) {
            
                                rs5.updateDate("end_date", new java.sql.Date(new java.util.Date().getTime()));
                                rs5.updateTime("end_time", new java.sql.Time(new java.util.Date().getTime()));
                                rs5.updateRow();

                            }
                        
                            al.remove(this);
                            stm.fireTableDataChanged();

                            {
                                String date = rs5.getString("end_date");

                                File f = new File(System.getProperty("user.home") + "\\Videos\\" + username2);
                                if (!f.exists()) {
                                    f.mkdirs();
                                }
                                File f2 = new File(f + "\\" + date + ".avi");
                                /*if (f2.exists()) 
                                 {
                                 try {
                                 Desktop.getDesktop().open(f2);
            
                                 } catch (Exception e) 
                                 {
                                 e.printStackTrace();
                                 }
                                 }*/// else 
                                {

                                    File f5 = new File(f + "\\" + date + ".avi");
                                    AVIOutputStream av = new AVIOutputStream(f5, AVIOutputStream.VideoFormat.JPG);

                                    File f6 = new File(System.getProperty("user.home") + "\\Screenshots\\" + username2 + "\\" + date);
                                    int len = f6.listFiles().length;
                                    av.setFrameRate(3);
                                    av.setVideoDimension(500, 500);

                                    for (int i = 1; i <= len; i++) {
                                        File f1 = new File(f6 + "\\" + i + ".jpg");
                                        if (f1.length() == 0) {
                                        } else {
                                            FileInputStream fis = new FileInputStream(f1);
                                            av.writeFrame(fis);
            //                                System.out.println("Image fetched : " + i);
                                        }
                                    }

                                    av.close();
                                    //  Desktop.getDesktop().open(f2);

                                }

                            }

                            dos.writeBytes("LOGOUT" + "\r\n");

                        } else if (s1.equals("Recieve Activities")) 
                        {    
                            String str = "start";
                            while (str != "end") {
                                str = dis.readLine();
                                obj.addElement(str);
                            }
                        } else if (s1.equals("Recieve msg")) {
                            String mg = dis.readLine();
                            int flag = 0;
                            int index = -1;
                            for (int i = 0; i < al1.size(); i++) {
                                if (al1.get(i).name.equals(name)) {
                                    flag = 1;
                                    index = i;
                                    break;
                                }
                            }
                            if (flag == 0) {
                                Chat chat = new Chat(name);
                                Thread.sleep(500);
                                chat.jTextArea1.append(name + ": " + mg + "\n");
                                chat.jTextArea1.setCaretPosition(chat.jTextArea1.getText().length());

                                Class.forName("com.mysql.jdbc.Driver");
                                Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "root");
                                Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                                ResultSet rs = stmt.executeQuery("select * from  Chat");

                                rs.moveToInsertRow();
                                rs.updateString("msg_from", name);
                                rs.updateString("msg_to", "Server");
                                rs.updateString("msg", mg);

                                rs.insertRow();

                                al1.add(chat);
                            } else {
                         
                                al1.get(index).jTextArea1.append(name + ":" + mg + "\n");
                                al1.get(index).jTextArea1.setCaretPosition(al1.get(index).jTextArea1.getText().length());

                                Class.forName("com.mysql.jdbc.Driver");
                                Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "root");
                                Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                                ResultSet rs = stmt.executeQuery("select * from  Chat");

                                rs.moveToInsertRow();
                                rs.updateString("msg_from", name);
                                rs.updateString("msg_to", "Server");
                                rs.updateString("msg", mg);

                                rs.insertRow();

                                al1.get(index).toFront();
                                al1.get(index).setState(NORMAL);
                            }

                        } else if (s1.equals("Clear Chat")) {
                            try {
                                String user=dis.readLine();
                                Class.forName("com.mysql.jdbc.Driver");
                                Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "root");
                                Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                                ResultSet rs = stmt.executeQuery("select * from  Chat where msg_from= "+ "'" + user + "' or msg_to =" + "'" + user + "'");
                            while(rs.next())
                            {
                                rs.deleteRow();
                            }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }

                        } else if (s1.equals("Change Image")) {
                            String user = dis.readLine();
                            File f2 = new File(System.getProperty("user.home") + "\\Images\\" + user + ".jpg");
                            FileOutputStream fos1 = new FileOutputStream(f2);
                            long size = dis.readLong();
                            byte b[] = new byte[1000];
                            long count = 0;
                            while (true) {
                                int r = dis.read(b, 0, 1000);
                                fos1.write(b, 0, r);
                                count += r;
                                if (count == size) {
                                    break;
                                }
                            }
                            fos1.close();

                        } else if (s1.equals("Password change Request")) 
                        {

                            String username = dis.readLine();
                            String old_password = dis.readLine();
                            String new_password = dis.readLine();

                            Class.forName("com.mysql.jdbc.Driver");
                            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "root");

                            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                            ResultSet rs = stmt.executeQuery("select * from employee where emp_name =" + "'" + username + "'" + "and password =" + "'" + old_password + "'");

                            if (rs.next()) {

                                rs.updateString("emp_name", username);
                                rs.updateString("password", new_password);
                                rs.updateRow();

                                dos.writeBytes("Password Changed Successfully" + "\r\n");

                            } else {
                                dos.writeBytes("Employee with this username and password do not exist" + "\r\n");
                            }

                        } else if (s1.equals("Login Verification")) 
                        {
                            String username = dis.readLine();
                            String password = dis.readLine();
                            int flag = 0;
                            for (int i = 0; i < al.size(); i++) {
                                if (username.equals(al.get(i).name)) {
                                    flag = 1;
                                    break;
                                }
                            }
                            if (flag == 1) {
                                dos.writeBytes("You have already logged in\r\n");
                            } else {
                                dos.writeBytes("You can login\r\n");
                            }

                        } else if (s1.equals("Login Request")) 
                        {
                            String username = dis.readLine();
                            String password = dis.readLine();

                            Class.forName("com.mysql.jdbc.Driver");
                            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "root");
                            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                            ResultSet rs = stmt.executeQuery("select * from employee where emp_name = " + "'" + username + "'" + "and password = " + "'" + password + "'");

                            if (rs.next()) {

                                name = username;
                                dos.writeBytes("Login Successfuly" + "\r\n");

                                File f2 = new File(System.getProperty("user.home") + "\\Images\\" + username + ".jpg");
                                FileInputStream fis1 = new FileInputStream(f2);
                                long size = f2.length();
                                dos.writeLong(size);
                                byte b[] = new byte[1000];
                                long count = 0;

                                while (true) {
                                    int r = fis1.read(b, 0, 1000);
                                    dos.write(b, 0, r);
                                    count += r;

                                    if (count == size) {
                                        break;
                                    }
                                }
                                fis1.close();

                                Statement stmt4 = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                                ResultSet rs4 = stmt4.executeQuery("select count(*) as c1 from chat where msg_from = " + "'" + name + "'" + "or msg_to = " + "'" + name + "'");

                                int count2 = 0;
                                if (rs4.next()) {
                                    count2 = rs4.getInt("c1");

                                    dos.writeInt(count2);
                                }
                                rs4 = stmt4.executeQuery("select * from chat where msg_from = " + "'" + name + "'" + "or msg_to = " + "'" + name + "'");
                                while (rs4.next()) 
                                {
                                    dos.writeBytes(rs4.getString("msg_from") + "\r\n");
                                    dos.writeBytes(rs4.getString("msg") + "\r\n");
                                }

                                stm.fireTableDataChanged();
                                String username1 = rs.getString("emp_name");
                                Statement stmt3 = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                                ResultSet rs3 = stmt3.executeQuery("select * from log_table");

                                rs3.moveToInsertRow();
                                rs3.updateString("username", username1);
                                rs3.updateDate("start_date", new java.sql.Date(new java.util.Date().getTime()));
                                rs3.updateTime("start_time", new java.sql.Time(new java.util.Date().getTime()));
                                rs3.insertRow();

                            } else {
                                dos.writeBytes("Login Failed" + "\r\n");
                            }
                        }

                    }
                } catch (Exception e) {
                    al.remove(this);
                    stm.fireTableDataChanged();
                    e.printStackTrace();
                }
            }
        }

    }

    public class PhotoServer implements Runnable {

        public void run() {
            try {
                ServerSocket pservsock = new ServerSocket(10000);
                while (true) {
                    Socket psock = pservsock.accept();
                    PhotoClienthandler pcl = new PhotoClienthandler(psock);
                    Thread t1 = new Thread(pcl);
                    t1.start();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        class PhotoClienthandler implements Runnable {

            DataInputStream dis;
            DataOutputStream dos;
            Socket sockp;
            String name;
            FileOutputStream fos;
            FileInputStream fis;

            PhotoClienthandler(Socket sockp) {
                try {
                    this.sockp = sockp;
                    dis = new DataInputStream(sockp.getInputStream());
                    dos = new DataOutputStream(sockp.getOutputStream());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            public void run() {
                try {

                    dos.writeBytes("Hello PhotoClient\r\n");
                    String msg = dis.readLine();
              
                    String username = dis.readLine();
                    Calendar cal = Calendar.getInstance();

                    SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
                    String formatted = format1.format(cal.getTime());

                    int i;
                    File f = new File(System.getProperty("user.home") + "\\Screenshots\\" + username + "\\" + formatted);

                    if (!f.exists()) {
                        f.mkdirs();
                    }

                    int file_num = f.listFiles().length;
                    i = file_num;
                    while (true) {

                        fos = new FileOutputStream(f + "\\" + i + ".jpg");
                        long size = dis.readLong();
                        byte b[] = new byte[1000];
                        long count = 0;
                        while (true) {
                            int r = dis.read(b, 0, 1000);
                            fos.write(b, 0, r);
                            count += r;
                            if (count == size) {
                                break;
                            }
                        }

                        fos.close();

                        if (live != null && live.flag2 == 1) {

                            File f1 = new File(f + "\\" + i + ".jpg");
                            BufferedImage orgimage = ImageIO.read(f1);
                            BufferedImage resizedImage = resize(orgimage, Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit.getDefaultToolkit().getScreenSize().height);
                            live.lab1.setIcon(new ImageIcon(resizedImage));
                            Thread.sleep(5000);

                        }
                        i++;
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //--------------------------------Resize Function----------------------------------- 
    public static BufferedImage resize(BufferedImage image, int width, int height) {
        BufferedImage bi = new BufferedImage(width, height, BufferedImage.TRANSLUCENT);
        Graphics2D g2d = (Graphics2D) bi.createGraphics();
        g2d.addRenderingHints(new RenderingHints(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY));
        g2d.drawImage(image, 0, 0, width, height, null);
        g2d.dispose();
        return bi;
    }

    class ClientHandler extends AbstractTableModel 
    {

        String columnNames[] = {"ip_address", "name"};

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
                return al.get(row).sock.getInetAddress().getHostAddress();
            } else {
                return al.get(row).name;
            }
        }
    }
    public class Chat extends javax.swing.JFrame implements WindowListener {

        String name;

        public Chat(String name) {
            this.name = name;
            initComponents();
             setSize(500,400);
            SwingUtilities.invokeLater(new Runnable() {
                public void run() 
                {
                    try {

                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "root");
                        Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                        ResultSet rs = stmt.executeQuery("select * from chat where msg_from =" + "'" + name + "' or msg_to =" + "'" + name + "'");
                        while (rs.next()) {
                            String msg_to = rs.getString("msg_to");
                            String msg_from = rs.getString("msg_from");
                            String msg = rs.getString("msg");
                            if (msg_from.equals("Server")) {
                                jTextArea1.append("Server" + " : " + msg + "\n");
                                jTextArea1.setCaretPosition(jTextArea1.getText().length());

                            } else {
                                jTextArea1.append(name + " : " + msg + "\n");
                                jTextArea1.setCaretPosition(jTextArea1.getText().length());

                            }
                        }

                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }
            });

            jTextArea1.setEditable(false);
            this.addWindowListener(this);

            lb1.setText("Welcome" + name);

            setVisible(true);
            setSize(500, 500);
        }

        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        chat_panel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        lb1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        chat_panel.setBackground(new java.awt.Color(102, 102, 255));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(102, 153, 255));
        jButton1.setText("Send");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lb1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/chatlogo2.png"))); // NOI18N

        javax.swing.GroupLayout chat_panelLayout = new javax.swing.GroupLayout(chat_panel);
        chat_panel.setLayout(chat_panelLayout);
        chat_panelLayout.setHorizontalGroup(
            chat_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chat_panelLayout.createSequentialGroup()
                .addGroup(chat_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(chat_panelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(chat_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(chat_panelLayout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(chat_panelLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(lb1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, Short.MAX_VALUE))
        );
        chat_panelLayout.setVerticalGroup(
            chat_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chat_panelLayout.createSequentialGroup()
                .addGroup(chat_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(chat_panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lb1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(chat_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );

        getContentPane().add(chat_panel);
        chat_panel.setBounds(52, 14, 380, 340);

        pack();
    }// </editor-fold>                        
private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
            // TODO add your handling code here:
            String msg = jTextField1.getText();
            jTextArea1.append("Me : " + msg + "\n");
            jTextArea1.setCaretPosition(jTextArea1.getText().length());
            jTextField1.setText("");
            int index;
            for (int i = 0; i < al.size(); i++) {
                if (al.get(i).name.equals(name)) 
                {
                    try 
                    {
                        al.get(i).dos.writeBytes("Recieved msg\r\n");
                        al.get(i).dos.writeBytes(msg + "\r\n");
           
                        Class.forName("com.mysql.jdbc.Driver");
                           Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "root");
                        Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                        ResultSet rs = stmt.executeQuery("select * from  Chat");

                        rs.moveToInsertRow();
                        rs.updateString("msg_from", "Server");
                        rs.updateString("msg_to", name);
                        rs.updateString("msg", msg);

                        rs.insertRow();

                        break;
                    } catch (Exception e) {
                    }

                }
            }

        }

        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
            String msg = jTextField1.getText();
            System.out.println("message is " + msg);
            jTextArea1.append("Me :" + msg + "\n");
            jTextArea1.setCaretPosition(jTextArea1.getText().length());

            jTextField1.setText("");
            int index;
            for (int i = 0; i < al.size(); i++) {
                if (al.get(i).name.equals(name)) {
                    try {
                        al.get(i).dos.writeBytes("Recieved msg\r\n");
                        al.get(i).dos.writeBytes(msg + "\r\n");
                        System.out.println(msg);

                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "root");
                        Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                        ResultSet rs = stmt.executeQuery("select * from  Chat");

                        rs.moveToInsertRow();
                        rs.updateString("msg_from", "Server");
                        rs.updateString("msg_to", name);
                        rs.updateString("msg", msg);

                        rs.insertRow();

                        break;
                    } catch (Exception e) {
                    }

                }
            }

        }

        private javax.swing.JPanel chat_panel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lb1;
    // End of variables declaration                   

        @Override
        public void windowOpened(WindowEvent e) {
        }

        @Override
        public void windowClosing(WindowEvent e) {
            al1.remove(this);
        }

        @Override
        public void windowClosed(WindowEvent e) {
        }

        @Override
        public void windowIconified(WindowEvent e) {
        }

        @Override
        public void windowDeiconified(WindowEvent e) {
        }

        @Override
        public void windowActivated(WindowEvent e) {
        }

        @Override
        public void windowDeactivated(WindowEvent e) {
        }
    }

    public class LiveView extends javax.swing.JFrame 
    {

        int flag2 = 0;
        javax.swing.JLabel lab1;
        String name;

        public LiveView(String name) {

            this.name = name;
            initComponents();
            lab1.setSize(Toolkit.getDefaultToolkit().getScreenSize());
            setSize(Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit.getDefaultToolkit().getScreenSize().height);
            setVisible(true);
            setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
//        getContentPane().setLayout(null);
            try {
                //BufferedImage orgimage = ImageIO.read(getClass().getResource("/Images/apple.png"));
                //BufferedImage resizedImage = Admin_Home.resize(orgimage, Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit.getDefaultToolkit().getScreenSize().height);
                //live.lab1.setIcon(new ImageIcon(resizedImage));

            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
        private void initComponents() {

            lab1 = new javax.swing.JLabel();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            getContentPane().setLayout(null);

            //lab1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/apple.png"))); // NOI18N
            getContentPane().add(lab1);
            lab1.setBounds(0, 0, 720, 510);

            pack();
        }// </editor-fold>                        

                          
    }

}
