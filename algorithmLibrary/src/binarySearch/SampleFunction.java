package binarySearch;

import java.util.Scanner;

public class SampleFunction {
	/*
	  二分探索法:ソート済みの配列に入ったデータ（同一の値はないものとする）に対する検索を行うにあたって、
	  中央の値を見て、検索したい値との大小関係を用いて、検索したい値が中央の値の
	  右(大きい)か、左(小さい)かを判断して、片側には存在しないことを確かめながら検索していく。
	 */

	//		検索対象を設定	
	final static int[] SARCH_TARGET = { 1, 2, 3, 5, 8, 9, 11, 12, 15, 18 };
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("探す数字を入力してください。");
		int target = scan.nextInt();
		scan.close();

		System.out.println(target + "を二分探索法で検索します");
		int ans = BinarySearch.logic(target, SARCH_TARGET);
		
		if(ans >=0) System.out.println(ans + "番目に発見しました");
		if(ans == -1) System.out.println(target+"は見つかりませんでした");
		
		System.out.println("検索を終了します");
		
	}

}
