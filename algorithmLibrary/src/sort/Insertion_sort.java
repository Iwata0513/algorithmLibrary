package sort;

public class Insertion_sort{
	/*
	挿入ソート:データ列を「整列済み」と「未整列」の2つに分け、
	「未整列な配列」からデータを1つ取り出し、「整列済み配列」の適切な位置に挿入することを
	繰り返すことで全てを整列済にするソート法
	*/
	public static int[] logic(int[] sortArray) {
		int i, k, tmp;
		for (i = 1; i < sortArray.length; i++) {
			tmp = sortArray[i];
			for (k = i; k > 0 && sortArray[k - 1] > tmp; k--) {
				sortArray[k] = sortArray[k - 1];
			}
			sortArray[k] = tmp;
		}
		return sortArray;
	}
}
