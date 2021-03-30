package com.senati.eti;

import java.util.Scanner;
import com.senati.eti.model.Calculador2;

public class Caso2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Numero 1: ");
		float n1 = sc.nextFloat();
		
		System.out.print("Numero 2: ");
		float n2 = sc.nextFloat();
		
		Calculador2 calc = new Calculador2(n1,n2);
		
		System.out.println(" ** NUMERO INGRESADOS ** ");
		System.out.println("---------------------------");
		System.out.println("Primer número..........: "+ calc.getNumero1());
		System.out.println("Segundo número.........: "+ calc.getNumero2());
		
		System.out.println("\n ** RESULTADOS ** ");
		System.out.println("---------------------");
		
		System.out.println("1. Suma......................: " + calc.Operar(1));
		System.out.println("2. Resta.....................: " + calc.Operar(2));
		System.out.println("3. Multiplicacion............: " + calc.Operar(3));
		System.out.println("4. Division..................: " + calc.Operar(4));
		System.out.println("5. Resto entero..............: " + calc.Operar(5));
		System.out.println("6. Promedio..................: " + calc.Operar(6));
		System.out.println("7. Suma de Cuadrados.........: " + calc.Operar(7));
		System.out.println("8. Diferencia Procentual.....: " + calc.Operar(8));
		System.out.println("9. Numero mayor..............: " + calc.Operar(9));
		System.out.println("10. Numero menor.............: " + calc.Operar(10));
	}

}
