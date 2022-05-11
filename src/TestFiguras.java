

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TestFiguras {

	@Test
	void queSePuedaCrearUnCirculo() {
		//Preparacion
		Circulo circulo;
		final String COLOR_ESPERADO = "Azul";
		final Double RADIO_ESPERADO = 10.50;
		//Ejecucion
		circulo = new Circulo(COLOR_ESPERADO,RADIO_ESPERADO);
		//Validacion
		assertEquals(COLOR_ESPERADO,circulo.getColor());
		assertEquals(RADIO_ESPERADO,circulo.getRadio());
	}
	
	@Test
	void queSePuedaCrearUnCuadrado() {
		//Preparacion
		Cuadrado cuadrado;
		final String COLOR_ESPERADO = "Azul";
		final Double LADO1_ESPERADO = 10.50;
		final Double LADO2_ESPERADO = 10.50;
		
		//Ejecucion
		cuadrado = new Cuadrado(COLOR_ESPERADO,LADO1_ESPERADO,LADO2_ESPERADO);
		//Validacion
		assertEquals(COLOR_ESPERADO,cuadrado.getColor());
		assertEquals(LADO1_ESPERADO,cuadrado.getLado1());
		assertEquals(LADO2_ESPERADO,cuadrado.getLado2());
	}
	
	@Test
	void queSePuedaCalcularElAreaDelCirculo() {
		//Preparacion
		Circulo circulo;
		final String COLOR_ESPERADO = "Azul";
		final Double RADIO_ESPERADO = 10.50;
		final Double AREA_ESPERADA = 346.185;
		//Ejecucion
		circulo = new Circulo(COLOR_ESPERADO,RADIO_ESPERADO);
		final Double AREA_OBTENIDA = circulo.calcularArea();
		//Validacion
		assertEquals(AREA_OBTENIDA,AREA_ESPERADA);
		
	}

}
