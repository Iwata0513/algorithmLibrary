package trial.search;

import java.util.Scanner;

import seach.Binary_search;
import seach.Linear_search;

public class SearchFunction {

	//		検索対象を設定	
	final static int[] SARCH_ARRAY = { 1, 2, 3, 5, 8, 9, 11, 12, 15, 18 };

	public static void main(String[] args) {
		SarchSample(SearchType.LINEAR);
	}

	static void SarchSample(SearchType sarchType) {

		System.out.println("探す数字を入力してください。");
		Scanner scan = new Scanner(System.in);
		int target = scan.nextInt();
		scan.close();
		System.out.println(target + "を" + sarchType.getSearchName() + "探索法で検索します");

		int ans = 0;
		//		ソートの種類選択
		switch (sarchType) {
		case LINEAR:
			ans = Linear_search.logic(target, SARCH_ARRAY);
			break;
		case BINARY:
			ans = Binary_search.logic(target, SARCH_ARRAY);
			break;
		}

		if (ans >= 0)
			System.out.println(ans + "番目に発見しました");
		if (ans == -1)
			System.out.println(target + "は見つかりませんでした");

		System.out.println("検索を終了します");
	}

}
