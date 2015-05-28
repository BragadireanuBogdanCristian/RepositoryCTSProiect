package proiect;

import sun.util.calendar.BaseCalendar.Date;

public class Client {
  private String nume;
  private String prenume;
  private String telefon;
  private Date dataNastere;
  private AdresaClient adresa;
  
public String getNume() {
	return nume;
}
public void setNume(String nume) {
	this.nume = nume;
}
public String getPrenume() {
	return prenume;
}
public void setPrenume(String prenume) {
	this.prenume = prenume;
}
public String getTelefon() {
	return telefon;
}
public void setTelefon(String telefon) {
	this.telefon = telefon;
}
public Date getDataNastere() {
	return dataNastere;
}
public void setDataNastere(Date dataNastere) {
	this.dataNastere = dataNastere;
}
public AdresaClient getAdresa() {
	return adresa;
}
public void setAdresa(AdresaClient adresa) {
	this.adresa = adresa;
}
public Client(String nume, String prenume, String telefon, Date dataNastere,
		AdresaClient adresa) {
	super();
	this.nume = nume;
	this.prenume = prenume;
	this.telefon = telefon;
	this.dataNastere = dataNastere;
	this.adresa = adresa;
}
public Client(){
	super(); 
 }

public String toString() {
	return "Client [nume=" + nume + ", prenume=" + prenume + ", telefon="
			+ telefon + ", dataNastere=" + dataNastere + ", adresa=" + adresa
			+ "]";
}


}
