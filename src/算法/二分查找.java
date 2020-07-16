package 算法;

/**
 * @ClassName 二分查找
 * @Description TODO
 * @author: cdf
 * @Date: 2020-07-17 00:07
 **/
public class 二分查找 {
	public static void main(String[] args) {
		int[] arr ={1,25,35,100,256,325};
		System.out.println(binarySearch(arr, 0, arr.length, 325));
	}

	public static int binarySearch(int[] arr, int left, int right, int findVal){
		if(left > right){
			return -1;
		}
		int mid = (left + right) / 2;
		int midValue = arr[mid];

		if (findVal > midValue){
			return binarySearch(arr, mid + 1, right, findVal);
		}else if (findVal < midValue){
			return binarySearch(arr, left, mid - 1, findVal);
		}else {
			return mid;
		}
	}
}
