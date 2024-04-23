package app;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Programa {

	public static void main(String[] args) {

		// stream é uma sequencia de elementos advinda de uma fonte de dados que
		// oferece suporte a "operações agregadas".

		List<Integer> lista = Arrays.asList(3, 4, 5, 10, 7);
		Stream<Integer> st1 = lista.stream();	// transformando a lista em uma stream
		System.out.println(Arrays.toString(st1.toArray()));
		
		Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");	// declarando uma stream com valores
		System.out.println(Arrays.toString(st2.toArray()));
		
		Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);	// iterando de 2 em 2
		System.out.println(Arrays.toString(st3.limit(10).toArray()));	// impondo limite pq a operação seria infinita
		
		Stream<Long> st4 = Stream.iterate(new long[] { 0L, 1L }, p -> new long[] { p[1], p[0] + p[1] }).map(p -> p[0]);	// sequencia de fibonacci
		System.out.println(Arrays.toString(st4.limit(15).toArray()));
	}
}
