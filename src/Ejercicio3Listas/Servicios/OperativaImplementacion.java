package Ejercicio3Listas.Servicios;

import java.util.List;
import java.util.Scanner;

import Ejercicio3Listas.Dtos.CamposDtos;

public class OperativaImplementacion implements OperativaInterfaz {

	@Override
	public void añadirElementos(List<CamposDtos> lista, Scanner sc) {
		
		for (int i = 1; i<13 ; i++) {
		 CamposDtos campos = new CamposDtos();
		 System.out.println("Dime el numero correspondiente al " + i + "º mes");
		 campos.setNumeroMes(sc.nextInt());
		 System.out.println("Dime el mes correspondiente que representa el numero " + i);
		 campos.setMes(sc.next());
		 lista.add(campos);
		}
		
		
	}

}
