package 数据结构.链表;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @ClassName Test
 * @Description TODO
 * @author: cdf
 * @Date: 2020-07-12 13:55
 **/
public class Test {
	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		arrayList.add(1);
		arrayList.add(2);
		System.out.println(arrayList.get(1));
		StringBuilder stringBuilder =new StringBuilder("abc");
		System.out.println(stringBuilder.reverse());

//		String s3 = new String("hello ") + new String("world");
		String s1 = new String("hello world");
		s1.intern();
//		s3.intern();
		String s2 = "hello world";
//		System.out.println(s3 == s2);
		System.out.println(s1 == s2);
	}
}
