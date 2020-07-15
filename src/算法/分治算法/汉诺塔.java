package 算法.分治算法;

/**
 * @ClassName 汉诺塔
 * @Description TODO
 * @author: cdf
 * @Date: 2020-07-15 22:52
 **/
public class 汉诺塔 {
	public static void main(String[] args) {
		long l = System.currentTimeMillis();
		hannuota(25,'a','b','c');
		long l1 = System.currentTimeMillis();
		System.out.println(l1-l);
	}

	public static void hannuota(int num, char a, char b, char c){
		int temp = 0;
		if (num == 1){
			System.out.println("第" + num +"个盘，从" + a + "到" + c);
		}else{
			// 第一步：需要把最上面的都移动到B盘上
			hannuota(num-1, a ,c , b);
			// 第二步：把最下面的移动到C盘上
			System.out.println(temp++ +"第" + num +"个盘，从" + a + "到" + c);
			// 第三步：把b上的移动到c上
			hannuota(num-1 , b, a, c);
		}
	}
}
