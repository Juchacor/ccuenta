import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCCuentaJCC {
	
	@Test
	void testGetSaldoJCC() {
		fail("Not yet implemented");
	}

	@Test
	void testIngresarJCC()throws Exception{
		Ccuenta miCuenta=new Ccuenta("Ana","López",3200,1);
		miCuenta.ingresar(-600);
	}

	@Test
	void testRetirarJCC() {
		fail("Not yet implemented");
	}

	@Test
	void testGetCuentaJCC() {
		fail("Not yet implemented");
	}

}
