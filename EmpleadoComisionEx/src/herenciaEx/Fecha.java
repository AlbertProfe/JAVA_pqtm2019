package herenciaEx;

public class Fecha {
	public int dia;
	public int mes;
	public int año;

	public Fecha(int nuevoDia, int nuevoMes, int nuevoAño) {
		dia = nuevoDia;
		mes = nuevoMes;
		año = nuevoAño;
	}

	public void imprimir() {
		System.out.println(dia + "/" + mes + "/" + año);
	}

	public void setDia(int nuevoDia) {
		dia = nuevoDia;
	}

	public void setMes(int nuevoMes) {
		mes = nuevoMes;
	}

	public void setAño(int nuevoAño) {
		año = nuevoAño;
	}
}