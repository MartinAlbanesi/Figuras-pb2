
public class Cuadrado extends Figura{
	private Double lado1;
	private Double lado2;
	
	public Cuadrado(String color, Double lado1, Double lado2) {
		super(color);
		this.lado1 = lado1;
		this.lado2 = lado2;
	}
	
	@Override
	public Double calcularArea() {
		return lado1 * lado2;
	}
	
	@Override
	public Double calcularPerimetro() {
		return (lado1 + lado2) * 2;
	}

	public Double getLado1() {
		return lado1;
	}

	public void setLado1(Double lado1) {
		this.lado1 = lado1;
	}

	public Double getLado2() {
		return lado2;
	}

	public void setLado2(Double lado2) {
		this.lado2 = lado2;
	}
	
	
}
