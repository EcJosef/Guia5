package com.senati.eti;

import java.util.ArrayList;
import java.util.Scanner;
import com.senati.eti.model.Publicacion;

public class Caso4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Publicacion> arrPubli = new ArrayList<Publicacion>();
		
		Publicacion pub1 = new Publicacion("Los Perros Hambrientos", "Ciro Alegría",1);
		Publicacion pub2 = new Publicacion("Tradiciones Peruanas", "Ricardo Palma",1);
		Publicacion pub3 = new Publicacion("Informática Global", "BillGates",2);
		Publicacion pub4 = null;
		String tit = "", aut = "";
		int tip = 0;
		
		System.out.println("REGISTRO DE DATOS");
		System.out.println("-----------------");
		System.out.print("Título.....: ");
		tit = sc.nextLine();
		System.out.print("Autor......: ");
		aut = sc.nextLine();
		System.out.print("Tipo[1(Lib.)/2(Rev.)].: ");
		tip = sc.nextInt();
		
		
		pub4 = new Publicacion(tit, aut, tip);
		
		arrPubli.add(pub1);
		arrPubli.add(pub2);
		arrPubli.add(pub3);
		arrPubli.add(pub4);
		
		System.out.println("\nLISTA DE PUBLICACIONES");
		System.out.println("----------------------\n");
		
		String lin = "%-3s %-30s %-20s %-15s";
		System.out.println(String.format(lin, "N", "Título",
				           "Autor", "Tipo"));
		System.out.println(String.format(lin, "-", "-------",
				           "-----", "----"));
		
		for (int x = 0; x < arrPubli.size(); x++) {
			System.out.println(String.format(lin, (x + 1), 
					arrPubli.get(x).MostrarTitulo(),
					arrPubli.get(x).MostrarAutor(),
					arrPubli.get(x).MostrarTipo()));
		}
		
	}

}