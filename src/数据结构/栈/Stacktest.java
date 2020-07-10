package 数据结构.栈;

import java.util.Stack;

/**
 * @ClassName Stacktest
 * @Description TODO
 * @author: cdf
 * @Date: 2020-07-10 23:04
 **/
public class Stacktest {
	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.add(1);
		stack.add(2);
		stack.add(3);
		System.out.println(stack);

		stack.push(3);//入栈
		stack.pop();       //出栈
		stack.peek();      //栈顶元素
		stack.search(2); //栈中元素查找  返回索引


		stack.pop();
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack.search(2));

	}
}
