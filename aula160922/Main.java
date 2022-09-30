package aula160922;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub.
	
	//mostrarDados c1
	Cliente cl = new Cliente("bruno","Rua 5","Masculino",30,900,5000,0);	
	cl.mostrarDados();
	
	
	/////////////////////////////////////////////////////////////////////
		//Pulando Linha
		System.out.println(" \n");
	/////////////////////////////////////////////////////////////////////
	//VendaOK
	Cliente ve = new Cliente("Eneas","Rua das Quanzas 48","Masculino",0,0,0,0);
	ve.vendaOK();
	
	/////////////////////////////////////////////////////////////////////
	//Pulando Linha
		System.out.println(" \n");
	ve.mostrarDados();//mostrarDados ve  ##vendaOK
		//Pulando Linha
			System.out.println(" \n");
	/////////////////////////////////////////////////////////////////////
	Cliente lOK = new Cliente("Sr alvaro", "rua  pirapora 51","Masculino",18,4000,5000,5500);
	lOK.mostrarDados();
	lOK.limiteOK();
	/////////////////////////////////////////////////////////////////////
		//Pulando Linha
		System.out.println(" \n");
	/////////////////////////////////////////////////////////////////////
		
	Cliente vender = new Cliente("iago","rua 3","Masculino",20,5000,5000,4500);
	vender.mostrarDados();
	vender.vender();
		//Pulando Linha
		System.out.println(" \n");
	/////////////////////////////////////////////////////////////////////
		
	Cliente tV = new Cliente("","","",0,0,0,0);
		
		tV.mostrarTotalVendas(); 
		cl.mostrarTotalVendas();
		lOK.mostrarTotalVendas();
		vender.mostrarTotalVendas();
		
		
	
	
	}
	
	
	

}
