package com.senati.eti;

import com.senati.eti.model.Alumnos;

import java.util.Scanner;

import java.io.*;
public class Caso6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		FileWriter archivo = null;
		PrintWriter pw = null;
		
		//True es para que se escriba y de edite dentro de el
		
		try {
			archivo = new FileWriter("info.txt", true);
			pw = new PrintWriter(archivo);
			
			System.out.println("REGISTRO DE DATOS");
			System.out.println("=================");
			
			System.out.print("Nombre............: ");
			String nom = sc.nextLine();
			
			System.out.print("Apellido..........: ");
			String ape = sc.nextLine();
			
			System.out.print("Genero............: ");
			String gen = sc.nextLine();
			
			System.out.print("Edad [15 - 30]....: ");
			int ed = sc.nextInt();
			
			Alumnos alu = new Alumnos(nom , ape, gen ,ed);
			
			pw.println("Datos Registrados");
			pw.println("-----------------");
			
			pw.println("Nombre y apellido...: " + alu.NombreCompleto());
			pw.println("Genero..............: " + alu.MostrarGenero());
			pw.println("Estado..............: " + alu.MostrarEstado());
			
			System.out.println("El archivo fue creado ");
			
		}catch (Exception ex1) {
				ex1.printStackTrace();
		} finally {
			// Cierre del archivo
			try {
				if (archivo != null)
					archivo.close();
			} catch (Exception ex2) {
					ex2.printStackTrace();
			}
		}

	}

}
