package proiect;

public class Test {

	public static void main(String[] args) {

		Client client1 = new Client();
		client1.setNume("Sorin");
		client1.setTelefon("0774242532");
		System.out.println(client1.toString());
		
		ClientBuilder clientBuilder = new ClientBuilder();
		clientBuilder.setNume("Adina");
		clientBuilder.setTelefon("0543422436");
		Client client2 = clientBuilder.build();
		System.out.println(client2);
		
		AutentificareCont cont1 = AutentificareCont.getAutentificareCont();
		AutentificareCont cont2 = AutentificareCont.getAutentificareCont();
		System.out.println(cont1.getAutentificareCont());
		
		Cont cont3 = new Cont(1, "Popescu", 0,0);
		System.out.println(cont3.returneazaTitular(client1));
		cont3.ofertaCredit();
		cont3.adaugaCont(5000);
		System.out.println(cont3.getFonduri());
		
		Facade_Conturi f = new Facade_Conturi();
		f.afisareConturisiTitulari();
	}

}
