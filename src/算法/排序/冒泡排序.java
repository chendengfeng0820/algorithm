package 算法.排序;

import java.util.Arrays;

/**
 * @ClassName 冒泡排序
 * @Description TODO
 * @author: cdf
 * @Date: 2020-07-14 00:00
 **/
public class 冒泡排序 {
	public static void main(String[] args) {
		int [] a = new int[]{5,9,6,7,2};
		int temp = 0;
		for (int i = 0;i < a.length-1; i++){
			for (int j = 0;j < a.length-1-i;j++){
				if (a[j] > a[j+1]){
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
 				}
			}
			System.out.println(Arrays.toString(a));
		}
		System.out.println(Arrays.toString(a));
	}
}
