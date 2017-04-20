import java.net.*;
import java.io.*;
public class Client implements Runnable
{
    public void run()
    {
      try 
      {
         
        Socket sock = new Socket("127.0.0.1",9000);
        DataOutputStream dos = new DataOutputStream(sock.getOutputStream());
        DataInputStream dis = new DataInputStream(sock.getInputStream());
    
        while(true)
        {
        String msg=dis.readLine();
        System.out.println(msg);
         dos.writeBytes("Hello Server\r\n");
        }
         
     }
     catch (Exception e) 
     {
         e.printStackTrace();
     }
    }
    
    
}
