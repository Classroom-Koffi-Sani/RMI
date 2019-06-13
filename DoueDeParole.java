import java.rmi.*;

public interface DoueDeParole extends Remote {
    public String parler() throws java.rmi.RemoteException;
}