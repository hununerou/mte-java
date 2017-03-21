package hoseihp;

import javax.swing.JOptionPane;

public class ModifyInstance {

	public static void main(String[] args) {
		new ModifyInstance().start();
	}

	void start() {
		Person instance = new Person();
		instance.name = "Bob";
		instance.age = 19;
		modify(instance);
		JOptionPane.showMessageDialog(null, instance.name + "の年齢は" + instance.age + "歳です");
	}

	void modify(Person param) {
		param.age = param.age + 1;
	}
}

class Person {
	String name;
	int age;
}
