package proiect;

public class AdresaClient {
 public String judet;
 public String oras;
 public String strada;
 public int numar;
 
 public String getJudet() {
	return judet;
}
public void setJudet(String judet) {
	this.judet = judet;
}
public String getOras() {
	return oras;
}
public void setOras(String oras) {
	this.oras = oras;
}
public String getStrada() {
	return strada;
}
public void setStrada(String strada) {
	this.strada = strada;
}
public int getNumar() {
	return numar;
}
public void setNumar(int numar) {
	this.numar = numar;
}
public AdresaClient(String judet, String oras, String strada, int numar) {
	super();
	this.judet = judet;
	this.oras = oras;
	this.strada = strada;
	this.numar = numar;
}
}
