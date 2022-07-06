package br.com.kenneth.lambdastream;

import java.util.concurrent.atomic.AtomicInteger;
//Closure é uma capacidade que o java tem, que de dentro de uma expressão lambda acessar variáveis que estão "exclosed scope" 
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		int mult = 2;	
		AtomicInteger count = new AtomicInteger();// Mostra a quantidade de número incrementado; como se estivesse usando count++
		IntStream.range(1, 21)
		    .map(i -> {
		    	count.incrementAndGet();
		    	return i * mult;
		    })
			.forEach(System.out::println);
		
		System.out.println(count);
	}

	
}

// Clouser