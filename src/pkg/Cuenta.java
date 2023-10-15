package pkg;

public class Cuenta {
	
	public Cuenta(String numero, String titular, double saldo, double retirar) {
		super();
		this.numero= numero;
		this.titular=titular;
		this.saldo = saldo;
		this.retirar= retirar;
	}

	double saldo;
	String titular;
	String numero;
	double retirar;
	
	public double getRetirar() {
		return -100;
	}

	public void setRetirar(double retirar) {
		this.retirar = retirar;
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
		//if(i<=this.getSaldo())
		if(this.getSaldo()-i>-500) {
			this.setSaldo(this.getSaldo()-i);
			
		}else System.out.print("Error , su saldo no puede ser menor de 500\n");
		
	}
	
	
}
