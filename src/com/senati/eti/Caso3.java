package com.senati.eti;

import java.util.ArrayList;
import java.util.Scanner;
import com.senati.eti.model.Alumnos;

public class Caso3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Alumnos> arrAlumnos = new ArrayList<Alumnos>();
		
		//Forma 1: Crear el conjunto de datos de tipo de alumno
		Alumnos alum1 = new Alumnos();
		
		alum1.setNombre("Joe");
		alum1.setApellido(" Castillo");
		alum1.setGenero("M");
		alum1.setEdad(25);
		
		//Forma 2: Crear el objeto de tipo Alumno
		
		Alumnos alum2 = new Alumnos("Rosa"," Flores", "F", 15);
		
		//Forma 3: Crear el objeto de tipo Alumno
		
		Alumnos alum3 = null;
		
		String nom = "", ape = "", gen = "";
		int  ed = 0;
		
		System.out.println("REGISTRO DE DATOS");
		System.out.println("=================");
		System.out.print("Nombre............: ");
		nom = sc.nextLine();
		System.out.print("Apellido..........: ");
		ape = sc.nextLine();
		System.out.print("Genero............: ");
		gen = sc.nextLine();
		System.out.print("Edad [15 - 30]............: ");
		ed = sc.nextInt();
		
		alum3 = new Alumnos(nom , ape, gen ,ed);
		
		arrAlumnos.add(alum1);
		arrAlumnos.add(alum2);
		arrAlumnos.add(alum3);
		
		System.out.println("\nLISTA DE DATOS REGISTRADOS");
		System.out.println("============================");
		
		String patron = "%-4s %-20s %-10s %-15s";
		
		System.out.println(String.format(patron, "N", "Nombres y Apellidos",
				"Genero", "Estado"));
		System.out.println(String.format(patron,"-","--------------------",
				"-------","--------"));
		
		for (int x = 0; x < arrAlumnos.size(); x++)
			System.out.println(String.format(patron, (x + 1),
					arrAlumnos.get(x).NombreCompleto(),
					arrAlumnos.get(x).MostrarGenero(),
					arrAlumnos.get(x).MostrarEstado()));
			
		
		
		
		
		
		
	}

}
	