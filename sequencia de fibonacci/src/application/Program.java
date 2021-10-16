package application;

import java.util.Arrays;
import java.util.stream.Stream;

public class Program {
	public static void main(String[] args) {
		//fazendo a sequencia a série de FIBONACCI  usando o Stream e o map
		Stream<Long> st1 = Stream.iterate(new Long[] {0L, 1L}, p -> new Long[] {p[1],p[0]+ p[1]}).map(p -> p[0]);
		System.out.println(Arrays.toString(st1.limit(300).toArray()));		
		
	}
}
