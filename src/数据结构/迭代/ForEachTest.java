package 数据结构.迭代;

import jdk.internal.dynalink.linker.LinkerServices;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName ForEachTest
 * @Description TODO
 * @author: cdf
 * @Date: 2020-07-11 00:19
 **/
public class ForEachTest {
	public static void main(String[] args) {
		User user = new User();
		List<User> users =  new ArrayList<>();
		users.add(new User("cdf"));
		users.add(new User("fyl"));

		Iterator iterator = users.iterator();
		while (iterator.hasNext()){
			User u = (User) iterator.next();
			System.out.println(u);
		}
//
//		for (User u : users) {
//			System.out.println(u);
//		}
	}


}
class User {
	public User() { }

	public User(String name) {
		this.name = name;
	}

	private String name;

	@Override
	public String toString() {
		return "User{" +
				"name='" + name + '\'' +
				'}';
	}
}
