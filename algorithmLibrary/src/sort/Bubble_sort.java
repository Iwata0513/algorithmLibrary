package sort;

public class Bubble_sort {

	public static int[] logic(int[] sortArray) {
		int arrayMaxIndex = sortArray.length - 1;
		int arrayTaagetIndex = arrayMaxIndex;

		for (int work = 0, sortedNum = 0; sortedNum != arrayMaxIndex; sortedNum++, arrayTaagetIndex = arrayMaxIndex) {
			for (; sortedNum < arrayTaagetIndex; arrayTaagetIndex--) {
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
