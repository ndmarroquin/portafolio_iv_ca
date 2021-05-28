package scl.edu.gt;

public class CommandList {
	
	String InfoSistemas [] = new String [5];
	String command      [] = new String [7];
	String information  [] = new String [7];
	String Sistemas     [] = new String [5];
	
	int cantidadDeComandos;
	
	CommandList() {
		
		command[0]= "suma";
		command[1]= "resta";
		command[2]= "multiplicacion";
		command[3]= "division";
		command[4]= "residuo";
		command[5]= "help";
		command[6]= "exit";
		
		
		information[0]= "El comando puede realizar la suma de dos n�meros o m�s, por ejemplo: 1+1 = 2";
		information[1]= "El comando puede realizar la resta de dos n�meros o m�s, por ejemplo: 10-5 = 5";
		information[2]= "El comando puede realizar la multiplicai�n de dos n�meros o m�s, por ejemplo: 2*2 = 4";
		information[3]= "El comando puede realizar la divisi�n de dos n�meros o m�s, por ejemplo: 30/5 = 6";
		information[4]= "El comando puede darnos el residuo del producto";
		information[5]= "Con este comando nos dar� una peque�a ayuda :)";
		information[6]= "Este comando nos da la opci�n de salir r�pido y f�cil del programa";
		
		InfoSistemas[0]= "CPU";
		InfoSistemas[1]= "RAM";
		InfoSistemas[2]= "SD";
		InfoSistemas[3]= "Mouse";
		InfoSistemas[4]= "Java";
		
		Sistemas[0]= "Nos dar� un poco de informaci�n acerca del CPU";
		Sistemas[1]= "Nos dar� informaci�n acerca de la Memoria Ram del dispositivo";
		Sistemas[2]= "Nos dar� informaci�n acerca de la memoria SD que conforman al equipo";
		Sistemas[3]= "Nos dar� informaci�n del mouse de nuestra computadora";
		Sistemas[4]= "�Qu� es Java?";
				
		}
}
