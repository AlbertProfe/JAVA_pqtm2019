package herenciaEx;

public class EmpleadoComision extends Empleado {
	private double porcentajeComision;
	private int dineroVentas;

	public EmpleadoComision(String nombre, Fecha fechaNacimiento, int dni, int sueldoBase, double porcentajeComision) {
		super(nombre, fechaNacimiento, dni, sueldoBase);
		this.porcentajeComision = porcentajeComision;
		this.dineroVentas = 0;
	}

	public void vender(int dineroVenta) {
		this.dineroVentas += dineroVenta;
	}

	public int getSueldo() {
		return sueldoBase + (int) (dineroVentas * porcentajeComision / 100.0);
	}
}