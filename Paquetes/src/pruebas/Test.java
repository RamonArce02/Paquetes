package pruebas;

public class Test {
	
	public static void main(String[] args) {
		
		paquete1.Persona p= new paquete1.Persona(23, "Maria");
		paquete2.Persona m= new paquete2.Persona(23, "Ramon", "Maculino");
		paquete1.Persona n= new paquete1.Persona(25, "Juan");
		System.out.println("Inicio de impresion: ");
		    System.out.println(p.toString());
	        System.out.println(m.toString());
	        System.out.println(n.toString());
	        System.out.println("Fin..... ");
	        System.out.println("prueba branch");
	}

}
