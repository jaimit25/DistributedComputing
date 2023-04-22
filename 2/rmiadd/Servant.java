package rmiadd;

import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import rmiadd.Adder;


public class Servant extends UnicastRemoteObject implements Adder
{	
	Servant() throws RemoteException {
		super();
	}

	public int add(int x,int y) throws RemoteException {
		return x+y;
	}
}