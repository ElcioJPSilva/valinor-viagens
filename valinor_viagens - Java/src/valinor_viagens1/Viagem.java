package valinor_viagens1;

public class Viagem {
	public int id_viagem;
	public String data_ida;
	public String data_volta;
	public String aguia;
	public String classe;
	
public Viagem (int id_viagem, String data_ida, String data_volta, String aguia, String classe) {
		this.id_viagem = id_viagem;
		this.data_ida = data_ida;
		this.data_volta = data_volta;
		this.aguia = aguia;
		this.classe = classe;
	}


public void exibir() {
		System.out.println("id_viagem: " + id_viagem +"data_ida: " + data_ida +"data_volta: " + data_volta +"aguia: " + aguia +"classe: " + classe);
	}


public int getId_viagem() {
	return id_viagem;
}


public void setId_viagem(int id_viagem) {
	this.id_viagem = id_viagem;
}


public String getData_ida() {
	return data_ida;
}


public void setData_ida(String data_ida) {
	this.data_ida = data_ida;
}


public String getData_volta() {
	return data_volta;
}


public void setData_volta(String data_volta) {
	this.data_volta = data_volta;
}


public String getAguia() {
	return aguia;
}


public void setAguia(String aguia) {
	this.aguia = aguia;
}


public String getClasse() {
	return classe;
}


public void setClasse(String classe) {
	this.classe = classe;
}
	
}