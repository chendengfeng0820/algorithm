package 算法.二分查找;

/**
 * @ClassName BinarySearchDigui
 * @Description TODO
 * @author: cdf
 * @Date: 2020-07-28 17:41
 **/
public class BinarySearchDigui {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		System.out.println(binarySearch(arr,0,arr.length-1,15));
	}

	public static int binarySearch(int[] arr, int left, int right, int result){
		if (left > right){
			return -1;
		}
		int mid =(left + right) / 2;
		int midValue = arr[mid];

		if (result > midValue){
			return binarySearch(arr, mid+1, right, result);
		}else if (result < midValue){
			return binarySearch(arr, left, mid-1, result);
		}else if(result == midValue){
			return mid;
		}
		return -1;
	}
}
