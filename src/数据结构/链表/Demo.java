package 数据结构.链表;

/**
 * @ClassName Demo
 * @Description TODO
 * @author: cdf
 * @Date: 2020-07-27 12:08
 **/
public class Demo {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		Node node1 = new Node(1,"aaa");
		Node node2 = new Node(2,"bbb");
		Node node3 = new Node(3,"ccc");
		Node node4 = new Node(4,"ddd");

		list.add(node1);
		list.add(node2);
		list.add(node3);
		list.add(node4);

		list.list();
	}
}
