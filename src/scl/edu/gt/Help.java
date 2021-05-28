package scl.edu.gt;

import java.util.Scanner;

public class Help {
	public static void CommandList() {
		CommandList data = new CommandList();
		
		int cantidadDeComandos = data.command.length;
		int cantidadDeComandosSistemas = data.Sistemas.length;
		
		System.out.println("Todos los comandos disponibles son: ");
		for(var i = 0;i < cantidadDeComandos;i++) {
			System.out.println(""+data.command[i]+" | ");
			System.out.println("");
		}
		for(var i = 0;i < cantidadDeComandosSistemas;i++) {
			System.out.println(""+data.Sistemas[i]+" | ");
			System.out.println("");
		}
	}
}

