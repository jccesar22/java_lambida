package entities;

public class Product {
	private String name;
	private Double price;
	public Product(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	// metodo não estatico 
	public static void StaticPriveUpDate(Product p) {
		p.setPrice(p.getPrice() * 1.1);
	}
	
	public  void nonStaticPriveUpDate() {
		setPrice(getPrice() * 1.1);
	}
	
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
	 
	
	
}
