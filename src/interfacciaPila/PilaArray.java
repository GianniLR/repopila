package interfacciaPila;

import java.util.Arrays;

public class PilaArray<T> implements PilaInterface<T> {
	
	private Object[] array=new Object[10];
	private int cont=0;

	
	public PilaArray() {
		//this.array = array;
	}

	@Override
	public void push(T val) {
		if(cont==array.length)
		{
			array=aggiungere(array);
		}
		array[cont]=val;
		cont++;
	}

	@Override
	public T pop() {
		if(cont==0) {
			return null;
		}
		T val=(T)array[cont-1];//prendo quello dell'ultima posizione
		cont--;
		return val;	
	}
	
	@Override
	public String toString() {
		return "PilaArray [array=" + Arrays.toString(array) + ", cont=" + cont + "]";
	}
	
	private Object[] aggiungere(Object[] arr) {
		Object[] nuovo_array=new Object[arr.length*2];
		for(int i=0; i<arr.length; i++) {
			nuovo_array[i]=arr[i];
		}
		return nuovo_array;
	}



}
