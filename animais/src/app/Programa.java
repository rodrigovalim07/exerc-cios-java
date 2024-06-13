package app;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import animais.Animal;
import animais.Cachorro;
import animais.Gato;
import animais.Passaro;
import loja.PetShop;

public class Programa {

	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro("Roberto", "caramelo", 0.6, 20.7, 0.4);
		System.out.println("numero de cachorros: " + Cachorro.getContador());
		Cachorro cachorro2 = new Cachorro("Rex", "preto", 0.5, 15.7, 0.4);
		Animal cachorro3 = new Cachorro("Adkins", "cinza", 0.9, 22.3, 0.7);

		cachorro.soar();
		cachorro.interagir("carinho");
		System.out.println(cachorro.getEstadoDeEspirito());
		cachorro.interagir("gritar");
		System.out.println(cachorro.getEstadoDeEspirito());
		cachorro.comer();
		
		List<Animal> animais = new ArrayList<>();
		animais.add(cachorro);
		animais.add(cachorro2);
		animais.add(cachorro3);
		
		animais = animais.stream().collect(Collectors.toList());
		animais.forEach(System.out::println);
		
		System.out.println("numero de cachorros: " + Cachorro.getContador());
		
		System.out.println("----------------------------------");
		
		Gato gato = new Gato("Felix", "preto", 0.3, 2.0);
		Passaro passaro = new Passaro("Frajola", "branco", 0.2, 0.1);
		System.out.println(passaro.getEstadoDeEspirito());
		
		cachorro.soar();
		gato.soar();
		passaro.soar();
		
		System.out.println("----------------------------------");
		
		PetShop petShop = new PetShop();
		
		petShop.darBanho(cachorro);
		System.out.println(cachorro.getEstadoDeEspirito());
		
		petShop.darBanho(gato);
		System.out.println(gato.getEstadoDeEspirito());
		
		petShop.tosar(cachorro);
		System.out.println(cachorro.getEstadoDeEspirito());
		
		petShop.deixarNoHotel(passaro);
		System.out.println(passaro.getEstadoDeEspirito());
		
		System.out.println(Passaro.getContador());
		
		System.out.println("----------------------------------");
		
		animais.add(passaro);
		animais.add(gato);
		
		animais.forEach(System.out::println);
	}

}
