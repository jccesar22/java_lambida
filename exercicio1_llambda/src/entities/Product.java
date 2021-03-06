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

	// metodo estatico
	public static boolean staticProductPredicate(Product p) {
		return p.getPrice() >= 100.00;
	}

	// metodo n?o estatico
	public boolean nonstaticProductPredicate() {
		return price >= 100.00;
	}

	public static String staticUppCaseName(Product p) {
		return p.getName().toUpperCase();
	}

	public String nonstaticUppCaseName() {
		return name.toUpperCase();
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}

}
