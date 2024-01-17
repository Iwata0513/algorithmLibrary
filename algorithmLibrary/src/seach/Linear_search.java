package seach;

public class Linear_search {
	/*
	 線形探索法: その言葉通り単純に探索の対象とするデータ群と探索したいデータである探索値を
	 先頭から比較していき、目的のデータが見つかるまで探索を続ける方法。
	 */

	public static int logic(int target, int[] searchArray) {
		int ans;
		for (int i = 0; i < searchArray.length; i++) {
			if (searchArray[i] == target) {
				return ans = i + 1;
			}
		}
		//		存在しない場合は-1
		return ans = -1;
	}

}
