package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Cuenta;

class CuentaTest {

	static Cuenta aux, aux2;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		aux= new Cuenta("12345","Manuel",50,0);
		aux2= new Cuenta ("67890","Alberto",0,0);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		//aux.setSaldo(0);

	}

	@AfterEach
	void tearDown() throws Exception {
	}

/*	
	@Test
	void testRetirar() {
		aux.retirar(-100);
		assertEquals(aux.getRetirar(), -100);
	}
	@Test
	void testIngresar() {
		aux.ingresar(1000);
		assertEquals(aux.getSaldo(), 1000);
	}
	*/
	@Test
	void test14() {
		System.out.println("Cuenta 67890");
		System.out.println("Saldo inicial de "+aux2.getSaldo());
		aux2.retirar(350);
		System.out.println("Saldo actual de "+aux2.getSaldo());
		aux2.retirar(150);
		aux2.ingresar(50);
		assertEquals(-300, aux2.getSaldo());
	}
	@Test
	void test15() {
		System.out.println("Cuenta 12345");
		aux.retirar(200);
		aux.ingresar(100);
		aux.retirar(200);
		assertEquals(-250, aux.getSaldo());
	}
}
