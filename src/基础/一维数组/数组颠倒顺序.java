package 基础.一维数组;

import java.util.Arrays;

/**
 * @ClassName 数组颠倒顺序
 * @Description TODO
 * @author: cdf
 * @Date: 2020-07-09 00:29
 **/

public class 数组颠倒顺序 {

	public static void main(String[] args) {
		int [] a = {1,2,3,4,5,6,7,8,9};
		Arrays.sort(a);
		shuzu(a);
		shuzumore(a);
	}

	public static void shuzumore(int[] a){
		int temp = 0;
		for (int i = 0; i<a.length/2; i++){
			temp = a[i];
			a[i] = a[a.length-1-i];
			a[a.length-1-i] = temp;
		}
		System.out.println(Arrays.toString(a));
	}

	/**
	 * 新建一个数组  temp中间转换
	 */
	public static void shuzu(int[] a){
		int [] b = new int[a.length];
		int temp = 0;
		for (int i = 0; i < a.length; i++){
			temp = a[i];
//			a[i] = b[a.length-i-1];
			b[a.length-i-1] = temp;
		}
		System.out.println(Arrays.toString(b));
	}
}
