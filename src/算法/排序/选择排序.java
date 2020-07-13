package 算法.排序;

import java.util.Arrays;

/**
 * @ClassName 选择排序
 * @Description TODO
 * @author: cdf
 * @Date: 2020-07-14 01:18
 **/
public class 选择排序 {
	public static void main(String[] args) {
		int[] a = {5, 9, 6, 7, 2};

		for (int i = 0; i < a.length; i++) {
			int min = a[i];//假设第一个为最小值
			int minInex = i;
			for (int j = i+1; j < a.length; j++) {
				if (a[j] < min) {
					min = a[j];  //最小值交换
					minInex = j; //记录最小值的下标
				}
			}
			a[minInex] = a[i];
			a[i] = min;

			System.out.println(Arrays.toString(a));

		}
	}
}
