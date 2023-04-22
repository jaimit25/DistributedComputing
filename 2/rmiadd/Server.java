package rmiadd;

import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import rmiadd.Adder;
import rmiadd.Servant;


public class Server {
	
	public static void main(String[] args) throws RemoteException{
		System.out.println("Server Started...");
		Registry registry = LocateRegistry.createRegistry(5099);
		registry.rebind("add",new Servant());
	}
}
