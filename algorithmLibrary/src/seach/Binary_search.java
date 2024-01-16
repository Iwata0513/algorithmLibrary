package seach;

public class Binary_search {
	/*
	  二分探索法:ソート済みの配列に入ったデータ（同一の値はないものとする）に対する検索を行うにあたって、
	  中央の値を見て、検索したい値との大小関係を用いて、検索したい値が中央の値の
	  右(大きい)か、左(小さい)かを判断して、片側には存在しないことを確かめながら検索していく。
	 */

	public static int logic(int target, int[] targetArray) {
		//		確認する配列の添字を計算
		int arrayFirstNum = 0;
		int arrayLastNum = targetArray.length - 1;
		int arrayMidNum = (arrayLastNum - arrayFirstNum) / 2;
		int ans = -1;

		while (arrayLastNum >= arrayFirstNum) {

			//見つかった時は何番目かを返す
			if (target == targetArray[arrayMidNum]) {
				ans = arrayMidNum + 1;
				break;
			}

			//探している数字と合わなかった時
			if (targetArray[arrayMidNum] < target) {
				arrayFirstNum = arrayMidNum + 1;
			} else if (targetArray[arrayMidNum] > target) {
				arrayLastNum = arrayMidNum - 1;
			}

			arrayMidNum = arrayFirstNum + (arrayFirstNum - arrayFirstNum) / 2;

		}

		//見つからない買った場合は-1
		return ans;
	}

}
