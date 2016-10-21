package es.upo.cal.EntregaEPD03;

public class Problema01 {
  /**
	 * Testing con enteros
	 */
	@Test
	public void TestInteger() throws Exception {

		// 1. Testing del método parseInt
		Assert.assertNotEquals(Integer.parseInt("epd3"), 1, "Son iguales");

		// 2. Testing del método valueOf
		Assert.assertFalse(Integer.valueOf(1) == 2, "Son diferentes");

		// 3. Testing del método toString
		Assert.assertEquals(Integer.toString(1), "1", "Son iguales");

		// 4. Testing del método toHexString
		Assert.assertNotEquals(Integer.toHexString(10), "epd3", "No son iguales");

	}
}
