package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import entities.Product;
import util.UpperCaseName;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mousee", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.00));
		
		
		//colocando como llambda inline
		List<String> names = list.stream().map( p -> p.getName().toUpperCase()).collect(Collectors.toList());	
		names.forEach(System.out::println);
		/*
		 * 
		 * usando uma function
		 * 
		Function<Product, String> func = p -> p.getName().toUpperCase();
		List<String> names = list.stream().map(func).collect(Collectors.toList());	
		names.forEach(System.out::println);
		
		
		 * usando metodo não estatico da class Product
		 * List<String> names = list.stream().map(Product::nonstaticUppCaseName).collect(Collectors.toList());	
		names.forEach(System.out::println);
		 * 
		 * usando um metotodo statico da class Product 
		List<String> names = list.stream().map(Product::staticUppCaseName).collect(Collectors.toList());	
		names.forEach(System.out::println);
		
		
		usando um interface
		List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());	
		names.forEach(System.out::println);*/
	}

}
