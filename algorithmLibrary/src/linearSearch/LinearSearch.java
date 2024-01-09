package linearSearch;

import java.util.Scanner;

public class LinearSearch {
	/*
	 線形探索法: その言葉通り単純に探索の対象とするデータ群と探索したいデータである探索値を
	 先頭から比較していき、目的のデータが見つかるまで探索を続ける方法。
	 */

	//		検索対象を設定
	final static int[] SARCH_TARGET = { 4, 2, 3, 5, 1 };
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		//		実行処理
		System.out.println("数値を入力してください");
		int target = scan.nextInt();
		scan.close();
		System.out.println(target + "を線形探索法で検索します");
		logic(target, SARCH_TARGET);
		System.out.println("検索を終了します");
	}

	//		線形探索法の処理
	//		戻り値はJunit用
	static int logic(int target, int[] SARCH_TARGET) {
		int ans;
		for (int i = 0; i < SARCH_TARGET.length; i++) {
			if (SARCH_TARGET[i] == target) {
				System.out.println(i + 1 + "番目に発見しました");
				return ans = i + 1;
			}
		}
		//		存在しない場合は-1
		System.out.println(target + "は配列に存在しませんでした。");
		return ans = -1;
	}

}
