package 基础.Math类;

import java.util.Queue;
import java.util.Stack;

/**
 * @ClassName MathTest
 * @Description TODO
 * @author: cdf
 * @Date: 2020-07-10 00:44
 **/
public class MathTest {

	double PI = Math.PI;    //3.1415926
	double E  = Math.E;		//2.7 e

	public static void main(String[] args) {
		int a = -100;
		int b = 9;
		double c = 1.5;
		System.out.println(Math.abs(a));   //绝对值   100
		System.out.println(Math.min(a, b));//min  a b 比较小的值
		System.out.println(Math.max(a,b)); //max  a b 比较大的值
		System.out.println(Math.ceil(c));  //celi   向上取整
		System.out.println(Math.floor(c)); //floor  向下取整
		System.out.println(Math.sqrt(b));  //sqrt   平方根
		System.out.println(Math.cbrt(27));  //cbrt   立方根
		System.out.println(Math.pow(a,2)); // pow   a 的 2次方
		System.out.println(Math.addExact(a,b));//addexact  a b相加
		System.out.println(Math.random());    //random  大于等于0.0  小于1.0
		double random = Math.random();
		System.out.println(random);
		int d = (int) (random * 100);
		double e = d/100.0;
		System.out.println(e);
		System.out.println(Math.round(c));   //round  四舍五入
	}
}
