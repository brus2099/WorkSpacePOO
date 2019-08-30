package fes.aragon.inicio;

import fes.aragon.clases.Linea;
import fes.aragon.clases.Punto;

public class Principal {

	public static void main(String[] args) {

		Punto hola = new Punto();
		Punto adios = new Punto(3,4);
		
		Linea embeses = new Linea(hola, adios);
		System.out.println(embeses.distancia());
		
		Punto hey = new Punto(3,4);
		Punto dude = new Punto();
		Linea haigas = new Linea();
		System.out.println(haigas.distancia(hey,dude));
	}

}
