package pkg;

public class Cuenta {
	
	public Cuenta(String numero, String titular, double saldo, double retirar) {
		super();
		this.saldo = saldo;
		this.numero= numero;
		this.titular=titular;
		this.retirar= retirar;
	}

	double saldo;
	String titular;
	String numero;
	double retirar;
	
	public double getRetirar() {
		return 1000;
	}

	public void setRetirar(double retirar) {
		this.retirar = retirar;
	}
	public static Integer retirar(int i) {
		return i;
	}

	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	//public static Integer ingresar(int i) {
	//	return i;
	//
	//}
	
	public void ingresar(double i) {
		this.setSaldo(this.getSaldo()+i);
	}

	public void retirar (double i) {
		if(i<=this.getSaldo())
			this.setSaldo(this.getSaldo()-i);
	}


	
	
	
}
