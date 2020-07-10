package 数据结构.拆箱装箱;

/**
 * @ClassName Test
 * @Description TODO
 * @author: cdf
 * @Date: 2020-07-11 00:02
 **/
public class Test {
	/**
	 * 装箱：将基本数据类型转化为封装类型
	 * char  Character   byte  Byte  short Short   int Integer  float Float  double Double  long  Long  boolean  Boolean
	 * 拆箱：将封装类型转换为基本数据类型
	 *
	 * 装箱  ：  Integer.valueOf()    return new Integer(i)
	 * 拆箱  ：  intValue()    Integer-->int
	 *
	 * String c = "5";
	 * int d =Integer.parseInt(c);
	 *  string 转换为基本数据类型
	 */
	public static void main(String[] args) {
		Integer.valueOf(5);
		Integer a = 5;
		int b = 6;
		a.intValue();
		String c = "5";
		int d =Integer.parseInt(c);
		System.out.println(d);
	}
}
