package 数据结构.栈;

import java.util.Stack;

/**
 * @ClassName Test
 * @Description TODO
 * @author: cdf
 * @Date: 2020-07-11 14:48
 **/
public class Test {
	public static void main(String[] args) {
		removeDuplicates("abbaca");
	}
		public static String removeDuplicates(String S) {
			Stack<String> stack = new Stack<>();
			String sb = new String();
			for(int i=0;i<S.length();i++){
				String s =String.valueOf(S.charAt(i));
				if(i==0){
					stack.push(s);
				}else if(stack.peek().equals(s)){
					stack.pop();
				}else{
					stack.push(String.valueOf(s));
				}
			}
			while(!stack.empty()){
				sb = stack.pop()+sb;
			}
			return sb.toString();
		}
	}
	//     StringBuilder sb = new StringBuilder();
	//     sb.append(S);
	//     for(int i =0;i<S.length()-1;i++){
	//         if(S.charAt(i)==S.charAt(i+1)){
	//             sb.deleteCharAt(i);
	//             sb.deleteCharAt(i+1);
	//             i=i-1;
	//         }
	//     }
	//     return sb.toString();
	//
