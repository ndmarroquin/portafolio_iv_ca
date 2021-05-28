package scl.edu.gt;

import java.util.Scanner;

public class ArithmeticFunctions {
	
	public static void sumar() {
		
		Scanner numeral1 = new Scanner(System.in);
		System.out.print("Este comando nos permitirá sumar dos o más números ");
		double num1 = numeral1.nextDouble();
		
		Scanner numera2 = new Scanner(System.in);
		System.out.print("num_2:");
		double num2 = numera2.nextDouble();
		
		double respuesta = num1 + num2;
		
		System.out.println(respuesta);
	}
	
	public static void restar() {
		
		Scanner numeral1 = new Scanner(System.in);
		System.out.print("Este comando nos da la opción de restar cualquier digito");
		double num1 = numeral1.nextDouble();
		
		Scanner numera2 = new Scanner(System.in);
		System.out.print("num_2: ");
		double num2 = numera2.nextDouble();
		
		double respuesta = num1 - num2;
		
		System.out.println(respuesta);
	}
	
	public static void multiplicar() {
		
		Scanner numeral1 = new Scanner(System.in);
		System.out.print("Como su nombre lo indica, esta opción nos ayudará a multiplicar cualquier digito");
		double num1 = numeral1.nextDouble();
		
		Scanner numera2 = new Scanner(System.in);
		System.out.print("num_2: ");
		double num2 = numera2.nextDouble();
		
		double respuesta = num1 * num2;
		
		System.out.println(respuesta);
	}
	
	public static void division() {
		
		Scanner numeral1 = new Scanner(System.in);
		System.out.print("Este comando nos ayudará para dividir cualquier cosa");
		double num1 = numeral1.nextDouble();
		
		Scanner numera2 = new Scanner(System.in);
		System.out.print("num_2: ");
		double num2 = numera2.nextDouble();
		
		double respuesta = num1 / num2;
		
		System.out.println(respuesta);
		
	}
	
	public static void residuo() {
		
		Scanner numeral1 = new Scanner(System.in);
		System.out.print("Este comando nos desplega todo el residuo de lo que ha que ha quedado");
		double num1 = numeral1.nextDouble();
		
		Scanner numera2 = new Scanner(System.in);
		System.out.print("num_2: ");
		double num2 = numera2.nextDouble();
		
		double respuesta = num1 % num2;
		
	}
	
    public static void help() {
		
		Scanner numeral1 = new Scanner(System.in);
		System.out.print("Help nos ayuda dandonos una pequeña información acerca de como usar el pregrama");
		double num1 = numeral1.nextDouble();
		
		Scanner numera2 = new Scanner(System.in);
		System.out.print("num_2: ");
		double num2 = numera2.nextDouble();
		
		double respuesta = num1 % num2;
		
	}
    
    public static void exit() {
		
		Scanner numeral1 = new Scanner(System.in);
		System.out.print("Este metodo nos permite salir rápido y fácil");
		double num1 = numeral1.nextDouble();
		
		Scanner numera2 = new Scanner(System.in);
		System.out.print("num_2: ");
		double num2 = numera2.nextDouble();
		
		double respuesta = num1 % num2;
		
	}
	
}