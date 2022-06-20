package paquete1;

public class Coche {
	
	private String matricula;
	
	private String marca;
	
	private String modelo;
	
	private String color;
	
	private double potencia;
	
	private String bastidor;
	
	private boolean electrico;            // false: no es electrico, true: si es electrico

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String a) {
		
		if  (a.length()==7) {
		this.matricula = a;
		}
		else{
			
			System.out.println("dato " + a + " invalido");
		}
		
		
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	public String getBastidor() {
		return bastidor;
	}

	public void setBastidor(String bastidor) {
		this.bastidor = bastidor;
	}

	public boolean isElectrico() {
		return electrico;
	}

	public void setElectrico(boolean electrico) {
		this.electrico = electrico;
	}
	
	
	public void simulaRuidoMotor() {
		
		if(this.electrico) {
			System.out.println("....");
		}else {
			System.out.println("BROOOMM BROMM POF PF");
		}	
	}
	
	public char cambiarPotencia(double incremento) {
		
		this.potencia= this.potencia+incremento;
		
		char a= 'p';
		
		return a;
		
	}
	

	
	
	
	
	
	

}
