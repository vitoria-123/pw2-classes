
public class TesteContaBanco {
	public static void main(String[] args) {

	Agencia agencia = new Agencia();
	agencia.numero = "123456";
	
	ContaBanco conta = new ContaBanco();
	conta.numero = "123456789";
	conta.saldo = "100";
	conta.limite = "1000";
	conta.agencia = agencia;
	
	System.out.println("N�mero: " + agencia.numero);
	System.out.println("N�mero: " + conta.numero + " Saldo: " + conta.saldo + " Limite: " + conta.limite + " Ag�ncia: " + conta.agencia.numero);
	
}
}
