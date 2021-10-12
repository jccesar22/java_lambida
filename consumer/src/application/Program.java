package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mousee", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.00));

		/// list.forEach(new PriceUpDate()); usando implementação de interface

		// list.forEach(Product::StaticPriveUpDate); usando metodo estatico da class
		// Product
		// list.forEach(Product::nonStaticPriveUpDate); usando metodo não estatico da class Product
		
		
		/*
		double factor = 1.1;
		Consumer<Product> cons = p -> 
			p.setPrice(p.getPrice() * factor);
			
		list.forEach(cons);
		
		usando expressão lambida declarada
		*/
		double factor = 1.1;
		list.forEach(p -> p.setPrice(p.getPrice() * factor));
		list.forEach(System.out::println);

	}

}
