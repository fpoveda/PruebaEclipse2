package paquete1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Coche coche1 = new Coche();
		
		Coche coche2 = new Coche();
		
		coche1.setMatricula("23455FET");
		coche2.setMatricula("6783BHRT");
//		coche1.matricula = "9828092RIEIW";
//		coche1.marca = "Seat";
//		coche1.modelo = "Ibiza";
//		coche1.color = "rojo";
		coche1.setPotencia(90);
		coche1.setElectrico(false);
		
	//	coche1.setPotencia(coche1.getPotencia()+10);
		
//		coche1.bastidor = "89137863hdeh";
		
//		coche2.matricula = "8745BTH";
//		coche2.marca = "Peugeot";
//		coche2.modelo = "307";
//		coche2.color = "azul";
//		coche2.potencia = 110;
//		coche2.bastidor = "8998233dhh";
		coche2.setElectrico(true);
		
		
		System.out.println("La matricula del coche1 es " + coche1.getMatricula());
		
		coche1.simulaRuidoMotor();
		coche2.simulaRuidoMotor();	
		
		//char b= coche1.cambiarPotencia(20);
		
	//	System.out.println(b);
		
		System.out.println("La potencia del coche1 es " + coche1.cambiarPotencia(20));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
