
public class TestaTurma {

public static void main(String[] args) {
		
		Turma referencia = new  Turma();
		referencia.periodo = "Manh�";
		referencia.serie = "2";
		referencia.sigla = "AI";
		referencia.tipo = "Ensino M�dio";
		
		Turma referencia2 = new  Turma();
		referencia2.periodo = "Tarde";
		referencia2.serie = "�6";
		referencia2.sigla = "C";
		referencia2.tipo = "Ensino Fundamental";
		
		
		
		System.out.println("Per�odo: " + referencia.periodo + " S�rie: " + referencia.serie + " Sigla: " + referencia.sigla + " Tipo:" + referencia.tipo);
		System.out.println("Per�odo: " + referencia2.periodo + " S�rie: " + referencia2.serie + " Sigla: " + referencia2.sigla + " Tipo:" + referencia2.tipo);
	}

}
