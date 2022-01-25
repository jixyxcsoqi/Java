
// 第一步：类加载
// 第二步：调用UserTest类的main方法（方法调用要压栈。）
public class UserTest{

	// 方法体外声明的变量叫做成员变量。
	//User u1; //成员变量。（实例变量）

	public static void main(String[] args){
		//int i = 100;

		// 方法体当中声明的变量叫做局部变量
		User u1 = new User();
		// 实例变量怎么访问（属性怎么访问）？
		// 语法是：“引用.属性名”
		System.out.println(u1.id); //0
		System.out.println(u1.username); //null
		System.out.println(u1.password); //null

		u1.id = 11111;
		u1.username = "zhangsan";
		u1.password = "123";

		System.out.println(u1.id);
		System.out.println(u1.username);
		System.out.println(u1.password);
		
		User u2 = new User();
		u2.id = 22222;
		u2.username = "lisi";
		u2.password = "456";

		System.out.println(u2.id);
		System.out.println(u2.username);
		System.out.println(u2.password);
	}
}

public class User{
	// 用户id
	// 访问id不能这样：User.id （这是错误的，实例变量不能用类名访问。）
	// id的访问必须先造对象，然后对象有了，才能访问对象的id
	int id; //成员变量，实例变量（对象变量，一个对象一份。）
	// 用户名
	String username; // 成员变量可以不手动赋值，系统赋默认值。
	// 密码
	String password;
}