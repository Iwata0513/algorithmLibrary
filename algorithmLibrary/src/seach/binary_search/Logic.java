package seach.binary_search;

public class Logic {

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
