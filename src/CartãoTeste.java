
public class Cart�oTeste {

	public static void main(String[] args) {
		
		Cliente clie = new Cliente();
		clie.nome = "Jubis";
		clie.codigo = "123456";
		clie.status_clie = Cliente_at_inat.ATIVA;
		
		System.out.println("Nome: " + clie.nome + " C�digo: " + clie.codigo + " Status do cliente: " + clie.status_clie);
	}
}
