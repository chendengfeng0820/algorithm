package 算法.排序;

import java.util.Arrays;

/**
 * @ClassName 归并排序
 * @Description TODO
 * @author: cdf
 * @Date: 2020-07-15 09:09
 **/
public class 归并排序 {
	public static void main(String[] args) {
		int[] a = { 49, 38, 65, 97, 76, 13, 27, 50 };
		int[] temp = new int[a.length];
		mergeSort(a, 0, a.length-1,temp);
		System.out.println("排好序的数组：");
		System.out.println(Arrays.toString(temp));
	}

	public static void merge(int []array,int left, int right, int mid,int []temp){
		int l = left;
		int r = right;
		int t = 0;
		while (l < mid && r < right){
			if (array[l] < array[r]){
				temp[t] = array[l];
				t++;
				l++;
			}else {
				temp[t] = array[r];
				t++;
				r++;
			}
		}
		while (l == mid){
			temp[t] = array[r];
			t++;
			r++;
		}
		while (r == right){
			temp[t] = array[l];
			t++;
			l++;
		}

		for (int i = left; i <=right; i++) {
			temp[i] = array[i];
		}
	}

	public static void mergeSort(int [] array,int left, int right, int [] arr){
		if(left < right){
			int mid = (left + right)/2;
			mergeSort(array,left,mid,arr);
			mergeSort(array,mid + 1, right, arr);
			merge(array,left,right,mid,arr);
		}
	}
}
