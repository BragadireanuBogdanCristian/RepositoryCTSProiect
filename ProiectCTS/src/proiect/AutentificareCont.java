package proiect;

public class AutentificareCont {
   public static AutentificareCont instance = null;
   private final static String denumireCont = "Client1";
   private final static String parola = "12345";

private AutentificareCont(){
	   
   }
   
   public static synchronized AutentificareCont getAutentificareCont(){
	   if ( instance == null){
		   instance = new AutentificareCont();
	   }
	   return instance;
   }
}
