import java.rmi.*;
public interface TimeServerIntf extends Remote {
	public String currentTime() throws RemoteException;
}

