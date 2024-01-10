package binarySearch;

public class BinarySearch {
	
	
	
	 public static int logic(int target,int[] SARCH_TARGET ){
			//		確認する配列の添字を計算
			int arrayFirstNum = 0;
			int arrayLastNum = SARCH_TARGET.length - 1;
			int arrayMidNum = (arrayLastNum - arrayFirstNum) / 2;
			int ans = -1;

			while (arrayLastNum >= arrayFirstNum) {

				//見つかった時
				if (target == SARCH_TARGET[arrayMidNum]) {
					ans = arrayMidNum + 1;
					System.out.print(ans + "番目に発見しました");
					break;
				}

				//探している数字と合わなかった時
				if (SARCH_TARGET[arrayMidNum] < target) {
					arrayFirstNum = arrayMidNum + 1;
				} else if (SARCH_TARGET[arrayMidNum] > target) {
					arrayLastNum = arrayMidNum - 1;
				}

				arrayMidNum = arrayFirstNum + (arrayFirstNum - arrayFirstNum) / 2;

			}

			//見つからない買った場合
			if (ans == -1)
				System.out.print("見つかりませんでした。");

			return ans;
		}

}
