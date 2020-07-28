package 算法.二分查找;

/**
 * @ClassName BinarySearchfei
 * @Description TODO
 * @author: cdf
 * @Date: 2020-07-28 17:54
 **/
public class BinarySearchfei {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		System.out.println(binsearch(arr, 9));
	}

	public static int binsearch(int[] arr, int result){
		int left = 0;
		int right = arr.length - 1;
		while (left <= right){
			int mid = (left + right)/2;
			int midValue = arr[mid];
			if (result > midValue){
				left = mid + 1;
			}else if (result < midValue){
				right = mid - 1;
			}else if (result == midValue){
				return mid;
			}
		}
		return -1;
	}
}
