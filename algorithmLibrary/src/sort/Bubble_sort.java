package sort;

public class Bubble_sort {
	/*
	  バブルソート:データ列の隣り合う要素を比較し交換することを繰り返すことによりデータ列をソートする手法。
	  バブルとは「泡」の意味で、ソートの過程でデータが移動する様子が、水中で泡が浮かんでいくように見えるため。
	 */

	public static int[] logic(int[] sortArray) {
		int arrayMaxIndex = sortArray.length - 1;
		int arrayTaagetIndex = arrayMaxIndex;

		for (int work = 0,
				sortedIndex = 0; sortedIndex != arrayMaxIndex; sortedIndex++, arrayTaagetIndex = arrayMaxIndex) {
			for (; sortedIndex < arrayTaagetIndex; arrayTaagetIndex--) {
				if (sortArray[arrayTaagetIndex] < sortArray[arrayTaagetIndex - 1]) {
					work = sortArray[arrayTaagetIndex - 1];
					sortArray[arrayTaagetIndex - 1] = sortArray[arrayTaagetIndex];
					sortArray[arrayTaagetIndex] = work;
				}
			}
		}

		return sortArray;
	}

}
