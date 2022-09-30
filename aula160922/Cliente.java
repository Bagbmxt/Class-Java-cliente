package aula160922;

public class Cliente {
	
	private String nome;
	private String endereco;
	private String sexo;
	private int idade;
	private double limitecredito ;
	private double limiteoperacao = 5000;
	private double totalvendas ;
	
	public Cliente (String n, String e, String s, int i, double lc, double lo, double t) {
		
		this.nome = n;
		this.endereco = e;
		this.sexo = s;
		this.idade = i;
		this.limitecredito = lc;
		this.limiteoperacao = lo;
		this.totalvendas = t;
}		
 	public void mostrarDados() {
 		System.out.println("Nome: "+this.nome);
 		System.out.println("Endereco: "+this.endereco);
 		System.out.println("Sexo: "+this.sexo);
 		System.out.println("Idade: "+this.idade);
 		System.out.println("LimiteCredito: "+this.limitecredito);
 	    System.out.println("LimiteOperacao: "+this.limiteoperacao);
 		System.out.println("TotalVendas: "+this.totalvendas);
}
 	public void vendaOK() {
 		this.totalvendas = 300;
 		this.limitecredito = 200;
		this.limiteoperacao = 5000;		
			//boolean limiteoperacao;
			//boolean totalvendas;	
	boolean vendaOK = true;
	if (limiteoperacao>=totalvendas) 
		System.out.println("Venda aprovada,  Voce tem  " + this.limitecredito + " de Limite de credito");
	else 
		System.out.println("Nao aprovado, Total de venda maior que o seu Limiteoperacao");
	}
 		
//	if (totalvendas <= limiteoperacao) {
	    //System.out.println("Voce nao tem limite sulficiente! " + "Total de vendas: " + totalvendas);
	//} else {
	 //   System.out.println(  this.nome + " Limite Aprovado, " +"  voce tem  " + limitecredito + " de Limite Disponivel ! ! !");
//	}
//}
 	
 	public void limiteOK() {
 	
 	boolean limiteOK = true;
	//Pulando Linha
	System.out.println(" \n");
	System.out.println("o seu limite  eh de " + this.limitecredito);
 	this.limitecredito -= this.limiteoperacao;
 
 	
	if (totalvendas>=limiteoperacao)
		System.out.println("(Aprovado)Limite estourado, o limite da sua conta atual eh  " + this.limitecredito + " e o limite da operacao eh " + limiteoperacao );
	else
		System.out.println("Aprovado, o seu limite eh de  " + this.limitecredito + " e o saldo da compra eh de " + this.limiteoperacao);
 	}
 	
 	public void vender() {
 		
	
	if ( totalvendas <= limitecredito  )
		System.out.println(" Limite OK (APROVADO)  SALDO " + this.limitecredito);
	else
		System.out.println("Voce nao tem limite sulficiente " + this.limitecredito);
 	}
 	
 	
 	public void mostrarTotalVendas() {
 		System.out.println("total de vendas ate o momento: " + this.totalvendas );
 		
 		 
 		
 	}
 	
 
 	
		
 		
 		
 	}
 	
 	



//void vender (double)

//bollean vendaOK(double) > método responsavel em verificar se o valor da venda (passado por 
//parametro) não é maior que o valor da operação definida para todos os clientes, retornando 
//um booleano correspondente


