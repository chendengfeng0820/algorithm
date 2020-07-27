package 数据结构.链表;

/**
 * @ClassName LinkedList
 * @Description TODO
 * @author: cdf
 * @Date: 2020-07-27 11:38
 **/
public class LinkedList {

	Node head = new Node(0,"");

	public LinkedList() {
	}

	public LinkedList(Node head) {
		this.head = head;
	}

	public Node print(Node head){
		Node temp = head;
		if (head.next == null){
			return null;
		}
		System.out.println(temp.next);
		return print(temp.next);
	}

	/**
	 * 按照list添加顺序添加
	 * @param node
	 */
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

	/**
	 * 按照编号顺序添加
	 */
	public void addByOrder(Node node){
		Node temp = head;
		boolean flag = true;
		if (head.next == null){
			System.out.println("链表为空");
		}
		while (true){
			if (temp.next == null){
				break;
			}
			if (node.no < temp.next.no){
				break;
			}else if (node.no == temp.next.no){
				flag = false ;
				break;
			}
			temp = temp.next;
		}
		if (flag == false){
			System.out.println("存在此节点" + temp.no);
		}else {
			node.next = temp.next;
			temp.next = node;
		}
	}

	/**
	 * 根据编号修改节点
	 * @param node
	 */
	public void update(Node node){
		boolean flag = false;
		Node temp = head;
		if (head.next == null){
			System.out.println("链表为空");
		}
		while (true){
			if (temp.next == null){
				break;
			}
			if (node.no == temp.no){
				flag = true;
				break;
			}
			temp = temp.next;
		}
		if (flag == true){
			temp.name = node.name;
		}else {
			System.out.println("不存在此节点");
		}
	}

	/**
	 * 删除
	 * @param node
	 */
	public void delete(Node node){
		boolean flag = false;
		Node temp = head;
		if (head.next == null){
			System.out.println("链表为空");
		}
		while (true){
			if (temp.next == null){
				break;
			}
			if (node.no == temp.next.no){
				flag = true;
				break;
			}
			temp = temp.next;
		}
		if (flag == true){
			temp.next = temp.next.next;
		}else {
			System.out.println("不存在此节点");
		}
	}

	/**
	 * 链表的长度
	 * @param head  链表头节点
	 */
	public int getLength(Node head){
		int length = 0;
		Node cur = head.next;
		if (head.next == null){
			return 0;
		}
		while (head.next != null){
			length++;
			head = head.next;
		}
		return length;
	}



	/**
	 * 遍历展示
	 */
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
