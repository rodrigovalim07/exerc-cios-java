package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entidades.Comentario;
import entidades.Post;

public class Programa {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comentario c1 = new Comentario("tenha uma boa viagem");
		Comentario c2 = new Comentario("uau, isso é incrível!");
		Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Viagem para Nova Zelandia", "Indo visitar meu lindo país", 12);
		
		p1.addComentario(c1);
		p1.addComentario(c2);
		
		System.out.println(p1);

		Comentario c3 = new Comentario("boa noite!");
		Comentario c4 = new Comentario("que a força esteja com vc");
		Post p2 = new Post(sdf.parse("28/07/2018 23:14:19"), "boa noite, meus amigos", "vejo vcs amanhã", 5);
		
		p2.addComentario(c3);
		p2.addComentario(c4);
		
		System.out.println(p2);
	}

}
