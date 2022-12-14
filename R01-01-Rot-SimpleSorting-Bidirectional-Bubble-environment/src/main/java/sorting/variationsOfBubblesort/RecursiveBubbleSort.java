package sorting.variationsOfBubblesort;

import sorting.AbstractSorting;
import util.Util;

public class RecursiveBubbleSort<T extends Comparable<T>> extends
		AbstractSorting<T> {

	/**
	 * Implementação recursiva do bubble sort. Você deve implementar apenas esse
	 * método sem usar nenhum outro método auxiliar (exceto
	 * Util.swap(array,int,int)). Para isso, tente definir o caso base do
	 * algoritmo e depois o caso indutivo, que reduz o problema para uma entrada
	 * menor em uma chamada recursiva. Seu algoritmo deve ter complexidade
	 * quadrática O(n^2).
	 */
	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		if (array.length > 1 && leftIndex >= 0 && rightIndex <= array.length - 1) {
				for (int i = leftIndex; i < rightIndex; i++) {
					int auxIndex = i;
					for (int j = i + 1 ; j < rightIndex + 1; j++) {
						if (array[j].compareTo(array[auxIndex]) < 0) {
							auxIndex = j;
							}
						}
					Util.swap(array, i, auxIndex);
					}
			}
	}

}
