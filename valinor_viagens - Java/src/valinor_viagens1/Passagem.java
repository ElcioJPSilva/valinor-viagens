package valinor_viagens1;

public class Passagem {
	public int tx_id;
	public double valor;
	public double promocao;
	public double cupom;
	
public Passagem (int tx_id, double valor, double promocao, double cupom) {
		this.tx_id = tx_id;
		this.valor = valor;
		this.promocao = promocao;
		this.cupom = cupom;
	}	
	
public void exibir() {
		System.out.println("tx_id: " + tx_id +"valor: " + valor +"promocao: " + promocao +"cupom: " + cupom);
	}

public int getTx_id() {
	return tx_id;
}

public void setTx_id(int tx_id) {
	this.tx_id = tx_id;
}

public double getValor() {
	return valor;
}

public void setValor(double valor) {
	this.valor = valor;
}

public double getPromocao() {
	return promocao;
}

public void setPromocao(double promocao) {
	this.promocao = promocao;
}

public double getCupom() {
	return cupom;
}

public void setCupom(double cupom) {
	this.cupom = cupom;
}
	
}
