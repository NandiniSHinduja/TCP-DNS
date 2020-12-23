 package TCPDNS;
import java.io.*;
import java.util.*;
import java.net.*;
public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket ss=new ServerSocket(6666);
        Socket s=ss.accept();
        DataInputStream din=new DataInputStream(s.getInputStream());
        DataOutputStream dout=new DataOutputStream(s.getOutputStream());
        String ip[]={"165.165.80.80","165.165.79.1"};
        String name[]={"www.aptitudeguru.com","www.google.com"};
        String str=din.readUTF().trim();
        for( int i=0;i<=ip.length;i++){
            if(str.equals(ip[i])){
                dout.writeUTF(name[i]);
                break;
            }
            else if(str.equals(name[i])){
                dout.writeUTF(ip[i]);
                break;
            }
            else{
                dout.writeUTF("Enter the right IP address or domain name");
                break;
            }
        }
        
    }
    
}
