package 数据结构.链表;

/**
 * @ClassName LinkedList
 * @Description TODO
 * @author: cdf
 * @Date: 2020-07-27 11:38
 **/
public class LinkedList {

	Node head = new Node(0,"");

	public void add(Node node){
		//temp节点指向head节点
		Node temp = head;
		while (true){
			//如果节点的next为null就是最后一个节点 就退出
			if (temp.next == null){
				break;
			}
			//节点向后
			temp = temp.next;
		}
		//node赋值给temp.next
		temp.next = node;
	}

	public void list(){
		Node temp = head;
		if (head.next == null){
			System.out.println("链表为空");
		}
		while (temp !=null){
			System.out.println(temp);
			temp = temp.next;
		}
	}
}
