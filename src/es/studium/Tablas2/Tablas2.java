package es.studium.Tablas2;

import java.util.Scanner;

public class Tablas2
{

	public static void main(String[] args)
	{
		final int TAM = 10;
		int tabla[] = new int[TAM];
		int i;
		Scanner teclado = new Scanner(System.in);
		// Recorrido para rellenar la tabla
		for (i = 0; i < 10; i++)
		{
			System.out.println("Ingrese el valor de la posici�n " + i + ":");
			tabla[i] = teclado.nextInt();
		}
		// Recorrido para tratar los elementos de la tabla
		for (i = 0; i < TAM; i++)
		{
			tabla[i] = tabla[i] * 2;
		}
		// Recorrido para mostrar los valores de la tabla
		for (i = 0; i < TAM; i++)
		{
			System.out.println("Tabla[" + i + "]=" + tabla[i]);
		}
		teclado.close();

	}

}
