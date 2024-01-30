package Ejercicio3Listas.controladores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Ejercicio3Listas.Dtos.CamposDtos;
import Ejercicio3Listas.Servicios.OperativaImplementacion;
import Ejercicio3Listas.Servicios.OperativaInterfaz;

public class InicioApp {

	public static void main(String[] args) {

		List<CamposDtos> listaCampos = new ArrayList<CamposDtos>();
		Scanner sc = new Scanner(System.in);
		OperativaInterfaz op = new OperativaImplementacion();
		String afirmacion;
		op.añadirElementos(listaCampos, sc);
		
		System.out.println("--------------------------------------------------");
		do {
			System.out.println("Dame el numero especifico para saber de que mes se trata:");
			int num = sc.nextInt();
			if (num<13 & num>=1){
				System.out.println(listaCampos.get(num).toString());
				
			}else {
				System.out.println("Los valores se encuentra fuera del rango de los meses");
		
			}
			System.out.println("¿Queires volver a intentarlo?(s/n)");
			afirmacion= sc.next();
		}while(afirmacion.equals("s"));
			
		
		
	
		
	}

}
