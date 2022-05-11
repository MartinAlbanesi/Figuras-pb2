
public class Circulo extends Figura{
	private Double radio;
	private final Double PI = 3.14;
	
	public Circulo(String color, Double radio) {
		super(color);
		this.radio = radio;
	}

	@Override
	public Double calcularArea() {
		return PI * Math.pow(radio, 2);
	}
	
	@Override
	public Double calcularPerimetro() {
		return 2 * PI * radio;
	}

	public Double getRadio() {
		return radio;
	}

	public void setRadio(Double radio) {
		this.radio = radio;
	}
	
	
}
