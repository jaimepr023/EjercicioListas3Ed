package Ejercicio3Listas.Dtos;

public class CamposDtos {
	
	
	int numeroMes = 0;
	String mes ="aaaaa"; 
	
	
	public CamposDtos() {
		super();
	}
	
	
	public CamposDtos(int numeroMes, String mes) {
		super();
		this.numeroMes = numeroMes;
		this.mes = mes;
	}
	
	public int getNumeroMes() {
		return numeroMes;
	}
	public void setNumeroMes(int numeroMes) {
		this.numeroMes = numeroMes;
	}
	public String getMes() {
		return mes;
	}
	public void setMes(String mes) {
		this.mes = mes;
	}
	
	
	@Override
	public String toString() {
		return "CamposDtos [numeroMes=" + numeroMes + ", mes=" + mes + "]";
	}

}
