import java.rmi.server.UnicastRemoteObject;
import java.text.SimpleDateFormat;
import java.util.Date;
public class TimeServerIntfImpl extends UnicastRemoteObject implements TimeServerIntf{
        public TimeServerIntfImpl()
                throws java.rmi.RemoteException{
                super();
        }
        public String currentTime() throws java.rmi.RemoteException {
         Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = formatter.format(currentTime);
        return dateString;
        }
}
