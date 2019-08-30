package fes.aragon.clases;

public class Linea {
	
	private Punto pUno;
	private Punto pDos;
	
	public Linea (){
		this.pUno = new Punto();
		this.pDos = new Punto();
	}
	
	public Linea (Punto pUno, Punto pDos) {
		this.pUno = pUno;
		this.pDos = pDos;
	}
	
	public float distancia() {
		int disX = this.pDos.getX()-this.pUno.getX();
		int disY = this.pDos.getY()-this.pUno.getY();
		int distCuad = (int)Math.pow(disX, 2)+(int)Math.pow(disY, 2);
		float dist = (float)Math.sqrt(distCuad);
		return dist;
	}
	
	public float distancia(Punto pUno, Punto pDos) {
		int disX = pDos.getX()-pUno.getX();
		int disY = pDos.getY()-pUno.getY();
		int distCuad = (int)Math.pow(disX, 2)+(int)Math.pow(disY, 2);
		float dist = (float)Math.sqrt(distCuad);
		return dist;
	}
}
