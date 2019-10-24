package ar.edu.utn.intermedio.java.clase2;

public class QRParser {

	public static void main(String[] args) {
		String qr = "mailto:mlennard.utn@gmail.com?subject=Asunto del mail&body=Un mensaje a la sociedad";

		/*
		 * A) Mostrar en pantalla los primeros 6 caracteres del QR
		   B) Indicar si tiene el caracter @
		   C) Indicar si se encuentra la palabra subject
		   D) Mostrar todo el contenido seguido de la palabra "body="
		 */
		
		// A
		String a = qr.substring(0, 6);
        System.out.println(a);
        
        // B
        System.out.println(qr.contains("@"));
		
        //C
        System.out.println(qr.contains("subject"));
        
        //D
		String body = "body=";
		Integer index = qr.indexOf(body);
        System.out.println(qr.substring(index + body.length()));
		
	}

}
