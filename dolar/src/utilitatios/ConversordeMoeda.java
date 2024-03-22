package utilitatios;

public class ConversordeMoeda {
	
	public static double iof = 0.06;
	
	public static double totalCompra(double compra, double dolar) {
		return compra * dolar * (1.0 + iof);
	}

}
