package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;
import model.services.ProductServices;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mousee", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.00));
		
		ProductServices ps = new ProductServices();
		
		double sum = ps.filteredSum(list, p -> p.getPrice() < 100.0);
		
		System.out.println("Sum = "  + String.format("%.2f", sum));
		
	}

}
