package pruebaGit;

public class Main {
	 public static void main(String[] args) {
	        saludoBucle();
	        despedida();
	    }


	    /**
	     * Muestra "Hola mundo." 5 veces
	     * de una forma bastante ineficiente.
	     */
	    public static void saludoBucle() {
	        System.out.println("Hola mundo.");
	        System.out.println("Hola mundo.");
	        System.out.println("Hola mundo.");
	        System.out.println("Hola mundo.");
	        System.out.println("Hola mundo.");
	    }

	    /**
	     * Muestra un mensaje que indica el
	     * final de la ejecución del programa.
	     */
	    private static void despedida() {
	        System.out.println("Fin del programa.");
	    }
}
