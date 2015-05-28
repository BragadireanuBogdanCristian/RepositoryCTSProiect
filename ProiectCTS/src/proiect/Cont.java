package proiect;

public class Cont {
 private int idCont;
 private String titular;
 private double fonduri;
 private double valoareCredit;
 
 public int getIdCont() {
	return idCont;
}

public void setIdCont(int idCont) {
	this.idCont = idCont;
}

public String getTitular() {
	return titular;
}

public void setTitular(String titular) {
	this.titular = titular;
}

public double getFonduri() {
	return fonduri;
}

public void setFonduri(double fonduri) {
	this.fonduri = fonduri;
}

public double getValoareCredit() {
	return valoareCredit;
}

public void setValoareCredit(double valoareCredit) {
	this.valoareCredit = valoareCredit;
}

public Cont(int idCont, String titular, double fonduri, double valoareCredit) {
	super();
	this.idCont = idCont;
	this.titular = titular;
	this.fonduri = fonduri;
	this.valoareCredit = valoareCredit;
}

public String returneazaTitular(Client c){
	 this.titular = c.getNume() + " " + c.getPrenume();
	 return this.titular;
 }
 
 public void adaugaCont(double suma){
	 this.fonduri = this.fonduri + suma;
 }
 
 public void retrageCont(double suma){
	 this.fonduri = this.fonduri - suma; 
 }
 
 public double ofertaCredit(){
	 if(fonduri==0){
		 fonduri=3000;
		 valoareCredit+=fonduri;
		 System.out.println("S-a realizat un imprumut de 3000 de lei.");
	 }
	 return valoareCredit;
 }
}
