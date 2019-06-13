import java.rmi.*;
import java.rmi.server.*;
import java.net.*;

public class BashoServeur extends UnicastRemoteObject
implements DoueDeParole {
    public BashoServeur() throws RemoteException {
        super();
    }

    public String parler() throws RemoteException {
        return "La cloche du temple s’est tue " + 
        "Dans le soir, le parfum des fleurs " + 
        "En prolonge le tintement." +
        "Matsuo Basho (1644-1694)" ;
    }

    public static void main(String args[]) {
        try {
            System.setProperty("java.security.policy", "/home/koffisani/Documents/RMI/security");
            System.setSecurityManager(new RMISecurityManager());
            BashoServeur b = new BashoServeur();
            Naming.rebind("MatsuoBasho", b);
            System.out.println("Serveur BahoServeur pret.");
        } catch (RemoteException re) {
            System.out.println("Exception ds BashoServeur.main " +re);
        } catch (MalformedURLException re) {
            System.out.println("MalformedURLException ds BashoServeur.main " + re);
        }
    } 
}