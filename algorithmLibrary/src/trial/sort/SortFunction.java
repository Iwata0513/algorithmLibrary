package trial.sort;

import sort.Bubble_sort;
import sort.Insertion_sort;

public class SortFunction {
	//		検索対象
	static int[] sortArray = { 5, 19, 3, 5, 22, 11, 11, 12, 33, 18 };

	public static void main(String[] args) {
		//EnumのSortTypeを変更するとそれぞれのソートが試せます。
		SortSample(SortType.BUBBLE);
	}

	
	static void SortSample(SortType sortType) {
		System.out.println(sortType.getSortName() + "ソートを実施します");
		System.out.print("ソート前:");
		for (int i : sortArray)
			System.out.print(i + " ");
		System.out.println();

//		ソートの種類選択
		switch (sortType) {
		case BUBBLE:
			Bubble_sort.logic(sortArray);
			break;
		case INSERTION:
			Insertion_sort.logic(sortArray);
			break;
		}

		
		System.out.print("ソート後:");
		for (int i : sortArray)
			System.out.print(i + " ");
		System.out.println();
		System.out.println("ソートを終了します");

	}

}
