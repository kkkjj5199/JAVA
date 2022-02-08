import java.util.Arrays;
// arr의 요소중 인덱스 2~5까지 불러오기 copyOfRange*
public class Solution_Basic {
	private static int[] arr = {0,1,2,3,4,5,6,7,8,9,10};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = Arrays.copyOfRange(arr, 2, 6);
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i] + " ");
		}

	}

}
