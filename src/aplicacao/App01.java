package aplicacao;

import java.util.HashSet;
import java.util.Set;

import entidades.Produto;

public class App01 {

	public static void main(String[] args) {
		
		Set <Produto> set= new HashSet<>();
		set.add(new Produto("TV", 900.00));
		set.add(new Produto("Notebook", 1200.0));
		set.add(new Produto(" Tablet", 400.00));
		
		Produto prod = new Produto("Notebook",1200.0);
		
		
		System.out.println(set.contains(prod));

	}

}
