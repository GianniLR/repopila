package interfacciaPila;

public class Test {

	public static void main(String[] args) {
		PilaInterface<String> pila= new PilaArray<String>();
		pila.push("Ciao");
		pila.push("Anna");
		pila.push("Peppe");
		
		
		do {
			System.out.println(pila.pop());
		}while(pila.pop()!=null);
		

	}

}
