package Exercicio8;

public class Teste {
	public static void main(String[] args) {
		
	NoticiarioAssina noticiario = new NoticiarioAssina();  //cria objeto NoticiarioAssina
	new Consumidor("Pedro Gallon", noticiario);     //Cria um consumidor e 
	noticiario.notificaNoticia("Uma nova noticia", 1, 2, "Tópicos interessantes!");
	new Consumidor("Jão", noticiario);
	noticiario.notificaNoticia("Uma noticia mais nova ainda", 2, 2, "Tópico ruim");
	
	
	}
}
