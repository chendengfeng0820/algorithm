package 数据结构.栈;

import 数据结构.链表.Node;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName Stack
 * @Description 数组模拟栈
 * @author: cdf
 * @Date: 2020-07-27 18:06
 **/
public class Stack {

	private int maxSize ;
	private int[] stack;
	private int top = -1;

	public Stack(int maxSize) {
		this.maxSize = maxSize;
		stack = new int[maxSize];
	}

	/**
	 * 栈满
	 */
	public Boolean isFull(){
		return top == maxSize-1;
	}

	/**
	 * 栈空
	 */
	public Boolean isEmpty(){
		return top == -1;
	}

	/**
	 * 入栈
	 */
	public void push(int value){
		if (isFull()){
			return;
		}
		top++;
		stack[top] = value;
	}

	/**
	 * 出栈
	 */
	public int pop(){
		if (isEmpty()){
			return 0;
		}
		int temp = stack[top];
		top--;
		return temp;
	}




 	/**
	 * 遍历栈
	 */
	public void list(){
		if (isEmpty()){
			System.out.println("对不起，栈为空");
			return;
		}
		for (int i = top; i >= 0; i--){
			System.out.println(stack[i]);
		}
//		int value = stack[top];
//		top--;
//		System.out.println(value);
//		list();
	}
}
