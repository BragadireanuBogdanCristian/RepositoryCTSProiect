package proiect;


public class ListaConturi {

   private Cont[] conturi;
   
   public ListaConturi(){
	   conturi = new Cont[10];
	   for(int i=0; i<10; i++){
		   conturi[i] = new Cont(i+1,"Titular" + i, 0,1000*i);
	   }
   } 
   public double CreditTotalClienti(){
	   double sumaTotala = 0;
	   for(int i=0; i<conturi.length; i++){
		   sumaTotala+=conturi[i].getValoareCredit();
	   }
	   return sumaTotala;
   }
   
}
