package proiect;

import sun.util.calendar.BaseCalendar.Date;

public class ClientBuilder implements IClient {
	private String nume;
	  private String prenume;
	  private String telefon;
	  private Date dataNastere;
	  private AdresaClient adresa;
	
	public void setNume(String nume) {
		this.nume = nume;
	}
	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	public void setDataNastere(Date dataNastere) {
		this.dataNastere = dataNastere;
	}
	public void setAdresa(AdresaClient adresa) {
		this.adresa = adresa;
	}

	public Client build() {
		return new Client(nume,prenume,telefon,dataNastere,adresa);
	}
	  
}
