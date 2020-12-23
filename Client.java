package TCPDNS;
import java.util.*;
import java.io.*;
import java.net.*;
public class Client {
    public static void main (String args[]) throws Exception{
        Socket s=new Socket("localhost",6666);
        DataInputStream din=new DataInputStream(s.getInputStream());
        DataOutputStream dout=new DataOutputStream(s.getOutputStream());
        Scanner sc=new Scanner(System.in);
        String str=new String();
        System.out.println("Enter the IP address or domain name:");
        str=sc.nextLine();
        dout.writeUTF(str);
        String rec=new String();
        rec=din.readUTF().trim();
        System.out.println("The IP address/domain name is:" + rec);
        
    }
    
}
