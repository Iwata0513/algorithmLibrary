package trial;

import java.util.Scanner;

import seach.Binary_search;

public class SearchFunction {
	
	//		検索対象を設定	
	final static int[] SARCH_TARGET = { 1, 2, 3, 5, 8, 9, 11, 12, 15, 18 };
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("探す数字を入力してください。");
		int target = scan.nextInt();
		scan.close();

		System.out.println(target + "を二分探索法で検索します");
		int ans = Binary_search.logic(target, SARCH_TARGET);
		
		if(ans >=0) System.out.println(ans + "番目に発見しました");
		if(ans == -1) System.out.println(target+"は見つかりませんでした");
		
		System.out.println("検索を終了します");
		
	}

}
