package 数据结构.链表;

/**
 * @ClassName Node
 * @Description TODO
 * @author: cdf
 * @Date: 2020-07-27 11:36
 **/
public class Node {

	public int no;
	public String name;
	public Node next;

	public Node(int no,String name) {
		this.no = no;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Node{" +
				"no=" + no +
				", name='" + name + '\'' +
				'}';
	}
}
