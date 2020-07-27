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
		Node node5 = new Node(3,"fff");

		list.add(node1);
		list.add(node4);
		list.add(node2);
		list.add(node3);
//		list.addByOrder(node1);
//		list.addByOrder(node2);
//		list.addByOrder(node3);
//		list.addByOrder(node4);
//
//		System.out.println(list.getLength(list.head));
//
//		list.list();

//		System.out.println("修改后的=====");
//		list.update(node5);
//		list.list();
//
//		System.out.println("删除后的======");
//		list.delete(node3);
//		list.list();

		System.out.println(list.print(list.head));

	}
}
