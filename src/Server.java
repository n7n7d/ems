import java.net.*;
import java.io.*;
public class Server implements Runnable 
{
    public void run()
    {
        try {
                ServerSocket servsock = new ServerSocket(9000);
               while(true)
                {
                Socket sock = servsock.accept();
                Clienthandler cl = new Clienthandler(sock);
                Thread t1 = new Thread(cl);
                t1.start();
               }
        } 
        catch (Exception e) {
        }

        
        
    }
    class Clienthandler implements Runnable
    {
        
         DataInputStream dis;
         DataOutputStream dos;
             Socket sock;
        Clienthandler(Socket sock)
        {
            try {
                 dis = new DataInputStream(sock.getInputStream());
                 dos = new DataOutputStream(sock.getOutputStream());    
                 this.sock=sock;
            }
            
            catch (Exception e) 
            {
            e.printStackTrace();
            }
       }
   
           
        public void run()
        {
            try {
               while(true)
               {
                dos.writeBytes("Hello Client\r\n");
                String msg=dis.readLine();
                System.out.println(msg);
                
                }
                }
            catch (Exception e) 
                {
                e.printStackTrace();
                }
        }
    }
    
    
    
}
