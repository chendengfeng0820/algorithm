package 基础.测试;
import java.awt.Color;
/**
 * @ClassName Test
 * @Description TODO
 * @author: cdf
 * @Date: 2020-07-09 22:35
 **/
public class Test {
	public static void main(String[] args) {
		b();
		String a = "12";
		String b = "34";
		String c = a+b;
		System.out.println(c);
		double d = Double.POSITIVE_INFINITY;
	}
	public  static void  a(){
		System.out.println("static1");
	}
	public static  void b(){
		a();
		System.out.println("static2");

	}
}
