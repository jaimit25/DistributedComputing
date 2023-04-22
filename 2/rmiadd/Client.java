
// /Library/Java/JavaVirtualMachines/jdk-17.0.2.jdk/Contents/Home/lib/jrt-fs.jar
package rmiadd;


import java.net.MalformedURLException;
import java.rmi.*;
import rmiadd.Adder;


public class Client 
{
public static void main(String[] args) throws NotBoundException, MalformedURLException,RemoteException{		
		Adder service = (Adder) Naming.lookup("rmi://localhost:5099/add");
		System.out.println("The Output of addition is : "+service.add(1, 2));
	}
}
