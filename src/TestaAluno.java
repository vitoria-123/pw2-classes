
public class TestaAluno {

	public static void main(String[] args) {
		
		Aluno referencia = new Aluno();
		referencia.rg = "11.222.333-2";
		referencia.nome = "Craudinho do Glau";
		referencia.dtnasc = "30/08/2009";
		
		
		Aluno referencia2 = new Aluno();
		referencia2.rg = "22.333.444-3";
		referencia2.nome = "Craudete do Morro";
		referencia2.dtnasc = "31/11/2007";
		
		System.out.println("Nome: " + referencia.nome + " rg: ," + referencia.rg + " Data de nascimento: " + referencia.dtnasc);
		System.out.println("Nome: " + referencia2.nome + " rg: ," + referencia2.rg + " Data de nascimento: " + referencia2.dtnasc);
	}

}
