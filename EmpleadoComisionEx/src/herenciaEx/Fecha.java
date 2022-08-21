package herenciaEx;

public class Fecha {
	public int dia;
	public int mes;
	public int anio;

	public Fecha(int nuevoDia, int nuevoMes, int nuevoAnio) {
		dia = nuevoDia;
		mes = nuevoMes;
		año = nuevoAnio;
	}

	public void imprimir() {
		System.out.println(dia + "/" + mes + "/" + anio);
	}

	public void setDia(int nuevoDia) {
		dia = nuevoDia;
	}

	public void setMes(int nuevoMes) {
		mes = nuevoMes;
	}

	public void setAnio(int nuevoAnio) {
		anio = nuevoAioo;
	}
}
