package 算法.排序;

import java.util.Arrays;

/**
 * @ClassName 插入排序
 * @Description TODO
 * @author: cdf
 * @Date: 2020-07-14 09:06
 **/
public class 插入排序 {
	public static void main(String[] args) {
		int[] a = {9, 5, 6, 7, 2};
		for (int i = 1; i < a.length; i++) {
			int inserValue = a[i];
			int insertIndex = i - 1;
			while (insertIndex >= 0 && inserValue < a[insertIndex]) {
				a[insertIndex + 1] = a[insertIndex];
				insertIndex--;
			}
			a[insertIndex + 1] = inserValue;
			System.out.println(Arrays.toString(a));
		}
	}
}
