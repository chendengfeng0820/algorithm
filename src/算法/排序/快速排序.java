package 算法.排序;

import java.util.Arrays;

/**
 * @ClassName 快速排序
 * @Description TODO
 * @author: cdf
 * @Date: 2020-07-14 23:57
 **/
public class 快速排序 {
	public static void main(String[] args) {
		int [] arr ={8,7,10,9,3,12,18};
		quickSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

	static void quickSort(int [] arr, int left, int right){
		if(left>right){
			return;
		}
		int base = arr[left];
		int l = left ; int r = right ;
		int temp = 0;
		while (l < r){
			while (arr[r] > base && l < r){
				r--;
			}
			while (arr[l] < base && l < r){
				l++;
			}

			temp = arr[l];
			arr[l] = arr[r];
			arr[r] = temp;

		}
		arr[left] = arr[l];
		arr[l] = base;


		quickSort(arr,left,l-1);
		quickSort(arr,l+1,right);
	}
}
