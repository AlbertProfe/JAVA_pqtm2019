package herenciaEx;

public class Fecha {
	public int dia;
	public int mes;
	public int a�o;

	public Fecha(int nuevoDia, int nuevoMes, int nuevoA�o) {
		dia = nuevoDia;
		mes = nuevoMes;
		a�o = nuevoA�o;
	}

	public void imprimir() {
		System.out.println(dia + "/" + mes + "/" + a�o);
	}

	public void setDia(int nuevoDia) {
		dia = nuevoDia;
	}

	public void setMes(int nuevoMes) {
		mes = nuevoMes;
	}

	public void setA�o(int nuevoA�o) {
		a�o = nuevoA�o;
	}
}