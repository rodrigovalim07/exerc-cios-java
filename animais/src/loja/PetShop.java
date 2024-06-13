package loja;

import animais.Animal;
import animais.Cachorro;

public class PetShop {

	public void darBanho(Animal animal) {
		animal.setEstadoDeEspirito("limpo");
	}
	
	public void tosar(Cachorro cachorro) {
		cachorro.setEstadoDeEspirito("tosado");
	}
	
	public void deixarNoHotel(Animal animal) {
		animal.setEstadoDeEspirito("saudade");
	}
}
