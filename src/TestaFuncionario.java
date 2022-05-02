
public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionario referencia = new Funcionario();
		referencia.cargo = "Lixeiro";
		referencia.salario = "10.000";
	
		
		
		Funcionario referencia2 = new Funcionario();
		referencia2.cargo = "Coordenador";
		referencia2.salario = "100.000";
	
		System.out.println("Cargo: " + referencia.cargo + ", Salario: " + referencia.salario );
		System.out.println("Cargo: " + referencia2.cargo + ", Salario: " + referencia2.salario);
		
	}

}
