
public class Cart�oTeste {

	public static void main(String[] args) {
		
		Cliente clie = new Cliente();
		clie.nome = "Jubis";
		clie.codigo = "123456";
		clie.status_clie = Cliente_at_inat.ATIVA;
		
		Cart�o cartao = new Cart�o();
		cartao.numero = "123";
		cartao.dt_valid = "20022022";
		cartao.tipo = "debito";
		cartao.cliente = clie; 
		
		
		System.out.println("Nome: " + clie.nome + " C�digo: " + clie.codigo + " Status do cliente: " + clie.status_clie);
		System.out.println("N�mero: " + cartao.numero + " Data de validade: " + cartao.dt_valid + " Tipo: " + cartao.tipo + " Cliente: " + cartao.cliente.codigo);
	}
}
