package 数据结构.栈;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.StringStack;

import java.util.Scanner;
import java.util.Stack;

/**
 * @ClassName Calculation
 * @Description TODO
 * @author: cdf
 * @Date: 2020-07-11 01:10
 **/
public class Calculation {
	public static void main(String[] args) {

		Stack<String> ops = new Stack<>();//运算符栈
		Stack<Integer> val = new Stack<>();//操作数栈

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入表达式：");

		String scanner = sc.toString();
		while (sc.hasNext()){
			//如果是运算符放进操作数栈
			Object next = sc.next();
			if (next.equals("(")) {}
			else if (next.equals("+")) {ops.push(String.valueOf(next)) ;}
			else if (next.equals("-")) {ops.push(String.valueOf(next)) ;}
			else if (next.equals("*")) {ops.push(String.valueOf(next)) ;}
			else if (next.equals("/")) {ops.push(String.valueOf(next)) ;}
			else if (next.equals(")")) {
				//如果是 ） 数和运算符出栈并计算  然后结果入栈
				String op = ops.pop();//运算符出栈
				Integer value = val.pop();
				if (op.equals("+")) {value = val.pop() + value ;}
				if (op.equals("-")) {value = val.pop() - value ;}
				if (op.equals("*")) {value = val.pop() * value ;}
				if (op.equals("/")) {value = val.pop() / value ;}
			}else {
				//如果不是运算符和） 就是数值放进val中
				val.push(Integer.valueOf(String.valueOf(next)));
			}
			System.out.println(val.pop());
		}
	}
}
