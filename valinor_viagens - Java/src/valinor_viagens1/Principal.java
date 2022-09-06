package valinor_viagens1;

public class Principal {

	public static void main(String[] args) {
		
		Cliente cl = new Cliente(1 , "Élcio ", "72632738024 ", "elcio_frontovick@hotmail.com ", "88993737069 "); 
		Destino ds = new Destino(1 , "Valfenda ", "Terra-Média ", "Cascata dos elfos ");
		Viagem vg = new Viagem(1 , "05/09/2022 ", "13/09/2022 ", "Thorondor ", "A ");
		Passagem ps = new Passagem(1 , 1200 , 1080 , 10);
		
		cl.exibir();
		ds.exibir();
		vg.exibir();
		ps.exibir();	
		
		}
}
