
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.UIManager;

public class splashscreen extends javax.swing.JFrame {

    public splashscreen() {
        try {
            initComponents();
           setResizable(false);   
            BufferedImage orgimage = ImageIO.read(getClass().getResource("ems.jpg"));//getResource if image is in package
            BufferedImage resizedImage = resize(orgimage,400,300);
            jLabel1.setIcon(new ImageIcon(resizedImage));
            setSize(400,300);
            //------------------------
            int width = Toolkit.getDefaultToolkit().getScreenSize().width;//to get screen size width
            int height = Toolkit.getDefaultToolkit().getScreenSize().height;//to get screen size height
            int x = (width/2)-(this.getWidth()/2);// to make the splash scrren in centre
            int y = (height/2)-(this.getHeight()/2);
            setLocation(x, y);//set the location of Jframe in centre of screen
            //--------------------------
            UIManager.put(jProgressBar1, Color.red);
            UIManager.put(jProgressBar1, Color.blue);
            UIManager.put(jProgressBar1, Color.red);
            UIManager.put(jProgressBar1, Color.green);
            jProgressBar1.setForeground(new java.awt.Color(51,153,0));
            new Thread(new progress()).start();
        } catch (Exception ex) {
        ex.printStackTrace();
        }
    }
    
    public class progress implements Runnable
    {

        @Override
        public void run() 
        {
            for (int i = 1; i <=100; i++) 
            {
                if(i<30)
                {
                    jLabel2.setText("Initializing..............");
                jProgressBar1.setValue(i);
                }
                else if(i<60)
                {
                    jLabel2.setText("Loading................");
                jProgressBar1.setValue(i);
                }
                else if(i<90)
                {
                    jLabel2.setText("Processing..............");
                jProgressBar1.setValue(i);
                }
                else
                {
                    jLabel2.setText("Launching..............");
                jProgressBar1.setValue(i);
                }
                try {
                    Thread.sleep(100);
                } catch (Exception ex) {
                    ex.printStackTrace();
                    }
            }
            dispose();
            new Admin_login().setVisible(true);
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
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jProgressBar1.setBackground(new java.awt.Color(255, 255, 255));
        jProgressBar1.setForeground(new java.awt.Color(255, 51, 51));
        jProgressBar1.setBorderPainted(false);
        getContentPane().add(jProgressBar1);
        jProgressBar1.setBounds(0, 286, 400, 10);

        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 260, 110, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("ems.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 400, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new splashscreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}
