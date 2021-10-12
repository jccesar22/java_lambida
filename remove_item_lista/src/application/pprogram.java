package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entities.Product;
import util.ProductPredicate;

public class pprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mousee", 50.00));
		list.add(new Product("Tablet", 350.00));
		list.add(new Product("HD Case", 80.00));
		
		/**Predicate<Product> pred = p -> p.getPrice() >= 100.00;
		list.removeIf(pred);
		usando a expressão lambida declarada podendo ser usada no lugar no valo podendo ser digitado
		
		*/
		list.removeIf(p -> p.getPrice() >= 100);
		
		//list.removeIf(p -> p.getPrice() >= 100);  usando a expresão lambida
		//list.removeIf(new ProductPredicate());   usando uma interface
		//list.removeIf(Product::staticProductPredicate); referenciando o metodo estatico
		//list.removeIf(Product::nonstaticProductPredicate); usando uma referencia de um metodo não estatico
		
		
		
		
		for (Product p : list) {
			System.out.println(p);
		}
	}

}
