// all declarations herre
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.*;
import javax.imageio.ImageIO;
import javax.swing.*;
// Main class to handle all clients
public class ClientFrame extends JFrame implements WindowListener 
{

    String ip;
    Client cl;
    Client_login cl1;
    ChangePassword cp;
    PhotoClient pc;
    String client_username;
    String user;

    public ClientFrame() {

        initComponents();
        setResizable(false);
      
        setSize(700, 500);
        ta1.setEditable(false);
        login_button.setVisible(false);
        change_password_button.setVisible(false);
        logout_button.setVisible(false);
        client_details_panel.setVisible(false);
        charpanel.setVisible(false);
        chat1.setVisible(false);

        this.addWindowListener(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        connect_button = new javax.swing.JButton();
        chat1 = new javax.swing.JButton();
        login_button = new javax.swing.JButton();
        change_password_button = new javax.swing.JButton();
        logout_button = new javax.swing.JButton();
        client_details_panel = new javax.swing.JPanel();
        lb1 = new javax.swing.JLabel();
        edit_photo_button = new javax.swing.JButton();
        lb2 = new javax.swing.JLabel();
        charpanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta1 = new javax.swing.JTextArea();
        tf1 = new javax.swing.JTextField();
        sendmessage_client_button = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ip_tf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        connect_button.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        connect_button.setText("CONNECT");
        connect_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connect_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(connect_button);
        connect_button.setBounds(260, 30, 118, 32);

        chat1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chat1.setText("CLEAR CHAT");
        chat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chat1ActionPerformed(evt);
            }
        });
        getContentPane().add(chat1);
        chat1.setBounds(270, 420, 140, 30);

        login_button.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        login_button.setText("LOGIN");
        login_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(login_button);
        login_button.setBounds(450, 30, 160, 30);

        change_password_button.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        change_password_button.setText("CHANGE PASSWORD");
        change_password_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                change_password_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(change_password_button);
        change_password_button.setBounds(50, 420, 160, 30);

        logout_button.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        logout_button.setText("LOGOUT");
        logout_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(logout_button);
        logout_button.setBounds(480, 420, 160, 31);

        client_details_panel.setBackground(new java.awt.Color(102, 102, 255));
        client_details_panel.setForeground(new java.awt.Color(0, 51, 255));

        lb1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lb1.setForeground(new java.awt.Color(255, 255, 255));

        edit_photo_button.setText("Edit Photo");
        edit_photo_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_photo_buttonActionPerformed(evt);
            }
        });

        lb2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout client_details_panelLayout = new javax.swing.GroupLayout(client_details_panel);
        client_details_panel.setLayout(client_details_panelLayout);
        client_details_panelLayout.setHorizontalGroup(
            client_details_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, client_details_panelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lb1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
            .addGroup(client_details_panelLayout.createSequentialGroup()
                .addGroup(client_details_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(client_details_panelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(lb2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(client_details_panelLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(edit_photo_button)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        client_details_panelLayout.setVerticalGroup(
            client_details_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(client_details_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edit_photo_button)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        getContentPane().add(client_details_panel);
        client_details_panel.setBounds(30, 120, 280, 270);

        charpanel.setBackground(new java.awt.Color(102, 102, 255));
        charpanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        charpanel.setLayout(null);
        charpanel.add(jLabel1);
        jLabel1.setBounds(58, 24, 115, 0);

        ta1.setColumns(20);
        ta1.setRows(5);
        jScrollPane1.setViewportView(ta1);

        charpanel.add(jScrollPane1);
        jScrollPane1.setBounds(27, 30, 250, 175);

        tf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf1ActionPerformed(evt);
            }
        });
        charpanel.add(tf1);
        tf1.setBounds(27, 224, 167, 20);

        sendmessage_client_button.setText("Send");
        sendmessage_client_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendmessage_client_buttonActionPerformed(evt);
            }
        });
        charpanel.add(sendmessage_client_button);
        sendmessage_client_button.setBounds(204, 223, 70, 23);

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CHAT BOX");
        charpanel.add(jLabel4);
        jLabel4.setBounds(110, 10, 70, 15);

        getContentPane().add(charpanel);
        charpanel.setBounds(360, 120, 310, 270);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("ENTER IP");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(27, 36, 77, 15);
        getContentPane().add(ip_tf);
        ip_tf.setBounds(114, 30, 137, 29);

        jLabel3.setBackground(new java.awt.Color(153, 153, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/employee-silhouette.jpg"))); // NOI18N
        jLabel3.setText("Clear Chat");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 710, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void connect_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connect_buttonActionPerformed
        // TODO add your handling code here:
         ip=ip_tf.getText();
        cl = new Client();
        Thread t1 = new Thread(cl);
        t1.start();
        login_button.setVisible(true);

    }//GEN-LAST:event_connect_buttonActionPerformed

    private void login_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_buttonActionPerformed
        // TODO add your handling code here:
        cl1 = new Client_login();

    }//GEN-LAST:event_login_buttonActionPerformed

    private void change_password_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_change_password_buttonActionPerformed
        // TODO add your handling code here:
        cp = new ChangePassword();

    }//GEN-LAST:event_change_password_buttonActionPerformed

    private void logout_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_buttonActionPerformed
        try {

            cl.dos.writeBytes("Logout Request\r\n");
            String username = client_username;
            cl.dos.writeBytes(username + "\r\n");
            login_button.setEnabled(true);
            charpanel.setVisible(false);
            client_details_panel.setVisible(false);
            chat1.setVisible(false);
            logout_button.setVisible(false);
            change_password_button.setVisible(false);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_logout_buttonActionPerformed

    private void edit_photo_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_photo_buttonActionPerformed
        // TODO add your handling code here:
        try {

            JFileChooser fc2 = new JFileChooser();
            int r = fc2.showOpenDialog(this);
            if (r == JFileChooser.APPROVE_OPTION) {
                File f5 = fc2.getSelectedFile();
                String path = f5.getPath();
                File f = new File(path);
                FileInputStream fis3 = new FileInputStream(f);
                cl.dos.writeBytes("Change Image\r\n");
                cl.dos.writeBytes(cl1.tf1.getText() + "\r\n");
                long size = f.length();
                cl.dos.writeLong(size);
                byte b[] = new byte[1000];
                long count = 0;

                while (true) {
                    int r1 = fis3.read(b, 0, 1000);
                    cl.dos.write(b, 0, r1);
                    count += r1;
                    if (count == size) {
                        break;
                    }
                }
                fis3.close();

                BufferedImage orgimage = ImageIO.read(f);
                BufferedImage resizedImage = resize(orgimage, lb2.getWidth(), lb2.getHeight());

                lb2.setIcon(new ImageIcon(resizedImage));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_edit_photo_buttonActionPerformed

    private void tf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf1ActionPerformed
        // TODO add your handling code here:
           String mg = tf1.getText();
        try 
        {
            ta1.append(cl1.username + " : " + mg + "\n");
            ta1.setCaretPosition(ta1.getText().length());
                
            cl.dos.writeBytes("Recieve msg\r\n");
            cl.dos.writeBytes(mg + "\r\n");

            tf1.setText("");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_tf1ActionPerformed

    private void sendmessage_client_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendmessage_client_buttonActionPerformed
        // TODO add your handling code here:
        String mg = tf1.getText();
        try {
            ta1.append(cl1.username + " : " + mg + "\n");
            ta1.setCaretPosition(ta1.getText().length());
                
            cl.dos.writeBytes("Recieve msg\r\n");
            cl.dos.writeBytes(mg + "\r\n");

            tf1.setText("");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_sendmessage_client_buttonActionPerformed

    private void chat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chat1ActionPerformed
        // TODO add your handling code here:
        try {
            
           cl.dos.writeBytes("Clear Chat\r\n");
            cl.dos.writeBytes(client_username + "\r\n");
           
           ta1.setText("");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
    }//GEN-LAST:event_chat1ActionPerformed

    //--------------------------------Resize Function----------------------------------- 
    public static BufferedImage resize(BufferedImage image, int width, int height) {
        BufferedImage bi = new BufferedImage(width, height, BufferedImage.TRANSLUCENT);
        Graphics2D g2d = (Graphics2D) bi.createGraphics();
        g2d.addRenderingHints(new RenderingHints(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY));
        g2d.drawImage(image, 0, 0, width, height, null);
        g2d.dispose();
        return bi;
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton change_password_button;
    private javax.swing.JPanel charpanel;
    private javax.swing.JButton chat1;
    private javax.swing.JPanel client_details_panel;
    private javax.swing.JButton connect_button;
    private javax.swing.JButton edit_photo_button;
    private javax.swing.JTextField ip_tf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JButton login_button;
    private javax.swing.JButton logout_button;
    private javax.swing.JButton sendmessage_client_button;
    private javax.swing.JTextArea ta1;
    private javax.swing.JTextField tf1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {

        try {
            // TODO add your handling code here:

            cl.dos.writeBytes("Logout Request\r\n");
            String username = client_username;
            cl.dos.writeBytes(username + "\r\n");
        }
        catch (Exception ef) 
        {
            ef.printStackTrace();
        }

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

    public class Client implements Runnable {

        Socket sock;
        DataOutputStream dos;
        DataInputStream dis;
        boolean flag2 = true;

        public void run() {

            try {

                sock = new Socket(ip, 9000);
                dos = new DataOutputStream(sock.getOutputStream());
                dis = new DataInputStream(sock.getInputStream());

                String msg = dis.readLine();
                dos.writeBytes("Hello Server\r\n");

                while (true) {

                    String s1 = dis.readLine();
                    if (s1.equals("LOGOUT")) {
                        JOptionPane.showMessageDialog(rootPane, "You have successfullt logged out");
                        pc.flag1 = false;
                        cl.flag2 = false;
                    }
                     if (s1.equals("View Services")) 
                    {
                      
                        try 
                        {
                            dos.writeBytes("Recieve Activities\r\n");
                            String line;
                            Process p = Runtime.getRuntime().exec(System.getenv("windir") + "\\system32\\" + "tasklist.exe");
                            BufferedReader input
                                    = new BufferedReader(new InputStreamReader(p.getInputStream()));
                            while ((line = input.readLine()) != null) {
                                
                                dos.writeBytes(line+"\r\n");
                              }
                            dos.writeBytes("end" + "\r\n");
                            input.close();
                        } catch (Exception err) {
                            err.printStackTrace();
                        }

                    }
                    if (s1.equals("Shut down your PC")) {
                        Runtime runtime = Runtime.getRuntime();
                        Process proc = runtime.exec("shutdown -s -t 0");
                        System.exit(0);

                    } else if (s1.equals("Recieved msg")) {
                        String msg2 = dis.readLine();
                        ta1.append("Admin : " + msg2 + "\n");
                        ta1.setCaretPosition(ta1.getText().length());
                

                    }  else if (s1.equals("You have already logged in")) {
                        JOptionPane.showMessageDialog(rootPane, "You have already logged in");
                    } else if (s1.equals("You can login")) {
                        String username = cl1.tf1.getText();
                        String password = cl1.tf2.getText();

                        cl.dos.writeBytes("Login Request\r\n");
                        cl.dos.writeBytes(username + "\r\n");
                        cl.dos.writeBytes(password + "\r\n");

                    } else if (s1.equals("Employee with this username and password do not exise")) {
                        JOptionPane.showMessageDialog(rootPane, "Employee with this username and password do not exise");

                    } else if (s1.equals("Password Changed Successfully")) {
                        JOptionPane.showMessageDialog(rootPane, "Password changed successfully");
                    } else if (s1.equals("Login Successfuly")) {

                        JOptionPane.showMessageDialog(rootPane, "You have Successfully logged in");
                        charpanel.setVisible(true);
                        login_button.setEnabled(false);
                        chat1.setVisible(true);
                        logout_button.setVisible(true);
                        pc = new PhotoClient();
                        Thread t3 = new Thread(pc);
                        t3.start();
                        FileOutputStream fos1 = new FileOutputStream(cl1.username+".jpg");
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

                        BufferedImage orgimage = ImageIO.read(new File(cl1.username+".jpg"));
                        BufferedImage resizedImage = resize(orgimage, lb2.getWidth(), lb2.getHeight());

                        lb2.setIcon(new ImageIcon(resizedImage));

                        client_details_panel.setVisible(true);
                        lb1.setText("Hello" + "   " + cl1.tf1.getText());
                        change_password_button.setVisible(true);
                        cl1.dispose();
                        
                        int count3 = dis.readInt();
                        for (int i = 0; i < count3; i++) {
                            String msg_from = dis.readLine();
                            String msg1 = dis.readLine();
                            if (msg_from.equals("Server")) {
                                ta1.append("Server" + " : " + msg1+ "\n");
                          ta1.setCaretPosition(ta1.getText().length());
                
                            } else {
                                ta1.append(client_username + " : " + msg1 + "\n");
                             ta1.setCaretPosition(ta1.getText().length());
                

                            }
                        }

                    } else if (s1.equals("Login Failed")) {
                        JOptionPane.showMessageDialog(rootPane, "Login Failed");
                        cl1.setfields();
                    }
                    if (flag2 == false) {
                        break;
                    }
                }
            } catch (Exception e) {

                e.printStackTrace();
                JOptionPane.showMessageDialog(rootPane, "Server is off");
                ClientFrame.this.dispose();
            }
        }

    }

    public class PhotoClient implements Runnable {

        Socket sockp;
        DataOutputStream dos;
        DataInputStream dis;
        FileOutputStream fos;
        FileInputStream fis;
        boolean flag1 = true;

        public void run() {
            try {

                sockp = new Socket(ip, 10000);
                dos = new DataOutputStream(sockp.getOutputStream());
                dis = new DataInputStream(sockp.getInputStream());

                String msg = dis.readLine();
                dos.writeBytes("Hello PhotoServer\r\n");

                String username = client_username;
                dos.writeBytes(username + "\r\n");

                while (true) {

                    Robot robot = new Robot();
                    String format = "jpg";
                    String fileName = "clientphoto." + format;
                    Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
                    BufferedImage screenFullImage = robot.createScreenCapture(screenRect);
                    ImageIO.write(screenFullImage, format, new File(fileName));
                    fis = new FileInputStream(fileName);
                    long size = new File(fileName).length();
                    dos.writeLong(size);
                    byte b[] = new byte[1000];
                    long count = 0;

                    while (true) {
                        int r = fis.read(b, 0, 1000);
                        dos.write(b, 0, r);
                        count += r;
                        if (count == size) {
                            break;
                        }
                    }
                    if (flag1 == false) {
                        break;
                    }
                    Thread.sleep(5000);

                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public class Client_login extends javax.swing.JFrame {

    String username;

        public Client_login() {
            initComponents();
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setVisible(true);
            setSize(500, 500);
        }

        public void setfields() {
            tf1.setText("");
            tf2.setText("");
        }

        public void disp() {
            dispose();
        }

   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() 
    {

        lb1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        tf2 = new javax.swing.JPasswordField();
        ebt1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lb1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lb1.setText("Username");
        getContentPane().add(lb1);
        lb1.setBounds(55, 89, 102, 33);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Password");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(55, 158, 92, 29);
        getContentPane().add(tf1);
        tf1.setBounds(206, 92, 135, 30);
        getContentPane().add(tf2);
        tf2.setBounds(206, 158, 135, 29);

        ebt1.setBackground(new java.awt.Color(102, 153, 255));
        ebt1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ebt1.setText("LOGIN");
        ebt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ebt1ActionPerformed(evt);
            }
        });
        getContentPane().add(ebt1);
        ebt1.setBounds(177, 225, 102, 31);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("EMPLOYEE LOGIN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(251, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(19, 19, 19))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 570, 70);

        pack();
    }// </editor-fold>                        

    private void ebt1ActionPerformed(java.awt.event.ActionEvent evt) {
            // TODO add your handling code here:
            String username1 = tf1.getText();
            String password = tf2.getText();
            if (username1.equals("") || password.equals("")) {
                JOptionPane.showMessageDialog(this, "Please fill all the fields");

            } else {
                try {
                    client_username = tf1.getText();
                    username = tf1.getText();
                    cl.dos.writeBytes("Login Verification\r\n");
                    cl.dos.writeBytes(username1 + "\r\n");
                    cl.dos.writeBytes(password + "\r\n");

                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }


    // Variables declaration - do not modify          
    private javax.swing.JButton ebt1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb1;
    private javax.swing.JTextField tf1;
    private javax.swing.JPasswordField tf2;
    // End of variables declaration                   
}

    public class ChangePassword extends javax.swing.JFrame {

        public ChangePassword() {
            initComponents();
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setSize(500, 500);
            setVisible(true);
        }

           @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tf4 = new javax.swing.JPasswordField();
        tf3 = new javax.swing.JPasswordField();
        tf2 = new javax.swing.JPasswordField();
        tf1 = new javax.swing.JTextField();
        pbt1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Username");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(90, 100, 61, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Old Password");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(90, 140, 82, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("New Password");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(90, 180, 88, 17);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Confirm Password");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(90, 220, 110, 17);
        getContentPane().add(tf4);
        tf4.setBounds(240, 220, 120, 20);
        getContentPane().add(tf3);
        tf3.setBounds(240, 180, 120, 20);
        getContentPane().add(tf2);
        tf2.setBounds(240, 140, 120, 20);

        tf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf1ActionPerformed(evt);
            }
        });
        getContentPane().add(tf1);
        tf1.setBounds(240, 100, 120, 20);

        pbt1.setBackground(new java.awt.Color(102, 102, 255));
        pbt1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pbt1.setText("CLICK");
        pbt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pbt1ActionPerformed(evt);
            }
        });
        getContentPane().add(pbt1);
        pbt1.setBounds(190, 260, 90, 40);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("CHANGE PASSWORD");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(128, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 480, 80);

        pack();
    }// </editor-fold>                        

 private void tf1ActionPerformed(java.awt.event.ActionEvent evt) {
            // TODO add your handling code here:
        }

        private void pbt1ActionPerformed(java.awt.event.ActionEvent evt) {
            // TODO add your handling code here:
            String username = tf1.getText();
            String old_password = tf2.getText();
            String new_password = tf3.getText();
            String confirm_password = tf4.getText();
            if (username.equals("") || old_password.equals("") || new_password.equals("") || confirm_password.equals("")) {
                JOptionPane.showMessageDialog(this, "Please fill all the field");
            } else {
                if (new_password.equals(confirm_password)) {
                    try {
                        cl.dos.writeBytes("Password change Request\r\n");
                        cl.dos.writeBytes(username + "\r\n");
                        cl.dos.writeBytes(old_password + "\r\n");
                        cl.dos.writeBytes(new_password + "\r\n");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Password mismatch");
                }
            }
        }
        // Variables declaration - do not modify                     
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton pbt1;
    private javax.swing.JTextField tf1;
    private javax.swing.JPasswordField tf2;
    private javax.swing.JPasswordField tf3;
    private javax.swing.JPasswordField tf4;
 // End of variables declaration                   
    }
}
