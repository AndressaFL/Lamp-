package alura.com.cursojava.projectlamp;

public class Light {
	
	private String brand;
	private String type;
	private String material;
	private String color;
	private double height;
	private boolean lighton;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public boolean isLighton() {
		return lighton;
	}

	public void setLighton(boolean lighton) {
		this.lighton = lighton;
	}

	//public Light(String color, String type, String material) {  /* Construtor*/
		//this.color = color;
		//this.type = type;
		//this.material = material;
		//System.out.println("Available lights: ");
	//}
	public Light() {
	}
	
	void lighton() {

		lighton = true;
	}
	
	void lightoff() {

		lighton = false;
	}
	
	public void status() {
		
		if(lighton) {
			System.out.println("Lampada ligada");
		}else {
			System.out.println("Lampada desligada");
		}
	}
	}

