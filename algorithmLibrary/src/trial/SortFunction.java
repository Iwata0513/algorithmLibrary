package trial;

import sort.Bubble_sort;

public class SortFunction {
	//		検索対象を設定	
	static int[] sortArray = { 5, 19, 3, 5, 22, 11, 11, 12, 33, 18 };

	public static void main(String[] args) {
		System.out.println("バブルソートを実施します");
		System.out.print("ソート前:");
		for (int i : sortArray)
			System.out.print(i + " ");
		System.out.println();

		Bubble_sort.logic(sortArray);

		System.out.print("ソート後:");
		for (int i : sortArray)
			System.out.print(i + " ");
		System.out.println();
		System.out.println("ソートを終了します");

	}

}
