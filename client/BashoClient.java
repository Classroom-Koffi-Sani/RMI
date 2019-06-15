import java.rmi.*;

public class BashoClient {
    public static void main(String args[]) {
        try{
            System.setProperty("java.security.policy", "/home/koffisani/Documents/RMI/security");
            if (System.getSecurityManager() == null)
                System.setSecurityManager(new RMISecurityManager());
        } catch (Exception e) {
            System.out.println("Security Exception " + e);
        }
        try {
            DoueDeParole b = (DoueDeParole) Naming.lookup("rmi://127.0.0.1:1099/MatsuoBasho");
            String message = b.parler();
            System.out.println("BashoClient : " + message);
        } catch (Exception e) {
            System.out.println("Exception dans BashoClient.main" + e);
            e.printStackTrace();
        }
    }
}