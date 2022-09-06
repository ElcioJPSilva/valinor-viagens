package valinor_viagens1;

public class Destino {
	public int codigo_destino;
	public String cidade;
	private String regiao;
	private String atrativos;
	
public Destino (int codigo_destino, String cidade, String regiao, String atrativos) {
		this.codigo_destino = codigo_destino;
		this.cidade = cidade;
		this.regiao = regiao;
		this.atrativos = atrativos;
	}

public void exibir() {
		System.out.println("cidade: " + cidade +"regiao: " + regiao +"atrativos: " + atrativos);
	}

public int getCodigo_destino() {
	return codigo_destino;
}

public void setCodigo_destino(int codigo_destino) {
	this.codigo_destino = codigo_destino;
}

public String getCidade() {
	return cidade;
}

public void setCidade(String cidade) {
	this.cidade = cidade;
}

public String getRegiao() {
	return regiao;
}

public void setRegiao(String regiao) {
	this.regiao = regiao;
}

public String getAtrativos() {
	return atrativos;
}

public void setAtrativos(String atrativos) {
	this.atrativos = atrativos;
}		


}