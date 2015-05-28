package proiect;


public class Facade_Conturi {
    public void afisareConturisiTitulari(){
    	ListaConturi lista = new ListaConturi();
    	Cont cont = new Cont(1,"Titular1",0,0);
    	cont.ofertaCredit();
    	AdresaClient adresa1 = new AdresaClient("Vrancea","Focsani","Str. Primaverii", 82);
    	System.out.print(lista.CreditTotalClienti());
    	System.out.println(cont.getTitular());
    }
}
