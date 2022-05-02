
public class TestaTurma {

public static void main(String[] args) {
		
		Turma referencia = new  Turma();
		referencia.periodo = "Manhã";
		referencia.serie = "2";
		referencia.sigla = "AI";
		referencia.tipo = "Ensino Médio";
		
		Turma referencia2 = new  Turma();
		referencia2.periodo = "Tarde";
		referencia2.serie = "¨6";
		referencia2.sigla = "C";
		referencia2.tipo = "Ensino Fundamental";
		
		
		
		System.out.println("Período: " + referencia.periodo + " Série: " + referencia.serie + " Sigla: " + referencia.sigla + " Tipo:" + referencia.tipo);
		System.out.println("Período: " + referencia2.periodo + " Série: " + referencia2.serie + " Sigla: " + referencia2.sigla + " Tipo:" + referencia2.tipo);
	}

}
