package clientserver;
import java.io.*;
import java.net.*;

class IPCClient {
    public static void main(String args[]) {

        try {
            Socket s = new Socket("localhost", 1200);
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());

            DataInputStream dis = new DataInputStream(s.getInputStream());

            System.out.println(" \n \t******* CLIENT PROCESS STARTED ******* ");

            System.out.println(" \n ******* PLEASE ENTER THE VALUES OF Number 1 AND Number 2 TO PASS THEM TO SERVER PROCESS ******* \n");
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            int a = Integer.parseInt(br.readLine());
            System.out.println("Number 1 ------>" + a);
            dos.writeInt(+a);

            int b = Integer.parseInt(br.readLine());
            System.out.println("Number 2 ------>" + b);
            dos.writeInt(+b);
            int result = dis.readInt();
            System.out.println("\n.......CLIENT PROCESS HAS RECIEVED RESULT FROM SERVER.......\n");
            System.out.println("\n THE ADDITION OF " + a + " AND " + b + " IS" + result);
            s.close();
        } catch (Exception e) {
            System.out.println("Exception is " + e);
        }
    }
}