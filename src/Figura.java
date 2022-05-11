
public abstract class Figura {
	protected String color;
	
	public Figura(String color) {
		this.color = color;
	}

	public abstract Double calcularArea();
	public abstract Double calcularPerimetro();
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
