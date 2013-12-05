import java.rmi.Naming;

public class TimeServer{
	public TimeServer(){
		try{
			TimeServerIntf c = new TimeServerIntfImpl();
			Naming.rebind("rmi://localhost:1099/TimeServerIntfService", c);
		}catch(Exception e){
			System.out.println("Trouble: "+ e);
		}
	}
	public static void main(String args[]){
		new TimeServer();
	}
}
